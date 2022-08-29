package TRY2;

public class FormatarCep {
    public static void main(String[] args) {  
        
        try{   //criando a classe de exceção
            String cepFormatado = formatarCep("14315760");
            System.out.println(cepFormatado);
        } catch (CepInvalido e){
            System.out.println("CEP invalido ");
            e.printStackTrace();
        }
        //o fato de eu querer usar o formatarCep ja exige que eu use o try catch 
        //pq ela é uma exception, não é um erro mas uma excessão 
    } 

    //metodo de formataçao
    static String formatarCep(String CEP) throws CepInvalido {
           if(CEP.length() != 8) //diferente dos 8 numeros do CEP
            throw new CepInvalido(); //a condição que lança
            return "14.315.760"; //simulando o cep formatado
    }
}
