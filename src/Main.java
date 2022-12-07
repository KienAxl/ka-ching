
public class Main {
    public static void main(String[] args) {
        for (int x = 1; x < 50; x++) {

            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("ka ching!");
            } else if (x % 5 == 0) {
                System.out.println("ching!");
            } else if (x % 3 == 0) {
                System.out.println("ka");
            }
            else {
                System.out.println(x);
            }
        }
    }
}