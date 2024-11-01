public class Paciente extends Pessoa{

    private String condicaoPaciente;

    public void setCondicaoPaciente(String condicaoPaciente) {
        this.condicaoPaciente = condicaoPaciente;
    }

    public String getCondicaoPaciente() {
        return condicaoPaciente;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Condição: " + condicaoPaciente;
    }

}
