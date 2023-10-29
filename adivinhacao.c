#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void clear();
int tinfinita(int opcao);
int tfinita(int opcao);
int geradornumeros();
float pontuacao(int chute, float pontos, int nsecreto);


int main()
{
    int opcao;
    
    
    while(opcao != 0)
    {

    printf("**********************************\n");
    printf("Bem vindo ao  jogo de adivinhacao");
    printf("\n********************************\n");
    printf("1 - Tentativas infinitas\n");
    printf("2 - Escolher numero de tentativas\n");
    printf("0 - Sair\n");
    printf("Escolha uma opcao: ");
    scanf("%d", &opcao);
    system("cls");

    switch(opcao)
    {
        case 1:
        {
            opcao = tinfinita(opcao);  
            break;
        }
        
       case 2:
        {
            opcao = tfinita(opcao);
            break;
        }
        

       case 0:
       {
            printf("Voce saiu do jogo\n");
            break;
       }
       

        default:
        {
            printf("Opcao invalida, tente novamente\n\n");  
        }   
    }
  }
} 

void clear() //limpeza do buffer do teclado
{
    char carac;
    
    while((carac = fgetc(stdin)) != EOF && carac != '\n'){}
}

int tinfinita(int opcao) //jogo com tentativas ilimitadas
{
    int tentativas = 1;
    float pontos = 1000;
    int chute;
    int nsecreto = geradornumeros();

    while(chute != nsecreto){

        printf("Digite seu chute: ");
        scanf("%d", &chute);  
        

        if(chute < 0){
            printf("\nNao chute numeros negativos\n");
            continue;
            }

        printf("Seu chute foi %d\n\n", chute);

        if(chute == nsecreto)
        {
            printf("Parabens, voce acertou o numero secreto!\n");
            pontos = pontuacao(chute, pontos, nsecreto);
            printf("Seu total de pontos foi: %.1f\n", pontos);
            break;
        }

            else if(chute > nsecreto)
        {
            printf("Seu numero foi maior que o numero secreto\n");
            pontos = pontuacao(chute, pontos, nsecreto);
        }

            else
        {
            printf("Seu numero foi menor que o numero secreto\n");
            pontos = pontuacao(chute, pontos, nsecreto);
        
        }
            tentativas++; 
        }

        do{

        printf("\nSe deseja jogar novamente digite 1, se deseja sair digite 0: ");
        scanf("%d", &opcao);


        if (opcao == 1)
        {
            system("cls"); 
            continue;
        }

        else if (opcao == 0)
        {
            system("cls");
            printf("Voce saiu do jogo\n");
            break;
        }

        else 
            printf("Opcao invalida, digite novamente.\n"); 
        }while(opcao != 0 && opcao != 1);    
                 
    return opcao;
}

int tfinita(int opcao) //jogo com tentativas limitadas
{
    int qtd, chute;
    int tentativas = 1;
    float pontos = 1000;
    int nsecreto = geradornumeros();

    do{
            printf("Quantas tentativas voce quer (Entre 1 e 20)?\n");
            scanf("%d", &qtd);
            clear(); 

            if(qtd < 1 || qtd > 20)
            printf("Quantidade de tentativas invalidas, digite novamente\n");
           
        }while(qtd < 1 || qtd > 20);

        do{ 
        printf("\nTentativa %d de %d\n", tentativas, qtd);

        printf("Digite seu chute: ");
        scanf("%d", &chute);  

        if(chute < 0){
            printf("Nao chute numeros negativos\n");
            continue;
            
        }

        printf("Seu chute foi %d\n", chute);

        if(chute == nsecreto)
        { 
            printf("\nParabens, voce acertou o numero secreto!\n");
            pontos = pontuacao(chute, pontos, nsecreto);
            printf("Seu total de pontos foi: %.1f\n", pontos);
        }

        else if(chute > nsecreto)
        {
            printf("Seu numero foi maior que o numero secreto\n");
            pontos = pontuacao(chute, pontos, nsecreto);
        }   
            
        else
        { 
            printf("Seu numero foi menor que o numero secreto\n");
            pontos = pontuacao(chute, pontos, nsecreto);
        }
         
         tentativas++;

        if(tentativas > qtd && chute != nsecreto)
            printf("\nFim de jogo, acabaram suas tentativas. O numero secreto era %d\n\n", nsecreto);
        }while(tentativas <= qtd && chute != nsecreto);  

        do{

        printf("\nSe deseja jogar novamente digite 1, se deseja sair digite 0: ");
        scanf("%d", &opcao);

        if (opcao == 1)
        {
            system("cls"); 
            continue;
        }

        else if (opcao == 0)
        {
            system("cls");
            printf("Voce saiu do jogo\n");
            break;
        }

        else 
            printf("Opcao invalida, digite novamente.\n"); 
        }while(opcao != 0 && opcao != 1); 

    return opcao;
} 

float pontuacao(int chute, float pontos, int nsecreto) //os parametros dentro da funcao servem para "salvar" os valores colocados pelo usuario dentro do codigo
{
    float pontosperdidos = abs(chute - nsecreto) / (float)2; //abs retorna o valor absoluto do numero, caso seja 41 - 42 = -1, o valor que me retornara sera 1
    
    pontos = pontos - pontosperdidos;

    return pontos; //retorna os pontos da formula no fim da funcao
}

int geradornumeros()
{
    int gerador = time(0); //obtendo o valor atual do relógio (em segundos desde 1 de janeiro de 1970) usando a função time(0). 
                          //Isso serve para inicializar o gerador de números aleatórios com uma semente que muda a cada segundo, garantindo 
                          //que os números aleatórios sejam diferentes em cada execução do programa.

    srand(gerador); //usada para inicializar o gerador de números aleatórios. Está usando o valor obtido a partir do relógio como semente, para que os 
                    //números aleatórios gerados sejam diferentes em cada execução do programa.

    int ngrande = rand(); //gerando um número aleatório e armazenando-o na variável ngrande. Esse número será um valor inteiro aleatório, que 
                         //pode ser bastante grande, dependendo da implementação do gerador de números aleatorios

    int nsecreto = ngrande % 100; //limitando os numeros de 0 a 99 pois calcula o resto da divisao do "ngrande" por 100

    return nsecreto;
}    