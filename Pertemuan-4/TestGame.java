/*Nama : Muhamad Fariz Iskandar
Nim : A11.2019.12205
Kel : A11.4418
 */
public class TestGame {
   public static void main(String[]args){
      GamePlayer pemain = new GamePlayer();
      pemain.setPosition(60,90);
      
      pemain.Run();
      pemain.Run(30);
      
      GameEnemy prajurit = new GameEnemy();
      prajurit.Run();
       
       
   }
}