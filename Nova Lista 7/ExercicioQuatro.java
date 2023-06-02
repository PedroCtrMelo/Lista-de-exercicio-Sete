import java.util.Scanner;

public class ExercicioQuatro {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResolucaoExercicios resolucao = new ResolucaoExercicios();
        System.out.print("Digite o numero a ser convertido para extenso : ");
        int numero = scanner.nextInt();

      
        ResolucaoExercicios exercicios = new ResolucaoExercicios();

    
        String numeroExtenso = exercicios.convertToExtenso(numero);

        
        System.out.println("Número: " + numero);
        System.out.println("Número por extenso: " + numeroExtenso);
    }
    
}
