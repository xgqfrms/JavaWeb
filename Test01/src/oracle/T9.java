package oracle;


public class T9 {
	  private String content;
	  public String getContent() { return content; }
	  public void setContent(String d) { content = d; }
	  public static void modifyCont(T9 weibo, String content) {
	    weibo = new T9();
	    weibo.setContent(content);
	  }
	  public static void main(String[] args) {
		  T9 wb = new T9();
	    wb.setContent("javacontest");
	    T9 wb2 = new T9();
	    wb2.setContent("jingkao");
	    modifyCont(wb, "sudocn");
	    System.out.println(wb.getContent());
	    System.out.println(wb2.getContent());
	  }
	}