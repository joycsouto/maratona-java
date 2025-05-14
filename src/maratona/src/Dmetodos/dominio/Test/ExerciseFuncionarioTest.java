package Dmetodos.dominio.Test;

import Dmetodos.dominio.ExerciseFuncionario;

public class ExerciseFuncionarioTest {
    public static void main(String[] args) {
        ExerciseFuncionario funcionario = new ExerciseFuncionario();
        funcionario.setSalario(new double[] {2000,2000,5000});
        funcionario.setNome("Joyce");
        funcionario.setidade(25);
        funcionario.impressãoFuncionario();

    }
}
