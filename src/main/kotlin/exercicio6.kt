class exercicio6 {
}fun main() {
    print("Digite o valor em dólar: ")
    val valorEmDolar = readLine()?.toDoubleOrNull()

    print("Digite a cotação do dólar: ")
    val cotacaoDolar = readLine()?.toDoubleOrNull()

    if (valorEmDolar != null && cotacaoDolar != null) {
        val valorEmReais = valorEmDolar * cotacaoDolar
        println("O valor em reais é: R$%.2f".format(valorEmReais))
    } else {
        println("Entrada inválida. Por favor, digite valores numéricos válidos.")
    }
}