
public class Patterns 
{

	public static void firstPattern() 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("\t*");
			}
			System.out.println();
		}
	}

	
	public static void secondPattern()
	{
		int x=4;
		for(int i=0;i<5;i++)
		{
			for(int p=x;p>0;p--)
			{
				System.out.print("\t");
			}
			for(int j=0;j<i+1;j++)
			{
				System.out.print("\t*");
			}
			System.out.println();
			x--;
		}
	}

	public static void thirdPattern() 
	{
		int k=1;
		int s=4;
		for(int i=0;i<5;i++)
		{
			for(int sp=0;sp<s;sp++)
			{
				System.out.print("\t");
			}
			s--;
			for(int j=0;j<k;j++)
			{
				System.out.print("\t*");
			}
			System.out.println();
			k=k+2;
		}
	}

	
	public static void fourthPattern()
	{
		int k=1;
		int s=4;
		for(int i=0;i<5;i++)
		{
			for(int sp=0;sp<s;sp++)
			{
				System.out.print("\t");
			}
			s--;
			for(int j=0;j<k;j++)
			{
				System.out.print("\t*");
			}
			System.out.println();
			k=k+2;
			
			if(i==4)
			{
				k=k-2;
				for(int l=0;l<4;l++)
				{
					k=k-2;
					s++;
					for(int sp=0;sp<=s;sp++)
					{
						System.out.print("\t");
					}
					
					for(int j=0;j<k;j++)
					{
						System.out.print("\t*");
					}
					
					for(int sp=0;sp<s;sp++)
					{
						System.out.print("\t");
					}
					System.out.println();
				}
			}
		}
		
		
		
	}
	
}
