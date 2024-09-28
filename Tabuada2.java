import java.util.Scanner;

public class Tabuada2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
    System.out.println("Digite um número para gerar a tabuada:");
    int numero = scanner.nextInt();
    
    System.out.println("Tabuada do" + numero+ "numero:");
     
    for(int i = 0; i < 10 ; i ++){
        int resultado = numero * i;
        System.out.println(numero + "x" + i + "=" + resultado);
    }
    scanner.close();
    
       
       
    }
    
}
