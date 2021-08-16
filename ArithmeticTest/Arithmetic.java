public class Arithmetic {
    int num1,num2;
    public Arithmetic(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
    }

    public int sum() {
        return num1+num2;
    }

    public int substract() {
        return num1-num2;
    }

    public int multiply() {
        return num1*num2;
    }

    public int divide() {
        return num1/num2;
    }
}
