
public class AdvanceProgram2 {

	// A1B2C3-->1A2B3C
	public static void main(String[] args) {
		String result = swapNumChar("A1B2C3");
		System.out.println(result);
		
	}
	public static String swapNumChar(String str) {
		
		int len = str.length();
		String res = "";
		
		for(int i=0; i<len;i=i+2) {
			res = res + str.charAt(i+1)+str.charAt(i);
		}
		return res;
	}
}
