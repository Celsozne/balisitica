package balistica;

public class Bola extends input{

    private int raio=10; // Raio da bola em pixels
    private int x =0; // Posição X da bola
    private int y=0; // Posição Y da bola

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

    void movimentoX() {
        for (double t0 = 0; t0 <= 100; t0 += 0.1) {
            double x = 0;
        }
    }
    void movimentoY(){
        for (double t0 = 0; t0 <= 100; t0 += 0.1) {
            double y = 0 + (tx_v0)
        }
    }



}


