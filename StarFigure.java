public class StarFigure {

  public static void main(String args[]){
      
      for (int i = 0; i < 5; i++)
      {
          String stars = "";
          for (int j = 0; j < i * 8; j++)
          {
              stars += "*";
          }
          
          for (int k = 0; k < 16 - (i*4); k++) 
          {
              stars = "/" + stars + "\\";
          }
          System.out.println(stars);
      }
  }
}
