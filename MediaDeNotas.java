import java.util.Scanner;
public class MediaDeNotas {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float n1, n2, n3, media;
    String nome;
    System.out.print("Digite seu nome: ");
    nome = var.nextLine();
    System.out.print("Informe nota 1: ");
    n1 = var.nextFloat();
    System.out.print("Informe nota 2: ");
    n2 = var.nextFloat();
    System.out.print("Informe nota 3: ");
    n3 = var.nextFloat();
    media = (n1+n2+n3)/3;
    System.out.print("O(A) aluno(a) " + nome + " está com a média: " + media);
  }
}