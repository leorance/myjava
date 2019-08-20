package daspro2_4;
public class MainPesan implements pesan{
    public static void main(String[] args) {
        MainPesan ps = new MainPesan();
        ps.tampilPesan1();
        ps.tampilPesan2();
        ps.tampilPesan3();
    }
    @Override
    public void tampilPesan1() {
        System.out.println("Tampilkan Pesan 1");
    }

    @Override
    public void tampilPesan2() {
        System.out.println("Tampilkan Pesan 2");
    }

    @Override
    public void tampilPesan3() {
        System.out.println("Tampilkan Pesan 3");
    }
    
}