class exercicio3 {
}fun main() {
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        if (numero % 5 == 0) {
            println("O número $numero é múltiplo de 5.")
        } else {
            println("O número $numero não é múltiplo de 5.")
        }
    } else {
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }
}