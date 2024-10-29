package polymorphism;
import java.util.Comparator;
import java.util.Scanner;
public class Polymorphism {
	public static void main(String[] args) {
		T firstT = new T("иванов", "ak123456"), secT = new T("петров", "ae123456");
		Tree<T> tree = new Tree<T>(firstT, secT);
		if (tree.compare(firstT, secT) < 0) System.out.println(false);
		else if (tree.compare(firstT, secT) > 0) System.out.println(true);
		else System.out.println("значения равны");
		Records records = new Records();
		int iterator = 0;//количество пройденных итераций
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("цена товара");
			int subtraction = scanner.nextInt();
			if (records.amount - subtraction < 0) {
				getErr(records, "мало средств на счету", iterator);
				iterator++;
			}
			else if (subtraction <= 0) {
				getErr(records, "цена должна быть больше 0", iterator);
				iterator++;
			}
			else {
				records.amount -= subtraction;
				System.out.println("операция выполнена успешно. количество денег на счету=" + records.amount);
				break;
			}
		}
	}
	static void getErr(Records record, String recording, int iterator_) {
		record.addLog(recording);
		System.out.println(record.logs
				.toArray()[iterator_]);
	}
}
class Tree<T> implements Comparator<T> {
	T a, b;
	Tree(T firstVal, T secVal) {
		this.a = firstVal;
		this.b = secVal;
	}
	public int compare(T a, T b) { return a.toString().length() - b.toString()
			.length(); }
}