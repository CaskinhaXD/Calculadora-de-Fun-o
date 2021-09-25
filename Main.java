import java.util.Scanner;
import java.lang.Math;

class Main {
  static int leng;
  static String erro = "Reveja o que você escreveu por favor. Você provavelmente escreveu algo errado.";
  static float A;
  static float B;
  static float C;
  static String parabola;
  static String localp;
  
  public static void main(String[] args) {
    System.out.println("Escreva o número da linguagem que você quer:\n1- EN (English) \n2- PT (Português)");
    Scanner in = new Scanner(System.in);
    leng = in.nextInt();

  switch (leng) {
    case 1:
      System.out.println("Ok, you have selected English");
      A = in.nextInt();
      B = in.nextInt();
      C = in.nextInt();
      break;
      
    case 2:
      System.out.println("Ok, você selecionou português");
      System.out.println("Enviei os 3 números da função na seguinte ordem A, B e C");
      System.out.println();
      A = in.nextInt();
      System.out.println("Você mandou o A como " + A);
      System.out.println();
      B = in.nextInt();
      System.out.println("Você mandou o B como " + B);
      System.out.println();
      C = in.nextInt();
      System.out.println("Você mandou o C como " + C);
      System.out.println();

      float delta = (B * B) + (-4 * A * C);

      System.out.println("O valor de Delta é: " + delta);

      double raiz = Math.sqrt(delta);

      System.out.println("O valor de x' é: " + (-B + raiz) / (2 * A));
      System.out.println("O valor de x'' é: " + (-B - raiz) / (2 * A));
      System.out.println("O valor de Vx é: " + -B / (2 * A));
      System.out.println("O valor de Vy é: " + delta / (4 * A));

      if (A >= 0) {
        parabola = "cima";
      } else {
        parabola = "baixo";
      }

      if (B >= 0) {
        if (parabola == "cima") {
          localp = "A parte decrescente vai enconstar na parte de baixo da tabela";
        } else {
          localp = "A parte crescente vai enconstar na parte de cima da tabela";
        }
      } else {
        if (parabola == "cima") {
          localp = "A parte decrescente vai enconstar na parte de cima da tabela";
        } else {
          localp = "A parte crescente vai enconstar na parte de baixo da tabela";
        }
      }

      System.out.println("A parabola vai ser para " + parabola + ".");
      System.out.println("O ponto que tem que passar em Y vai ser: " + C + ".");
      System.out.println(localp);
      System.out.println();

      System.out.println("Você que ver a explicação? \n1 - Sim\n2 - Não");
      int esp = in.nextInt();

      if (esp == 1) {
        System.out.println("\n");
      } else {
        return;
      }

      System.out.println("Você que ver os calculos? \n1 - Sim\n2 - Não");
      int calc = in.nextInt();

      if (calc == 1) {
        System.out.println("\n");
      } else {
        return;
      }
        
      break;
    
     default:
      System.out.println(erro);
      break;
    } 
  }
}