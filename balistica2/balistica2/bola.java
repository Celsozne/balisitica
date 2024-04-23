package balistica2;

public class bola {
    float velocidade;
    float angulo;
    float posicaox;
    float posicaoy;

    void movimentox() {
        for (float t0 = 0; t0 < 100; t0+= 0.1F) {
            float x = (float) (0 + (velocidade * Math.cos(angulo)*t0));
                  x = posicaox;
        }
    }

    void movimentoy() {
        float g = 9.8F;
        for (float t0 = 0; t0 < 100; t0+= 0.1F) {
            float y = (float) ((float) 0 + (velocidade*Math.sin(angulo)*t0) + (g*Math.pow(t0,2)));
            y = posicaoy;
            if (posicaoy >0) {
                break;
            }
            }
        }
    }
}


