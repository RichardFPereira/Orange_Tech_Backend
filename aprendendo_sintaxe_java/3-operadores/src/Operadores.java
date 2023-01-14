public class Operadores {
    public static void main(String[] args) {

        String concatenação = "?";

        concatenação = 1+1+1+"1";
        System.out.println(concatenação);

        concatenação = 1+"1"+1+1;
        System.out.println(concatenação);

        concatenação = 1+"1"+1+"1";
        System.out.println(concatenação);

        concatenação = "1"+1+1+1;
        System.out.println(concatenação);

        concatenação = "1"+(1+1+1);
        System.out.println(concatenação);


        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);

        boolean estudou = true;
        System.out.println(!estudou);

        int a = 0;
        int b = 5;
        a++;
        b--;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        boolean tirouLixo = true;
        String resposta = tirouLixo ? "Lixo foi tirado!" : "Vá tirar o lixo!";
        System.out.println(resposta);
        tirouLixo = !tirouLixo;
        resposta = tirouLixo ? "Lixo foi tirado!" : "Vá tirar o lixo!";
        System.out.println(resposta);

        int idade = 20;
        resposta = idade >= 18 ? "Pode tirar habilitação." : "Habilitação somente para maiores de 18 anos.";
        System.out.println(resposta);
        idade = 16;
        resposta = idade >= 18 ? "Pode tirar habilitação." : "Habilitação somente para maiores de 18 anos.";
        System.out.println(resposta);


        a = 5;
        b = 10;
        int c = 5;
        boolean testeLogico;

        testeLogico = a > b;
        System.out.println(testeLogico);

        testeLogico = a < b;
        System.out.println(testeLogico);

        testeLogico = a == c;
        System.out.println(testeLogico);

        testeLogico = a != c;
        System.out.println(testeLogico);

        testeLogico = a >= c;
        System.out.println(testeLogico);

        testeLogico = c <= b;
        System.out.println(testeLogico);

        String nome = "José";
        String outroNome = new String("José");
        System.out.println(nome == outroNome);
        System.out.println(nome.equals(outroNome));

        idade = 18;
        boolean temHabilitacao = false;

        resposta = (idade >= 18) && (temHabilitacao == true) ? "Pode dirigir!" : "Não pode dirigir!";
        System.out.println(resposta);

        boolean leuMaterial = true;
        boolean assistiuAula = false;
        resposta = leuMaterial || assistiuAula ? "Você estudou hoje!" : "Você não estudou hoje.";
        System.out.println(resposta);
    }
}