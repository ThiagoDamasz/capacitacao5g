import pandas as pd

df = pd.read_csv('space.csv', sep=';')

total_missao = df['Status Mission'].count()
total_sucesso = df[df['Status Mission'] == 'Success']['Status Mission'].count()

missoes_sucesso = (total_sucesso / total_missao) * 100

print(f'Missoes sucesso: {missoes_sucesso}%')
print(df[df[' Cost'] != 0][' Cost'].mean())

missoes_spacex = df[df['Company Name'] == 'SpaceX']
mais_caro = missoes_spacex[' Cost'].max()

print('Missões mais caras da SpaceX: ')
print(missoes_spacex[missoes_spacex[' Cost'] == mais_caro])