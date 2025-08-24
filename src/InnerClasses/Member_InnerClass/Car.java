package src.InnerClasses.Member_InnerClass;

class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {
        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " Engine Started!!");
            } else {
                System.out.println(model + " Engine is Already Started!!");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " Engine is Stopped!!!");
            } else {
                System.out.println(model + " Engine is Already OFF");
            }
        }
    }
}
