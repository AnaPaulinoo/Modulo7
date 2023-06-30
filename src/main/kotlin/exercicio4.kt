class exercicio4 {
}fun main() {
    print("Digite a temperatura em graus Celsius: ")
    val temperatura = readLine()?.toDoubleOrNull()

    if (temperatura != null) {
        if (temperatura <= 18) {
            println("O clima está frio.")
        } else if (temperatura in 19.0..23.0) {
            println("O clima está agradável.")
        } else if (temperatura in 24.0..35.0) {
            println("O clima está quente.")
        } else if (temperatura > 35) {
            println("O clima está muito quente.")
        } else {
            println("A temperatura não corresponde a um tipo de clima definido.")
        }
    } else {
        println("Entrada inválida. Por favor, digite um número válido para a temperatura.")
    }
}