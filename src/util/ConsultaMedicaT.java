package util;

import model.ConsultaMedica;
import servico.ServicoConsultaMedica;
import servico.ServicoMedico;
import servico.ServicoPaciente;

import java.sql.SQLException;

public class ConsultaMedicaT {
    public static ServicoConsultaMedica servicoConsultaMedica = new ServicoConsultaMedica();
    public static ServicoPaciente servicoPaciente = new ServicoPaciente();
    public static ServicoMedico servicoMedico = new ServicoMedico();
    public static void main(String[] args) throws SQLException {
        long millis = System.currentTimeMillis();
        ConsultaMedica consultaMedica = new ConsultaMedica(new java.sql.Date(millis),
                "sasaasa",
                servicoPaciente.buscarPorId(1),
                servicoMedico.buscarPorId(1));

        //salvar
        servicoConsultaMedica.salvar(consultaMedica);

       // listar
        System.out.println(servicoConsultaMedica.buscar());

        //buscar
        ConsultaMedica consultaMedica1 = servicoConsultaMedica.buscarPorId(1);

        //editar
        consultaMedica1.setNm_atendimento("alterar");
        servicoConsultaMedica.update(consultaMedica1);
        System.out.println(consultaMedica1);

        // remover
//        servicoConsultaMedica.remover(3);

    }
}
