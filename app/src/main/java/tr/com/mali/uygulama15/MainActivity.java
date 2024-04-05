package tr.com.mali.uygulama15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import tr.com.mali.uygulama15.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void onayla(View view) {
        String kullaniciAdi= binding.editTextName.getText().toString();

        String sifre =binding.editTextsifre.getText().toString();

        Kisi kisi = new Kisi(kullaniciAdi,sifre);

        Intent intent = new Intent(MainActivity.this,VeriTabani.class);
        intent.putExtra("kisiKey",kisi);
        startActivity(intent);
    }
}