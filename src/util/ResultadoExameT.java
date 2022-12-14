package util;

import model.ResultadoExame;
import servico.ServicoComposicao;
import servico.ServicoLaudo;
import servico.ServicoResultadoExame;

import java.sql.SQLException;

public class ResultadoExameT {
    public static ServicoResultadoExame servicoResultadoExame = new ServicoResultadoExame();
    public static ServicoLaudo servicoLaudo = new ServicoLaudo();
    public static ServicoComposicao servicoComposicao = new ServicoComposicao();

    public static void main(String[] args) throws SQLException {
        long millis = System.currentTimeMillis();

        ResultadoExame resultadoExame = new ResultadoExame(
                new java.sql.Date(millis),
                "Muitos",
                servicoComposicao.buscarPorId(1),
                servicoLaudo.buscarPorId(1)
        );
//
//        // salvar
        servicoResultadoExame.salvar(resultadoExame);

        // listar
        System.out.println(servicoResultadoExame.buscar());

        // buscar
        ResultadoExame resultadoExame1 = servicoResultadoExame.buscarPorId(1);

        // editar
        resultadoExame1.setValor("Descubra");
        servicoResultadoExame.update(resultadoExame1);

        System.out.println(servicoResultadoExame.buscarPorId(1));
    }
}
