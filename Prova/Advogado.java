package Prova;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String CPF, String rg, String matricula, Setor setor, double salario, String oab) {
        super(nome, telefone, email, endereco, dataNascimento, genero, CPF, rg, matricula, setor, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Advogado: " +
                "\n oab: " + oab;
    }
}
