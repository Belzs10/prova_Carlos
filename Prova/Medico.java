package Prova;

import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String CPF, String rg, String matricula, Setor setor, double salario, String crm) {
        super(nome, telefone, email, endereco, dataNascimento, genero, CPF, rg, matricula, setor, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico: " +
                "\n crm= " + crm ;
    }
}
