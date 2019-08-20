package kuis;


import javax.swing.JOptionPane;

public class no1 {
    public static void main(String[] args) {
//    nomor 1 array 2 dimensi 4 baris 3 kolom
    String data[][];
    data = new String[4][3];
        for (int i = 0; i < 4; i++) {
            data[i][0] = JOptionPane.showInputDialog("Masukkan Nama");
            data[i][1] = JOptionPane.showInputDialog("Masukkan NIM");
            data[i][2] = JOptionPane.showInputDialog("Masukkan Jurusan");
            System.out.println("\n-======================= Baris ke "+(i+1)+" ====================-");
            System.out.println("Nama : "+data[i][0]);
            System.out.println("Nim : "+data[i][1]);
            System.out.println("Jurusan : "+data[i][2]);
        }
    }
}