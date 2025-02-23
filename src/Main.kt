

fun tomarPrestado(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Estudiante -> "El estudiante ${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por 14 días."
        is Profesor -> "El profesor ${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por 30 días."
        is Visitante -> "El visitante ${usuario.nombre} no puede tomar prestado libros."
    }
}

fun main() {
    val libroEjemplo = Libro("Aceitunas con mayonesa", "Paquito Chocolater", 2003)
    val estudiante = Estudiante("001", "Carlos Pérez", "Ingeniería")
    val profesor = Profesor("002", "Dayron", "Filosofía")
    val visitante = Visitante("003", "Luis Ramírez")

    println(tomarPrestado(estudiante, libroEjemplo))
    println(tomarPrestado(profesor, libroEjemplo))
    println(tomarPrestado(visitante, libroEjemplo))
}