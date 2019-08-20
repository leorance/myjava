package daspro2_4;
public class Tumbuhan extends MakhlukHidup {
    private String akar;
    public Tumbuhan(String akar) {
        this.akar = akar;
    }
    @Override
    public void berdiri(){
        System.out.println("Tumbuhan berdiri dengan : "+akar);
    }
    
}
