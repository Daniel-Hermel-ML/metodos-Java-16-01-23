package metodosAtividade1;

public class Clientes {

        private String nome;
        private int idade;
        private int telefone;
        private String sexo;
        private String email;

    public Clientes(String nome,
                    int idade,
                    int telefone,
                    String sexo,
                    String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.sexo = sexo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void visualizar(){
        System.out.println(nome+" "+idade+" " +
                ""+telefone+" "+sexo+" "+email);
    }
}
