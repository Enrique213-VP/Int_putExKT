package mytime.android.linkedin.benito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Alcibiades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcibiades)

        val view: TextView = findViewById(R.id.view)
        val buttonEnd: Button = findViewById(R.id.buttonEnd)

        val mostrar = intent.getStringExtra("Hola")
        view.text = "$mostrar Benvenute"
        
        buttonEnd.setOnClickListener(){
            finish()
        }


    }


}