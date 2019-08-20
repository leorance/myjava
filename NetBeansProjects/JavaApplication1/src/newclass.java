
public class newclass {
    public static void berulang(String a) {
        for (int i = 1; i < 10; i++) {
            System.out.println(a);
        }
    }
    public static int perkalian(int a, int b){
     int c=0;
     c = a*b;
     return c;
    }
    public static void main(String[] args) {
        System.out.println(perkalian(5,3));
    }
}
