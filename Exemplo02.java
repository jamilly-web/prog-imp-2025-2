import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        System.out.println("olá, turma");
        Scanner scanner = new Scanner (System.in);
        for(int i=0;i<100;i++){
            System.out.println(i+1);

        }
        for(int i=0;i<100;i++){
            System.out.println(i%3==0);
        }
        
    }
}