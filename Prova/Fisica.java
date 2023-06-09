package Prova;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa {
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return super.toString()+
                "Fisica: " +
                "\n dataNascimento=" + dataNascimento +
                "\n genero=" + genero;
    }
}
