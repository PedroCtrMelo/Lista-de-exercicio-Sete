import java.util.Scanner;

public class ExercicioDois {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResolucaoExercicios resolucao = new ResolucaoExercicios();
        
        System.out.println("Inversor de Nomes");
        System.out.print("Coloque o seu nome : ");
        String nomeDigitado = scanner.nextLine();
        resolucao.setNomeExercicioDois(nomeDigitado);
        StringBuilder reversed = new StringBuilder(nomeDigitado);
        reversed.reverse();
        if (nomeDigitado != "")
        {
            nomeDigitado = reversed.toString().toUpperCase();
            System.out.println("Nome inverso : " + nomeDigitado);
        }


    }






}
