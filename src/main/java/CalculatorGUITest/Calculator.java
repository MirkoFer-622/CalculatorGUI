package CalculatorGUITest;

public class Calculator {

    static String calculates(final String operation) {
        Operation op = new Operation(operation);
        double result = 0;
        if(op.getOperator() == '+') {
            result = op.getNumberA() + op.getNumberB();
        } else if(op.getOperator() == '-') {
            result = op.getNumberA() - op.getNumberB();
        } else if(op.getOperator() == 'x') {
            result = op.getNumberA() * op.getNumberB();
        } else {
            result = op.getNumberA() / op.getNumberB();
        }
        if(result == (long) result) {
            System.out.println("11111");
            return String.format("%d", (long) result);
        }
        else {
            System.out.println("ffffff");
            return String.format("%s", result);
        }

    }
}
