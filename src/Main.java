import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Consulta consulta = new Consulta();
        Medico medico = new Medico();
        Profissional profissional = new Profissional();
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data da consulta (formato AAAA-MM-DD): ");

        String data = scanner.next();
        LocalDate dataConsulta = LocalDate.parse(data); // Converte
        consulta.realizarConsulta(medico, paciente, dataConsulta);
        System.out.println("Consulta realizada com sucesso!");
    }
}