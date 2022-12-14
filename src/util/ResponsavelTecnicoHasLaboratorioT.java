package util;

import model.ResponsavelTecnico;
import model.ResponsavelTecnicoHasLaboratorio;
import servico.ServicoLaboratorio;
import servico.ServicoResponsavelTecnico;
import servico.ServicoResponsavelTecnicoHasLaboratorio;

public class ResponsavelTecnicoHasLaboratorioT {
    public static ServicoResponsavelTecnico servicoResponsavelTecnico = new ServicoResponsavelTecnico();
    public static ServicoResponsavelTecnicoHasLaboratorio servicoResponsavelTecnicoHasLaboratorio = new ServicoResponsavelTecnicoHasLaboratorio();
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();

    public static void main(String[] args) {
//        ResponsavelTecnicoHasLaboratorio responsavelTecnicoHasLaboratorio =
//                new ResponsavelTecnicoHasLaboratorio(
//                        servicoResponsavelTecnico.buscarPorId(1),
//                        servicoLaboratorio.buscarPorId(1)
//                );
//
//        // salvar
//        servicoResponsavelTecnicoHasLaboratorio.salvar(responsavelTecnicoHasLaboratorio);

        // listar
        System.out.println(servicoResponsavelTecnicoHasLaboratorio.buscar());

        // buscar
        System.out.println(servicoResponsavelTecnicoHasLaboratorio.buscarPorResponsavelTecnicoId(1));
    }
}
