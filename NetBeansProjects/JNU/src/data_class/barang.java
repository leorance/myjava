/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_class;

/**
 *
 * @author leorence
 */
public class barang {
    int id_barang, id_penerima, noresi, berat, total;
    String namabarang, jenispengiriman, jenisbarang, tanggal, bulan, tahun;

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getId_penerima() {
        return id_penerima;
    }

    public void setId_penerima(int id_penerima) {
        this.id_penerima = id_penerima;
    }

    public int getNoresi() {
        return noresi;
    }

    public void setNoresi(int noresi) {
        this.noresi = noresi;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getJenispengiriman() {
        return jenispengiriman;
    }

    public void setJenispengiriman(String jenispengiriman) {
        this.jenispengiriman = jenispengiriman;
    }

    public String getJenisbarang() {
        return jenisbarang;
    }

    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}
