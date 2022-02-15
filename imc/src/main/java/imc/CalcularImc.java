package imc;
import java.util.Scanner;

public class CalcularImc {

    static Scanner pesoDigitado;
    static Scanner alturaDigitada;
    static double imc = 0;    
    static double peso = 0;
    static double altura = 0;
    static String retornoIMC;

    public static void main(String[] args) throws Exception {
        SolicitarPeso();
        SolicitarAltura();

        imc = CalcularIMC();
        retornoIMC = FaixaIMC(imc);
        
        System.out.println("O seu resultado é: " + retornoIMC);
    }

    public static void SolicitarPeso()
    {
        System.out.println("Digite seu peso em kilogramas");
        pesoDigitado = new Scanner(System.in);
        peso = tratarNumero(pesoDigitado);
    }

    public static void SolicitarAltura()
    {
        System.out.println("Digite sua altura em metros");
        alturaDigitada = new Scanner(System.in);
        altura = tratarNumero(alturaDigitada);
    }
    
    public static double tratarNumero(Scanner numeroDigitado){  
        
        String numero = numeroDigitado.nextLine();
        
        // Substituir "," por "."
        numero = numero.replace(',', '.'); 

        // retornando no tipo double
        return Double.parseDouble(numero);
    }

    public static double CalcularIMC(){       
        return Math.round(((peso / (altura*altura))*100.0))/100.0;
    }

    public static String FaixaIMC(double imc){  
        
        retornoIMC = "Não foi possível calcular";

        if (imc < 18.5){
            retornoIMC = "Abaixo do Peso";
        }
        else if ((imc >= 18.5) && (imc <= 24.9)){            
            retornoIMC = "Peso Normal";
        }            
        else if ((imc >= 25) && (imc <= 29.9)){                
            retornoIMC = "Sobrepeso";            
        }
        else if ((imc >= 30) && (imc <= 34.9)){
            retornoIMC = "Obesidade Grau I";
        }
        else if ((imc >= 35) && (imc <= 39.9)){
            retornoIMC = "Obesidade Grau II";
        }
        else if (imc >= 40){
            retornoIMC = "Obesidade Grau III ou Mórbida";
        }

        return retornoIMC;        
    }
}
