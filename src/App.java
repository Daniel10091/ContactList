import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    Agenda agenda = new Agenda();

    String nome, email, telefone;

    String opcao;
    boolean isLoop = true;

    System.out.println("\nStarting app...");

    while (isLoop != false) {
      System.out.println("\n0 - Sair da aplicação");
      System.out.println("1 - Adicianar pessoa");
      System.out.println("2 - Remover pessoa");
      System.out.println("3 - Buscar pessoa");
      System.out.println("4 - imprimir agenda");
      System.out.println("5 - imprimir pessoa\n");
      opcao = in.next();

      switch (opcao) {
        case "0":
          System.out.println("\nOperação finalizada com sucesso...\n");
          isLoop = false;
          break;

        case "1":
          System.out.println("\nDigite o nome:\n");
          nome = in.next();
      
          System.out.println("\nDigite o email:\n");
          email = in.next();
      
          System.out.println("\nDigite o telefone:\n");
          telefone = in.next();

          agenda.armazenarPessoa(nome, email, telefone);

          System.out.println("\nOperação executada com sucesso...\n");
          break;

        case "2":
          System.out.println("Digite o nome da pessoa:\n");
          String nomePessoa = in.next();
          agenda.removerPessoa(nomePessoa);
          System.out.println("\nContato removido com sucesso\n");
          break;

        case "3":
          System.out.println("Digite o nome da pessoa:\n");
          String nomeDaPessoa = in.next();
          System.out.println("\nA posição na agenda é: " + agenda.buscarPessoa(nomeDaPessoa));
          break;

        case "4":
          System.out.println(agenda.imprimirAgenda());
          break;

        case "5":
          System.out.println("Digite o indice do contato:\n");
          int indexPessoa = in.nextInt();
          try {
            agenda.imprimirPessoa(indexPessoa);
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
          }
          break;
      
        default:
          System.out.println("Opção inválida...\n");
          break;
      }
    }

  }
}
