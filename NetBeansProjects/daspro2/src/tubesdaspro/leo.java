package tubesdaspro;
public class leo extends data{
    private String nama;
    private String jk;
    private String pekerjaan;
    private String kewarganegaraan;
    private String ttl;
    public leo (String nama, String jk, String pekerjaan, String kewarganegaraan, String ttl){
        this.nama = nama;
        this.jk = jk;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.ttl = ttl;
    }
    @Override
    public void ktp() {
        System.out.println("Nama               : "+nama);
        System.out.println("Jenis Kelamin      : "+jk);
        System.out.println("Pekerjaan          : "+pekerjaan);
        System.out.println("Kewarganegaraan    : "+kewarganegaraan);
        System.out.println("Tempat / Tgl Lahir : "+ttl);
    }
}
