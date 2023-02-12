# <p style="text-align: center">Estruturas de Repetição e Arrays em Java</p>

---

## While

~~~java
//Executa condição dentro do bloco enquanto condição for verdadeira
public class Loop () {
    public static void main(String[] args) {
        int i = 0;

        while(i < 10) {
            //Executará o código enquanto i for menor que 10
            System.out.println("i: " + i);

            //Caso utilizemos um break, ele sairá do bloco
            break;
        }

        //Variáveis de incremeto
        i++; //Equivalente a i = i + 1
        i--; //Equivalente a i = i - 1
    }    
}
~~~

## Arrays
```java
class Array {
    public static void main(String[]args) {
    //Arrays são uma lista com dados do mesmo tipo
        //Tanto arr quanto arr1 são listas de inteiros 
        //arr é uma lista de tamanho 5 com seus elementos já delcarados
        //arr1 é uma lista de tamanho 5, mas não foi inicializada
        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[5];
        int cnt = 0;
        while (cnt <= arr.lenght) {
            System.out.println("Index: " + cnt);
            System.out.println("Valor: " + arr[cnt]);
            cnt++;
        }
    }
}
```

