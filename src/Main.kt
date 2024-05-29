import javax.swing.ImageIcon
import javax.swing.JFrame
import kotlin.concurrent.fixedRateTimer

fun main() {
    // Create a JFrame window with the title "Survive the Wild"
    val frame = JFrame("Survive the Wild")

    val iconImage = ImageIcon("resources/icon.png")

    // Create an instance of GamePanel
    val gamePanel = GamePanel()

    // Set the default close operation to exit the application when the window is closed
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    // Add the gamePanel to the frame
    frame.add(gamePanel)

    // Pack the frame to fit the preferred size and layouts of its subcomponents
    frame.pack()

    // Make the frame visible
    frame.isVisible = true

    // Start the game loop with a fixed-rate timer
    // This timer triggers the update and repaint functions every 16 milliseconds (approx. 60 FPS)
    fixedRateTimer(name = "game-loop-timer", initialDelay = 0, period = 16) {
        gamePanel.update()
        gamePanel.repaint()
    }
}
