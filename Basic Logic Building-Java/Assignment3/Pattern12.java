class Pattern12{
    public static void main(String[] args){
	    int k=1;
	    for(int i=1;i<=5;i++){
			
			for(int z=5;z>=i;z--){
				System.out.print(" ");
			}	
		    for(int j=1;j<=i;j++){
			    System.out.print(k+" ");
			}
			k++;
			System.out.println();
		}
	}
}
