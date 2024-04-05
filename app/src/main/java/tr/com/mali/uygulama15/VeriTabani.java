package tr.com.mali.uygulama15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import tr.com.mali.uygulama15.databinding.ActivityVeriTabaniBinding;

public class VeriTabani extends AppCompatActivity {
    private ActivityVeriTabaniBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityVeriTabaniBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Intent intent = getIntent();
        Kisi kisi =intent.getParcelableExtra("kisiKey");
        binding.textisimSoyad.setText(kisi.getAdSoyad());

        binding.textsifre.setText(kisi.getsifre());
    }
}