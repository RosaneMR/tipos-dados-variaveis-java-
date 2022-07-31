import java.util.Locale;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);//(Garantir o separador seja, o ponto e não a vírgula.)
        int idade;
        double salario,altura;
        char genero;
        String nome;

        idade =30;
        salario = 5800.5;
        altura =1.72;
        genero ='F';
        nome = "Maria Silva";

        System.out.println("IDADE = " + idade);
        System.out.println("SALARIO= " + String.format("%.2f", salario));
        // (Tudo isso para imprimir o salario com duas casas decimais /String.format("%.2f",salario)
        System.out.println("ALTURA = " + String.format("%.2f", altura));
        // (Tudo isso para imprimir o altura com duas casas decimais /String.format("%.2f",altura)
        System.out.println("GENERO = " + genero);
        System.out.println("NOME = " + nome);
    }
}
