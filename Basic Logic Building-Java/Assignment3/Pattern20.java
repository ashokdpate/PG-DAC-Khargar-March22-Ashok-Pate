public class Pattern20 {
    
        public static void main(String[] args){
            for(int i=9;i>=1;i--){
            
                for(int w=i;w<=9;w++){
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

