package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import model.patient;

public class AddActivity extends AppCompatActivity {

    private ImageView addPatient_imageView_back, ImageView10, addPatient_imageView_info;
    private TextView textView22, textView23, textView21;
    private TextInputLayout dataPasien_textInput_namaPasien, dataPasien_textInput_umur,
            dataPasien_textInput_noTelp, dataPasien_textInput_alamat,
            dataPasien_textInput_noTelpKeluarga, anamnesis_textInput_riwayatPenyakitPsien,
            anamnesis_textInput_riwayatPenyakitKeluagaPasien, anamnesis_textInput_obatKonsumsi,
            anamnesis_textInput_alergiObat, anamnesis_textInput_alergiMakanan,
            anamnesis_textInput_tekananDarah, anamnesis_textInput_gulaDarah, pKasus_textInput_pKasus,
            pFisik_textInput_nadi, pFisik_textInput_tinggi, pFisik_textInput_berat,
            pFisik_textInput_lingkarPerut, pFisik_textInput_fisikMata, pLab_textInput_hemoglobin,
            pLab_textInput_eritrosit, pLab_textInput_leukosit, pLab_textInput_trombosit,
            prognosis_textInput_prognosis, diagnosis_textInput_diagnosis,
            komplikasi_textInput_komplikasi, mKlinis_textInput_mKlinis,
            tatalaksana_textInput_tatalaksana;
    private Button addPatient_button_save;
    private RadioGroup dataPasien_radioGroup_jKelamin;
    private String jenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        ImageView10 = findViewById(R.id.ImageView10);
        addPatient_imageView_back = findViewById(R.id.addPatient_imageView_back);

        dataPasien_textInput_namaPasien = findViewById(R.id.dataPasien_textInput_namaPasien);
        dataPasien_radioGroup_jKelamin = findViewById(R.id.dataPasien_radioGroup_jKelamin);
        jenisKelamin = "";
        dataPasien_textInput_umur = findViewById(R.id.dataPasien_textInput_umur);
        dataPasien_textInput_noTelp = findViewById(R.id.dataPasien_textInput_noTelp);
        dataPasien_textInput_alamat = findViewById(R.id.dataPasien_textInput_alamat);
        dataPasien_textInput_noTelpKeluarga = findViewById(R.id.dataPasien_textInput_noTelpKeluarga);

        anamnesis_textInput_riwayatPenyakitPsien = findViewById(R.id.anamnesis_textInput_riwayatPenyakitPsien);
        anamnesis_textInput_riwayatPenyakitKeluagaPasien = findViewById(R.id.anamnesis_textInput_riwayatPenyakitKeluagaPasien);
        anamnesis_textInput_obatKonsumsi = findViewById(R.id.anamnesis_textInput_obatKonsumsi);
        anamnesis_textInput_alergiObat = findViewById(R.id.anamnesis_textInput_alergiObat);
        anamnesis_textInput_alergiMakanan = findViewById(R.id.anamnesis_textInput_alergiMakanan);
        anamnesis_textInput_tekananDarah = findViewById(R.id.anamnesis_textInput_tekananDarah);
        anamnesis_textInput_gulaDarah = findViewById(R.id.anamnesis_textInput_gulaDarah);

        pKasus_textInput_pKasus = findViewById(R.id.pKasus_textInput_pKasus);

        pFisik_textInput_nadi = findViewById(R.id.pFisik_textInput_nadi);
        pFisik_textInput_tinggi = findViewById(R.id.pFisik_textInput_tinggi);
        pFisik_textInput_berat = findViewById(R.id.pFisik_textInput_berat);
        pFisik_textInput_lingkarPerut = findViewById(R.id.pFisik_textInput_lingkarPerut);
        pFisik_textInput_fisikMata = findViewById(R.id.pFisik_textInput_fisikMata);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView21 = findViewById(R.id.textView21);

        pLab_textInput_hemoglobin = findViewById(R.id.pLab_textInput_hemoglobin);
        pLab_textInput_eritrosit = findViewById(R.id.pLab_textInput_eritrosit);
        pLab_textInput_leukosit = findViewById(R.id.pLab_textInput_leukosit);
        pLab_textInput_trombosit = findViewById(R.id.pLab_textInput_trombosit);

        prognosis_textInput_prognosis = findViewById(R.id.prognosis_textInput_prognosis);

        diagnosis_textInput_diagnosis = findViewById(R.id.diagnosis_textInput_diagnosis);

        komplikasi_textInput_komplikasi = findViewById(R.id.komplikasi_textInput_komplikasi);

        mKlinis_textInput_mKlinis = findViewById(R.id.mKlinis_textInput_mKlinis);

        tatalaksana_textInput_tatalaksana = findViewById(R.id.tatalaksana_textInput_tatalaksana);

        addPatient_imageView_info = findViewById(R.id.addPatient_imageView_info);
        addPatient_button_save = findViewById(R.id.addPatient_button_save);

        addPatient_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        addPatient_button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = dataPasien_textInput_namaPasien.getEditText().getText().toString().trim();
                final String[] jenisKelamin = {dataPasien_textInput_namaPasien.getEditText().getText().toString().trim()};
                int umur = Integer.parseInt(dataPasien_textInput_umur.getEditText().getText().toString().trim());
                int noTelp = Integer.parseInt(dataPasien_textInput_noTelp.getEditText().getText().toString().trim());
                String alamat = dataPasien_textInput_alamat.getEditText().getText().toString().trim();
                int noTelpKel = Integer.parseInt(dataPasien_textInput_noTelpKeluarga.getEditText().getText().toString().trim());
                String riwayatP = anamnesis_textInput_riwayatPenyakitPsien.getEditText().getText().toString().trim();
                String riwayatKP = anamnesis_textInput_riwayatPenyakitKeluagaPasien.getEditText().getText().toString().trim();
                String obat = anamnesis_textInput_obatKonsumsi.getEditText().getText().toString().trim();
                String alergiO = anamnesis_textInput_alergiObat.getEditText().getText().toString().trim();
                String alergiM = anamnesis_textInput_alergiMakanan.getEditText().getText().toString().trim();
                String tekananD = anamnesis_textInput_tekananDarah.getEditText().getText().toString().trim();
                int gulaD = Integer.parseInt(anamnesis_textInput_gulaDarah.getEditText().getText().toString().trim());
                String penyebab = pKasus_textInput_pKasus.getEditText().getText().toString().trim();
                int nadi = Integer.parseInt(pFisik_textInput_nadi.getEditText().getText().toString().trim());
                int tinggi = Integer.parseInt(pFisik_textInput_tinggi.getEditText().getText().toString().trim());
                int berat = Integer.parseInt(pFisik_textInput_berat.getEditText().getText().toString().trim());
                int lingkarP = Integer.parseInt(pFisik_textInput_lingkarPerut.getEditText().getText().toString().trim());
                String fisikM = pFisik_textInput_fisikMata.getEditText().getText().toString().trim();
                int hemo = Integer.parseInt(pLab_textInput_hemoglobin.getEditText().getText().toString().trim());
                int erit = Integer.parseInt(pLab_textInput_eritrosit.getEditText().getText().toString().trim());
                int leuko = Integer.parseInt(pLab_textInput_leukosit.getEditText().getText().toString().trim());
                int trombo = Integer.parseInt(pLab_textInput_trombosit.getEditText().getText().toString().trim());
                String prognosis = prognosis_textInput_prognosis.getEditText().getText().toString().trim();
                String diagnosis = diagnosis_textInput_diagnosis.getEditText().getText().toString().trim();
                String komplikasi = komplikasi_textInput_komplikasi.getEditText().getText().toString().trim();
                String mKlinis = mKlinis_textInput_mKlinis.getEditText().getText().toString().trim();
                String tata = tatalaksana_textInput_tatalaksana.getEditText().getText().toString().trim();

                dataPasien_radioGroup_jKelamin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (checkedId == R.id.dataPasien_radioButton_pria) {
                            jenisKelamin[0] = "Pria";
                        } else if (checkedId == R.id.dataPasien_radioButton_wanita) {
                            jenisKelamin[0] = "Wanita";
                        }else{
                            jenisKelamin[0] = "Unknown";
                        }
                    }
                });


                addPatient_imageView_info.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent info = new Intent(getBaseContext(), infoNilaiRujukanActivity.class);
                        startActivity(info);
                    }
                });

                //button disable if data is empty
                if (nama != null || diagnosis != null) {
                    addPatient_button_save.setEnabled(true);
                } else {
                    addPatient_button_save.setEnabled(false);
                }

                FirebaseFirestore db = FirebaseFirestore.getInstance();
                Map<String, String> save = new HashMap<>();

                save.put("Nama Pasien", nama);
                save.put("Jenis Kelamin", jenisKelamin[0]);
                save.put("Umur", String.valueOf(umur));
                save.put("No.Telp", String.valueOf(noTelp));
                save.put("Alamat", alamat);
                save.put("No.Telp Keluarga", String.valueOf(noTelpKel));
                save.put("Riwayat Penyakit Pasien", riwayatP);
                save.put("Riwayat Penyakit Keluarga Pasien", riwayatKP);
                save.put("Obat Yang Telah Dikonsumsi", obat);
                save.put("Alergi Obat", alergiO);
                save.put("Alergi Makanan", alergiM);
                save.put("Tekanan Darah Terakhir", tekananD);
                save.put("Gula Darah Terakhir", String.valueOf(gulaD));
                save.put("Penyebab Kasus", penyebab);
                save.put("Nadi", String.valueOf(nadi));
                save.put("Tinggi Badan", String.valueOf(tinggi));
                save.put("Berat Badan", String.valueOf(berat));
                save.put("Lingkar Perut", String.valueOf(lingkarP));
                save.put("Fisik Mata", fisikM);
                save.put("Hemoglobin", String.valueOf(hemo));
                save.put("Eritrosit", String.valueOf(erit));
                save.put("Leukosit", String.valueOf(leuko));
                save.put("Trombosit", String.valueOf(trombo));
                save.put("Prognosis", prognosis);
                save.put("Diagnosis", diagnosis);
                save.put("Komplikasi", komplikasi);
                save.put("Manifestasi Klinis", mKlinis);
                save.put("Tatalaksana", tata);

                db.collection("Patients").document().set(save).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(AddActivity.this, "Patient's Data Saved", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(AddActivity.this, "Patient's Data Failed To Save", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}