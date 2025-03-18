public class MainProgram {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wert von i: " + i);
            if (i == 3) {
                System.out.println("Holdriho!");
            }
        }

        printSomeNumbers();
        printNumbers(3,6);
        System.out.println(sumUp(2,4));
        System.out.println(powerOfTwo(4));
        System.out.println(sumUpPowerOfTwo(2));
        rectangleStars(10,10);
        triangleStars(5);
        printEvenNumbers(1,10);
        System.out.println(sumUpThree(0,8));
        starThing(5, 5);

    }

    public static void printSomeNumbers() {
        for (int i = 6; i <= 23; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static int sumUp(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) { //geht alle Zahlen von START bis ENDE durch
            sum = sum + i; //addiert die Summe aller BISHERIGEN zahlen mit der AKTUELLEN zahl
        }
        return sum; //gibt die summe aller Zahlen zurück
    }

    public static int powerOfTwo(int exp){
        int result = 1;
        if(exp >= 0) {
            for (int i = 1; i <= exp; i++) {
                result = result * 2;
            }
        }
        return result;
    }

    public static int sumUpPowerOfTwo(int n){
        int result = 1;
        int sum = 1;
        if(n >= 0) {
            for (int i = 1; i <= n; i++) {
                result = result * 2;
                sum = sum + result;
            }
        }
        return sum;
    }

    public static void rectangleStars(int width, int height){
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rectangleStarsSafe(int width, int height){
        if(height > 0 && width > 0) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

    public static void triangleStars(int width){
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printEvenNumbers(int start, int end){
        for (int i = start; i <= end; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static int sumUpThree(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if(i % 3 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void starThing(int width, int height){
        for (int i = 1; i <= height; i++) {
            if(i % 2 == 0){
                System.out.println("* ");
            }
            else {
                for (int j = 1; j <= width; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
