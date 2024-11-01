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

    public void realizarConsulta(Medico medico, Paciente paciente, LocalDate dataConsulta){
        this.medico = medico;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
    }

    @Override
    public String toString() {
        return  "--------------Ficha--------------" +
                "\nConsulta: " + dataConsulta + "\n\n" +
                "Médico: " + medico.toString() + "\n" +
                "Paciente: " + paciente.toString() + "\n\n" +
                "Atendimento de enfermaria\n\n" +
                "Profissional: " + profissional.toString() + "\n" +
                "Paciente: " + paciente.toString()+ "\n" +
                "--------------Agradecemos pela preferência--------------";
    }

}
