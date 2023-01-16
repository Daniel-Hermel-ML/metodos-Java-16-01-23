package metodosAtividade5;

public class testaIngresso {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(  "Esqueceram de Mim",
                                            78787878,
                                            "Universal",
                                            38,
                                            "Clássico infantil");
        Ingresso ingresso2 = new Ingresso(  "De Volta para o FuturoAvatar",
                                            98989898,
                                            "Anos 90",
                                            34,
                                            "Clássico anos 90");

        ingresso1.visualizar();
        ingresso2.visualizar();
    }
}
