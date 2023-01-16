package metodosAtividade4;

public class Farmacia {
    private String nome;
    private int cod;
    private String laboratorio;
    private float preco;
    private String validade;

    public Farmacia(String nome,
                    int cod,
                    String laboratorio,
                    float preco,
                    String validade) {
        this.nome = nome;
        this.cod = cod;
        this.laboratorio = laboratorio;
        this.preco = preco;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void visualizar(){
        System.out.println(nome+" " +
                        ""+cod+" " +
                        ""+laboratorio+" " +
                        ""+preco+" " +
                        ""+validade);
    }
}
