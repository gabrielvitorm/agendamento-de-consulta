public class Profissional extends Pessoa {

    private String profissao;

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString() {
        return nome + ", Idade: " + idade + ", Profissão: " + profissao;
    }

}
