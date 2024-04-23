import math

velocidade = float(input("Qual a velocidade inicial? "))
angulo = float(input("Qual o ângulo (0~180)? "))
g = 10

def posicaoy():
    y = 0
    for x in range(0, 100):
        y += velocidade * math.sin(angulo) * x - ((g * (pow(x, 2))) / 2)
        if y > 0:
            break
    return y

def posicaox():
    x = 0
    for x in range(0, 100):
        x += (velocidade * angulo) * math.cos(math.radians(angulo))
    return x

class Bola:
    def __init__(self, velocidade_inicial, angulo_inicial):
        self.x = posicaox()
        self.y = posicaoy()

# Cria um objeto bola com as informações fornecidas
bola1 = Bola(velocidade, angulo)

# Imprime as posições final da bola
print(f"Posição X: {bola1.x}")
print(f"Posição Y: {bola1.y}")
