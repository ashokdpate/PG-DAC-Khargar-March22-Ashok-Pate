public class Pattern21 {
        public static void main(String[] args){
            for(int i=1;i<=9;i++){
                for(int k=9;k>=i;k--){
                    if(k%2==0){
                        System.out.print(" ");
                    }
                }
               for(int j=1;j<=i;j++){
                   if(i%2!=0){
                   System.out.print("*");}
               }
             if(i%2==0){  
            System.out.println(); }  
            }
            
             
            for(int i=8;i>=1;i--){
                for(int k=i;k<=8;k++){
                    if(k%2==0){
                        System.out.print(" ");
                    }
                }
               for(int j=1;j<=i;j++){
                   if(i%2!=0){
                   System.out.print("*");}
               }
             if(i%2==0){  
            System.out.println(); }  
            }
        } 
    
}
