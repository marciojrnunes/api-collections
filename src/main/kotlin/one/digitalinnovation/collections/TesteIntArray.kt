package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)        //Criando uma variável values como um Array de Inteiros de tamanho 5

    //Inicializa cada posição do array
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //Formas de acessar cada valor no IntArray values
    println("utilizando in")
    for (valor in values){
        println(valor)  //imprime cada elemento do array values
    }

    println("utilizando .foreach")
    values.forEach {
        println(it)
    }

    println("utilizando .indices")
    for (index in values.indices) {
        println(values[index])
    }

    println("utilizando .sort")
    values.sort()
    for (valor in values) {
        println(valor)
    }


}