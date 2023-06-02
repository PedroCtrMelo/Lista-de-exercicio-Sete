public class ResolucaoExercicios {
    private String textoUmExercicioUm;
    private String textoDoisExercicioUm;
    private String NomeExercicioDois;
    private String validadorCPF;
    private int numeroPorExtenso;
    

    public int getNumeroPorExtenso() {
        return numeroPorExtenso;
    }

    public void setNumeroPorExtenso(int numeroPorExtenso) {
        this.numeroPorExtenso = numeroPorExtenso;
    }

    public String getValidadorCPF() {
        return validadorCPF;
    }

    public void setValidadorCPF(String validadorCPF) {
        this.validadorCPF = validadorCPF;
    }

    public String getNomeExercicioDois() {
        return NomeExercicioDois;
    }

    public void setNomeExercicioDois(String nomeExercicioDois) {
        NomeExercicioDois = nomeExercicioDois;
    }

    public String getTextoDoisExercicioUm() {
        return textoDoisExercicioUm;
    }

    public void setTextoDoisExercicioUm(String textoDoisExercicioUm) {
        this.textoDoisExercicioUm = textoDoisExercicioUm;
    }

    public String getTextoExercicioUm() {
        return textoUmExercicioUm;
    }

    public void setTextoExercicioUm(String textoExercicioUm) {
        this.textoUmExercicioUm = textoExercicioUm;
    }

    
  
    public static String convertToExtenso(int numero) {
        String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] especiais = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centenas = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

        if (numero < 10) {
            return unidades[numero];
        } else if (numero < 20) {
            return especiais[numero - 10];
        } else if (numero < 100) {
            int unidade = numero % 10;
            int dezena = numero / 10;
            return dezenas[dezena] + (unidade != 0 ? " e " + unidades[unidade] : "");
        } else {
            int unidade = numero % 10;
            int dezena = (numero % 100) / 10;
            int centena = numero / 100;
            return centenas[centena] + (dezena != 0 ? " e " + dezenas[dezena] : "") + (unidade != 0 ? " e " + unidades[unidade] : "");
        }
    }





}
