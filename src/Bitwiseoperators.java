public class Bitwiseoperators {
    public static void main(String[] args) {

        int x = 10, y = 12;
        int i = 5;
        int j = 8;
        if (++i < 10 && ++j < 8) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        if (++i < 5 || ++j < 6) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("x = " +x);
        System.out.println("y = " +y);
    }
}
