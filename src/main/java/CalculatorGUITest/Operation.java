package CalculatorGUITest;

public class Operation {
    private float numberA;
    private float numberB;
    private char operator;

    public Operation(String operation) {
        char[] charArray = operation.toCharArray();
        for(char character : charArray) {
            if (character == '+' || character == '-' || character== 'x' || character == '÷') {
                this.operator = character;
                break;
            }
        }
        this.numberA = Float.parseFloat(operation.substring(0, operation.indexOf(operator)));
        this.numberB = Float.parseFloat(operation.substring(operation.indexOf(operator) + 1));
    }

    public char getOperator() {
        return operator;
    }

    public float getNumberA() {
        return numberA;
    }

    public float getNumberB() {
        return numberB;
    }
}
