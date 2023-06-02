import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResolucaoExercicios resolucao = new ResolucaoExercicios();

        System.out.print("Digite o seu CPF no formato XXX.XXX.XXX-XX para ser validado: ");
        String cpf = scanner.nextLine();

        String[] validarcpf = new String[cpf.length()];

        for (int i = 0; i < cpf.length(); i++) {
            validarcpf[i] = String.valueOf(cpf.charAt(i));
        }

        if (validarcpf[3].equals(".") && validarcpf[7].equals(".") && validarcpf[11].equals("-")) {
            System.out.println("CPF digitado corretamente");
        }
        else{
            System.out.println("Cpf digitado incorretamente ")
        }
    }
}
