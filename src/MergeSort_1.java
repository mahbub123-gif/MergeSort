
public class MergeSort_1 {
	public static void Merge(int a[], int p,int q,int r) {
		int n1 = q-p+1;
		int n2 = r-q;
		int L[]=new int[n1+1];
		
		for(int i=0;i<=(n1-1);i++)
			
			L[i]=a[p+i-1];
		
		int R[]=new int[n2+1];
		
		for(int j=0;j<=(n2-1);j++)
			
			R[j]=a[q+j];
		
		L[n1]=999;
		R[n2]=999;
		
		int i=0,j=0;
		
		for(int k=p-1;k<=(r-1);k++) {
			
			if(L[i]<=R[j]) {
				
				a[k]= L[i];
				i++;
			}
			
			else {
				a[k]=R[j];
				j++;
			}
		}
		
		
	}
	
	public static void MergeSort(int a[], int p, int r) {
		int q;
		
		if(p<r) {
			
			q = (p+r)/2;
			
			MergeSort(a,p,q);
			MergeSort(a,q+1,r);
			Merge(a,p,q,r);
			
		}
	}

	public static void main(String[] args) {
		int a[]= {12,3,12,4,4,62,2};
		
		MergeSort(a,1,a.length);
		
		for(int i=0; i<a.length;i++)
			
			System.out.println(a[i]);
	}

}
