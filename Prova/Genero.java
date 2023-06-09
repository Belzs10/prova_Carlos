package Prova;

public enum Genero {
    FEMININO('F',"Feminino"),
    MASCULINO('M',"Masculino");

    private char caractere;
    private String text;

    Genero(char caractere, String text) {
        this.caractere = caractere;
        this.text = text;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
