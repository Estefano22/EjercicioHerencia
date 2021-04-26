fun main() {

    val Esgrima = Esgrima(NombreParticipante("Javier"))

    val Maraton = Maraton(NombreParticipante("Antonio"))

    val Natacion = Natacion(NombreParticipante("Paco"))

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



class Maraton(nombre : NombreParticipante) : Participante(nombre), Decir {

    override fun decir() {
        println("yo corro durante mucho rato")
    }
}

class Esgrima(nombre : NombreParticipante) : Participante(nombre), Decir {

    override fun decir() {
        println("yo pego espadazos")
    }
}

class Natacion(nombre : NombreParticipante) : Participante(nombre), Decir {

    override fun decir() {
        println("chof, chof, chof")
    }
}
interface Decir {
    fun decir()
}
