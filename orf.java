import java.util.*;
import java.lang.*;
class orf
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int ch,l,i,j,k=-1;
		String s;
		String p[]=new String[10];
		System.out.println("Enter the Choice\n1.DNA Sequence\n2.RNA Sequence");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:	System.out.println("Enter the Sequence");
					s=sc.next();
					l=s.length();
					x:for(i=0;i<l;i++)
					{
						if(l-i<3)
							break;
						if(s.substring(i,i+3).equals("ATG"))
						{
							y:for(j=i+3;j<l;j++)
							{
								if(l-j<3)
									break;
								if((s.substring(j,j+3).equals("TAA"))||(s.substring(j,j+3).equals("TAG"))||(s.substring(j,j+3).equals("TGA")))
								{
									p[++k]=s.substring(i,j+3);
									i=j+2;
									continue x;
								}
							}
						}
					}
					break;
			case 2:	System.out.println("Enter the Sequence");
					s=sc.next();
					l=s.length();
					x:for(i=0;i<l;i++)
					{
						if(l-i<3)
							break;
						if(s.substring(i,i+3).equals("AUG"))
						{
							y:for(j=i+3;j<l;j++)
							{
								if(l-j<3)
									break;
								if((s.substring(j,j+3).equals("UAA"))||(s.substring(j,j+3).equals("UAG"))||(s.substring(j,j+3).equals("UGA")))
								{
									p[++k]=s.substring(i,j+3);
									i=j+2;
									continue x;
								}
							}
						}
					}
					break;
			default:	System.out.println("Choose the Correct Choice");
						System.exit(0);
		}
		if(k<0)
			System.out.println("The given input sequence does not contains any ORF sequence");
		else
		{
			System.out.println("Number of Sequence:"+(k+1));
			for(i=0;i<=k;i++)
				System.out.println("ORF sequence "+(i+1)+":"+p[i]);
		}
	}
}