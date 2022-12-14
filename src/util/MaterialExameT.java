package util;

import model.MaterialExame;
import servico.ServicoMaterialExame;

import java.sql.SQLException;

public class MaterialExameT {
    public static ServicoMaterialExame servicoMaterialExame = new ServicoMaterialExame();

    public static void main(String[] args) throws SQLException {
        MaterialExame materialExame = new MaterialExame("material", "monstro");

        // salvar
        //servicoMaterialExame.salvar(materialExame);

        // listar
        System.out.println(servicoMaterialExame.buscar());

        //buscar
      //  MaterialExame materialExame1 = servicoMaterialExame.buscarPorId(1);

        //editar
       // materialExame1.setMaterial("Lâmina de barbear");
      //  servicoMaterialExame.update(materialExame1);

       // System.out.println(materialExame1);
    }
}
