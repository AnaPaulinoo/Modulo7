class exercicio5 {
}fun main() {
    print("Digite um número: ")
    val numero = readLine()?.toDoubleOrNull()

    if (numero != null) {
        if (numero > 0) {
            println("O número é positivo.")
        } else if (numero < 0) {
            println("O número é negativo.")
        } else {
            println("O número é zero.")
        }
    } else {
        println("Entrada inválida. Por favor, digite um número válido.")
    }
}