import org.testng.annotations.Test;

public class ArrayRotationBynTimes {

	public int[] rotate(int[] arr,int k) {
		if(arr.length==0) {
			return arr;
		}
		
		int l=arr.length;
		//int arr1[]=new int[l];
		for(int i=0;i<k;i++) {
			arr=rotateonce(arr);
			}
		return arr;
	}
	
	public int[] rotateonce(int[] array1) {
		int arr1[]=new int[array1.length];
		int l=array1.length;
	for(int j=1;j<l;j++) {
		arr1[j]=array1[j-1];
		if(j==l-1) {
			arr1[0]=array1[l-1];
		}
	}return arr1;
	}
	@Test
	public void test1() {
		int a[]= {1,2,3,4,5,6}; //6,1,2,3,4,5   5,6,1,2,3,4    4,5,6,1,2,3
		int ac[]=rotate(a,3);
		for(int i=0;i<ac.length;i++) {
			System.out.println(ac[i]);
		}
		
	}
}
