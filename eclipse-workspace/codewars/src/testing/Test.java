package testing;

public class Test {
	public static void main (String [] args)
	{
		System.out.println("this is hell");
		String var = "abcdefghijklmnopqrstuvwxyz";
		String s = "J-T";
		String res = "";

		if (Character.isLowerCase(s.charAt(0)))
		{
			res = var.substring(var.indexOf(s.charAt(0)), var.indexOf(s.charAt(2)) + 1);	
			System.out.println(res);
		}
		else
		{
			s = s.toLowerCase();
			//System.out.println(strRange);
			res = var.substring(var.indexOf(s.charAt(0)), var.indexOf(s.charAt(2)) + 1);	
			System.out.println(res.toUpperCase());
		}
		
		String sol2 = "";
		for (int i = s.charAt(0); i <= s.charAt(2); i++)
		{
			sol2 += (char) i;
		}
		System.out.println(sol2);
		
	}
}
