package model;

public class patient {
    public static String nama,jenisKelamin,alamat,riwayatP,riwayatKP,obat,alergiO,alergiM,penyebab,fisikM,
                        prognosis,diagnosis,komplikasi,mKlinis,tata;
    public static int umur, noTelp, noTelpKel, tekananD, gulaD, nadi, tinggi, berat,
               lingkarP, hemo, erit, leuko, trombo;
    public int id;

    public patient() {
        this.id = 0;
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

    public patient(int id, String nama) {
        this.id = 0;
        this.nama = nama;
    }

    public patient(int id, String nama, String jenisKelamin, String alamat, String riwayatP, String riwayatKP, String obat, String alergiO, String alergiM, String penyebab, String fisikM, String prognosis, String diagnosis, String komplikasi, String mKlinis, String tata, int umur, int noTelp, int noTelpKel, int tekananD, int gulaD, int nadi, int tinggi, int berat, int lingkarP, int hemo, int erit, int leuko, int trombo) {
        this.id = 0;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        patient.nama = nama;
    }

    public static String getJenisKelamin() {
        return jenisKelamin;
    }

    public static void setJenisKelamin(String jenisKelamin) {
        patient.jenisKelamin = jenisKelamin;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        patient.alamat = alamat;
    }

    public static String getRiwayatP() {
        return riwayatP;
    }

    public static void setRiwayatP(String riwayatP) {
        patient.riwayatP = riwayatP;
    }

    public static String getRiwayatKP() {
        return riwayatKP;
    }

    public static void setRiwayatKP(String riwayatKP) {
        patient.riwayatKP = riwayatKP;
    }

    public static String getObat() {
        return obat;
    }

    public static void setObat(String obat) {
        patient.obat = obat;
    }

    public static String getAlergiO() {
        return alergiO;
    }

    public static void setAlergiO(String alergiO) {
        patient.alergiO = alergiO;
    }

    public static String getAlergiM() {
        return alergiM;
    }

    public static void setAlergiM(String alergiM) {
        patient.alergiM = alergiM;
    }

    public static String getPenyebab() {
        return penyebab;
    }

    public static void setPenyebab(String penyebab) {
        patient.penyebab = penyebab;
    }

    public static String getFisikM() {
        return fisikM;
    }

    public static void setFisikM(String fisikM) {
        patient.fisikM = fisikM;
    }

    public static String getPrognosis() {
        return prognosis;
    }

    public static void setPrognosis(String prognosis) {
        patient.prognosis = prognosis;
    }

    public static String getDiagnosis() {
        return diagnosis;
    }

    public static void setDiagnosis(String diagnosis) {
        patient.diagnosis = diagnosis;
    }

    public static String getKomplikasi() {
        return komplikasi;
    }

    public static void setKomplikasi(String komplikasi) {
        patient.komplikasi = komplikasi;
    }

    public static String getmKlinis() {
        return mKlinis;
    }

    public static void setmKlinis(String mKlinis) {
        patient.mKlinis = mKlinis;
    }

    public static String getTata() {
        return tata;
    }

    public static void setTata(String tata) {
        patient.tata = tata;
    }

    public static int getUmur() {
        return umur;
    }

    public static void setUmur(int umur) {
        patient.umur = umur;
    }

    public static int getNoTelp() {
        return noTelp;
    }

    public static void setNoTelp(int noTelp) {
        patient.noTelp = noTelp;
    }

    public static int getNoTelpKel() {
        return noTelpKel;
    }

    public static void setNoTelpKel(int noTelpKel) {
        patient.noTelpKel = noTelpKel;
    }

    public static int getTekananD() {
        return tekananD;
    }

    public static void setTekananD(int tekananD) {
        patient.tekananD = tekananD;
    }

    public static int getGulaD() {
        return gulaD;
    }

    public static void setGulaD(int gulaD) {
        patient.gulaD = gulaD;
    }

    public static int getNadi() {
        return nadi;
    }

    public static void setNadi(int nadi) {
        patient.nadi = nadi;
    }

    public static int getTinggi() {
        return tinggi;
    }

    public static void setTinggi(int tinggi) {
        patient.tinggi = tinggi;
    }

    public static int getBerat() {
        return berat;
    }

    public static void setBerat(int berat) {
        patient.berat = berat;
    }

    public static int getLingkarP() {
        return lingkarP;
    }

    public static void setLingkarP(int lingkarP) {
        patient.lingkarP = lingkarP;
    }

    public static int getHemo() {
        return hemo;
    }

    public static void setHemo(int hemo) {
        patient.hemo = hemo;
    }

    public static int getErit() {
        return erit;
    }

    public static void setErit(int erit) {
        patient.erit = erit;
    }

    public static int getLeuko() {
        return leuko;
    }

    public static void setLeuko(int leuko) {
        patient.leuko = leuko;
    }

    public static int getTrombo() {
        return trombo;
    }

    public static void setTrombo(int trombo) {
        patient.trombo = trombo;
    }
}
