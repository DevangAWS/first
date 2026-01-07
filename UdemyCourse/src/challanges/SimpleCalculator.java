package challanges;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAdditionResult(){
        return (int) (firstNumber + secondNumber);
    }
    public int getSubtractionResult(){
        return (int) (firstNumber - secondNumber);
    }
    public int getMultiplicationResult(){
        return (int) (firstNumber * secondNumber);
    }
    public int getDivisionResult(){
        if (secondNumber==0){return 0;}
        return (int) (firstNumber / secondNumber);
    }
}

class Run{
    static void main() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}