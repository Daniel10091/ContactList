import java.util.ArrayList;

public class Agenda {

  private ArrayList<Contato> contatos = new ArrayList<>();
  
  public Agenda() {
  }

  public void armazenarPessoa(String nome, String email, String telefone) {
    Contato contato = new Contato(nome, email, telefone);

    if (contatos.isEmpty()) {
      contatos.add(contato);
    } else {
      for (Contato pessoa : contatos) {
        if (!pessoa.getEmail().equals(email) && !pessoa.getTelefone().equals(telefone)) {
          contatos.add(contato);
          break;
        }
      }
    }
  }

  public void removerPessoa(String nome) {
    for (Contato pessoa : contatos) {
      if (pessoa.getNome().equals(nome)) {
        contatos.remove(pessoa);
        break;
      }
    }
  }

  public int buscarPessoa(String nome) {
    int i = 0;

    if (!contatos.isEmpty()) {
      int agendaSize = contatos.size();

      while (i < agendaSize) {
        for (Contato contato : contatos) {
          if (contato.getNome().equals(nome)) {
            return i;
          } else {
            i = i + 1;
          }
        }
      }
    } else {
      return -1;
    }
    return i;
  }

  public ArrayList<Contato> imprimirAgenda() {
    return contatos;
  }

  public void imprimirPessoa(int indexPessoa) {
    if (indexPessoa >= contatos.size()) {
      throw new ArrayIndexOutOfBoundsException("\nIndex não existe...\n");
    }
    Contato contato = new Contato();
    contato = contatos.get(indexPessoa);
    System.out.println(contato.toString());
  }
}
