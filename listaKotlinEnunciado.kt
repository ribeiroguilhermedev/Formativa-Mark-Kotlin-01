// 1. Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário. 
fun isEven(a: Int): Boolean {
    return a % 2 == 0
}


// 2. Crie uma função que receba um array de inteiros e retorne o maior número.
fun maxNumber(arr: Array<Int>): Int {
    var max = arr[0]
    for (num in arr) {
        if (num > max) {
            max = num
        }
    }
    return max
}

// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome". 

class Pessoa(val nome: String, val idade: Int)
fun main() {
    val pessoas = listOf(Pessoa("Maria", 25), Pessoa("João", 30), Pessoa("Ana", 20))
    val pessoasOrdenadas = pessoas.sortedBy { it.nome }
    println(pessoasOrdenadas)
}

// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente). 
fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

// 5. Implemente uma função lambda que retorne o maior valor entre dois números.
val maiorValor = { a: Int, b: Int -> if (a > b) a else b }


// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". Adicione um método chamado "saque" que recebe um valor como parâmetro e subtrai do saldo da conta. Se o valor do saque for maior que o saldo da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente". 
class ContaBancaria(var saldo: Double, val limite: Double) {
    fun saque(valor: Double) {
        if (valor > saldo + limite) {
            throw Exception("Saldo insuficiente")
        } else {
            saldo -= valor
        }
    }
}


// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista. 
fun longestString(lista: List<String>): String {
    var longest = lista[0]
    for (str in lista) {
        if (str.length > longest.length) {
            longest = str
        }
    }
    return longest
}


// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário. 
class Funcionario(val nome: String, val idade: Int, val salario: Double)

fun maiorSalario(funcionarios: List<Funcionario>): Funcionario {
    var maiorSalario = funcionarios[0]
    for (funcionario in funcionarios) {
        if (funcionario.salario > maiorSalario.salario) {
            maiorSalario = funcionario
        }
    }
    return maiorSalario
}



// 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente, sem usar o método de ordenação da linguagem.
fun ordenarCrescente(lista: List<Int>): List<Int> {
	val lst: MutableList<Int> = mutableListOf(lista[0])

    for(i in 1 until lista.size){
        val item = lista[i]

        for(j in lst.indices){
            if(item <= lst[j]){
                lst.add(j, item)
                break
            } else { 
                if (j == lst.size - 1){
                    lst.add(item)
                }
            }
        }
     
    }
    
    return lst
}


// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula e retorna a área do triângulo.
class Triangulo(val base: Double, val altura: Double) {
    fun area(): Double {
        return base * altura / 2
    }
}

// 11. Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra "A", em ordem alfabética.
fun comecaComA(lista: List<String>): List<String> {
    return lista.filter { it.startsWith("A") }.sorted()
}

// 12. Utilize um mapa para representar um dicionário de palavras e suas traduções.
fun main() {
    val dicionario = mapOf("cachorro" to "dog", "gato" to "cat", "mesa" to "table")
    println(dicionario["cachorro"])
}

// 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda. A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado. Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão. Use a função de ordem superior para realizar essas operações com diferentes pares de números.
fun operacaoMatematica(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

fun main() {
    val soma = { a: Int, b: Int -> a + b }
    val subtracao = { a: Int, b: Int -> a - b }
    val multiplicacao = { a: Int, b: Int -> a * b }
    val divisao = { a: Int, b: Int -> a / b }

    println(operacaoMatematica(10, 5, soma))
    println(operacaoMatematica(10, 5, subtracao))
    println(operacaoMatematica(10, 5, multiplicacao))
    println(operacaoMatematica(10, 5, divisao))
}

//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo. A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas). Em seguida, use essa função para verificar se algumas palavras são palíndromos.
fun String.isPalindromo(): Boolean {
    val str = this.toLowerCase().replace(" ", "")
    return str == str.reversed()
}

//15. Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros. Você deve criar funções de alta ordem para realizar as seguintes operações: filtrarPares: Uma função que filtra e retorna apenas os números pares do array; dobrarValores: Uma função que dobra o valor de cada número no array; somarValores: Uma função que calcula a soma de todos os valores no array. Em seguida, crie um array de números inteiros e utilize as funções de alta ordem para realizar essas operações.
fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val filtrarPares = numeros.filter { it % 2 == 0 }
    val dobrarValores = numeros.map { it * 2 }
    val somarValores = numeros.reduce { acc, i -> acc + i }

    println(filtrarPares)
    println(dobrarValores)
    println(somarValores)
}

    
