package util;

import model.Exame;
import model.MaterialExame;
import servico.ServicoExame;
import servico.ServicoMaterialExame;
import servico.ServicoTipoExame;

import java.sql.SQLException;

public class ExameT {
    public static ServicoExame servicoExame = new ServicoExame();
    public static ServicoTipoExame servicoTipoExame = new ServicoTipoExame();
    public static ServicoMaterialExame servicoMaterialExame = new ServicoMaterialExame();

    public static void main(String[] args) throws SQLException {
        Exame exame = new Exame(
                "sim",
                "nao",
                servicoMaterialExame.buscarPorId(1),
                servicoTipoExame.buscarPorId(1));

        // salvar
        servicoExame.salvar(exame);

        // listar
        System.out.println(servicoExame.buscar());

        // buscar
        Exame exame1 = servicoExame.buscarPorId(1);

        // editar
        exame1.setDescricao("Mto bom");
        servicoExame.update(exame1);

        System.out.println(exame1);
    }
}
