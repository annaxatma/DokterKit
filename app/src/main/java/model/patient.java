package model;

public class patient {
    public String nama, jenisKelamin, alamat, riwayatP, riwayatKP,
                  obat, alergiO, alergiM, penyebab, fisikM, prognosis, diagnosis, komplikasi,
                  mKlinis, tata;
    public int umur, noTelp, noTelpKel, tekananD, gulaD, nadi, tinggi, berat,
               lingkarP, hemo, erit, leuko, trombo;

    public patient() {
    }

    public patient(String nama, String jenisKelamin, String alamat, String riwayatP, String riwayatKP, String obat, String alergiO, String alergiM, String penyebab, String fisikM, String prognosis, String diagnosis, String komplikasi, String mKlinis, String tata, int umur, int noTelp, int noTelpKel, int tekananD, int gulaD, int nadi, int tinggi, int berat, int lingkarP, int hemo, int erit, int leuko, int trombo) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.riwayatP = riwayatP;
        this.riwayatKP = riwayatKP;
        this.obat = obat;
        this.alergiO = alergiO;
        this.alergiM = alergiM;
        this.penyebab = penyebab;
        this.fisikM = fisikM;
        this.prognosis = prognosis;
        this.diagnosis = diagnosis;
        this.komplikasi = komplikasi;
        this.mKlinis = mKlinis;
        this.tata = tata;
        this.umur = umur;
        this.noTelp = noTelp;
        this.noTelpKel = noTelpKel;
        this.tekananD = tekananD;
        this.gulaD = gulaD;
        this.nadi = nadi;
        this.tinggi = tinggi;
        this.berat = berat;
        this.lingkarP = lingkarP;
        this.hemo = hemo;
        this.erit = erit;
        this.leuko = leuko;
        this.trombo = trombo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRiwayatP() {
        return riwayatP;
    }

    public void setRiwayatP(String riwayatP) {
        this.riwayatP = riwayatP;
    }

    public String getRiwayatKP() {
        return riwayatKP;
    }

    public void setRiwayatKP(String riwayatKP) {
        this.riwayatKP = riwayatKP;
    }

    public String getObat() {
        return obat;
    }

    public void setObat(String obat) {
        this.obat = obat;
    }

    public String getAlergiO() {
        return alergiO;
    }

    public void setAlergiO(String alergiO) {
        this.alergiO = alergiO;
    }

    public String getAlergiM() {
        return alergiM;
    }

    public void setAlergiM(String alergiM) {
        this.alergiM = alergiM;
    }

    public String getPenyebab() {
        return penyebab;
    }

    public void setPenyebab(String penyebab) {
        this.penyebab = penyebab;
    }

    public String getFisikM() {
        return fisikM;
    }

    public void setFisikM(String fisikM) {
        this.fisikM = fisikM;
    }

    public String getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(String prognosis) {
        this.prognosis = prognosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getKomplikasi() {
        return komplikasi;
    }

    public void setKomplikasi(String komplikasi) {
        this.komplikasi = komplikasi;
    }

    public String getmKlinis() {
        return mKlinis;
    }

    public void setmKlinis(String mKlinis) {
        this.mKlinis = mKlinis;
    }

    public String getTata() {
        return tata;
    }

    public void setTata(String tata) {
        this.tata = tata;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public int getNoTelpKel() {
        return noTelpKel;
    }

    public void setNoTelpKel(int noTelpKel) {
        this.noTelpKel = noTelpKel;
    }

    public int getTekananD() {
        return tekananD;
    }

    public void setTekananD(int tekananD) {
        this.tekananD = tekananD;
    }

    public int getGulaD() {
        return gulaD;
    }

    public void setGulaD(int gulaD) {
        this.gulaD = gulaD;
    }

    public int getNadi() {
        return nadi;
    }

    public void setNadi(int nadi) {
        this.nadi = nadi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getLingkarP() {
        return lingkarP;
    }

    public void setLingkarP(int lingkarP) {
        this.lingkarP = lingkarP;
    }

    public int getHemo() {
        return hemo;
    }

    public void setHemo(int hemo) {
        this.hemo = hemo;
    }

    public int getErit() {
        return erit;
    }

    public void setErit(int erit) {
        this.erit = erit;
    }

    public int getLeuko() {
        return leuko;
    }

    public void setLeuko(int leuko) {
        this.leuko = leuko;
    }

    public int getTrombo() {
        return trombo;
    }

    public void setTrombo(int trombo) {
        this.trombo = trombo;
    }
}
