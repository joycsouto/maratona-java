package MPolimorifismo.servico;

import MPolimorifismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria...");
    }
}
