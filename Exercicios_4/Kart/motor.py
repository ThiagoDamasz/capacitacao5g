
class Motor:
    def __init__(self, cilindradas, velocidade_maxima) -> None:
        self.cilindradas = cilindradas
        self.velocidade_maxima = velocidade_maxima

    def mostra_info(self):
        print("Informações do motor:")
        print(f"Cilindradas: {self.cilindradas}")
        print(f"Velocidade Máxima: {self.velocidade_maxima}")
