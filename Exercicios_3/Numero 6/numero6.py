import pandas as pd

df = pd.read_csv('paises.csv', sep=';')

print('Países Oceania: ')
print(df[df['Region'] == 'OCEANIA'])

media_alfabetizacao = df['Literacy (%)'].mean()
print(f'Média da taxa de alfabetização do planeta: {media_alfabetizacao}')

maior_pop = df['Population'].max()
print('A região do país que possui a maior população: ')
print(df[df['Population'] == maior_pop]['Region'])

paises_sem_costa = df[df['Coastline (coast/area ratio)'] == 0]
paises_sem_costa.to_csv('noCoast.csv', sep=';')