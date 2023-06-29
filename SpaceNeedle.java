public class SpaceNeedle{
   public static final int n = 10;
   public static void main (String[] args){
      makePipes();
      makeTop();
      makeBottom();
      makePipesAgain();
      makePipesWithPercents();
      makeTop();
   }
   
   
   public static void makePipes(){
      for(int j = 0; j<n; j++){
         for(int i = 0; i<3*n; i++){
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   
   public static void makeTop(){
      for(int i = 0; i<n; i++){
         for(int j = 0; j<(3*n-3*(i+1)); j++){
            System.out.print(" ");
         }
         System.out.print("__/");
         for(int k = 0; k<3*i; k++){
            System.out.print(":");
         }
         System.out.print("||");
         for(int l = 0; l<3*i; l++){
            System.out.print(":");
         }
         System.out.println("\\__");
      }
      System.out.print("|");
      for(int m = 0; m<6*n; m++){
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   
   public static void makeBottom(){
      for(int i = 0; i<n; i++){
         for(int j = 0; j<2*i; j++){
            System.out.print(" ");
         }
         System.out.print("\\_/");
         for(int k = 0; k<n+2*(n-1)-2*i; k++){
            System.out.print("\\/");
         }
         System.out.println("\\_/");
      }
   }
   
   
   public static void makePipesAgain(){
      for(int j = 0; j<n; j++){
         for(int i = 0; i<3*n; i++){
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }


   public static void makePipesWithPercents(){
      for(int i = 0; i<n*n; i++){
         for(int j = 0; j<2*n+1; j++){
            System.out.print(" ");
         }
         System.out.print("|");
         for(int k = 0; k<n-2; k++){
            System.out.print("%");
         }
         System.out.print("||");
         for(int l = 0; l<n-2; l++){
            System.out.print("%");
         }
         System.out.println("|");
      }
   }

}