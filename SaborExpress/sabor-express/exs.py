listaNumeros = [1,2,3,4,5,6,7,8,9,10]
listaNomes = ['nicolas', 'luana', 'pedro', 'cesar']
listaAno  = [2005, 2024]

infoPessoas = {{'Nome' : 'Nicolas', 'Idade' : 19, 'Cidade' : 'São Paulo'}}

def parOuImpar():
    numero = int(input('insira um numero:'))
    if numero % 2 == 0:
        print('esse numero eh par')
    else:
        print('esse numero eh impar')    

def classificarIdade():
    idade = int(input('digite sua idade:'))
    if 0 <= idade <= 12:
        print('voce eh uma crianca')
    elif 13 <= idade <= 18:
        print('vc eh um adolescente')
    elif idade > 18:
        print('vc eh um adulto')
    else:
        print('idade invalida')    

def verificaCadastro():
    usuarioCerto = 'nickmds'
    senhaCerta = 'nick2102'

    usuario = input('digite o usuario:')
    senha = input('digite a senha:')

    if usuario == usuarioCerto and senha == senhaCerta:
        print('login feito com sucesso')
    else:
        print('login invalido')    

def planoCartesiano():
    x = float(input('digite o valor de X:'))
    y = float(input('digite o valor de Y:'))

    if x > 0 and y > 0:
        print('o ponto se encontra no primeiro quadrante do plano cartesiano')
    elif x < 0 and y > 0:
        print('o ponto se encontra no segundo quadrante do plano cartesiano')  
    elif x < 0 and y < 0:
        print('o ponto se encontra no terceiro quadrante do plano cartesiano')      
    elif x > 0 and y < 0:
        print('o ponto se encontra no quarto quadrante do plano cartesiano')
    else:
        print('o ponto esta localizado no eixo ou origem do plano cartesiano')    

def percorrerLista():
    for nomes in listaNomes:
        print(nomes)

def loopImprimeSomaImpar():
    somaImpar = 0
    for numero in listaNumeros:
        if numero % 2 != 0:
            somaImpar += numero
    print(somaImpar)
    
    #ou tambem
    '''
    soma_impares = 0
    for i in range(1, 11, 2):
        soma_impares += i
    print(soma_impares)
    '''
 
def imprimirDecrescente():
    for i in range (10, 0, -1):
        print (i)

def calcularPotencia():
    numero = int(input('digite um numero para calcular a tabuada:'))
    for i in range (1, 11):
        tabuada = numero * i
        print(f'{numero} x {i} = {tabuada}')
    
def calculaMedia():
    media = 0
    soma = 0

    try:
        for numeros in listaNumeros:
            soma += numeros
            media = soma / len(listaNumeros)
        print(media)
    except ZeroDivisionError:
        print('A lista está vazia')   
    except Exception as e:
        print(f'Ocorreu um erro: {e}')         


def main():
    #parOuImpar()
    #classificarIdade()
    #verificaCadastro()
    #planoCartesiano()
    #percorrerLista()
    #loopImprimeSomaImpar()
    #imprimirDecrescente()
    #calcularPotencia()
    calculaMedia()

if __name__ == '__main__':
    main()