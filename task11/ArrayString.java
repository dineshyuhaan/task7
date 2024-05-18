package practice;

public class ArrayString {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 4 };
		String s="Dinesh";
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}

			char f=s.charAt(7);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
