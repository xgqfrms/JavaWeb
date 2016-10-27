package first;


public class T013 {

	private String content;
	  public String getContent() { return content; }
	  public void setContent(String d) { content = d; }
	  public static void modifyCont(T013 weibo, String content) {
	    weibo = new T013();
	    weibo.setContent(content);
	  }
	  public static void main(String[] args) {
		T013 wb = new T013();
	    wb.setContent("javacontest");
	    T013 wb2 = new T013();
	    wb2.setContent("jingkao");
	    modifyCont(wb, "sudocn");
	    System.out.println(wb.getContent());
	    System.out.println(wb2.getContent());
	  }

}
