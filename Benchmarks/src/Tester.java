/**
 * 
 */

/**
 * @author jack
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] a=new double[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10);
		}
		Quick.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
	}
	
	
	

}
