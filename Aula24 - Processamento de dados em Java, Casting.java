//Processamento de dados

/*
Comando de atribuição.

Sintaxe:

<variável> = <expressão>;

= lê-se "recebe"

Regra:

1) A expressão é calculada
2) O resultado da expressão é armazenado na variável

Boa prática:

Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira)

Para double use:
.0

Para float use:
f
*/


public class Main {
  public static void main(String[] args) {
  //EXEMPLO 1
  /*
  	int x,y; //Aqui definimos os tipo de dados para as variáveis, não precisando declarar na própria variável
   
    x = 5;
    y = 2 * x;
    
    System.out.println(x);
    System.out.println(y);
    */
    
  //EXEMPLO 2
	/*
  	int x;
 	double y;

  	x = 5;
  	y = 2 * x;

  	System.out.println(x);
  	System.out.println(y);
  */
  
  //EXEMPLO 3
    /*
  	double b, B, h, area;
  	
    b = 6.0;
    B = 8.0;
    h = 5.0;
    
    area = (b + B)/2.0 * h;
	
    System.out.println(area);
    */
  //EXEMPLO 4
    /*
    int a, b;
    int a, b;
    double resultado;

    a = 5;
    b = 2;

    resultado = (double) a / b;

    System.out.println(resultado);
    //As variáveis a e b são do tipo inteira, o compilador vai entender que queremos dividir um número inteiro por outro número inteiro e assim o resultado 
    é um número inteiro, vai ser "cortado" as casas decimais. A solução será colocar a palavra double na frente da expressão, essa solução é chamado de Casting.
    */
    double a;
    int b;
    
    a = 5.0;
    b = (int) a;
    
    System.out.println(b);
    /* Não podemos converter de double para int, utilizando o Casting(int) estamos dizendo para 
       o compilador que não se importamos em perder possiveis informações
    */
    
  }
}

