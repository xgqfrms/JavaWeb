package first;

public class WWMXD {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		//
		try(dcCareer dc= new dcCareer()) {
			dc.happyLife();
			return ;
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName());
			return ;
		}finally{
			System.out.println("story end");
			return ;
		}

	}
    public  static class dcCareer implements AutoCloseable{
    	public  dcCareer(){
    		System.out.println("born");
    	}
    	public void  happyLife() throws JoyfulException {
			System.out.println("happy living");
			throw new JoyfulException();
		}
		@Override
		public void close() throws UnexpectedException {
			System.out.println("unexpected");
			throw new UnexpectedException();
		}
    }
}
class JoyfulException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class UnexpectedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}