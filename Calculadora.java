import java.util.Scanner;  


public class Calculadora   
{    
    public static void main (String args[])
	{  
		short operacao;
        double num1, num2;    
        Scanner input = new Scanner(System.in);
        
        do 
		{
             System.out.println("\nTá afim de fazer umas matemáticas, meu poderoso? Escolhe ai então:");
             System.out.println("\n1. Soma");      
             System.out.println("2. Subtração");      
             System.out.println("3. Multiplicação");      
             System.out.println("4. Divisão");      
             System.out.println("5. Potência");      
             System.out.println("0. Sair");
             System.out.print("\nOperacao: ");
             operacao = input.nextShort();
             
             if (operacao == 0) 
			 {
            	 System.out.println("\n Flw, meu consagrado!");
            	 break;
             }
             
             if (!OperacaoExiste(operacao))
			 {
				   continue;
             }
             
             System.out.print("Digita o primeiro valor ai, meu johnson: ");
             num1 = input.nextDouble();
             
             System.out.print("\nAgora, digita o segundo valor, meu colegiado: ");
             num2 = input.nextDouble();
             
             if (!ValidaDadosDeEntrada(operacao, num1, num2))
			 {
					continue;
			 }
        
             System.out.println("\nO resultado da operacao " + getNomeOperacao(operacao) + ", meu poderoso, é: " + Calcular(operacao, num1, num2) + "\n");
        } 
        
        while (operacao != 0);
    }
    
    static double Calcular (short operacao, double num1, double num2)
    {
    	double resultado = 0;
    	switch (operacao)
    	{
    		case 1: //soma
    			resultado = num1 + num2;
    			break;
    		case 2: //substração
    			resultado = num1 - num2;
    			break;
    		case 3: //multiplicação
    			resultado = num1 * num2;
    			break;
    		case 4: //divisão
    			resultado = num1 / num2;
    			break;
    		case 5: //potência
    			resultado = Math.pow(num1, num2);
    			break;
    	}
    	
    	return resultado;
    }
    
    static boolean OperacaoExiste (short operacao)
    {
       	boolean retorno = true;
       	
    	if (operacao > 5) 
    	{
       		System.out.println("\nCoé, Asa, ta vendo que não tem esssa opção, ta digitando pra que?\n");
       		retorno = false;
       	}
    	return retorno;
    }
    
    static boolean ValidaDadosDeEntrada (short operacao, double num1, double num2)
    {
    	boolean retorno = true; 
    	
    	if (operacao == 5 & num2 == 0)
    	{
        	 System.out.println("\nTá igual o Vitor, querendo dividir por zero\n");
        	 retorno = false;
        }
    	return retorno;
    }
    
    static String getNomeOperacao (short operacao)
    {
    	
    	switch (operacao)
    	{
		case 1:
			return "soma";
		case 2:
			return "subtracao";
		case 3: 
			return "multiplicacao";
		case 4: 
			return "divisao";
		case 5: 
			return "potência";
    	default:
    		return "undefined";
    	}
    	
    }
} 
