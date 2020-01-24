public class Test {
    public static void main(String[] args) {
        Math math = new Math();
        int a = 6;
        int b = 7;
        double c = 8;
        System.out.println("Number " + a + " is even: " + math.isEven(a));
        System.out.println("Number " + b + " is even: " + math.isEven(b));
        System.out.println("Number " + a + " is odd: " + math.isOdd(a));
        System.out.println("Number " + b + " is odd: " + math.isOdd(b));
        System.out.println("Circle field of a radius of " + c + " is: " + math.circleField(c));
        System.out.println("Squre of the number " + a + " is: " + math.power(a));
    }

}
