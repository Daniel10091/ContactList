import java.util.ArrayList;

public class Agenda {

  private ArrayList<Contato> contatos = new ArrayList<>();
  
  public Agenda() {
  }

  public void armazenarPessoa(Contato contato) {
    for (Contato pessoa : contatos) {
      if (pessoa.getId() == pessoa.getContatoId()) {
        pessoa.setPessoa(true);
      }
    }
    contatos.add(contato);
  }

  public void add(Contato contato) { // Só para teste
    if (contato == null) {
      return;
    }
    if (this.contatos == null) {
      this.contatos = new ArrayList<Contato>();
    }
    this.contatos.add(contato);
  }
  
  public void add(int index, Contato contato) { // Só para teste
    if (contatos == null) {
      contatos = new ArrayList<Contato>();
    }
    contatos.add(index, contato);
  }

  public void addAll(ArrayList<Contato> contatos) { // Só para teste
    if (contatos == null) {
      return;
    }
    if (this.contatos == null) {
      this.contatos = new ArrayList<Contato>();
    }
    this.contatos.addAll(contatos);
  }

  public ArrayList<Contato> getContatos() { // Só para teste
    return contatos;
  }

  public void remove(Contato contato) { // Só para teste
    if (contato == null) {
      return;
    }
    if (contatos!= null) {
      contatos.remove(contato);
    }
  }

  public void remove(int index) { // Só para teste
    if (contatos!= null) {
      contatos.remove(index);
    }
  }

  public void clear() { // Só para teste
    if (contatos!= null) {
      contatos.clear();
    }
  }

  public Contato get(int index) { // Só para teste
    return contatos.get(index);
  }

  public int size() { // Só para teste
    return contatos.size();
  }

  public boolean isEmpty() { // Só para teste
    return contatos.isEmpty();
  }

  @Override
  public String toString() {
    return contatos.toString();
  }
}
