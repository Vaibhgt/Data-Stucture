class Sorting
{
	//bubble sort
	void bubbleSort(int a1[]){
		//time complexity
		//space complexity
	int n=a1.length;
	for(int i=0;i<n-1;i++){
		for(int j=0;j<n-i-1;j++){
			if (a1[j]>a1[j+1]){
				int temp=a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
			}
		}
	}
		
		
}

	void selectionSort(int a1[]){
		//time complexity
		//space complexity
		int n=a1.length;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if (a1[j]<a1[min])
					min=j;
			}
			//
			int temp=a1[min];
			a1[min]=a1[i];
			a1[i]=temp;
		}
	}
	
	void insertionSort(int a1[])
	{
		//time complexity
		//space complexity
		int n=a1.length;
		for (int i=1;i<n;i++){
			int k=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>k)
			{
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=k;
		}
	}
	void mergesort(int a1[],int l, int r){
	if(l<r)
	{
		int m=1+(r-1)/2;
		mergesort(a1,l,m);
		mergesort(a1,m+1,r);
		mergesort(a1,l,m,r);
		
	}
	}
	
	void merge(int a1[],int l,int m,int r)
	{
		int n1=m-1+1;
		int n2=r-m;
		int L[]=new int [n1];
		int R[]=new int [n2];
		for (int i=0;i<n1;i++){
			L[i]=a1[l+i];
			
		}
		for (int j=0;j<n2;j++){
			R[j]=a1[m+1+j];
		}
		int i=0,j=0;
		int k=1;
		
		while(i<n1 && j<n2)
		{
			if (L[i]<=R[j]){
				a1[k]=L[i];
				i++;
			}
			else
			{
				a1[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a1[k]=L[i];
			i++;
			k++;
		}
		while (j<n2){
			a1[k]=R[j];
			j++;
			k++;
			
		}
	}
	

void display(int a1[])
{
	for(int i=0;i<a1.length;i++)
	{
		System.out.print(a1[i]+" ");
	}
}

public static void main(String args[]){
	Sorting s1=new Sorting();
	int a1[]={3, 5, 8, 4, 1, 9, -2};
	//s1.bubbleSort(a1);
	//s1.selectionSort(a1);
	//s1.insertionSort(a1);
	s1.mergesort(a1,0,n-1);
	s1.display(a1);
	
}
}
