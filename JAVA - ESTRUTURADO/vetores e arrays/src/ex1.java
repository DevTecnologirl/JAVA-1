public class ex1 
{
  public static void main(String[] args) throws Exception 
  {
      String[] nomes = new String[5];

      nomes[0] = "João";
      nomes[1] = "Maria";
      nomes[2] = "Goku";
      nomes[3] = "Pitoco";
      nomes[4] = "Vegata";

     for(int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++)
     {
       System.out.println(nomes[posicaoVetor]);
     }
  }
}
