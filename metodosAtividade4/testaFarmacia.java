package metodosAtividade4;

public class TestaFarmacia {
    public static void main(String[] args) {
        Farmacia produto1 = new Farmacia(  "AAS",
                                                1234,
                                                "ECHO",
                                                18,
                                                "Ácido AAS");
        Farmacia produto2 = new Farmacia(  "GELOL",
                                                4578,
                                                "Teuto",
                                                5,
                                                "GELOL");

        produto1.visualizar();
        produto2.visualizar();
    }
}
