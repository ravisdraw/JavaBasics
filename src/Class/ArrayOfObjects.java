package Class;

class Subject {
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObtained;
	
	public Subject(String subId, String name, int maxMarks) {
		this.subId  = subId;
		this.name = name;
		this.maxMarks = maxMarks;
	}

	public String getSubId() {
		return subId;
	}

	public String getName() {
		return name;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	
	public boolean isQualified() {
		return this.marksObtained >= this.maxMarks/10*4;
	}
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
//		Subject sub = new Subject("01","Ravi",100);
//		sub.setMarksObtained(40);
//		System.out.println(sub.isQualified());
		Subject sub[] = new Subject[2];
		sub[0] = new Subject("001","Ravi",100);
		sub[1] = new Subject("002","Moni",100);
		
		for(Subject s: sub) {
			System.out.println(s.isQualified());
		}
	}

}
