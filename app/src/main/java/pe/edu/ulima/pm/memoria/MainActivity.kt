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
        val emojis: List<String> = listOf(
            "\uD83D\uDE00",
            "\uD83D\uDE03",
            "\uD83D\uDE04",
            "\uD83D\uDE01",
            "\uD83D\uDE06",
            "\uD83D\uDE05",
            "\uD83D\uDC7D",
            "\uD83D\uDC7E",
            "\uD83D\uDC7B",
            "\uD83D\uDCA9",
            "\uD83D\uDC4D",
            "\uD83D\uDE4D",
            "\uD83C\uDF66",
            "\uD83C\uDF70",
            "\uD83C\uDF7A",
            "\uD83C\uDF0D",
            "\uD83C\uDFD8"
        ).shuffled().take(6)

        val emejisToAsign = (emojis + emojis).shuffled()

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
