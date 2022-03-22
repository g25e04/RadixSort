public class Radix {

	public Radix() {
		// TODO Auto-generated constructor stub
	}

	
	public void radixSort(int myarray[],int a) {
		int d=myarray.length;
		int k=0,n=1;
		int [][]temp1 = new int[d][d];
		int []temp2 = new int[d];
		
		while(n<=a) {
			for(int num=0;num<myarray.length;num++) {
				int number=myarray[num];
				int lsd=(number/n)%10;
				temp1[lsd][temp2[lsd]]=number;
				temp2[lsd]+=1;
			}
			
			for(int i=0;i<myarray.length;i++) {
				if(temp2[i]!=0) {
					for(int j=0;j<temp2[i];j++) {
						myarray[k]=temp1[i][j];
								k++;
					}
				}
				temp2[i]=0;
			}
			n*=10;
			k=0;
		}
	}
}
