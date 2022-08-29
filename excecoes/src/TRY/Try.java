package TRY;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Try {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            try{
                System.out.println("Digite o seu nome : ");
                String nome = entrada.next();

                System.out.println("Digite seu sobrenome : ");
                String sobrenome = entrada.next();

                System.out.println("Digite a sua idade : ");
                Integer idade = entrada.nextInt();

                System.out.println("Digite a sua altura : ");
                Double altura = entrada.nextDouble();

                    System.out.println("Hello, " + nome.toUpperCase());
                    System.out.println("Tenho " + idade + " anos ");
                    System.out.println("Minha altura é " + altura );
                    entrada.close();
            }

            catch(InputMismatchException e){
                //equivocando os dados
                System.out.println("Os campos IDADE & ALTURA foram preenchidos de maneira incorrete");
            }
    }
}
