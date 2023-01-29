# <p style="text-align: center"> Operadores Relacionais</p>

---

## Objetivos
1. Entender o que são operadores relacionais
2. Saber como utilizá-los

## Conceito
"São símbolos especiais que são capazes de realizar comparações entre determinados operandos e, em seguida, retornar  um resultado."
* Tipos:
  * Similaridade: igual, diferente
  * Tamanho: maior, maior igual, menor, menor igual


### Similaridade:
  * Igualdade: determina se um operador é igual ao outro
  * Diferença: determina se um operador não é igual ao outro
  * Simbologia:
    * Igualdade: ==
    * Diferença: !=


### Tamanho:
  * Maior: determina se o operadorando é maior que o outro
    * Simbologia: >
  * Maior ou igual: determina se um operador é maior ou igual a outro
    * Simbologia: >=
  * Menor: determina se um operando é menor que o outro
    * Simbologia: <
  * Menor ou igual: determina se um operando é menor ou igual a outro
    * Simbologia: <=

# <p style="text-align: center"> Operadores Lógicos</p>

---

## Objetivos:
1. Entender o que são operadores lógicos
2. Saber como utilizá-los

## Conceito
"São símbolos especiais capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado."
* Tipos:
  * Conjunção
  * Disjunção
  * Disjunção Exclusiva
  * Negação

### Conjunção:
São operações lógicas que somente são verdadeiras quando ambos os operadores ou expressões envolvidas são verdade.

* Simbologia: &&

* Terminologia: and(e)

### Disjunção:
São operações lógicas que somente são falsas quando ambos os operadores ou expressões envolvidas são falsos.

* Simbologia: ||

* Terminologia: or(ou)

### Disjunção Exclusiva:
São operações lógicas que somente são verdadeiras quando ambos os operadores ou expressões envolvidas são opostos.

* Simbologia: ^

* Terminologia: xor

### Negação:
São operações lógicas que invertem o valor lógico de um operando ou expressão.

* Simbologia: !

* Terminologia: inversão

### Observações
Não são operações ou operadores lógicos:
* Operadores Bitwise: & e | 
* Operadores shift: ~,>>, >>>, <<

# <p style="text-align: center"> Controle de Fluxo</p>

---

## Objetivos:
1. Entender o que são estruturas de controle de fluxo
2. Saber como usar cada uma

## Conceito:
São estruturas que tem a capacidade de direcionar o fluxo de execução do código.
* Tipos: 
  * Decisão:
    * if
    * if-else
    * if-else-if
    * switch
    * operador ternário
  * Repetição:
    * for
    * while
    * do while
  * Interrupção:
    * break
    * continue
    * return

### Tipos:
* Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução


* Opções:
  * if (se)
  * switch (escolha)
  * operador ternário

~~~java
//Exemplo de uso de operadores de decisão

// se condição for verdadeira executa if, 
// se não for executa else
if (condição) {
    //executa aqui
        } else {
    //executa aqui
        }

//Operador  ternário
//Se condição for ligar for true, desliga
//Se for false, liga        
ligado ? desligar : ligar

//Switch
//Verifica qual case do valor no switch

switch (olhos) {
    case "AZUIS":
        //faça algo
        break;
    case "VERDES":
        //faça outra coisa
        break;
    case "CASTANHOS":
        //faça outra coisa
        break;
    case "PRETOS":
        //faça outra coisa
        break;
    default:
        break;
}
~~~

### Boas Práticas
* Switch é oara valores exatos e if para expressões booleanas
* Evitar usar o default do switch para "cases genéricos"
* Evitar o efeito "flecha" dos if's
* Evitar muitos if's aninhados

# <p style="text-align: center"> Blocos, Tipos e Uso</p>

---

## Objetivos:
1. Entender o que são blocos
2. Tipos de blocos
3. Saber como usar blocos

## Conceito:
"É um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação"

* Tipos: 
  * Locais: dentro dos métodos
  * Estáticos: dentro de classes
  * Intância: dentro de classes

## Criação
~~~java
//exemplos bloco com if
if (autorizado) {
    CarregarPerfil();
    DirecionarPaginaInicial();
}
~~~

