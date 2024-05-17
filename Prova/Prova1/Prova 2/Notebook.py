class Notebook:
    def __init__(self,processador, memoria) -> None:
        self.geracao = processador
        self.marca = memoria

    def mostra_info(self):
        print("Informações do Notebook:")
        print(f"Processador: {self.processador}")
        print(f"Memoria: {self.memoria}")

    def instalar_aplicativo(self):
        print("Instalei um aplicatio no Notebook!")

