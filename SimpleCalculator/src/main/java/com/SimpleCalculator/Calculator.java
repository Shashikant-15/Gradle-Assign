package com.SimpleCalculator;


public class Calculator {

    private double fn;
    private double sn;
    private char op;

    public double getFn() {
        return fn;
    }

    public void setFn(double fn) {
        this.fn = fn;
    }

    public double getSn() {
        return sn;
    }

    public void setSn(double sn) {
        this.sn = sn;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }


    public Calculator(double fn, double sn, char op) {
        this.fn = fn;
        this.sn = sn;
        this.op = op;
    }

    public void getAnswer(){
        double ans;
        switch (getOp()){
            case '+':
                ans = add(getFn(), getSn());
                ansOutput(ans);
                break;
            case '-':
                ans = sub (getFn(), getSn());
                ansOutput(ans);
                break;
            case '*':
                ans = mul (getFn(), getSn());
                ansOutput(ans);
                break;
            case '/':
                ans = div (getFn(), getSn());
                ansOutput(ans);
                break;
            default:
                System.out.println("--------------------------");
                System.out.println("Invalid choice of operator");
                System.out.println("--------------------------");
        }
    }
    public static double add(double x,double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double mul(double x, double y){
        return x * y;
    }
    public static double div(double x, double y){
        return x / y;
    }

    public static void ansOutput(double x){
        System.out.println("----------- -------");
        System.out.printf("The answer is %.2f\n", x);
        System.out.println("-------------------");
    }
}

