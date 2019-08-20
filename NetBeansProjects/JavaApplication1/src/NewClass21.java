/*
    Buatlah sebuah program dengan menggunakan
    metode untuk menerima sebuah bilangan bulat X
    dan mengembalikan nilai y dari perhitungan y = x2 + 2x - 5
*/
public class NewClass21 {
    public static int hitung(int x) {
        int y = 0;
        y = (x * x) + (2 * x) - 5;
        return y;
    }
    public static void main(String[] args) {
        System.out.println(hitung(9));
    }
}