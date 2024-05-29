
import java.awt.Graphics
import java.awt.Image
import javax.swing.ImageIcon

class Player(var x: Int, var y: Int) {
    private val image: Image = ImageIcon("resources/player.png").image
    private var health = 100
    private var hunger = 100
    private var thirst = 100

    fun update() {
        // Update hunger and thirst over time
        hunger = (hunger - 1).coerceAtLeast(0)
        thirst = (thirst - 1).coerceAtLeast(0)
        if (hunger == 0 || thirst == 0) {
            health = (health - 1).coerceAtLeast(0)
        }
    }

    fun draw(g: Graphics) {
        g.drawImage(image, x, y, null)
    }

    fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
}
