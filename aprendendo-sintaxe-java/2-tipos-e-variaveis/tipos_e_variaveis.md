# <p style="text-align: center">Tipos e Variáveis</p>


## Assuntos:

* Tipos numéricos inteiros e decimais
* Tipos Lógicos
* Caracteres
* Objetos
* Diferenças entre variáveis e constantes

---

### Tipos de dados:
Existem oito tipos primitivos de variáveis no Java. São eles:

| Tipo                                      | Tamanho (bits)                       | Valor Mínimo                                                   | Valor Máximo                                                  | Default                                 |
|-------------------------------------------|--------------------------------------|----------------------------------------------------------------|---------------------------------------------------------------|-----------------------------------------|
 | <p style="text-align: center">boolean</p> | <p style="text-align: center">1</p>  | <p style="text-align: center">false</p>                        | <p style="text-align: center">true</p>                        | <p style="text-align: center">false</p> |
| <p style="text-align: center">char</p>    | <p style="text-align: center">16</p> | <p style="text-align: center">0</p>                            | <p style="text-align: center">65.535</p>                      | <p style="text-align: center">0</p>     |
| <p style="text-align: center">byte</p>    | <p style="text-align: center">8</p>  | <p style="text-align: center">-128</p>                         | <p style="text-align: center">127</p>                         | <p style="text-align: center">0</p>     |
| <p style="text-align: center">short</p>   | <p style="text-align: center">16</p> | <p style="text-align: center">-32.768</p>                      | <p style="text-align: center">32.767</p>                      | <p style="text-align: center">0</p>     |
| <p style="text-align: center">int</p>     | <p style="text-align: center">32</p> | <p style="text-align: center">-2.147.483.648</p>               | <p style="text-align: center">2.147.483.647</p>               | <p style="text-align: center">0</p>     |
| <p style="text-align: center">long</p>    | <p style="text-align: center">64</p> | <p style="text-align: center">-9.223.372.036.854.770.000</p>   | <p style="text-align: center">9.223.372.036.854.770.000</p>   | <p style="text-align: center">0</p>     |
| <p style="text-align: center">float</p>   | <p style="text-align: center">32</p> | <p style="text-align: center">-3,40282347E + 38</p>            | <p style="text-align: center">3,40282347E + 38</p>            | <p style="text-align: center">0.0</p>   |
| <p style="text-align: center">double</p>  | <p style="text-align: center">64</p> | <p style="text-align: center">-1,797691313486231570E + 308</p> | <p style="text-align: center">1,797691313486231570E + 308</p> | <p style="text-align: center">0.0</p>   |


### Declaração de variáveis

~~~java
// <tipo> <nomeDaVariavel> <atribuicao>
// Exemplo:

int idade = 25;
float altura = 1.75;
boolean estudante = true;
long cpf = 12345678900;
double salario = 1234.56;
// Para declarar uma variável do tipo float, 
// devemos colocar um "F" depois do número
float pi = 3.141592F;
~~~

### Variáveis vs. Constantes

Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um tipo determinado. Como o Java é uma linguagem fortemente tipada, o tipo da variável deve ser explicito e não pode ser alterado.
~~~java
// Exemplo:
int idade = 20;
idade = "vinte";
// Este código gera um erro de compilação 
// pois não podemos alterar o tipo de uma variável em Java

// Podemos alterar o valor desde que seja do mesmo tipo 
// Exemplo: 
idade = 21;
~~~

Uma constante também recebe um tipo, mas este não pode ser alterado durante o programa.
~~~java
// A constante é definida com a palavra final antes do tipo
// E por convenção deve ser declarada em CAIXA ALTA
// Caso tenha mais de uma palavra, separar por underline (_)
// Exemplo:
final int ANO = 2023;
final double VALOR_DE_PI = 3.14159265358979323846;

// Caso tente alterar o valor, mesmo mantendo o tipo, 
// dará erro na compilação
ANO = 2022;
VALOR_DE_PI = 3;
~~~

