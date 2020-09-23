public class Reference {
    public static void main(String[] args) {
        Type a = new Type();
        Type b = new Type();

        a.k = new int[]{1, 2};
        b.k = a.k;
        a.k = new int[]{3,4};

        System.out.println(b.k[0]);
    }
}

class Type {
    int i;
    int[] k;
}
