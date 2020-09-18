package id.putraprima.mobile06siplecalcsolution;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button_kali, button_tambah,button_kurang, button_bagi;
    private TextView text_hasil;
    private EditText edit_text_angka_pertama,edit_text_angka_kedua;

    private int angka_pertama, angka_kedua;
    private int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_kali = findViewById(R.id.button_kali);
        button_bagi = findViewById(R.id.button_bagi);
        button_kurang = findViewById(R.id.button_kurang);
        button_tambah = findViewById(R.id.button_tambah);
        text_hasil = findViewById(R.id.text_hasil);
        edit_text_angka_kedua = findViewById(R.id.edit_text_angka_kedua);
        edit_text_angka_pertama = findViewById(R.id.edit_text_angka_pertama);

        button_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan();
                text_hasil.setText(angka_pertama*angka_kedua);
                text_hasil.setText(String.valueOf(total));
            }
        });

        button_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan();
                if(angka_kedua > 0){
                    total = angka_pertama/angka_kedua;
                    text_hasil.setText(String.valueOf(total));
                }else{
                    text_hasil.setText("Not A Number");
                }
            }
        });

        button_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan();
                total = angka_pertama-angka_kedua;
                text_hasil.setText(String.valueOf(total));

            }
        });

        button_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan();
                total = angka_pertama+angka_kedua;
                text_hasil.setText(String.valueOf(total));
            }
        });
    }

    public void getAngkaMasukan(){
        angka_pertama = Integer.parseInt(String.valueOf(edit_text_angka_pertama.getText()));
        angka_kedua = Integer.parseInt(String.valueOf(edit_text_angka_kedua.getText()));
    }
}