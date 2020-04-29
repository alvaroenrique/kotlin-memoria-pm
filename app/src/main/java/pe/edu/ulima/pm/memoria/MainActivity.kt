package pe.edu.ulima.pm.memoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun butOnClick(view: View) {
        val but: Button = view as Button

        if (but.text==""){
            but.text = "\uD83D\uDE00"
        }
        else {
            but.text = ""
        }
        Log.i("HolaAndroid", "Me hizo click en el boton" + but.text)
    }
}
