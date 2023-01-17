# <p style="text-align: center">Escopo</p>

---

## Assuntos:
* Escopo de Classe
* Escopo de Método
* Escopo de Fluxo

---

### Escopo
O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.


Em uma classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.
Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

~~~java
public class Conta {
    // variavel da classe conta
    double saldo = 10.0;
    
    public void sacar(Double valor) {
        // variavel locao de método
        double novoSaldo = saldo - valor;
    }
    
    public void imprimirSaldo() {
        // disponível em toda a classe
        System.out.println(saldo);
        // somente o metodo sacar conhece essa variável
        // System.out.println(novoSaldo);
    }
}
~~~
