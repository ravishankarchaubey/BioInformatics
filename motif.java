import java.util.*;
import java.lang.*;
class motif
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s;
		String p[]=new String[42];
		int i,l,j=-1;
		System.out.println("Input the sequence(in Capital Letters)");
		s=sc.next();
		l=s.length();
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)=='G'&&(l-i<7))
				break;
			if(s.charAt(i)=='G'&&s.charAt(i+5)=='G'&&s.charAt(i+6)=='K'&&(s.charAt(i+7)=='S'||s.charAt(i+7)=='T'))
			{
				p[++j]=s.substring(i,i+8);
			}
		}
		System.out.println("Number of MOTIF:"+(j+1));
		for(i=0;i<=j;i++)	
			System.out.println("MOTIF "+(i+1)+" in the sequence:"+p[i]);
	}
}