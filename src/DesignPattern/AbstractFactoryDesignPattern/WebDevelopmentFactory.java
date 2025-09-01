package src.DesignPattern.AbstractFactoryDesignPattern;

public class WebDevelopmentFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
