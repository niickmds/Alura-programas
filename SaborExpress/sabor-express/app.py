import os

restaurantes = [{'nome' : 'Zao Sushi', 'categoria' : 'Japonesa', 'ativo' : False}, 
                {'nome' : 'Poncho Verde', 'categoria' : 'Churrascaria', 'ativo' : True},
                {'nome' : 'Burguês', 'categoria' : 'Hamburgueria', 'ativo' : False}]

    

def exibir_nome():
    print("""
──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─██████████████─██████████████─██████████████───██████████████─████████████████──────██████████████─████████──████████─██████████████─████████████████───██████████████─██████████████─██████████████─
─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░░░██──────██░░░░░░░░░░██─██░░░░██──██░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
─██░░██████████─██░░██████░░██─██░░██████░░██───██░░██████░░██─██░░████████░░██──────██░░██████████─████░░██──██░░████─██░░██████░░██─██░░████████░░██───██░░██████████─██░░██████████─██░░██████████─
─██░░██─────────██░░██──██░░██─██░░██──██░░██───██░░██──██░░██─██░░██────██░░██──────██░░██───────────██░░░░██░░░░██───██░░██──██░░██─██░░██────██░░██───██░░██─────────██░░██─────────██░░██─────────
─██░░██████████─██░░██████░░██─██░░██████░░████─██░░██──██░░██─██░░████████░░██──────██░░██████████───████░░░░░░████───██░░██████░░██─██░░████████░░██───██░░██████████─██░░██████████─██░░██████████─
─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░░░██──────██░░░░░░░░░░██─────██░░░░░░██─────██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
─██████████░░██─██░░██████░░██─██░░████████░░██─██░░██──██░░██─██░░██████░░████──────██░░██████████───████░░░░░░████───██░░██████████─██░░██████░░████───██░░██████████─██████████░░██─██████████░░██─
─────────██░░██─██░░██──██░░██─██░░██────██░░██─██░░██──██░░██─██░░██──██░░██────────██░░██───────────██░░░░██░░░░██───██░░██─────────██░░██──██░░██─────██░░██─────────────────██░░██─────────██░░██─
─██████████░░██─██░░██──██░░██─██░░████████░░██─██░░██████░░██─██░░██──██░░██████────██░░██████████─████░░██──██░░████─██░░██─────────██░░██──██░░██████─██░░██████████─██████████░░██─██████████░░██─
─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░░░░░██────██░░░░░░░░░░██─██░░░░██──██░░░░██─██░░██─────────██░░██──██░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
─██████████████─██████──██████─████████████████─██████████████─██████──██████████────██████████████─████████──████████─██████─────────██████──██████████─██████████████─██████████████─██████████████─
──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    """)

def mostrar_opcoes():
    
    print('1. Cadastrar restaurante')
    print('2. Listar restaurante')
    print('3. Alternar estado do restaurante')
    print('4. Sair\n')

def exibir_subtitulo(texto):
    os.system('cls')
    linha = '*' * (len(texto))
    print(linha)
    print(texto)
    print(linha)

def finalizar_app():
    exibir_subtitulo('Finalizando o programa')

def voltar_menu_princpal():
    input('\nDigite uma tecla para voltar ao menu principal')
    main()

def opcao_invalida():   
    print('Opcão inválida!\n')
    voltar_menu_princpal()

def cadastrar_novo_restaurante():
    exibir_subtitulo('Cadastro de novos restaurantes\n')

    while True:
        nome_do_restaurante = input('Digite o nome do restaurante que deseja cadastrar:')
        categoria = input(f'Digite a categoria do restaurante {nome_do_restaurante}:')

        if nome_do_restaurante.strip == '' or categoria.strip() == '':
            print('\nNome ou categoria inserido incorretamente, tente novamente\n')
        else:
            break

    dados_do_restaurante = {'nome' : nome_do_restaurante, 'categoria' : categoria, 'ativo' : False}

    for restaurante in restaurantes:
        if restaurante['nome'].lower() == nome_do_restaurante.lower() and restaurante['categoria'].lower() == categoria.lower():
            print('\nRestaurante já cadastrado.\n')
            voltar_menu_princpal()    

    restaurantes.append(dados_do_restaurante)

    print(f'O restaurante {nome_do_restaurante} foi cadastrado com sucesso!\n')
    
    voltar_menu_princpal()

def alternar_estado_restaurante():
    exibir_subtitulo('Alternando estado do restaurante')

    restaurante_encontrado = False

    while not restaurante_encontrado:
        nome_restaurante = input('Digite o nome do restaurante que deseja alterar o estado ("sair" para cancelar):')

        if nome_restaurante.lower() == 'sair':
            voltar_menu_princpal()

        for restaurante in restaurantes:
            if nome_restaurante.lower() == restaurante['nome'].lower():
                restaurante_encontrado = True
                restaurante['ativo'] =  not restaurante['ativo']
                mensagem = f'\nO restaurante {nome_restaurante} foi ativado com sucesso' if restaurante['ativo'] else f'\nO restaurante {nome_restaurante} foi desativado com sucesso'
                print(mensagem)
        if not restaurante_encontrado:
            print('\nO restaurante não foi encontrado\n')

    voltar_menu_princpal()

def listar_restaurantes():
   
    exibir_subtitulo('Listando os restaurantes\n')

    print(f'{"Nome do restaurante".ljust(23)} | {"Categoria".ljust(20)} | Status')
    print(f'{"-" * 23} | {"-" * 20} | {"-" * 10}')

    for restaurante in restaurantes:
        nome_restaurante = restaurante['nome']
        categoria = restaurante['categoria']
        ativo = 'Ativado' if restaurante['ativo'] else 'Desativado'
        print(f' - {nome_restaurante.ljust(20)} | {categoria.ljust(20)} | {ativo}')

    voltar_menu_princpal()

def escolher_opcao():   
    try: 
        opcao = int(input('Digite a opção desejada: '))
        #print(f'Opção escolhida {opcao}')

        if opcao == 1:
            cadastrar_novo_restaurante()
        elif opcao == 2:
            listar_restaurantes()
        elif opcao == 3:
            alternar_estado_restaurante()
        elif opcao == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except:
        opcao_invalida()

def main():
    os.system('cls')
    exibir_nome()
    mostrar_opcoes()
    escolher_opcao()
    
if __name__ == '__main__':
    main()