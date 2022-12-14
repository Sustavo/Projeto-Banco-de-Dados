package util;

import model.HabilitacaoExame;
import servico.ServicoHabilitacaoExame;
import servico.ServicoLaboratorio;
import servico.ServicoTipoExame;

import java.sql.SQLException;

public class HabilitacaoExameT {
    public static ServicoHabilitacaoExame servicoHabilitacaoExame = new ServicoHabilitacaoExame();
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();
    private static ServicoTipoExame servicoTipoExame = new ServicoTipoExame();

    public static void main(String[] args) throws SQLException {
        HabilitacaoExame habilitacaoExame = new HabilitacaoExame(
                "Maior de idade!",
                145.00,
                servicoLaboratorio.buscarPorId(1),
                servicoTipoExame.buscarPorId(1));

        // salvar
        servicoHabilitacaoExame.salvar(habilitacaoExame);

        // listar
        System.out.println(servicoHabilitacaoExame.buscar());

        // buscar
        HabilitacaoExame habilitacaoExame1 = servicoHabilitacaoExame.buscarPorId(1);

        // editar
        habilitacaoExame1.setCusto(40.00);
        servicoHabilitacaoExame.update(habilitacaoExame1);

        System.out.println(servicoHabilitacaoExame.buscarPorId(1));
    }
}
