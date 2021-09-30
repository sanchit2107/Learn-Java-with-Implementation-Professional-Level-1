public class MultiplyFun {

    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }

    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }

    static double Multiply(double a, double b, double c) {
        return a * b * c;
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println(MultiplyFun.Multiply(2, 4));

        System.out.println(MultiplyFun.Multiply(5.5, 6.3));

        System.out.println(MultiplyFun.Multiply(2, 4, 6));

        System.out.println(MultiplyFun.Multiply(5.5, 6.3, 8.9));

    }
}