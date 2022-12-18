package solid.openendedprinciple.wrongoep;

public class SampleCalculator implements Calculator {
    @Override
    public void calculate(Operation operation) {
        if(operation instanceof Addition) {
            Addition obj = (Addition) operation;
            obj.setResult(obj.getFirstOperand() + obj.getSecondOperand());
        }
    }
}
