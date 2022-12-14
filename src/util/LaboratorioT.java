package util;

import model.Laboratorio;
import servico.ServicoLaboratorio;

public class LaboratorioT {
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();

    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio("laboratorio", "aaa", "bb", "ccc", "ddd");

        //salvar
        servicoLaboratorio.salvar(laboratorio);

        //listar
        System.out.println(servicoLaboratorio.buscar());

        //buscar
        Laboratorio laboratorio1 = servicoLaboratorio.buscarPorId(1);

        // editar
        laboratorio1.setDescricao("editando");
        System.out.println(laboratorio1);
    }
}
