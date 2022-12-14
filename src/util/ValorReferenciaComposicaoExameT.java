package util;

import model.ValorReferenciaComposicaoExame;
import servico.ServicoUnidadeMedida;
import servico.ServicoValorReferenciaComposicaoExame;

import java.sql.SQLException;

public class ValorReferenciaComposicaoExameT {
    public static ServicoUnidadeMedida servicoUnidadeMedida = new ServicoUnidadeMedida();
    public static ServicoValorReferenciaComposicaoExame servicoValorReferenciaComposicaoExame = new ServicoValorReferenciaComposicaoExame();

    public static void main(String[] args) throws SQLException {
        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame = new ValorReferenciaComposicaoExame(
                "sim",
                "não",
                "talvez",
                "Boa sorte",
                servicoUnidadeMedida.buscarPorId(1));

        //salvar
        servicoValorReferenciaComposicaoExame.salvar(valorReferenciaComposicaoExame);

        // listar
        System.out.println(servicoValorReferenciaComposicaoExame.buscar());

        //buscar
        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame1 = servicoValorReferenciaComposicaoExame.buscarPorId(1);

        //editar
        valorReferenciaComposicaoExame1.setValor_maximo("bastante");
        servicoValorReferenciaComposicaoExame.update(valorReferenciaComposicaoExame1);

        System.out.println(servicoValorReferenciaComposicaoExame.buscarPorId(1));
    }
}
