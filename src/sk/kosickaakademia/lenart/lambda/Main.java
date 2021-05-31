package sk.kosickaakademia.lenart.lambda;

public class Main {
    public static void main(String[] args) {
        Calc calc = ((a, b) -> a*b);
        System.out.println(calc.operation(7,8));
        calc = (a, b) ->{return a>b?a:b;};
        System.out.println(calc.operation(5,8));

        Calc calc2 = (a,b) -> a-b;
        print(17,3,calc2);

        Tax taxSK = value -> 1.20*value;
        Tax taxHU = value -> 1.27*value;
        Tax taxLX = value -> 1.15*value;
        printEurWithTax(41.40, taxSK);
        printEurWithTax(41.40, taxHU);
        printEurWithTax(41.40, taxLX);
    }

    private static void print(int a,int b,Calc calc){
        System.out.println(calc.operation(a,b));
    }

    private static void printEurWithTax(double value, Tax tax){
        value = tax.calcTax(value);

        value = Math.round(value*100)/100.0;
        System.out.println(value+" €");
    }
}
