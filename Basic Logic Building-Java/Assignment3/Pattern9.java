
  
 
 class Pattern9{
      public static void main(String[] args){
         
           for(int i=65;i<=69;i++){
               for(int k=69;k>=i;k--){
                   System.out.print(" ");
               }
               for(char j=65;j<=i;j++){
                   System.out.print(j+" ");
               }		 
               System.out.println();
           }
      }
 }
