package daspro2;
//public +
//private -
public class Daspro2 {
    public static void main(String[] args) {
    Singa singa = new Singa();
    singa.SetSuaraSinga();
    
    Kucing kucing = new Kucing();
    kucing.SetSuaraKucing();
    
        System.out.println("Suara Singa : "+ singa.SuaraBinatang);
        System.out.println("Suara Kucing : "+ kucing.SuaraBinatang);
    }
}