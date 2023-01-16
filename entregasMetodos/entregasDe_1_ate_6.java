package entregasMetodos;

public class entregasDe_1_ate_6 {
    
    Atividade 1
    public static void main(String[] args) {
        Clientes cliente = new Clientes("Maria", 20, 123123123,"F","maria@maria.com");

        cliente.visualizar();
    ///////////////////////////
    Atividade 2
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Daniel",
                                                    30,
                                                    "Ativo",
                                                    "M",
                                                    123123123);
        funcionario.visualizar();
    }
    ////////////////////////////
    Atividade 3
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
    ////////////////////////////
    Atividade 4
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
    ////////////////////////////
    Atividade 5
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
    /////////////////////////////
    public static void main(String[] args) {
        CursoEad curso1 = new CursoEad( "Git e GitHub",
                                        1234567,
                                        "Alan Santos",
                                        1,120);
        CursoEad curso2 = new CursoEad( "Git e GitHub",
                                        1234567,
                                        "Alan Santos",
                                        2,200);

        curso1.visualizar();
        curso2.visualizar();
    }
     
}
