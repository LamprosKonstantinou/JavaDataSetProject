
public class Statistics {
	
	private int counter;
	private double sum;
	private Measurable maximum;
	private Measurable minimum;
	
	
	public Statistics() {
		counter = 0;
		sum = 0;
		maximum = null;
		minimum = null;
	}
	

	public void add(Measurable item) {
		sum = sum + item.getMeasure();
		
		if (counter == 0) {
			maximum = item;
			minimum = item;
			}
		else if(item.getMeasure() > maximum.getMeasure()) {
			maximum = item;
			
		}
		else if(item.getMeasure() < maximum.getMeasure()) {
			minimum = item;
			}
		counter++;
		}
	
	public double getAverage() {
		if (counter == 0)
			return 0;
		else 
			return sum/counter;
	}
	
	public Measurable getMaximum() {
		return maximum;
	}
	public Measurable getMinimum() {
		return minimum;
	}
	
	
	
	

	
}
