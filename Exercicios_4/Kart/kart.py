from motor import Motor


class Kart:
    def __init__(self, nome, cilindradas, velocidade_maxima, piloto) -> None:
        self.nome = nome
        self.motor = Motor(cilindradas, velocidade_maxima)
        self.piloto = piloto

    def pular(self):
        print(f"O kart {self.nome} está pulando...")

    def soltar_turbo(self):
        print(f"O kart {self.nome} está soltando turbo...")

    def fazer_drift(self):
        print(f"O kart {self.nome} está fazendo drift...")
