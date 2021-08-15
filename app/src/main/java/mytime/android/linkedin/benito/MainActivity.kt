package mytime.android.linkedin.benito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ingresar: EditText = findViewById(R.id.ingresar)
        val buttonFirst: Button = findViewById(R.id.buttonFirst)

        buttonFirst.setOnClickListener(){
            val intent = Intent(this, Alcibiades::class.java)
            intent.putExtra("Hola", ingresar.text.toString())
            startActivity(intent)
        }
    }
}