import java.util.Scanner;

public class exemplo01 {

    public static void main(String[]args){
        Scanner imput = new Scanner(System.in);
        aluno aluno = new aluno();
        System.out.println("digite seu nome");
        aluno.nome = imput.nextLine();
        System.out.println("digite a idade");
        aluno.idade = imput.nextInt();
        System.out.println("digite a 1 nota");
        aluno.nota1 = imput.nextDouble();
        System.out.println("digite a 2 nota");
        aluno.nota2 = imput.nextDouble();
        imprimir(aluno);
        System.out.println("\n i
        15media = " + calcularMedia(aluno));

    }
    public static void imprimir (aluno al){
        System.out.printf("(%s, %d anos, %.1f, %.1f)", al.nome, al.idade, al.nota1, al.nota2);


    }
    //media 
    public static double calcularMedia(aluno al){
        return(al.nota1*2 + al.nota2*3)/5;
    }
}