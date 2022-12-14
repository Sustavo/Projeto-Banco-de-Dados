package util;

import model.Medico;
import servico.ServicoMedico;

import java.sql.SQLException;

public class MedicoT {
	public static ServicoMedico servicoMedico = new ServicoMedico();
	
	public static void main(String[] args) throws SQLException {
		Medico med = new Medico("Marcos", "test");


//		// salvar
		servicoMedico.salvar(med);

		// listar
		System.out.println(servicoMedico.buscar());

		// buscar
		Medico medico = servicoMedico.buscarPorId(1);

		// editar
		medico.setCrm("12321");
		servicoMedico.update(medico);

		System.out.println(servicoMedico.buscarPorId(1));
	}
}
