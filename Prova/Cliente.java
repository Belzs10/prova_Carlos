package Prova;

import java.time.LocalDate;

public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente(String nome, String telefone, String email, Endereco endereco, LocalDate dataNascimento, Genero genero, int protocoloAtendimento) {
        super(nome, telefone, email, endereco, dataNascimento, genero);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Cliente: " +
                "\n protocoloAtendimento=" + protocoloAtendimento;
    }
}
