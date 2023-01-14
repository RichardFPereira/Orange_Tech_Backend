# <p style="text-align: center">Métodos</p>

---

### Objetivos:
Apresentar critérios para criação de métodos, parâmetros e visibilidade.

### Assuntos:
* Qual a proposta principal?
* Qual o tipo de retorno esperado após a execução do método?
* Quais parâmetros serão necessários para a execução do método?
* O método possui o risco de apresentar alguma excessão?
* Qual a visibilidade do método?

---

#### Métodos:
Uma classe é definida por atributos e métodos. Atributos, em sua maioria, são variáveis de diferentes tipos e valores. Já os métodos são funções ou sub-rotinas disponíveis dentro das nossas classes.

#### Critérios de Nomeação dos Métodos:

* Deve ser nomeado como verbo, de preferência no infinitivo
* Seguir o padrão camelCase

~~~java
// Exemplo:
somar (int a, int b) {
    return a + b;
    }
    
calcularResto (int a, int b) {
    return a % b;
        }
~~~

### Critérios de Definição de Métodos

* Qual a proposta principal do método? 

    Você deve se perguntar constantemente até compreender a real finalidade do mesmo.


* Qual o tipo de retorno esperado após executar o método? 

    Você deve analisar se o método será responsável por retornar algum valor ou não.


* Quais os parâmetros serão necessários para execução do método?

    Os métodos as vezes precisam de argumentos como critérios para a execução.

* O método possui o risco de apresentar alguma excessão?

    Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma excessão.

* Qual a visibilidade do método?

    Será necessário que o método seja visível para toda a aplicação, somente em mesmo pacote, através de herança ou somente a nível da própria classe.

~~~java
// Exemplo:
public class Metodos {
  
  // Bloco main
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(10-i);
    }
    imprimirLista(list);
    float media = calcularMedia(list);
    System.out.println("A média é: " + media);
  }

  // Metodo void somente para imprimir resultado, não retorna valor
  public static void imprimirLista(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("List index %d: %d.\n", i, list.get(i));
    }
  }

  // Método com retorno do tipo float
  public static float calcularMedia(List<Integer> list) {
    float media = 0F;
    for (int i = 0; i < list.size(); i++) {
      media = media + list.get(i);
    }
    return media / list.size();
  }
}
~~~