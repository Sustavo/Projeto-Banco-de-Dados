package util;

import model.ResponsavelTecnico;
import servico.ServicoResponsavelTecnico;
import servico.ServicoSiglaFormacao;

import java.sql.SQLException;

public class ResponsavelTecnicoT {
    public static ServicoResponsavelTecnico servicoResponsavelTecnico = new ServicoResponsavelTecnico();
    public static ServicoSiglaFormacao servicoSiglaFormacao = new ServicoSiglaFormacao();

    public static void main(String[] args) throws SQLException {
       ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico(
                "Barnabel",
                "Use máscara",
                "Rinha",
                servicoSiglaFormacao.buscarPorId(1));


//        // salvar
        servicoResponsavelTecnico.salvar(responsavelTecnico);

        // listar
        System.out.println(servicoResponsavelTecnico.buscar());

        //buscar
        ResponsavelTecnico responsavelTecnico1 = servicoResponsavelTecnico.buscarPorId(1);

        //editar
        responsavelTecnico1.setConselho("Usa máscara");
        servicoResponsavelTecnico.update(responsavelTecnico1);

        System.out.println(responsavelTecnico1);

    }
}
