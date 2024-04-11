package balistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static jdk.internal.foreign.abi.aarch64.AArch64Architecture.v0;

public class input extends JFrame {
    private JTextField tx_v0;
    private JTextField txteta;
    private JPanel tela;
    private JButton enviar;

    public input(){
        setContentPane(tela);
        setTitle("teste");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double v0 = Double.parseDouble(tx_v0.getText());
                float theta = Float.parseFloat(txteta.getText());
            }
        });
    }
    public class Bola{

    private int raio; // Raio da bola em pixels
    private int x; // Posição X da bola
    private int y; // Posição Y da bola

    // Construtor para inicializar a bola
    public Bola(int raio, int x, int y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    // Métodos para obter e definir propriedades
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void movimentoX(float teta, double v0) {
        for (double t0 = 0; t0 <= 100; t0 += 0.1) {
            double x = 0 + (v0*Math.sin(teta)*t0);
        }
    }
    void movimentoY(float teta, double v0){
        for (float t0 = 0; t0 <= 100; t0 += 0.1F) {
            float g = 9.8F;
            float y = (float) (0 + (v0* Math.sin(teta)*t0) - g*Math.pow(t0,2));
        }
    }





    public static void main(String[] args) {
        input myframe = new input();

    }
}
}
