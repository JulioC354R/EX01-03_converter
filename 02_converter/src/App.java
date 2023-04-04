import java.util.Scanner;

class Main {
    public static void main(String[] args){

    int metros;
    int centimetros;
      System.out.println("Informe o metro");

    Scanner teclado = new Scanner(System.in);
      metros = teclado.nextInt();
      teclado.close();

      centimetros = metros * 100;

      System.out.println("Igual à " + centimetros+ "cm");
      
    

    
    }
}