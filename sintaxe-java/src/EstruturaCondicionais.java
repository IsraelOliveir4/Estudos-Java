public class EstruturaCondicionais {

    public static void main(String[] args) {

        //////////////////////// CONDICIONAL SIMPLES   /////////////////////////////
        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;
 
         System.out.println(saldo);

        //////////////////////////      CONDICIONAL COMPOSTA    ///////////////
        int nota = 6;
       
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else
         System.out.println("Reprovado");

        /////////////////////////   CONDICIONAL ENCADEADA    ///////////
        int nota2 = 6;

        if (nota2 >= 7)
            System.out.println("Aprovado");
        else if (nota2 >= 5 && nota2 < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        ////////////////////    SWITCH      /////////////////
		String sigla = "M";
		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		

        }	
	}
}

