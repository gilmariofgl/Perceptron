package perceptron.modelos;
/*
 * @author Francisco Gilmário de Lima
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perceptron implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    // Atributos
    private int x1, x2, x3;
    private double w0, w1, w2, w3;
    private String nomeX1, nomeX2, nomeX3, nomeY0, nomeY1, titulo;

    //Converte em String [Atalho "Alt+Ins": Gerar\toString()];

    @Override
    public String toString() {
        return "Perceptron{" + "nomeX1=" + getNomeX1() + ", nomeX2=" + getNomeX2() + ", nomeX3=" + getNomeX3() + ", nomeY0=" + getNomeY0() + ", nomeY1=" + getNomeY1() + ", titulo=" + getTitulo() + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public double getW0() {
        return w0;
    }

    public void setW0(double w0) {
        this.w0 = w0;
    }

    public double getW1() {
        return w1;
    }

    public void setW1(double w1) {
        this.w1 = w1;
    }

    public double getW2() {
        return w2;
    }

    public void setW2(double w2) {
        this.w2 = w2;
    }

    public double getW3() {
        return w3;
    }

    public void setW3(double w3) {
        this.w3 = w3;
    }

    public String getNomeX1() {
        return nomeX1;
    }

    public void setNomeX1(String nomeX1) {
        this.nomeX1 = nomeX1;
    }

    public String getNomeX2() {
        return nomeX2;
    }

    public void setNomeX2(String nomeX2) {
        this.nomeX2 = nomeX2;
    }

    public String getNomeX3() {
        return nomeX3;
    }

    public void setNomeX3(String nomeX3) {
        this.nomeX3 = nomeX3;
    }

    public String getNomeY0() {
        return nomeY0;
    }

    public void setNomeY0(String nomeY0) {
        this.nomeY0 = nomeY0;
    }

    public String getNomeY1() {
        return nomeY1;
    }

    public void setNomeY1(String nomeY1) {
        this.nomeY1 = nomeY1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
