package balistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class input extends JFrame {
    private JTextField tx_v0;
    private JTextField txteta;
    private JPanel tela;
    private JButton enviar;
    float v0;
    float theta;
    float x;
    float y;
    float g = (float) 9.8;

    public input() {
        setContentPane(tela);
        setTitle("teste");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                v0 = Float.parseFloat(tx_v0.getText());
                theta = Float.parseFloat(txteta.getText());
                movimentoX();
                movimentoY();
                System.out.println(x + y);
            }
        });

    }

    void movimentoX() {
        for (float t0 = (float) 0.1; t0 <= 100; t0 += 0.1) {
            float x = (float) (0 + (v0 * Math.cos(theta) * t0));
            System.out.println(x);
            if (y < 0) {
                break;
            }
            return;
        }
    }
        void movimentoY () {
            for (float t0 = (float) 0.1; t0 <= 100; t0 += 0.1F) {
                float w = (float) (0 + (v0 * Math.sin(theta) * t0) - g * Math.pow(t0, 2));
                w = y;
                if (y < 0) {
                    break;
                }
            }
            return;
        }


        public static void main (String[]args){
            input myframe = new input();

        }
    }



