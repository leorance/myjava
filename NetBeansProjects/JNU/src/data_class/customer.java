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
public class customer {
    int id_customer, id_barang;
    String status_pengiriman, nama_customer, nama_perusahaan, nomor_telefon;

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getStatus_pengiriman() {
        return status_pengiriman;
    }

    public void setStatus_pengiriman(String status_pengiriman) {
        this.status_pengiriman = status_pengiriman;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getNama_perusahaan() {
        return nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }

    public String getNomor_telefon() {
        return nomor_telefon;
    }

    public void setNomor_telefon(String nomor_telefon) {
        this.nomor_telefon = nomor_telefon;
    }
}
