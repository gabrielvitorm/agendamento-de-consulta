import java.time.LocalDate;

public final class Consulta {
    private Paciente paciente;
    private Medico medico;
    private Profissional profissional;
    private LocalDate dataConsulta;

    public void adicionarPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public void adicionarMedico(Medico medico){
        this.medico = medico;
    }

    public void adicionarProfissional(Profissional profissional){
        this.profissional = profissional;
    }

    public void realizarConsulta(){

    }
}
