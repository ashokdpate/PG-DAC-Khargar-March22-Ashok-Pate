class Pattern11{
    public static void main(String[] args){
	    for(int i=1;i<=9;i++){
			
			for(int k=9;k>=i;k--){
				if(k%2==0){
				System.out.print(" ");}
			}
			for(int j=1;j<=i;j++){
			    if(i%2!=0){
					System.out.print("*");
				}   	
			}
			if(i%2==0){System.out.println();}
			
	    }
	}   
}
