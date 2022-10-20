import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade;
        int ano;
        int meses;
        Scanner input = new Scanner(System.in);
        idade = input.nextInt();

        if (idade >= 365){
            ano = idade / 365;
            idade = idade % 365;
            System.out.printf("%d ano(s)\n", ano);
        }
        else{
            System.out.printf("0 ano(s)\n");
        }

        if (idade >= 30){
            meses = idade / 30;
            idade = idade % 30;
            System.out.printf("%d mes(es)\n", meses);
        }
        else{
            System.out.printf("0 mes(es)\n");
        }

        System.out.printf("%d dia(s)\n", idade);
    }
}