package eg1;

public class Lastcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertTolastCase(s));


	}
	public static String convertTolastCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w =0;w<ar.length; w++) {
			sb.append(ar[w].substring(0,ar[w].length()-1)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()-1))).append(" ");
		}
		return sb.toString().trim();
	

}
}
