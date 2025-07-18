package src.Heap;

import java.util.*;

class Tweet implements Comparable<Tweet> {
    int time;
    int tweetId;
    Tweet(int t, int id){
        this.time = t;
        this.tweetId = id;
    }
    public int compareTo(Tweet that){
        return Integer.compare(that.time, this.time); // newer first
    }
}

class User {
    int userId;
    HashSet<Integer> followees;
    List<Tweet> tweets;
    User(int userId){
        this.userId = userId;
        followees = new HashSet<>();
        tweets = new LinkedList<>();
        followees.add(userId); // follow self
    }
    public void addTweets(Tweet t){
        tweets.add(0,t);
    }
    public void follow(int followeeId){
        followees.add(followeeId);
    }
    public void unfollow(int followeeId){
        if(followeeId != this.userId){
            followees.remove(followeeId);
        }
    }
}

class Twitter_Implementation {
    HashMap<Integer,User> userMap;
    int timeCounter ;
    public Twitter_Implementation() {
        userMap = new HashMap<>();
        timeCounter = 0;
    }

    public void postTweet(int userId, int tweetId) {
        timeCounter++;
        userMap.putIfAbsent(userId,new User(userId));
        User user = userMap.get(userId);
        user.addTweets(new Tweet(timeCounter,tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        if(!userMap.containsKey(userId)){
            return new ArrayList<>();
        }
        User user = userMap.get(userId);
        PriorityQueue<Tweet> pq = new PriorityQueue<>();
        for(int followeeId : user.followees){
            User followee = userMap.get(followeeId);
            int count = 0;
            for(Tweet tweet : followee.tweets){
                pq.offer(tweet);
                count++;
                if(count >= 10) break;
            }
        }
        List<Integer> res = new ArrayList<>();
        int idx = 0;
        while(!pq.isEmpty() && idx < 10){
            res.add(pq.poll().tweetId);
            idx++;
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        userMap.putIfAbsent(followerId, new User(followerId));
        userMap.putIfAbsent(followeeId, new User(followeeId));
        userMap.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(userMap.containsKey(followerId)){
            userMap.get(followerId).unfollow(followeeId);
        }
    }

    public static void main(String[] args) {
        Twitter_Implementation twitter = new Twitter_Implementation();

        // User 1 posts a tweet
        twitter.postTweet(1, 101);
        printFeed(twitter.getNewsFeed(1), "User 1 news feed after posting tweet 101");
        // Should print: [101]

        // User 1 posts another tweet
        twitter.postTweet(1, 102);
        printFeed(twitter.getNewsFeed(1), "User 1 news feed after posting tweet 102");
        // Should print: [102, 101]

        // User 2 follows user 1
        twitter.follow(2, 1);
        // User 2 posts a tweet
        twitter.postTweet(2, 201);

        printFeed(twitter.getNewsFeed(2), "User 2 news feed after following user 1 and posting 201");
        // Should print: [201, 102, 101] (201 from user 2, and latest tweets from user 1)

        // User 2 unfollows user 1
        twitter.unfollow(2, 1);

        printFeed(twitter.getNewsFeed(2), "User 2 news feed after unfollowing user 1");
        // Should print: [201] (only own tweet)

        // Edge case: user 3 has no tweets
        printFeed(twitter.getNewsFeed(3), "User 3 news feed with no tweets and no follows");
        // Should print: []

        // User 3 follows user 1
        twitter.follow(3, 1);

        printFeed(twitter.getNewsFeed(3), "User 3 news feed after following user 1");
        // Should print: [102, 101]
    }

    private static void printFeed(List<Integer> feed, String message) {
        System.out.println(message + ": " + feed);
    }
}
