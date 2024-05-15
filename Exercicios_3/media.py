nome = input("Escreva o nome do aluno: ") 
media = float(input("Escreva a media do aluno: "))

aluno = {
    'nome': nome,
    'media': media
}

if media >= 60:
    aluno['situacao'] = 'APROVADO'
else:
    aluno['situacao'] = 'REPROVADOP'

for key, value in aluno.items():
    print(f'{key}: {value}')
