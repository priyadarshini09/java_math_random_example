package guru.springframework;

public class Main {

    public static void main(String[] args) {
        System.out.println("Double between 0.0 and 1.0: SimpleRandomNumber = "+getRandomNumber());
        System.out.println("Double between 0.0 and 15.00: RandomDoubleNumber = "+getRandomDoubleBetweenRange(0.0, 15.00));
        System.out.println("Integer between 2 and 6: RandomIntegerNumber = "+getRandomIntegerBetweenRange(2.0,6.0));
        System.out.println("Integer between -10 and 10: RandomNegativeInteger = "+getRandomIntegerBetweenNegativeRange(-10,10));
    }

    // a simple random number
    public static double getRandomNumber(){
        double x = Math.random();
        return x;
    }

    // double between [0.0, 15.00)
    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }

    // integer between [2,6]
    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    // integer between [-10,10) - maximum 9
    public static double getRandomIntegerBetweenNegativeRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
