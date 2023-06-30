class exercicio8 {
}fun main() {
    print("Digite o valor de x: ")
    var x = readLine()?.toIntOrNull()

    print("Digite o valor de y: ")
    var y = readLine()?.toIntOrNull()

    if (x != null && y != null) {
        val temp = x
        x = y
        y = temp

        println("Após a troca, o valor de x é: $x")
        println("Após a troca, o valor de y é: $y")
    } else println("Entrada inválida. Por favor, digite valores inteiros válidos.")
}


