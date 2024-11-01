import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Consulta consulta = new Consulta();
        Medico medico = new Medico();
        Profissional profissional = new Profissional();
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do paciente:");
        paciente.setNome(scanner.nextLine());

        System.out.println("Digite a idade do paciente:");
        paciente.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite a condição do paciente:");
        paciente.setCondicaoPaciente(scanner.nextLine());
        consulta.adicionarPaciente(paciente);

        System.out.println("Digite o nome do Médico que vai acompanhar o Caso");
        medico.setNome(scanner.nextLine());

        System.out.println("Digite a idade do Médico:");
        medico.setIdade(scanner.nextInt());
        scanner.nextLine();

        medico.setEspecializacao(ESPECIALIZACAO.Clínco);
        //System.out.println("Digite a Especialização do Médico:");
        //medico.setEspecializacao(ESPECIALIZACAO.values(scanner.nextLine()));

        consulta.adicionarMedico(medico);

        System.out.println("Digite o nome do Profissional que vai acompanhar o médico:");
        profissional.setNome(scanner.nextLine());

        System.out.println("Digite a idade do profissional:");
        profissional.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite a profissão do ajudante:");
        profissional.setProfissao(scanner.nextLine());

        consulta.adicionarProfissional(profissional);


        System.out.print("Digite a data da consulta (formato AAAA-MM-DD): ");

        String data = scanner.next();
        LocalDate dataConsulta = LocalDate.parse(data); // Converte
        consulta.realizarConsulta(medico, paciente, dataConsulta);
        System.out.println("Consulta realizada com sucesso!");

        System.out.println(consulta);
    }
}