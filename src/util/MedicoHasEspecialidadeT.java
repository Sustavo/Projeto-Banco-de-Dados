package util;

import model.MedicoHasEspecialidade;
import servico.ServicoEspecialidade;
import servico.ServicoMedico;
import servico.ServicoMedicoHasEspecialidade;

import java.util.List;

public class MedicoHasEspecialidadeT {
    public static ServicoMedicoHasEspecialidade servicoMedicoHasEspecialidade = new ServicoMedicoHasEspecialidade();
    public static ServicoMedico servicoMedico = new ServicoMedico();
    public static ServicoEspecialidade servicoEspecialidade = new ServicoEspecialidade();

    public static void main(String[] args) {
        MedicoHasEspecialidade medicoHasEspecialidade = new MedicoHasEspecialidade(
                servicoMedico.buscarPorId(1),
                servicoEspecialidade.buscarPorId(1)
        );
//
//        // salvar
        servicoMedicoHasEspecialidade.salvar(medicoHasEspecialidade);

        // listar
        System.out.println(servicoEspecialidade.buscar());

        // buscar
        List<MedicoHasEspecialidade> medicoHasEspecialidade1 = servicoMedicoHasEspecialidade.buscarPorMedicoId(1);

        System.out.println(medicoHasEspecialidade1);
    }
}
