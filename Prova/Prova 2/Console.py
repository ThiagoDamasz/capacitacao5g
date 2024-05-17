class Console:
    def __init__(self,geracao, marca) -> None:
        self.geracao = geracao
        self.marca = marca

    def mostra_info(self):
        print("Informações do Notebook:")
        print(f"Nome: {self.nome}")
        print(f"Preco: {self.preco}")

    def jogar(self):
        print("Estou jogando o video game!")
