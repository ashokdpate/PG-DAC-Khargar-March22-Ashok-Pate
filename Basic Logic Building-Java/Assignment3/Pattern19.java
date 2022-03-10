public class Pattern19 {
        public static void main(String[] args){
            for(int i=1;i<=9;i++){
            
                for(int w=9;w>=i;w--){
                    if(w%2==0){
                    System.out.print(" ");}
                }
                
                    
                for (int j=1;j<=i;j++){
                    if(i%2!=0){
                    System.out.print("*");}
                }
                if(i%2==0){	
                System.out.println();}		
            }
        }
    }

