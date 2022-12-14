package util;

import model.TipoExame;
import servico.ServicoExame;
import servico.ServicoTipoExame;

import java.sql.SQLException;

public class TipoExameT {
    private static ServicoTipoExame servicoTipoExame = new ServicoTipoExame();

    public static void main(String[] args) throws SQLException {
        TipoExame tipoExame = new TipoExame("mama", "teste");

        // salvar
        servicoTipoExame.salvar(tipoExame);

        // listar
        System.out.println(servicoTipoExame.buscar());;

        //editar
        TipoExame tipoExame1 = servicoTipoExame.buscarPorId(1);
        tipoExame1.setObservacao("aaaa");
        servicoTipoExame.update(tipoExame1);

        System.out.println(servicoTipoExame.buscar());;
    }
}
