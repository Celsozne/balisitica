# pacotes do python
import numpy as np
import matplotlib.pyplot as plt


# Parametros
m = 1  # Massa do projetil
g = 9.8  # aceleracao da gravidade em m/s²
Vo = 80  # velocidade inicial de lacamento em m/s
ang = 60  # angulo da velocidade inicial em graus
b = 0.005  # Coeficiente de atrito
dt = 0.2  # incremento de tempo em seg

#### Lista das variaveis cinemáticas iniciais ####

# tempo, velocidade e posicao (em x e y) - tudo em [] lista

t = [0]  # variavel dinamica do tempo
vx = [Vo * np.cos(ang / 180 * np.pi)]  # variavel dinamica de vx
vy = [Vo * np.sin(ang / 180 * np.pi)]  # variavel dinamica de vy
x = [0]  # variavel dinamica da posicao x
y = [0]  # variavel dinamica da posicao y

# Forca de atrito inicial
fa = b * Vo ** 2  # fat inicial (arrasto quadratico)

# Componentes da aceleracao devido a fat inicial
ax = [-(fa * np.cos(ang / 180 * np.pi)) / m]
ay = [-g - (fa * np.sin(ang / 180 * np.pi) / m)]

#### Laço para atualizar as variaveis e gerar dados ####

i = 0  # contador
while (y[i] >= 0):  # Enqto o ultimo valor de y for >= 0 vai gerar dados
    t.append(t[i] + dt)  # incremento de dt para adicionar a lista de valores do tempo

    # Atualizando os valores da velocidade em x e y
    vx.append(vx[i] + dt * ax[i])
    vy.append(vy[i] + dt * ay[i])

    # Atualizando os valores da posição em x e y
    x.append(x[i] + dt * vx[i])
    y.append(y[i] + dt * vy[i])

    # Com o novo calculo da velocidade, pode-se atualizar a fat
    vel = np.sqrt(vx[i + 1] ** 2 + vy[i + 1] ** 2)  # magnitude da velocidade
    fa = b * vel ** 2  # forca de atrito atualizada

    # Atualizando as componentes da aceleracao devido à fat atualizada
    ax.append(-(fa * np.cos(ang / 180 * np.pi)) / m)
    ay.append(-g - (fa * np.sin(ang / 180 * np.pi) / m))

    # Incrementando o contador por 1
    i = i + 1

# Plotando o grafico da trajetoria
plt.plot(x, y, 'ro')
plt.ylabel("y (m)")
plt.xlabel("x (m)")

# O ultimo valor de x fornece aproximadamente o alcance do projetil

print("O alcance do projétil é {:3.1f} m".format(x[i]))