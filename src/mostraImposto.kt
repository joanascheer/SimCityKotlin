fun mostraImposto(impostoAPagar: DoubleArray, salarioComDesconto: DoubleArray) {

    println("*** Demonstrativo de Impostos ***\n")

    for (i in impostoAPagar.indices) {
        println("Mês ${i + 1}: Valor a receber: R$${impostoAPagar[i]} - Valor do imposto: R$${salarioComDesconto[i]}")
    }

    println()

}