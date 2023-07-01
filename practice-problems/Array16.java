// Array practice programs 
public class Array16{
	public static void main(String[] args){
		int arr[] = {1,1,1,1,1};
		int n = 5;
		int in = 1;
		int i=0;
		System.out.print("Given array is ");
		for(i = 0; i < n; i++) System.out.print(arr[i]+" ");
		i=0;
		while(i!=n){
			for(int j=i+1; j<n; j++){if(arr[i] == arr[j]){in = j; break;}}
			if(in==-1){i++; continue;}
			for(int j=in; j<n-1; j++) arr[j] = arr[j+1];
			n--;
			in = -1;
		}
		System.out.print("\nResulting array is ");
		for(i = 0; i < n; i++) System.out.print(arr[i]+" ");
	}
}