package util;

import model.Paciente;
import servico.ServicoPaciente;

import java.sql.SQLException;

public class PacienteT {
    public static ServicoPaciente servicoPaciente = new ServicoPaciente();

    public static void main(String[] args) throws SQLException {
        long millis = System.currentTimeMillis();
        Paciente paciente = new Paciente("roberta", new java.sql.Date(millis));

        //Salvar
        servicoPaciente.salvar(paciente);

        //editar
        Paciente paciente1 = servicoPaciente.buscarPorId(1);
        paciente1.setNome("joao");
        servicoPaciente.update(paciente1);

        //remover
        Paciente paciente11 = servicoPaciente.buscarPorId(1);
        servicoPaciente.remover(paciente11.getId().intValue());

        //Listar
        System.out.println(servicoPaciente.buscar());

    }
}
