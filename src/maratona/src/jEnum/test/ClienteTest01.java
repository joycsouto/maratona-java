package jEnum.test;


import jEnum.dominio.Cliente;
import jEnum.dominio.TipoCliente;
import jEnum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joyce" , TipoCliente.PESSOA_FISICA ,TipoPagamento.CREDITO);
        Cliente cliente01 = new Cliente("Leo" , TipoCliente.PESSOA_FISICA , TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Luisa" , TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
//        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
//        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente1);
        System.out.println(cliente);
        System.out.println(cliente01);
        System.out.println(cliente3);
    }
}
