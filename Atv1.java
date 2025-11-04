import java.util.Scanner;

    public class Atv1 {
        public static Scanner input = new Scanner (System.in);
        public static void main(String[] args) {
            Produto p1 = new Produto(),p2 = new Produto();
            System.out.println("digitaçao produto 1");
            lerProduto(p1);
            System.out.println("");
            System.out.println("digitaçao produto 2");
            lerProduto(p2);
           
            System.out.println("impressão");
            imprimirProduto(p1);
            imprimirProduto(p2);

        }
    public static void lerProduto(Produto p){
        
        System.out.println("digite titulo do produto");
        p.titulo = input.nextLine();
        System.out.println("digite a descriçao do produto");
        p.descricao = input.nextLine();
        System.out.println("digite preço do produto");
        p.precoUnitario = input.nextDouble();
        System.out.println("digite quantidade em estoque");
        p.qtdEstoque = input.nextInt();
        input.nextLine();

    }
    public static void imprimirProduto(Produto p) {
        System.out.printf("(%s,%s,%.2f,%n) \n", p.titulo,p.descricao,p.precoUnitario,p.qtdEstoque);
        //System.out.println(p);
    }
    }

