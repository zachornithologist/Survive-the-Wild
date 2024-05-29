

import java.awt.Color

class DayNightCycle {
    private var time = 0.0
    private val dayLength = 60.0 // in seconds

    fun update() {
        time += 1 / 60.0
        if (time > dayLength) time = 0.0
    }

    fun getBackgroundColor(): Color {
        val progress = (time / dayLength).coerceIn(0.0, 1.0)
        return if (progress < 0.5) {
            Color(135, 206, 250) // Day color
        } else {
            Color(25, 25, 112) // Night color
        }
    }
}
