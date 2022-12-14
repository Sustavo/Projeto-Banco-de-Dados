package util;

import model.Endereco;
import servico.ServicoEndereco;
import servico.ServicoLaboratorio;

import java.sql.SQLException;

public class EnderecoT {
    public static ServicoEndereco servicoEndereco = new ServicoEndereco();
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();

    public static void main(String[] args) throws SQLException {
        Endereco endereco = new Endereco(
                "Guarani",
                "1256",
                "zero",
                "Henrique Jorge",
                "152458",
                "labo",
                servicoLaboratorio.buscarPorId(1));

//        // salvar
        servicoEndereco.salvar(endereco);

        // listar
        System.out.println(servicoEndereco.buscar());

        //buscar
       Endereco endereco1 = servicoEndereco.buscarPorId(1);

        //editar
        endereco1.setRua("rua Guarana");
        servicoEndereco.update(endereco1);

        System.out.println(endereco1);
    }
}
