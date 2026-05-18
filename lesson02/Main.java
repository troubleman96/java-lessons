package lesson02;

public class Main {
    public static void main(String[] args){
        // comments in java
        String name = "CamelTech";
        System.out.println(name);

        // variables in java 
        int age = 122;
        System.out.println(age);

        // basics example
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        // constants in java
        final double pi = 3.14;
        System.out.println(pi);

        // realworld example
        String productName = "laptop";
        double priceDollar = 999.99;
        System.out.println("The price of the " + productName + " is $" + priceDollar);

        // small math example
        int length = 10;
        int width = 2;
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
