public class Contato {
  private String nome;
  private String email;
  private String telefone;

  public Contato() {
  }

  public Contato(String nome, String email, String telefone) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "\n Contato {\n" 
            + "  " + this.nome + "\n" 
            + "  " + this.email + "\n" 
            + "  " + this.telefone + "\n"
            + " }\n";
  }

  public void setPessoa(boolean b) {
    if (b) {
      this.telefone = "Pessoa";
    }
    else {
      this.telefone = "";
    }
  }

  public Object getId() {
    return null;
  }

  public Object getContatoId() {
    return null;
  }
}
