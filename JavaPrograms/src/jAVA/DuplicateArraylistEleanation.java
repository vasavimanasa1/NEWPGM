package jAVA;


public class DuplicateArraylistEleanation {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,2,3,4,4,5,6,6,7};
		String str[]= {"ma","na","ma","nt"};
		int strlen=str.length;
		System.out.println("Length of string array is::"+strlen);
	//	int len=arr.length;
		System.out.println("Length of te array is::"+arr.length);
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
			
		}
		temp[j++]=arr[arr.length-1];
		for(int k=0;k<j;k++) 
		{
		
			System.out.println(temp[k]);

		}
		}
	}

		
		
		/*System.out.println("**********************************");
		String strtemp[]=new String[str.length];
		int h=0;
		for (int d=0;d<strlen-1;d++)
		{
			if(str[h]!=str[h+1])
			{
				strtemp[d]=str[d];
				h++;
			}
		}
		
		strtemp[h++]=str[strlen-1];
		for(int z=0;z<h;z++)
		{
			System.out.println(strtemp[z]);
		}
		
		
		
	}
	}*/
	