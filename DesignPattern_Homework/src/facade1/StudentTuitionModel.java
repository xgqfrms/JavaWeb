package facade1;

public class StudentTuitionModel {

	   private String studFirstName;
	   private String studLastName;
	   private String studSerialNum;
	   //
	   private String tuitionTitle;
	   private String tuitionNum;

	   public StudentTuitionModel (String studFirstName, String studLastName, String studSerialNum,
	                                                         String tuitionTitle, String tuitionNum) {
	      this.studFirstName = studFirstName;
	      this.studLastName = studLastName;
	      this.studSerialNum = studSerialNum;
	      //
	      this.tuitionTitle = tuitionTitle;
	      this.tuitionNum = tuitionNum;
	   }

	   public String getStudFirstName() {
	      return studFirstName;
	   }
	   public String getStudLastName() {
	      return studLastName;
	   }
	   public String getStudSerialNum() {
	      return studSerialNum;
	   }
	   //
	   public String getTuitionTitle() {
	      return tuitionTitle;
	   }
	   public String getTuitionNum() {
	         return tuitionNum;
	   }
	}
