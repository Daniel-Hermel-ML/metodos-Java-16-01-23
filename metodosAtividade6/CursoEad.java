package metodosAtividade6;

import javax.swing.*;

public class CursoEad {
    private String nome;
    private int cod;
    private String prof;
    private int semeste;
    private int cargH;

    public CursoEad(String nome,
                    int cod,
                    String prof,
                    int semeste,
                    int cargH) {
        this.nome = nome;
        this.cod = cod;
        this.prof = prof;
        this.semeste = semeste;
        this.cargH = cargH;
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

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public int getSemeste() {
        return semeste;
    }

    public void setSemeste(int semeste) {
        this.semeste = semeste;
    }

    public int getCargH() {
        return cargH;
    }

    public void setCargH(int cargH) {
        this.cargH = cargH;
    }
    public void visualizar(){
        System.out.println(nome+" | " +
                ""+cod+" | " +
                ""+prof+" | " +
                ""+semeste+" | " +
                ""+cargH);

    }
}