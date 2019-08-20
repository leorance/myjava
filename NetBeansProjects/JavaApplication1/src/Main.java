// code di bawah adalah untuk perhitungan password usb debug
// Andromax E2+ alias B16C2G
// dengan Model Number : Andromax B16C2G
// Android version : 5.1.1
// Hardware version : V1.00
// Software Version : L1196.6.05.03.ID11
// Kernel version : 3.10.49
// Silahkan dites run dengan AIDE Pro

import java.util.zip.CRC32;

public class Main {

    public static void main(String[] args) {
//Ganti MEID dan IMEI (warna merah) di bawah dengan punya agan
//MEID wajib 14 character, di mana huruf harus diketik dengan huruf besar dan IMEI wajib 15 digit
//Jika MEID ada 15 character, cukup pakai 14 character aja. Character terakhir adalah check digit.
//bisa diliat lewat dialpad *#06# atau Settings > About phone > Status > IMEI information
//Contoh :
// String meid = "A1000042348868";
// String imei = "869123021223292";
// Password USB debug nya pasti terdiri dari 10 character hexadecimal

        String meid = "A100004226334F"; //tanda petik jangan dihapus
        String imei = "869123020294807"; //tanda petik jangan dihapus
        String name = "B16C2G"; // ro.product.name dari build.prop, jangan diganti
        String pass = getPassword(meid, imei, name);
        System.out.println("Password USB Debug agan adalah : " + pass);
    }

    private static String getPassword(String s, String s1, String s4) {
        long l = Long.valueOf(s, 16).longValue();
        long l1 = Long.valueOf(stringReverse(s1), 16).longValue();
        String s2 = (new StringBuilder()).append(l).append("").toString();
        String s3 = (new StringBuilder()).append(l1).append("").toString();
        String s5 = "01OKTOBER2016"; //getResources().getString(0x7f090b35)
        CRC32 crc32 = new CRC32();
        crc32.update(s2.getBytes());
        CRC32 crc32_1 = new CRC32();
        crc32_1.update(s3.getBytes());
        long l2 = crc32.getValue() << 8 ^ crc32_1.getValue();
        CRC32 crc32_2 = new CRC32();
        crc32_2.update(s4.getBytes());
        l2 ^= crc32_2.getValue();

        CRC32 crc32_3 = new CRC32();
        crc32_3.update(s5.getBytes());
        l2 ^= crc32_3.getValue();

        return Long.toHexString(l2);
    }

    public static String stringReverse(String s) {
        return (new StringBuffer(s)).reverse().toString();
    }
}
