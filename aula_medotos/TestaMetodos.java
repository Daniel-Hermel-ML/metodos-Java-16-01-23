package aula_medotos;

import pacote1.ClassePacote1;

public class TestaMetodos {

    public static void main(String[] args) {


        metodoPublico();
        metodoFriendly();
        metodoProtegido();
        metodoPrivado();

        Classe1.metodoFriendly();
        Classe1.metodoProtegido();
        Classe1.metodoPublico();

        ClassePacote1.metodoPublico();

    }
//	Métodos da Classe TestaMétodos

    //Método Public
    public static void metodoPublico(){
        System.out.println("Método Público - Classe Testa Métodos");
    }

    //Método Friendly
    static void metodoFriendly(){
        System.out.println("Método Friendly - Classe Testa Métodos");
    }

    //Método Protected
    protected static void metodoProtegido(){
        System.out.println("Método Protegido - Classe Testa Métodos");
    }

    //Método Private
    private static void metodoPrivado(){
        System.out.println("Método Privado - Classe Testa Métodos");
    }


}
