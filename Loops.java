public class Loops {
    public static void main(String[] args) {

        boolean log = true;
        int size = 4;
        int count = 0;

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(k);
                    System.out.print(i);
                    System.out.println(j);
                    count++;
                }
                if (log)
                    System.out.println("--- i++ ---");
            }
            if (log)
                System.out.println("--- k++ ---");
        }
        System.out.println(count);
    }
}
