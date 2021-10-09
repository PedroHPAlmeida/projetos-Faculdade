#include <stdio.h>
#include <ctype.h>
#include <windows.h>

#define ord 17

int move(char matriz[ord][ord], int i, int j);

main(){
    int i, j;
    char resp = 'S';
    system("cls");
    //layout inicial
    printf("CARREGANDO TUTORIAL");
    Sleep(1000);
    printf(".");
    Sleep(1000);
    printf(".");
    Sleep(1000);
    printf(".");
    printf("\n    'A' -> esquerda\n");
    Sleep(1000);
    printf("    'D' -> direita\n");
    Sleep(1000);
    printf("    'W' -> cima\n");
    Sleep(1000);
    printf("    'S' -> baixo\n");
    Sleep(1000);
    printf("APERTE ENTER PARA CONTINUAR...\n");
    getchar();

    while(1){ //o programa estará num loop infinito, enquanto o usuário não digitar 'n' para fechar o jogo
        system("cls");
        printf("                                \033[34mJOGO DO LABIRINTO\033[m\n"); // '\033[m' é um código para colocar cores no terminal
        printf("=================================================================================\n");
        char mapa[ord][ord] = {{'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},{'x', '_', '_', '_', 'x', '_', '_', '_', '_', '_', 'x', '_', '_', '_', '_', '_', 'x'},{'x', '_', 'x', '_', 'x', 'x', 'x', '_', 'x', '_', 'x', '_', 'x', '_', '_', 'x', 'x'},{'x', '_', 'x', '_', '_', '_', 'x', '_', '_', '_', '_', '_', '_', 'x', '_', 'x', 'x'},{'x', '_', '_', '_', 'x', '_', 'x', '_', 'x', 'x', '_', 'x', '_', 'x', '_', '_', 'x'},{'x', 'x', '_', 'x', '_', '_', '_', '_', 'x', '_', '_', 'x', '_', 'x', 'x', 'x', 'x'},{'x', '_', '_', '_', 'x', '_', 'x', '_', '_', '_', '_', 'x', '_', '_', '_', '_', '_'},{1, '_', 'x', '_', 'x', '_', 'x', 'x', 'x', 'x', '_', '_', '_', 'x', '_', 'x', 'x'},{'x', '_', 'x', '_', 'x', '_', '_', '_', '_', '_', 'x', '_', 'x', 'x', '_', '_', 'x'},{'x', '_', 'x', '_', 'x', '_', 'x', 'x', 'x', '_', '_', '_', '_', 'x', 'x', 'x', 'x'},{'x', '_', '_', '_', 'x', '_', '_', '_', '_', 'x', '_', 'x', '_', 'x', '_', '_', 'x'},{'x', '_', 'x', '_', '_', '_', 'x', '_', '_', '_', '_', 'x', '_', 'x', 'x', '_', 'x'},{'x', '_', 'x', '_', 'x', '_', 'x', 'x', 'x', 'x', '_', 'x', '_', '_', '_', '_', 'x'},{'x', '_', 'x', 'x', 'x', '_', 'x', '_', '_', 'x', '_', 'x', '_', 'x', 'x', '_', 'x'},{'x', '_', 'x', '_', 'x', '_', 'x', 'x', '_', 'x', '_', 'x', '_', '_', 'x', '_', 'x'},{'x', '_', '_', '_', 'x', '_', 'x', '_', '_', '_', '_', 'x', '_', '_', '_', '_', 'x'},{'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}}; //mapa do jogo

        for(i = 0; i < ord; i++){  //exibe o mapa inicial
            for(j = 0; j < ord; j++){
                if(mapa[i][j] == 'x'){
                    printf("\033[31m%c    \033[m", mapa[i][j]);
                }
                else if(mapa[i][j] == '_'){
                    printf("%c    ", mapa[i][j]);
                }
                else{
                    printf("\033[33m%c    \033[m", mapa[i][j]);
                }
                
                Sleep(1); //função para aguardar alguns segundos
            }
            printf("\n");
        }

        move(mapa, 7, 0);
        printf("\nDeseja jogar novamente? [S/N] ");
        fflush(stdin);
        scanf("%c", &resp);
        if(resp == 'N' || resp == 'n'){ //se o usuário digitar 'n' o programa será encerrado
            printf("=================================================================================\n");
            printf("                                 ENCERRANDO");
            Sleep(1000); 
            printf(".");
            Sleep(1000);
            printf(".");
            Sleep(1000);
            printf(".");
            Sleep(1000);
            break;
        }
    }
}

//função que move o personagem na tela
int move(char matriz[ord][ord], int i, int j){
    int lin, col;
    char letra;
    char pac = 1; //pac refere-se ao emoji do personagem, '1' é código ASCII do emoji sorrindo

    while(1){
        fflush(stdin); //limpar buffer de entrada
        letra = getch(); //leitura da tecla de movimento [só é permitido 'a, w, s, d']
        letra = toupper(letra);
        switch(letra)       //swith irá acrescentar ou decrementar a linha ou a coluna de acordo com a tecla digitada
        {
        case 'A':
            if (j != 0){ //caso o personagem esteja em qualquer borda, não será possível movimentá-lo para fora do labirinto
                matriz[i][j] = '_';
                j -= 1;
            }
            break;
        case 'W':
            matriz[i][j] = '_';
            i -= 1;
            break;
        case 'S':
            matriz[i][j] = '_';
            i += 1;
            break;
        case 'D':
            matriz[i][j] = '_';
            j += 1;
            break;
        }

        if(matriz[i][j] == 'x'){ //caso a posição para a qual o personagem foi deslocado tenha a letra 'x' o jogador perdeu 
            printf("=================================================================================\n");
            printf("                                  \033[31mGAME OVER\033[m");
            break;
        }
        
        matriz[i][j] = pac; //o personagem é movido para a posição desejada
        system("cls"); //o labirinto anterior é apagado da tela
        printf("                                \033[34mJOGO DO LABIRINTO\033[m\n");
        printf("=================================================================================\n");
        for(lin = 0; lin < ord; lin++){ //exibição do labirinto com o personagem deslocado para a posição desejada
            for(col = 0; col < ord; col++){
                if(matriz[lin][col] == 'x'){
                    printf("\033[31m%c    \033[m", matriz[lin][col]);
                }
                else if(matriz[lin][col] == '_'){
                    printf("%c    ", matriz[lin][col]);
                }
                else{
                    printf("\033[33m%c    \033[m", matriz[lin][col]);
                }
            }
            printf("\n");
        }
        if(i == 6 && j == 16){ //caso a posição seja igual a 'saída' do labirinto, o jogador venceu o jogo
            printf("=================================================================================\n");
            printf("                               \033[32mCONGRATULATIONS!!!\033[m");
            break;
        }
    }
}