package tubesdaspro;
public class celvin extends data {
    private String nama;
    private String jk;
    private String pk;
    private String kwn;
    private String ttl;
    public celvin(String nama, String jk, String pk, String kwn, String ttl) {
        this.nama = nama;
        this.jk = jk;
        this.pk = pk;
        this.kwn = kwn;
        this.ttl = ttl;
    }
    @Override
    public void ktp() {
        System.out.println("Nama               : "+nama);
        System.out.println("Jenis Kelamin      : "+jk);
        System.out.println("Pekerjaan          : "+pk);
        System.out.println("Kewarganegaraan    : "+kwn);
        System.out.println("Tempat / Tgl Lahir : "+ttl);
    }
    
}
