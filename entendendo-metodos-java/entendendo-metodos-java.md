# <p style="text-align: center">Estruturas de Repetição e Arrays em Java</p>

---

## Aula 01

### Objetivos:

1. O que é um método


2. Saber definir e utilizar métodos


3. Aplicar boas práticas em sua criação e uso

### Conceituação
É uma porção de código (sub-rotina) que é disponibvilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.


### Definição

Padrão de definição:

Obs. O que está entre interrogações é opcional

?visibilidade? ?tipo? ?modificador? retorno nome (?parâmetros?) ?exceções? corpo

#### Visibilidade:
* public
* protected
* private

#### Tipo:
* concreto
* abstrato

#### Modificador:
* static
* final

#### Retorno:
* tipo de dado
* void

#### Nome:
* nome que é fornecido ao método

#### Parâmetros:
* parâmetros que pode receber

#### Exceções:
* exceções que pode lançar

#### Corpo:
* código que possui ou vazio

#### Boas práticas
* Os nomes devem ser descritivos, mas curtos
* Notação Camel Case
* Deve possuir entre 80 e 120 linhas
* Evite lista de parâmetros longas
* Visibilidade adequada

#### Exemplo:
~~~java
// método definido pelo usuário  
public static void  procuraParOuImpar(int num) {  
   // corpo do método  
   if (num% 2 == 0 )   
      System.out.println (num + "é par" )  
   else   
      System.out.println (num + "é ímpar" );  
 }  
~~~


#### Crie uma aplicação que resolva as seguintes situações:
- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados
- A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite
- Calcule o valor final de um empréstimo, a partir do vamor solicitado. Taxas e parcelas influenciam. Defina arbirariamente as faixas que influenciam nos valores.
- Observações:
  - Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
  - Pode chamar um método dentro de outro
  - Pode passar como parâmetro, a chamada de outro método

## Aula 02

### Objetivos:

1. Entender o que é sobrecarregar um método


2. Saber como criar sobrecargas


### Conceito:
É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.


Alterar a assinatura do método:
Assinatura = nome + parâmetro.

converterParaInteiro(float f);
converterParaInteiro(double d);
converterParaInteiro(String s);

## Aula 03

### Objetivos:

1. Entender como funcionam os retornos

### Funcionamento

O método executa seu retorno quando:
* Completa todas suas instruções internas
* Chega a uma declaração explicita de retorno
* Lança uma exceção

~~~java
//Exemplos
public String getMensagem() {
    return "Olá!";
        }
public double getJuros() {
    return 2.36;
        }
~~~

