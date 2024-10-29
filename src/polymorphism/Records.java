package polymorphism;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class Records {
	public ArrayList<String> logs = new ArrayList<String>();
	public int amount = 300;//количество денег
	Records() { }
	public void addLog(String log) { logs.add(LocalDateTime.now() + " " + log); }
}