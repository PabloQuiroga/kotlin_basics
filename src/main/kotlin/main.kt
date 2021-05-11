import java.time.LocalDateTime

fun main() {
    println("Comienza la ejecucion del programa")
    mostrarFecha()
}

fun mostrarFecha(){
    val fechaActual = LocalDateTime.now()
    println("La fecha actual es $fechaActual")
}