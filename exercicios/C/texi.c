#include<stdio.h>
#include<stdlib.h>

int main(void)
{
int i;
float media, nota, m;
char cod;
	while(cod != 'f')
	{
		for (i = 1; i <= 4; i++)
		{
			printf("digite a nota do aluno: ");
			scanf("%f", &nota);
			m = m + nota;
		}
		media = m / 4;
		printf("\n====================================\n");
		printf("MEDIA = %f\n", media);
		printf("====================================\n");
		media = 0;
		m = 0;
		printf("digite [f] pra cancelar ou pressione [qualquer tecla] para continuar: ");
		cod = getche();
		printf("\n\n");
	}
return 0;
}
