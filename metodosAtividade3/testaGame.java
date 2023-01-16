package metodosAtividade3;

import metodosAtividade1.Clientes;

public class testaGame {
    public static void main(String[] args) {
        Produto produto1 = new Produto("God of War",
                "Loren Ipsem",16,
                "Play",199);
        Produto produto2 = new Produto("God of War2",
                "Loren Ipsem2",162,
                "Play2",200);
        produto1.visualizar();
        produto2.visualizar();
    }

}
