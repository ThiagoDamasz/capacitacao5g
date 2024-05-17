from Console import Console
from Produto import Produto
from Notebook import Notebook

Console1 = Console("segunda","Microsoft")
Notebook1 = Notebook("Intel","5GRAM")

Produto1 = Produto(1000,00,"Samsung odyssey",Console,Notebook)
Produto2 = Produto(350,00,"Xbox",Console,Notebook)

Console1.mostra_info()
Notebook1.mostra_info()

Console1.jogar()
Notebook1.instalar_aplicativo()

Produto1.mostra_info()
Produto2.mostra_info()