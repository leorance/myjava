package daspro2_4;
public class Manusia extends MakhlukHidup {
    private final String duaKaki;
    public Manusia(String dua_kaki) {
        this.duaKaki = dua_kaki;
    }
    @Override
    public void berdiri(){
        System.out.println("Manusia berdiri menggunakan : "+duaKaki);
    }
    
}
