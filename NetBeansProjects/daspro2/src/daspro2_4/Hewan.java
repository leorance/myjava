package daspro2_4;
public class Hewan extends MakhlukHidup {
    private final String kakiEmpat;
    private final String kakiDua;
    public Hewan(String empat_kaki, String dua_kaki) {
        this.kakiEmpat = empat_kaki;
        this.kakiDua = dua_kaki;
    }
    @Override
    public void berdiri() {
        System.out.println("Kambing berdiri menggunakan : " + kakiEmpat);
        System.out.println("Ayam berdiri menggunakan    : " + kakiDua);
    }
}
