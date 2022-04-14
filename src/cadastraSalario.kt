fun cadastraSalario(salarios: DoubleArray): DoubleArray {

    println("Vamos cadastrar o salário a partir de Janeiro. Digite 0 para os meses anteriores a sua entrada na empresa.")

    for (i in salarios.indices) {
        println("Digite o salário ${i + 1} ")
        salarios[i] = readln().toDouble()
    }

    return salarios

}