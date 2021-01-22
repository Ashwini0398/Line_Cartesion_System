public class Cartesion
{
                public static final int x1=3;
                public static final int y1=4;
                public static final int x2=5;
                public static final int y2=6;
                public static final int x3=7;
                public static final int y3=4;
                public static final int x4=6;
                public static final int y4=7;

	 public static void compute()

        {
                double length1, length2;


                //calculated lenth of two lines
                length1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
                length2 = Math.sqrt(Math.pow(x3-x4,2) + Math.pow(y3-y4,2));

                System.out.println("the length of line1 is:"+length1);
                System.out.println("the length of line2 is:"+length2);

                String str1=String.valueOf(length1);
                String str2=String.valueOf(length2);

                double var = str1.compareTo(str2);



                if( var == 0 )
                {
                        System.out.println("both line length are equal");
                }
                else if ( var > 0 )
                {
                        System.out.println("length of line 1 is greater");
                }
                else
                {
                        System.out.println(" length of line 2  is greater");
                }

        }

	  public static void main(String args[])
        {
                compute();

        }

}
