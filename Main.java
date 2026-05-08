void main() {
//1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código para filtragem.
    numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
//2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
    List<String> palavras = Arrays.asList("java", "stream", "lambda");
    // código para conversão
    palavras.stream()
            .map(String::toUpperCase)
            .toList()
            .forEach(System.out::println);
//3 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2 e colete os resultados em uma nova lista.
    List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5, 6);
    // código para filtragem e coleta
    numeros3.stream()
            .filter(n -> n % 2 != 0)
            .map(n -> n * 2)
            .toList()
            .forEach(System.out::println);
//4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez) e imprima o resultado.
    List<String> palavras4 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
    // código da filtragem
    palavras4.stream()
            .distinct()
            .forEach(System.out::println);
//5 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista e os ordene em ordem crescente.
    List<List<Integer>> listaDeNumeros = Arrays.asList(
            Arrays.asList(1, 2, 3, 4),
            Arrays.asList(5, 6, 7, 8),
            Arrays.asList(9, 10, 11, 12)
    );

    //código para filtrar e ordenar números primos
    listaDeNumeros.stream()
            .flatMap(List::stream) // Achata a lista de listas
            .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                    .noneMatch(i -> n % i == 0)) // Lógica de primo com lambda
            .sorted() // Ordena
            .forEach(n -> System.out.print(n + " ")); // Imprime cada um direto
// rangeClosed(2, raizDeN) -> Gera todos os números de 2 até a raiz quadrada de n.
// .noneMatch(i -> n % i == 0) -> Verifica se NENHUM desses números divide o 'n' perfeitamente.
// Se ninguém dividir, o número é primo!
// IntStream.rangeClosed(2, limite): Cria uma sequência de números de 2 até o limite (inclusive).
// É como um "for" automático que usamos aqui para testar se algum desses números divide o 'n'.


//6 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos, extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.
    List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Alice", 22),
            new Pessoa("Bob", 17),
            new Pessoa("Charlie", 19)
    );

    // código para filtrar pessoas
        pessoas.stream()
                .filter(p -> p.idade > 18 )
                .map(p -> p.nome)
                .sorted()
                .forEach(System.out::println);

//7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.
    List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone", 800.0, "Eletrônicos"),
            new Produto("Notebook", 1500.0, "Eletrônicos"),
            new Produto("Teclado", 200.0, "Eletrônicos"),
            new Produto("Cadeira", 300.0, "Móveis"),
            new Produto("Monitor", 900.0, "Eletrônicos"),
            new Produto("Mesa", 700.0, "Móveis")
    );

    // código para filtrar os produtos
    List<Produto> resultado = produtos.stream()
            .filter(e -> e.getCategoria().equals("Eletrônicos") && e.getPreco() < 1000 )
            .sorted(Comparator.comparingDouble(Produto::getPreco))
            .toList();

    resultado.forEach(System.out::println);
}
