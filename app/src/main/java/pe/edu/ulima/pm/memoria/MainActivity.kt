package pe.edu.ulima.pm.memoria

import android.graphics.Color
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

        val colors: List<String> = listOf("#EBF5DF", "#EDB458", "#80CED7", "#CCDBDC", "#C5D1EB", "#FEFCAD", "#A7BED3", "#9F86C0")

        val randomEmojis: List<String> = (emojis + emojis).shuffled()

        val randomColor: String = colors.shuffled().take(1)[0]

        val buttons: Array<Button> = arrayOf(
            findViewById(R.id.but1),
            findViewById(R.id.but2),
            findViewById(R.id.but3),
            findViewById(R.id.but4),
            findViewById(R.id.but5),
            findViewById(R.id.but6),
            findViewById(R.id.but7),
            findViewById(R.id.but8),
            findViewById(R.id.but9),
            findViewById(R.id.but10),
            findViewById(R.id.but11),
            findViewById(R.id.but12)
        )

        buttons.forEachIndexed { index, but ->
            but.text = randomEmojis[index]
            but.setBackgroundColor(Color.parseColor(randomColor))
        }
    }


    fun BotonClick(view: View) {
        val but: Button = view as Button
        if (but.textSize == 0F){
            but.setTextSize(40F)
        }
        else{
            but.setTextSize(0F)
        }

    }


}
