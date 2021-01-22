public class Cartesion {
	public static void main(String args[])
	{
		int x1,y1,x2,y2,x3,y3,x4,y4; //cordinated
		double length1, length2;
		x1=3;
		y1=4;
		x2=5;
		y2=6;
		x3=7;
		y3=4;
		x4=6;
		y4=7;
		
		//calculated lenth of two lines 
		length1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		length2 = Math.sqrt(Math.pow(x3-x4,2) + Math.pow(y3-y4,2));

		System.out.println("the length of line1 is:"+length1);
		System.out.println("the length of line2 is:"+length2);

		if( length1 == length2 )
		{
			System.out.println("both line length are equal");
		}
		else if ( length1 > length2 )
		{
			System.out.println("length of line 1 is greater");	
		}
		else
		{
			System.out.println(" length of line 2  is greater");
		}

	}
}
