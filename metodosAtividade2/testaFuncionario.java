package metodosAtividade2;

import metodosAtividade2.Funcionarios;

public class testaFuncionario {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Daniel",
                                                    30,
                                                    "Ativo",
                                                    "M",
                                                    123123123);

        funcionario.visualizar();
    }
}
