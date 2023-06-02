import java.util.Scanner;



public class ExercicioUm 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ResolucaoExercicios resolucao = new ResolucaoExercicios();
        System.out.println("Bem Vindo ao contador de Caracteres");

        System.out.print("Coloque a Frase que voce quer contar os caracteres : ");
        String textoUm = scanner.nextLine();

        System.out.print("Coloque a Segunda Frase : ");
        String textoDois = scanner.nextLine();

        resolucao.setTextoExercicioUm(textoUm);
        resolucao.setTextoDoisExercicioUm(textoDois);

        int caracteresUm = textoUm.length();
        int caracteresDois = textoDois.length();
        System.out.println("Numero de caracteres do texto Um : " + caracteresUm );
        System.out.println("Numero de caracteres do texto Dois : " + caracteresDois );

        if (caracteresUm == caracteresDois)
        {
            System.out.println("Os dois textos possuem a mesma quantidade de caracteres");
        }
        else
        {
            System.out.println("Os textos nao possuem caracteres iguais ");
        }

        
        if (textoUm.equals(textoDois)) {
            System.out.println("Os textos são iguais.");
        } else {
            System.out.println("Os textos são diferentes.");
        }


    }





}