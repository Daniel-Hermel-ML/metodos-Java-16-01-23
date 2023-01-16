package metodosAtividade3;

public class Produto {
    private String nome;
    private String descricao;
    private int classificao;
    private String console;
    private float preco;

    public Produto(String nome,
                    String descricao,
                    int classificao,
                    String console,
                    float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.classificao = classificao;
        this.console = console;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getClassificao() {
        return classificao;
    }

    public void setClassificao(int classificao) {
        this.classificao = classificao;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void visualizar(){
        System.out.println(nome+" "+descricao+" " +
                ""+classificao+" "+console+" "+preco);
    }
}
