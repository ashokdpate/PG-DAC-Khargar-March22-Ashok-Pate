class Pattern13{
    public static void main(String[] args){
	    int k=65;
	    for(int i=1;i<=5;i++){
			
			for(int w=5;w>=i;w--){
				System.out.print(" ");
			}	
		    for(int j=1;j<=i;j++){
			    System.out.print((char)k+" ");
			}
			k++;
			System.out.println();
		}
	}
}
