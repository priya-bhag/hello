package helper;

public class String_demo {

	public static void main(String[] args) {
		
		//startswith()
		//endswith()
		//.equals()
		//.equalsIgnoreCase()
		//.contains()
		//split(regex)
		//trim --trims while sapaces before and after string
		//charAt - --character at a specific index
		
		
		String data1 = "hello-hi-welcome";
		
		String []  arr = data1.split("-");
		
for(int i=0; i<arr.length; i++){
	System.out.println(arr[i]);
}
		
		
		
	}

}
