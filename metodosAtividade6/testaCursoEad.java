package metodosAtividade6;

public class testaCursoEad {
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
