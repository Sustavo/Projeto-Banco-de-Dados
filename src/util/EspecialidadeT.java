package util;

import model.Especialidade;
import servico.ServicoEspecialidade;

import java.sql.SQLException;

public class EspecialidadeT {
    public static ServicoEspecialidade servicoEspecialidade = new ServicoEspecialidade();

    public static void main(String[] args) throws SQLException {
        Especialidade especialidade = new Especialidade("Fisioterapia", "testt");

        // salvar
        servicoEspecialidade.salvar(especialidade);

        //listar
        System.out.println(servicoEspecialidade.buscar());

        //buscar
        Especialidade especialidade1 = servicoEspecialidade.buscarPorId(1);

        // editar
        especialidade1.setObservacao("bbbb");
        servicoEspecialidade.update(especialidade1);
        System.out.println(servicoEspecialidade.buscar());
    }
}
