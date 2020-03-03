import java.util.Calendar;

public class Date {
	private String dateTime;
	
	public String getDateTime() {
		this.setDateTime();
		return dateTime;
	}
	
	private void setDateTime() {
		Calendar calendar = Calendar.getInstance();
		// Formatando data hora para o padrão do Brasil
		dateTime = calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
	}
}
