package metodosAtividade2;

public class Funcionarios {
    private String nome;
    private int idade;
    private String situacao;
    private String sexo;
    private int telefone;

    public Funcionarios(String nome, int idade, String situacao,
                        String sexo, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.situacao = situacao;
        this.sexo = sexo;
        this.telefone = telefone;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void visualizar(){
        System.out.println(nome+" "+idade+" " +
                ""+situacao+" "+sexo+" "+telefone);
    }
}
