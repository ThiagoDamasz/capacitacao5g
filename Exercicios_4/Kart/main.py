from piloto import Piloto
from kart import Kart

piloto1 = Piloto("João", True)
piloto2 = Piloto("Zé", False)

kart1 = Kart("Kart do João", "90cc", 300, piloto1)
kart2 = Kart("Kart do Zé", "90cc", 300, piloto2)

piloto1.soltar_super_poder()

kart1.fazer_drift()
kart2.pular()
kart1.soltar_turbo()

kart1.motor.mostra_info()
kart2.motor.mostra_info()

kart1.piloto.soltar_super_poder()
kart2.piloto.soltar_super_poder()
