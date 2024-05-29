

import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent

class InputHandler(private val player: Player) : KeyAdapter() {
    override fun keyPressed(e: KeyEvent) {
        when (e.keyCode) {
            KeyEvent.VK_LEFT -> player.move(-5, 0)
            KeyEvent.VK_RIGHT -> player.move(5, 0)
            KeyEvent.VK_UP -> player.move(0, -5)
            KeyEvent.VK_DOWN -> player.move(0, 5)
        }
    }
}
