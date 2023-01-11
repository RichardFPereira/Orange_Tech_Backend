# <p style="text-align:center">Anatomia das Classes</p>

## Anatomia das Classes - 1:

### Sintaxe básica Java

~~~Java
public class MinhaClasse {
    
    public static void main(String[] args) {

        System.out.println("Olá turma, sejam bem-vindos!");
    }
}
~~~
* __MinhaClasse:__ Cria uma classe e o nome deve ter as letras iniciais maiúsculas.


* __Bloco main:__ Cria um bloco principal executável no código.


* __System:__ Chama classe System.


* __out:__ chama uma saída usando a classe Sytem.


* __println:__ "printa" no console a mensagem entre parentesses e aspas.

---

## Anatomia das Classes - 2:

### Padrão de Nomeclatura

---

* __Arquivo.java__: Todo arquivo java deve ter a extensão .java e seu nome deve iniciar com letra maiúscula. Exemplo: 
  * Calculadora.java<br>
  * Caso o nome seja compoto por mais de uma palavra, todas devem iniciar com letra maiúscula. Exemplo: CalculadoraCientifica.java


* __NomeDaClasse:__ O nome da classe deve ser igual ao nome do arquivo. Exemplo:
~~~java
//Caso o nome do arquivo seja CalculadoraCientifica.java ...

public class CalculadoraCientifica{
    //código aqui!
}
~~~

* __Nome da variável:__ Toda variável deve iniciar com letra minúscula e caso tenha duas ou mais palavras, todas as palavras seguintes devem iniciar com letra maiúscula (camelCase).
~~~java
    public class Veiculos{

    public static void main(String[] args) {
        
        int anoFabricacao = 2015;
        String modelo = "Gol";
        
        //para criar uma variável que não pode ser alterada, 
        //utilizamos a palavra reservada "final" antes do tipo
        //isso garante que o texto não seja alterado durante o programa.
        //O metodo de case utilizado é colocando todo o nome em letra maiúscula e separando
        //palavras com underline para indicar uma constante.
        
        final String PAIS_FABRICACAO = "Brasil";
    }
}
~~~
<p style="margin-left: 35px">Para declarar a variável devemos seguir as seguintes regras:</p>

* Deve conter apenas letras, _(underline), $ ou números;
* Deve-se obrigatoriamente iniciar com uma letra (preferencialmente), _ ou $, jamais número;
* Não pode conter espaços. Exemplo:
  * ~~~java
    public class Alunos {
    
    public static void main(String[] args){
        //ERRADO:
        //int idade Aluno = 20;
    
        //CORRETO:
        int idadeAluno = 20;
    }
    }
    ~~~
    
* Não podemos utilizar palavras reservadas da linguagem como main, int, String, System, entre outras;
* O nome deve ser o único dentro do escopo;
