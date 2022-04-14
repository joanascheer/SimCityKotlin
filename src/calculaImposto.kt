fun calculaImposto(salarios: DoubleArray, impostoAPagar: DoubleArray, salarioComDesconto: DoubleArray): DoubleArray {

    for (i in impostoAPagar.indices) {

        if (salarios[i] <= 2000.0) {
            impostoAPagar[i] = 0.0;
            salarioComDesconto[i] = salarios[i] - impostoAPagar[i];

        } else if (salarios[i] in 2001.00..3000.0) {
            impostoAPagar[i] = salarios[i] * 8 / 100;
            salarioComDesconto[i] = salarios[i] - impostoAPagar[i];

        } else if (salarios[i] in 3001.0..4500.0) {
            impostoAPagar[i] = (salarios[i] * 18) / 100;
            salarioComDesconto[i] = salarios[i] - impostoAPagar[i];

        } else if (salarios[i] > 4500.0) {
            impostoAPagar[i] = (salarios[i] * 28) / 100;
            salarioComDesconto[i] = salarios[i] - impostoAPagar[i];

        }

    }

    return impostoAPagar

}
