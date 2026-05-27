package trivia_preguntas

class BancoPreguntas {

    private val listaPreguntas = mutableListOf<Pregunta>()

    fun inicializarTrivia() {
        listaPreguntas.clear()

        listaPreguntas.add(
            Pregunta(
                1,
                "¿Qué palabra clave se usa para declarar una variable que no cambia en Kotlin?",
                listOf("var", "val", "fun", "class"),
                2,
                "Variables"
            )
        )

        listaPreguntas.add(
            Pregunta(
                2,
                "¿Qué palabra clave se usa para declarar una variable que sí puede cambiar?",
                listOf("var", "val", "const", "data"),
                1,
                "Variables"
            )
        )

        listaPreguntas.add(
            Pregunta(
                3,
                "¿Qué función se usa para imprimir texto en consola?",
                listOf("show()", "console()", "println()", "write()"),
                3,
                "Consola"
            )
        )

        listaPreguntas.add(
            Pregunta(
                4,
                "¿Qué palabra clave se usa para crear una función en Kotlin?",
                listOf("function", "fun", "def", "method"),
                2,
                "Funciones"
            )
        )

        listaPreguntas.add(
            Pregunta(
                5,
                "¿Qué estructura se usa para tomar decisiones en Kotlin?",
                listOf("if", "print", "readLine", "listOf"),
                1,
                "Condicionales"
            )
        )

        listaPreguntas.add(
            Pregunta(
                6,
                "¿Qué estructura permite evaluar varias opciones de forma ordenada?",
                listOf("while", "when", "forEach", "val"),
                2,
                "Condicionales"
            )
        )

        listaPreguntas.add(
            Pregunta(
                7,
                "¿Qué operador ayuda a evitar errores cuando un valor puede ser nulo?",
                listOf("?.", "++", "--", "=="),
                1,
                "Null Safety"
            )
        )

        listaPreguntas.add(
            Pregunta(
                8,
                "¿Qué operador se conoce como operador Elvis en Kotlin?",
                listOf("?.", "?:", "!!", "::"),
                2,
                "Null Safety"
            )
        )

        listaPreguntas.add(
            Pregunta(
                9,
                "¿Qué función convierte un texto a número entero de forma segura?",
                listOf("toInt()", "parseInt()", "toIntOrNull()", "readInt()"),
                3,
                "Null Safety"
            )
        )

        listaPreguntas.add(
            Pregunta(
                10,
                "¿Qué tipo de clase se usa principalmente para almacenar datos?",
                listOf("data class", "open class", "sealed class", "abstract class"),
                1,
                "Data Class"
            )
        )

        listaPreguntas.add(
            Pregunta(
                11,
                "¿Qué función crea una lista inmutable en Kotlin?",
                listOf("mutableListOf()", "listOf()", "arrayListOf()", "mapOf()"),
                2,
                "Colecciones"
            )
        )

        listaPreguntas.add(
            Pregunta(
                12,
                "¿Qué función permite recorrer una lista aplicando una acción a cada elemento?",
                listOf("forEach", "find", "filter", "count"),
                1,
                "Colecciones"
            )
        )
    }

    fun obtenerPreguntasDelJuego(): List<Pregunta> {
        return listaPreguntas.shuffled()
    }

    fun contarPreguntas(): Int {
        return listaPreguntas.count()
    }
}