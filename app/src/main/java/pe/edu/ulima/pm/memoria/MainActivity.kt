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
        initGame()
    }

    fun initGame() {
        val emojis: Array<String> = arrayOf(
            "\uD83D\uDE00",
            "\uD83D\uDE03",
            "\uD83D\uDE04",
            "\uD83D\uDE01",
            "\uD83D\uDE06",
            "\uD83D\uDE05"
        )

        val emejisToAsign = emojis + emojis

        val buttons: Array<Button> = arrayOf(
            findViewById<Button>(R.id.but1),
            findViewById<Button>(R.id.but2),
            findViewById<Button>(R.id.but3),
            findViewById<Button>(R.id.but4),
            findViewById<Button>(R.id.but5),
            findViewById<Button>(R.id.but6),
            findViewById<Button>(R.id.but7),
            findViewById<Button>(R.id.but8),
            findViewById<Button>(R.id.but9),
            findViewById<Button>(R.id.but10),
            findViewById<Button>(R.id.but11),
            findViewById<Button>(R.id.but12)
        )

        buttons.forEachIndexed { index, element ->
            element.text = emejisToAsign[index]
        }
    }
}
