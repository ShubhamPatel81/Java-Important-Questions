package src.DesignPattern.AbstractFactoryDesignPattern;

public class AndroidDevelopmentFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return  new AndroidDeveloper();
    }
}
