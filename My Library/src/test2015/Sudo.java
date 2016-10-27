package test2015;
class Su{
	private int pid;
	public Su(int pid){this.pid=pid;}
	public void setPid(int pid){this.pid =pid;}
	public int getPid(){return pid;}
}
public class Sudo {
static Su chmod(Su sudo){
	sudo =new Su(1);
	return sudo;
	
}
	public static void main(String[] args) {
		Su sudo=new Su(0);
		System.out.print(sudo.getPid());
		Su sudo2=chmod(sudo);
		System.out.print(sudo.getPid());
		System.out.print(sudo2.getPid());
		sudo=chmod(sudo2);
		System.out.print(sudo.getPid());
		System.out.print(sudo2.getPid());
	}
}
		

