class DemoSatu {
    public static void main (String[] args){
        System.out.println("awal program");

        int x = 10;

        try {
            x = x / 0;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("error karena pembagian nol");
        }

        System.out.println(x);

        System.out.println("akhir program");
    }
}