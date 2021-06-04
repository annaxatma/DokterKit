package model;

public class Pengguna {
    public String nama, username, email, namaRS, notelp, ahli;

    public Pengguna(String nama, String username, String email){
        this.nama = nama;
        this.username = username;
        this.email = email;
    }

    public Pengguna(){
        this.nama = "";
        this.username = "";
        this.email = "";
        this.namaRS = "";
        this.notelp = "";
        this.ahli = "";
    }

    public Pengguna(String nama, String username, String email, String namaRS, String notelp, String ahli) {
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.namaRS = namaRS;
        this.notelp = notelp;
        this.ahli = ahli;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaRS() {
        return namaRS;
    }

    public void setNamaRS(String namaRS) {
        this.namaRS = namaRS;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getAhli() {
        return ahli;
    }

    public void setAhli(String ahli) {
        this.ahli = ahli;
    }
}
