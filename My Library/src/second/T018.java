package second;

public class T018 {
	static String s = "> ";

	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				try {
					throw new Exception();
				} catch (Exception ex) {
					s += "eric ";
				}
				throw new Exception();
			} catch (Exception x) {
				s += "michael ";
			} finally {
				s += "fyi ";
			}
		} finally {
			s += "chao ";
		}
		System.out.println(s);
	}

}
