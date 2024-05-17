class Produto:
    def __init__(self, preco, nome, notebook, console) -> None:
        self.nome = nome
        self.preco = preco
        self.notebook = notebook
        self.console = console

    def mostra_info(self):
         print("Informações do Produto:")
         print(f"Nome: {self.nome}")
         print(f"Preço: {self.preco}")
