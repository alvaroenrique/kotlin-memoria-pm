package pe.edu.ulima.pm.memoria

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.graphics.drawable.DrawableCompat

class MainActivity : AppCompatActivity() {

    var currentButton: Button? = null
    var intentos: Int = 1
    var jugadas_acertadas: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initGame()
    }

    fun initGame() {
        val msg = findViewById<TextView>(R.id.msg)
        msg.text = "Turno del jugador"
        this.intentos = 1
        this.jugadas_acertadas = 0
        this.currentButton = null
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

        val colors: List<String> = listOf("#EDB458", "#80CED7", "#6EEB83", "#D7263D")

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
            but.setTextSize(0f)
            but.text = randomEmojis[index]
            val background = but.background as RippleDrawable
            val backgroundGradient =
                background.findDrawableByLayerId(R.id.item_shape) as GradientDrawable
            backgroundGradient.setColor(Color.parseColor(randomColor))

        }
    }


    fun BotonClick(view: View) {
        val msg = findViewById<TextView>(R.id.msg)
        val but: Button = view as Button
        if (this.jugadas_acertadas == 6) {
            initGame()
        } else if (this.currentButton == null) {
            msg.text = "Turno del jugador"
            but.setTextSize(40F)
            but.isClickable = false
            this.currentButton = but
        } else if (but.text == this.currentButton!!.text) {
            but.setTextSize(40F)
            but.isClickable = false
            this.currentButton!!.isClickable = false
            this.currentButton = null
            this.jugadas_acertadas = this.jugadas_acertadas + 1
            if (this.jugadas_acertadas == 6) {
                msg.text = "Ganaste! te tomaron " + this.intentos + " intentos"
                makeButtonsClickeables()
            }
        } else if (but.text != this.currentButton!!.text) {
            but.textSize = 0F
            this.currentButton!!.textSize = 0F
            but.isClickable = true
            this.currentButton!!.isClickable = true
            this.currentButton = null

            this.intentos = this.intentos + 1
            msg.text = "Error"


        }

    }

    fun makeButtonsClickeables() {
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
            but.isClickable = true
        }
    }


}
