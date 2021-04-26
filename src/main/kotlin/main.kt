fun main() {

    val Esgrima = Esgrima(NombreParticipante("Javier"))

    val Maraton = Maratón(NombreParticipante("Antonio"))

    val Natacion = Natación(NombreParticipante("Paco"))


    val listaEspecialidades = mutableListOf(Esgrima, Maraton, Natacion)
    listaEspecialidades.forEach {
        it.nombreParticipante()
        it.decir()

    }

}

class NombreParticipante(var nombre: String)

open class Participante(val nombreParticipante : NombreParticipante){

    fun nombreParticipante() {

        println("Soy ${nombreParticipante.nombre} ")
    }
}

class Esgrima(nombre : NombreParticipante) : Participante(nombre), Decir {

    override fun decir() {
        println("yo pego espadazos")
    }
}

class Maratón(nombre : NombreParticipante) : Participante(nombre), Decir {

    override fun decir() {
        println("yo corro durante mucho rato")
    }
}

class Natación(nombre : NombreParticipante) : Participante(nombre), Decir {

    override fun decir() {
        println("chof, chof, chof")
    }
}
interface Decir {
    fun decir()
}
