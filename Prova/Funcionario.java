package Prova;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica {
    protected String CPF;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    public Funcionario(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String CPF, String rg, String matricula, Setor setor, double salario) {
        super(nome, telefone, email, endereco, dataNascimento, genero);
        this.CPF = CPF;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Funcionario: " +
                "\n CPF= " + CPF +
                "\n rg= " + rg +
                "\n matricula= " + matricula +
                "\n  setor=" + setor +
                "\n salario=" + salario;
    }
}
