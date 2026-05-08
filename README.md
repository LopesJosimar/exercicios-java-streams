# ☕ Java Stream API - Desafios e Exercícios

Este repositório contém uma coleção de exercícios práticos para o domínio da **Stream API** e **Expressões Lambda** no Java. O objetivo é substituir loops tradicionais por um estilo de programação funcional, tornando o código mais limpo e eficiente.

---

## 🚀 Tecnologias Utilizadas
*   **Java 17+** (ou superior)
*   **Stream API**
*   **Lambdas & Method References**

---

## 🧠 Conceitos Praticados

Durante a resolução dos desafios, foram aplicados os seguintes métodos:

| Método | Descrição |
| :--- | :--- |
| `.map()` | Transformação de dados (ex: converter Strings para maiúsculas). |
| `.filter()` | Filtragem de elementos com base em condições (ex: números primos ou idade). |
| `.distinct()` | Remoção de duplicatas em coleções. |
| `.sorted()` | Ordenação de elementos (ordem natural ou personalizada com `Comparator`). |
| `.flatMap()` | "Achatamento" de listas aninhadas (`List<List<T>>` para `Stream<T>`). |
| `.rangeClosed()` | Geração de sequências numéricas inclusivas para lógica matemática. |
| `.collect()` / `.toList()` | Armazenamento do resultado do fluxo em uma nova coleção. |

---

## 📂 Desafios Resolvidos

### 1. Manipulação de Strings
*   Conversão de arrays para letras maiúsculas.
*   Remoção de palavras repetidas e ordenação.

### 2. Lógica Matemática com Streams
*   Filtro de **números primos** utilizando `IntStream.rangeClosed` e `noneMatch`.
*   Processamento de matrizes (listas de listas) utilizando `flatMap`.

### 3. Processamento de Objetos (Stream de Entidades)
*   **Filtro de Pessoas:** Filtragem por idade (> 18 anos) e extração de nomes em ordem alfabética.
*   **Filtro de Produtos:** Busca por categoria ("Eletrônicos") e preço (< 1000), ordenados por valor crescente.

---

## 🛠️ Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/LopesJosimar/exercicios-java-streams.git