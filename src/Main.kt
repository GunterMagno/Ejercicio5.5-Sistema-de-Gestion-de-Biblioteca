

fun tomarPrestado(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Estudiante -> "El estudiante ${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por 14 días."
        is Profesor -> "El profesor ${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por 30 días."
        is Visitante -> "El visitante ${usuario.nombre} no puede tomar prestado libros."
    }
}

fun main() {
    val libroEjemplo = Libro("1984", "George Orwell", 1949)
    val estudiante = Estudiante("E001", "Carlos Pérez", "Ingeniería")
    val profesor = Profesor("P001", "Dra. Ana Gómez", "Filosofía")
    val visitante = Visitante("V001", "Luis Ramírez")

    println(tomarPrestado(estudiante, libroEjemplo))
    println(tomarPrestado(profesor, libroEjemplo))
    println(tomarPrestado(visitante, libroEjemplo))
}