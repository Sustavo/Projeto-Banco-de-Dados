package util;

import model.SolicitacaoExame;
import servico.ServicoConsultaMedica;
import servico.ServicoExame;
import servico.ServicoHabilitacaoExame;
import servico.ServicoSolicitacaoExame;

import java.sql.SQLException;

public class SolicitacaoExameT {
    public static ServicoExame servicoExame = new ServicoExame();
    public static ServicoSolicitacaoExame servicoSolicitacaoExame = new ServicoSolicitacaoExame();
    public static ServicoHabilitacaoExame servicoHabilitacaoExame = new ServicoHabilitacaoExame();
    public static ServicoConsultaMedica servicoConsultaMedica = new ServicoConsultaMedica();

    public static void main(String[] args) throws SQLException {
        long millis = System.currentTimeMillis();
//
        SolicitacaoExame solicitacaoExame = new SolicitacaoExame(
          "Aasdfs",
          new java.sql.Date(millis),
                servicoConsultaMedica.buscarPorId(1),
                servicoHabilitacaoExame.buscarPorId(1),
                servicoExame.buscarPorId(1));

        // salvar
        servicoSolicitacaoExame.salvar(solicitacaoExame);

        // listar
        System.out.println(servicoSolicitacaoExame.buscar());

        // buscar
        SolicitacaoExame solicitacaoExame1 = servicoSolicitacaoExame.buscarPorId(1);

//        // editar
        solicitacaoExame1.setNm_prescrito("nome aq");
        servicoSolicitacaoExame.update(solicitacaoExame1);

        System.out.println(servicoSolicitacaoExame.buscarPorId(1));
    }
}
