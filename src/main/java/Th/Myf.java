package Th;

public class Myf {
    private int left;
    private int right;
    static int count = 0;
    private int b[];

    public Myf(int left, int right) {
        this.left = left;
        this.right = right;
    }

    static boolean is(int n) {
        boolean isperfectnumner = false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }

        }
        if (sum == n) {
            isperfectnumner = true;
        }
        return isperfectnumner;

    }

     void create_b() {

        b = new int[256];
    }

     void disp() {
         for (int i = left; i < right; i++) {
             if (is(i)) {
                 b[count++] = i;
             }
         }

         for (int i = 0; i < count; i++) {
             System.out.println(b[i]);
         }
    }

    public static void main(String[] args) {

        Myf myf = new Myf(4, 2000);

        myf.create_b();

        myf.disp();

    }
}
