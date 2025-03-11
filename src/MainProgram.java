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
        for (int i = 1; i <= exp; i++) {
            result = result * 2;
        }
        return result;
    }
}
