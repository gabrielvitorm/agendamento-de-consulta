public class Medico extends Pessoa{

    public ESPECIALIZACAO especializacao;

    public void setEspecializacao(ESPECIALIZACAO especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "Dr. " + nome + ", Idade: " + idade + ", Especialização: " + especializacao;
    }

}
