package metodosAtividade5;

public class Ingresso {
    private String nomeFilme;
    private int cod;
    private String sala;
    private double preco;
    private String obs;

    public Ingresso(String nomeFilme,
                    int cod,
                    String sala,
                    double preco,
                    String obs) {
        this.nomeFilme = nomeFilme;
        this.cod = cod;
        this.sala = sala;
        this.preco = preco;
        this.obs = obs;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    public void visualizar(){
        System.out.println(nomeFilme+" | " +
                ""+cod+" | " +
                ""+preco+" | " +
                ""+sala+" | " +
                ""+obs);
    }
}
