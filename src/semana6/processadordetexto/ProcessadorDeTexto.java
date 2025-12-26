package semana6.processadordetexto;

public class ProcessadorDeTexto {
    public static String processar(String texto){
        try{
            return texto.toUpperCase();
        } catch (NullPointerException e){
            System.err.println("Erro: O texto não pode ser nulo para processamento!");
            return  "";
        }
    }
}
