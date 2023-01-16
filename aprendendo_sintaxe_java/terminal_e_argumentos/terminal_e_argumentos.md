# <p style="text-align: center">Termina e Argumentos</p>

---

## Assuntos:
- Main Args
- Scanner
- Execução Via IDE
- Execução Via Prompt de Comando

---

### Execução pelo terminal:
1. Abra o MS-DOS ou Power Shell
2. Localize o diretorio do seu projeto: cd C:\estudos\dio-trilha-java-basico\java-terminal
3. Acesse a pasta bin: cd bin
4. Digite o comando: java MinhaClasse (nome da classe sem a extensão .class)

### Argumentos:
Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array[ ] de argumentos do tipo String. Podemos, após a definição da classe a ser executada, informar estes parâmetros.

~~~
//Exemplo:
java MinhaClasse argumentoUm argumentoDois
~~~

~~~java
// Exemplo de classe
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
~~~

Executando programa no terminal:
~~~java
cd C:\estudos\dio-trilha-java-basico\java-terminal
cd bin

java AboutMe José Sampaio 28 1.58
~~~

### Scanner
A classe Scanner, permite que o usuário tenha, uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa AboutMe para deixar mais intuitivo aos usuários:

~~~java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}
~~~