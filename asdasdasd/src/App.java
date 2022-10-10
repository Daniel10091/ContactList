/* 
  Desenvolva um sistema que será uma agenda de contatos:

  O sistema deve possui 3 classes: Contato (nome, telefone, email), Agenda (Lista de contato) e a classe principal do sistema.

  A classe Agenda deverá conter os métodos funcionais:

  •void armazenaPessoa(String nome, int telefone, String email);
  •void removePessoa(String nome);
  •int buscaPessoa(String nome); //
  informa em que posição da agenda está a pessoa
  •void imprimeAgenda(); // imprime
  os dados de todas as pessoas da agenda
  •void imprimePessoa(int index); //
  imprime os dados da pessoa que está na posição “i” da agenda

  A classe principal deve conter um menu com essas funcionalidades, além da opção sair e
  executar conforme opção escolhida.
*/

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    Contato contato = new Contato();
    Agenda agenda = new Agenda();

    String nome, email, telefone;
    String opcao;
    boolean isLoop = true;

    System.out.println("\nStarting app...");

    while (isLoop != false) {
      System.out.println("\n0 - Sair da aplicação");
      System.out.println("1 - Adicianar contato");
      System.out.println("2 - Adicianar contato numa posição específica");
      System.out.println("3 - Ver agenda");
      System.out.println("4 - Ver quantidade de contatos na agenda");
      System.out.println("5 - Verificar se a agenda está vazia");
      System.out.println("6 - Buscar contato");
      System.out.println("7 - Excluir contato");
      System.out.println("8 - Esvaziar agenda\n");
      opcao = in.next();

      switch (opcao) {
        case "0":
          System.out.println("\nOperação finalizada com sucesso...\n");
          isLoop = false;
          break;

        case "1":
          System.out.println("\nDigite o nome: \n");
          nome = in.next();
          contato.setNome(nome);
      
          System.out.println("\nDigite o email: \n");
          email = in.next();
          contato.setEmail(email);
      
          System.out.println("\nDigite o telefone: \n");
          telefone = in.next();
          contato.setTelefone(telefone);

          agenda.armazenarPessoa(contato);

          System.out.println("\nOperação executada com sucesso...\n");
          break;

        case "2":
          System.out.println("\nDigite o índice da posição na agenda: \n");
          int indexA = in.nextInt();
          
          System.out.println("\nDigite o nome: \n");
          nome = in.next();
          contato.setNome(nome);
      
          System.out.println("\nDigite o email: \n");
          email = in.next();
          contato.setEmail(email);
      
          System.out.println("\nDigite o telefone: \n");
          telefone = in.next();
          contato.setTelefone(telefone);

          agenda.add(indexA, contato);

          System.out.println("\nOperação executada com sucesso...\n");
          break;

        case "3":
          System.out.println("\n" + agenda.getContatos());
          break;

        case "4":
          System.out.println("\nQuantidade de contatos: " + agenda.size());
          break;

        case "5":
          if (agenda.isEmpty() == true) {
            System.out.println("\nA agenda está vazia\n");
          } else {
            System.out.println("\nA agenda não está vazia\n");
          }
          break;

        case "6":
          System.out.println("Digite o indice do contato:\n");
          int indexC = in.nextInt();
          agenda.get(indexC);
          break;

        case "7":
          System.out.println("Digite o índice do contato:\n");
          int indexD = in.nextInt();
          agenda.remove(indexD);
          System.out.println("\nContato removido com sucesso\n");
          break;

        case "8":
          agenda.clear();
          System.out.println("Agenda:\n" + agenda.toString());
          break;
      
        default:
          System.out.println("Opção inválida...\n");
          break;
      }
    }

  }
}
