package Prova;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, String CPF, String rg, String matricula, Setor setor, double salario, String cnh) {
        super(nome, telefone, email, endereco, dataNascimento, genero, CPF, rg, matricula, setor, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Motoboy{" +
                "cnh='" + cnh + '\'' +
                '}';
    }
}
