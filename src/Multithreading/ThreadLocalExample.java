package src.Multithreading;

class ResourceId {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

public class ThreadLocalExample {  // Renamed class to avoid conflicts with java.lang.ThreadLocal

    // Define a ThreadLocal variable to store ResourceId for each thread
    private static ThreadLocal<ResourceId> threadLocalResourceId = ThreadLocal.withInitial(ResourceId::new);

    public static void main(String[] args) {
        Long id1 = 12121L;
        Long id2 = 324242L;

        // Thread 1 handling request for id1
        Thread requestThread1 = new Thread(() -> {
            System.out.println("Started thread for ID: " + id1);

            ResourceId resourceId = threadLocalResourceId.get(); // Get thread-specific ResourceId
            resourceId.setId(id1);  // Set ID in the thread-local variable

            // Simulate business logic
            System.out.println("Completed logic for ID: " + resourceId.getId());

            // Clean up thread-local variable
            threadLocalResourceId.remove();
        });

        // Thread 2 handling request for id2
        Thread requestThread2 = new Thread(() -> {
            System.out.println("Started thread for ID: " + id2);

            ResourceId resourceId = threadLocalResourceId.get();
            resourceId.setId(id2);

            // Simulate business logic
            System.out.println("Completed logic for ID: " + resourceId.getId());

            // Clean up thread-local variable
            threadLocalResourceId.remove();
        });

        // Start both threads
        requestThread1.start();
        requestThread2.start();
    }
}
