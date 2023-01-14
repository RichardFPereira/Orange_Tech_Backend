# <p style="text-align: center">Operadores</p>

---
#### Assuntos:
* Operadores aritiméticos
* Operadores unários
* Operadores relacionais
* Operadores lógicos
* Operador ternário

---

Operadores são símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.

#### Operador de Atribuição:
* __Símbolo:__ ' = ' (igual)
~~~java
// Serve para atribuir um valor a uma variável
// Obs.: O valor é atribuido da direita para a esquerda
// Exemplo:

// Atribui o valor 20 na variável idade
int idade = 20;

String nome = "Richard";

boolean estudou = true;
~~~

#### Operadores Aritiméticos
* Utilizado para realizar operações matemáticas entre valores numéricos
* Símbolos:
  * __Adição:__ ' + ' 
  * __Subtração:__ ' - '
  * __Multiplicação:__ ' * '
  * __Divisão:__ ' / '
~~~java
int a = 1;
int b = 2;

int soma = a + b;
int subtracao = b - a;
int multiplicacao = a * b;
int divisao = b/a;

// Podemos usar também o operador de adição para concatenar strings
// Exemplo:
String nome = "José";
String sobrenome = "da Silva";

// A String nomeCompleto terá como valor: "José da Silva"
String nomeCompleto = nome + sobrenome;
~~~

#### Operadores Unários
São operadores aplicados juntamente com outro operador aritimético. Eles realizam alguins trabalhos básicos como incrementar, decrementar, inverter valores númericos e booleanos.

* __(+) Operador Unário de Valor Positivo:__ números são positivos sem esse operador explicitamente;
* __(-) Operador Unário de Valor negativo:__ nega um número ou expressão aritimética;
* __(++) Operador Unário de Incremento de Valor:__ incrementa o valor em uma unidade
* __(--) Operador Unário de Decremento de Valor:__ decrementa o valor em uma unidade
* __(!) Operador Unário Lógico de Negação:__ nega o valor de uma expressão booleana

~~~java
// Exemplos
int numero = 5;
System.out.println(- numero); // Saída: -5
System.out.println(numero); // Saída: 5
numero = -numero;
System.out.println(numero); // Saída: -5

boolean estudou = true;
System.out.println(!estudou); // Saída: false

int a = 0;
int b = 5;
a++;
b--;
System.out.println("a: " + a); // a: 1
System.out.println("b: " + b); // b: 4
~~~

#### Operador Ternário
~~~java
// Sintaxe:
// <Expressão Condicional> ? <Caso condição seja verdadeira> : <Caso condição seja falsa>;

// Exemplo:
boolean tirouLixo = true;
String resposta = tirouLixo ? "Lixo foi tirado!" : "Vá tirar o lixo!";
System.out.println(resposta);// Lixo foi tirado!
tirouLixo = !tirouLixo;
resposta = tirouLixo ? "Lixo foi tirado!" : "Vá tirar o lixo!";
System.out.println(resposta);// Vá tirar o lixo!

int idade = 20;
resposta = idade >= 18 ? "Pode tirar habilitação." : "Habilitação somente para maiores de 18 anos.";
System.out.println(resposta); // Pode tirar habilitação.
idade = 16;
resposta = idade >= 18 ? "Pode tirar habilitação." : "Habilitação somente para maiores de 18 anos.";
System.out.println(resposta); // Habilitação somente para maiores ded 18 anos.
~~~

#### Operadores Relacionais
Avaliam a relação entre duas variáveis ou expressões e retorna um valor booleano. 
* Símbolos:
  * ' == ' IGUAL A
  * ' != ' DIFERENTE DE
  * ' > ' MAIOR QUE
  * ' >= ' MAIOR OU IGUAL A
  * ' < ' MENOR QUE
  * ' <= ' MENOR OU IGUAL A

~~~java
// Exemplos:
int a = 5;
int b = 10;
int c = 5;
boolean testeLogico;

testeLogico = a > b;
System.out.println(testeLogico);// false

testeLogico = a < b;
System.out.println(testeLogico); // true

testeLogico = a == c;
System.out.println(testeLogico); // true

testeLogico = a != c;
System.out.println(testeLogico); // false

testeLogico = a >= c;
System.out.println(testeLogico); // true

testeLogico = c <= b;
System.out.println(testeLogico); // true

// Também podemos comparar objetos como strings mas devemos usar o equal
// Exemplo:
String nome = "José";
String outroNome = new String("José");
System.out.println(nome == outroNome); //false
System.out.println(nome.equals(outroNome)); // true
~~~

#### Operadores Lógicos
São recursos que nos permitem criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
* Símbolos:
  * __&& :__ Operador Lógico 'E'
  * __|| :__ Operador Lógico 'OU'

~~~java
int idade = 18;
boolean temHabilitacao = false;

String resposta = (idade >= 18) && (temHabilitacao == true) ? "Pode dirigir!" : "Não pode dirigir!";
System.out.println(resposta); // Não pode dirigir!

boolean leuMaterial = true;
boolean assistiuAula = false;
resposta = leuMaterial || assistiuAula ? "Você estudou hoje!" : "Você não estudou hoje.";
System.out.println(resposta); // Você estudou hoje!
~~~

