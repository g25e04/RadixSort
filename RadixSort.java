public class RadixSort {

	public RadixSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarray[] = {5,6,1,3,2,8,9,7,86,96,707};
		Radix ra = new Radix();
		System.out.println("The array before radix sort:");
		for(int i=0;i<myarray.length;i++) {
		System.out.println(myarray[i]+" ");
		}
		ra.radixSort(myarray, 999);
		System.out.println("\nThe array after radix sort:");
		for(int i=0;i<myarray.length;i++) {
			System.out.println(myarray[i]+" ");
		}
	}
}
