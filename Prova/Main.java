package Prova;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Pessoa juridica = new Juridica("Amazon","382742374","amazon@email.com",
               new Endereco("Avenida Bonita","137","Nhe","28173298","São Paulo",UnidadeFederativa.SAO_PAULO),"7348734748","387");
       Pessoa cliente = new Cliente("Perla","09238908","perla@email.com",
               new Endereco("Avenida Aonde","15","Casa","0120093","São Paulo",UnidadeFederativa.SAO_PAULO),LocalDate.of(1990,2,15),Genero.FEMININO,14);
       Pessoa motoboy = new Motoboy("Alex","38472837","alex@email.com",
               new Endereco("Rua Chama","70","Apto","4589492","Rio de Janeiro",UnidadeFederativa.RIO_DE_JANEIRO),LocalDate.of(1997,5,15),Genero.MASCULINO,"84738375","43783849","09",Setor.OPERACOES,930,"00209");
       Pessoa medico = new Medico("Clemencia","37427329","clemencia@email.com",
               new Endereco("Pracinha","124","Casa","0129039","Salvador",UnidadeFederativa.BAHIA),LocalDate.of(2000,10,2),Genero.FEMININO,"03824047032","274094723","j009",Setor.SAUDE,6800,"03299");
       Pessoa advogado = new Advogado("Joel","90490230","Joel@email.com",
               new Endereco("Rua","110","Casa","493828","Salvador",UnidadeFederativa.BAHIA),LocalDate.of(2001,7,24),Genero.MASCULINO,"309283982","489753947","is2636",Setor.JURIDICO,5700,"lçsadk");

        System.out.println("\n Pessoa Juridica: " + juridica);
        System.out.println("\n Cliente: " + cliente);
        System.out.println("\n Funcionário: " + motoboy);
        System.out.println("\n Funcionário: " + medico);
        System.out.println("\n Funcionário: " + advogado);


    }
}
