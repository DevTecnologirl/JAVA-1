public class ex2 
{
  public static void main(String[] args) throws Exception 
  {
     //cor da fruta
     String corFruta = "amarelo";

     if (corFruta == "vermelho")
     { System.out.println("Está madura!"); }
    else if (corFruta == "amarelo"){
      System.out.println("Está quase madura!");
    }
    else if (corFruta == "verde"){
      System.out.println("Não coma! Está Verde!");
    }
    else{
      System.out.println("Não come! Está podre!");
    }
  
  }
}
