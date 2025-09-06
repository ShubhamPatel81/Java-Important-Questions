package src.DesignPattern.BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
       User  user = new User.UserBuilder().setUserId("1").setUserName("Shubh").setEmail("shubh@gmail.com").build();
        System.out.println(user);

    }
}
