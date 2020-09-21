package id.putraprima.mobile06siplecalcsolution

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var multiplyBtn: Button
    private lateinit var plusBtn: Button
    private lateinit var minusBtn: Button
    private lateinit var divideBtn: Button
    private lateinit var resultTxt: TextView
    private lateinit var number1Edt: EditText
    private lateinit var number2Edt: EditText
    private val num1 = 0
    private val num2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        multiplyBtn = findViewById(R.id.button_kali)
        divideBtn = findViewById(R.id.button_bagi)
        minusBtn = findViewById(R.id.button_kurang)
        plusBtn = findViewById(R.id.button_tambah)
        resultTxt = findViewById(R.id.text_hasil)
        number2Edt = findViewById(R.id.edit_text_angka_kedua)
        number1Edt = findViewById(R.id.edit_text_angka_pertama)

        //TODO 02 Buatlah kode program untuk menambahkan event klik dari tombol kali dan tombol bagi

        //TODO 03 Gunakanlah Log Cat Untuk memperbaiki kesalahan program

        //TODO 04 Gunakanlah Debugger untuk mencari kesalahan program (program berjalan dengan baik namun hasilnya salah)

        //TODO 05 Buatlah Validasi input agar masukan yang di isi oleh user tidak membuat program Force Close

        minusBtn.setOnClickListener {
            getAngkaMasukkan()
            resultTxt.setText(num1-num2)
        }

        plusBtn.setOnClickListener {
            getAngkaMasukkan()
            resultTxt.setText(num1+num2)
        }

    }

    fun getAngkaMasukkan(){
        //TODO 01 Buatlah kode program untuk mengambil nilai input dari edit text
    }
}