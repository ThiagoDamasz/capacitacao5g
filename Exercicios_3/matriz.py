import numpy as np

np.random.seed(10)

matriz_aleatoria = np.array(np.random.randint(1, 50, [4, 4]))

print(matriz_aleatoria)

quant = {}

for i in np.unique(matriz_aleatoria):
    quant[i] = 0

for row in matriz_aleatoria:
    for i in row:
        quant[i] += 1

print(quant)
