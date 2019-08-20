package belajar;
public class belajarOverloading {
    private static int a(int x, int y){
        int t = 0;
        t = x+y;
        return t;
    }
    public static void main(String[] args) {
        System.out.println(a(7,7));
    }
}
