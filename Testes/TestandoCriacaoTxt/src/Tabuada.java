import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Tabuada {
 
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i, n;
 
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
 
      try (FileWriter arq = new FileWriter("e:\\tabuada.txt")) { // no exemplo estava sem o try, o NB estava com alerta e coloquei, mas estava pegando mesmo assim
          PrintWriter gravarArq = new PrintWriter(arq);
          
          gravarArq.printf("+--Resultado--+%n");
          for (i=1; i<=10; i++) {
              gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
          }
          gravarArq.printf("+-------------+%n");
      }
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
  }
 
}