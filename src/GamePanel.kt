
import java.awt.Color
import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JPanel

class GamePanel : JPanel() {
    private val player = Player(400, 300)
    private val cycle = DayNightCycle()

    init {
        preferredSize = Dimension(800, 600)
        background = Color(0x2b2b2b)
        addKeyListener(InputHandler(player))
        isFocusable = true
    }

    fun update() {
        cycle.update()
        player.update()
    }

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        background = cycle.getBackgroundColor()
        player.draw(g)
    }
}
