package NewTry;
import java.text.NumberFormat;
import java.text.ParseException;

public class Novotry {
    public static void main(String[] args) {
        
        try{
            Number valor = NumberFormat.getInstance().parse("a1.55");
                System.out.println(valor);
        } catch (ParseException e){
            e.printStackTrace(); //serve para exibir o conteudo 
        }

        //a proposta de exceções checadas ou não é o fato de que ao utilizar 
        //precisa tratar o error imediatamente  
    }
}
