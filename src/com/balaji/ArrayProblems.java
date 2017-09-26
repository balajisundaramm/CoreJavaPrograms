package com.balaji;

public class ArrayProblems{
	public static void main(String[] args) {
		int [] a={9,8,3,-5,6,0,8};
		int [] b={1,3,2,5,10};
		//System.out.println(findMax(a,b));
		//System.out.println(findAvg(a,b));	
		//System.out.println(findSecMax(a,b));	
		for (int x:printUniqElem(a,b)) {
			System.out.print(x+" ");
		}
		//System.out.println((-1>>>1)+1);

	}
	/*public static int findMax(int[] a, int[] b) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max=a[i];
			}
		}
		for (int i=0;i<b.length;i++) {
			if (max<b[i]) {
				max=b[i];
			}
		}
		return max;
	}
*/
	/*public static double findAvg(int [] a, int [] b) {
		double sum=0;
		double avg=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		for (int i=0;i<b.length;i++) {
			sum=sum+b[i];
		}
		avg=sum/(a.length+b.length);
		return avg;
	}*/

	public static int findSecMax(int[] a, int[] b) {
		int max=((-1>>>1)+1);
		int secondMax=((-1>>>1)+1);
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				secondMax=max;
				max=a[i];
			}
			else
				if (secondMax<a[i]) {
					secondMax=a[i];
				}
		}
		for (int i=0;i<b.length;i++) {
			if (max<b[i]) {
				secondMax=max;
				max=b[i];
			}
			else
				if (secondMax<b[i]) {
					secondMax=b[i];
				}
		}
		return secondMax;
	}

	public static int[] printUniqElem(int[] a, int[] b) {
		int[] c=new int[a.length+b.length];
		int[] d=new int[c.length];
		int count=0;
		int y=0;
		int z=0;
		boolean unique=false;
		/*to combine*/
		for (int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int i=a.length;i<c.length;i++) {
			c[i]=b[y++];
		}
		for (int x :c ) {
			System.out.print(x+" ");
		}
		System.out.println("");
		/*end to combine*/

		/*finding unique*/
		outer:for (int k=0;k<c.length;k++) {
			inner:for (int l=0;l<c.length;l++) {
				if (k!=l) {
					if (c[k]==c[l])
						continue outer;
					/*if(c[k]!=c[l])
						if(l==(c.length-1)){
							d[z++]=c[k];
							count++;
						}
					}*/
				}
			}
			d[z++]=c[k];
			count++;
		}
		int[] e=new int[count];
		for (int i=0;i<count;i++) {
			e[i]=d[i];
		}
		return e;
	}

}


















