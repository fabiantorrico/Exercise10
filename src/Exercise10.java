import javax.swing.JOptionPane;



public class Exercise10 {
	enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) {
		Month [] choices ={Month.January ,Month.February, Month.March,Month.April,Month.May,Month.June,Month.July,Month.August,Month.September,Month.October,Month.November,Month.December };
		boolean continueLoop = true;
		while(continueLoop){
		Month select = (Month)JOptionPane.showInputDialog(null,"Select a month.","Month",JOptionPane.QUESTION_MESSAGE,null, choices,choices[0]);
		if(select!=null){
		switch (select){
		case December: case January: case February:
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
			break;
		case March: case April: case May:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
			break;
		case June: case July: case August:
			JOptionPane.showMessageDialog(null, "Its summer time!");
			break;
		case September: case October: case November:
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
			break;
		}
	} else continueLoop=false;
}
		}
	}