package test2015;


class Contest{
	public Contest(String s){
		System.out.print("Fun");
	}
}
public class JavaContest extends Contest {
	public JavaContest(String s){
		System.out.print("S Fun");
	}
	public static void main(String[] args) {
		new JavaContest("come on");

	}

}
