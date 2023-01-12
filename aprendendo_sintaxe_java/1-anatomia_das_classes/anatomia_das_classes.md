# <p style="text-align:center">Anatomia das Classes</p>

## Anatomia das Classes - 1:

### Sintaxe básica Java

~~~Java
public class edu.richard.primeirasemana.MinhaClasse {
    
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

---

## Anatomia das Classes - 3:

### Declarando variáveis e métodos

~~~java
    // Estrutura 
    // tipo nomeBemDefinido = atribuição (opcional em alguns casos)

    // Exemplo:
    int idade = 25;
    double altura = 1.77;
    Dog noah; // Observe que aqui a variável Noah não tem valor definido
~~~

#### Declarando métodos:

~~~java
    // Estrutura do método
    TipoRetorno nomeObjetivoNoInfinitivo Parametro(s)

    // Exemplo:
    int somar (int numero1, int numero2)

    String formatarCep (long cep)
~~~

___
## Anatomia das Classes - 4:

### Identação:
  Basicamente, **identar** é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.
  
  No caso do Java a identação é utilizada apenas para promover legibilidade do código, não interfere no algorítimo do programa, diferente da linguagem Python que necessita de uma identação padronizada para o bom funcionamento do código.

  No código abaixo não há identação. Apesar de funcional, a legibilidade do código fica muito mais difícil.
~~~java
public class edu.richard.primeirasemana.BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)
System.out.println("REPROVADO");
else if(mediaFinal==6)
System.out.println("PROVA MINERVA");
else
System.out.println("APROVADO");
}
}
~~~

Já o mesmo código devidamente identado facilita a leitura e entendimento do mesmo. Observe:

~~~java
public class edu.richard.primeirasemana.BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
~~~
* Obs.: Para identar o código, utilizamos a tecla de espaço ou a tecla TAB que irá inserir uma quantidade padrão de espaços e na maioria dos casos identificar a identação correta para aquela linha. Algumas IDEs tem teclas de atalho para identar automaticamente o código selecionado. No IntelliJ por exemplo, o atalho CTRL+ALT+i irá identar automaticamente o trecho de código selecionado.

___
## Anatomia das Classes - 5:

### Organização de Arquivos:

Utilizamos pacotes para realizar o organização dos nossos projetos para facilitar o entendimento e a manutenção dos mesmos.
Poderiamos considerar, por exemplo uma divisão de pacotes para um estudante chamado Gabriel da seguinte maneira:
~~~
edu.gabriel.cursox.logicadeprogramacao
edu.gabriel.cursox.programacaoorientadaaobjetos
edu.gabriel.cursoy.interfacesgraficas
~~~

---

## Anatomia das Classes - 6:

### Java Beans
Este método visa tornar o código de fácil entendimento seguindo alguns padrões e convenções para facilitar a leitura do código por terceiros ou até pelo próprio desenvolvedor em momentos futuros.

#### Variáveis:
* Uma variável deve ser clara, sem abreviaçõeso ou definições abstratas;
* Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
* Defina um idioma único para as suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

#### Métodos:
* Devem ser nomeados como verbos
* Devem iniciar com letra minúscula em caso de palavra única
* Caso tenha duas ou mais palavras, com exceção da primeira palavra, todas as outras devem iniciar com eltra maíuscula

~~~java
//Exemplos:
somar (int numero1, int numero2) {}

abrirConexao(){}

concluirProcessament(){}

// Lembre-se de, assim como nas variáveis, 
// os métodos também devem seguir sempre o mesmo idioma
findById(int id){}

// Este método não deixa claro se seu objetivo é somar ou imprimir
// Evite utilizar um método para mais de uma ação e deixe o nome claro sobre sua função
somarImprimir(int a, int b){}
~~~ 


