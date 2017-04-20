/**
 * 
 */
package toolsQA;

/**
 * @author rameshpriya
 *
 */
public class Try_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** Arithmetic exception
		 *  NullPointer Exception
		 *  ArrayIndexOutOfBoxEception
		 *  NumberFormatException
		 */
	
			try{
				int a=12;
				int b=0;
				System.out.println(a/b);
				
			}catch(ArithmeticException  e)
			{
				System.out.println("exception occured");
			}
			
			System.out.println("helloo");
			
			int arr[]=new int[3];
			try{
			arr[8]=4;
			System.out.println(arr[8]);
			}catch(ArrayIndexOutOfBoundsException  e)
			{
				System.out.println("ArrayIndexOutOfBoundsException occurs");
			}
			
			try{
				String c = null;
				System.out.println(c.length());
				
			}catch(NullPointerException e){
				System.out.println("null pointer exception occurs");
			}

		}

	}


