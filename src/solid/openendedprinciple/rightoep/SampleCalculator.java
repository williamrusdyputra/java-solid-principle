package solid.openendedprinciple.rightoep;

public class SampleCalculator implements Calculator {
    @Override
    public void calculate(Operation operation)
    {
        operation.doOperation();
    }
}
