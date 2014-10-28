package is.ru.stringcalculator;
<<<<<<< HEAD
=======
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
>>>>>>> 799af897aab0c4fcb287f341ae43ad200b0cc777

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
<<<<<<< HEAD
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
=======
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return toInt(text);
>>>>>>> 799af897aab0c4fcb287f341ae43ad200b0cc777
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
<<<<<<< HEAD
	    return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
=======
		if(numbers.startsWith("//")){
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
			m.matches();
			String delimiter = m.group(1);
			String rest = m.group(2);
			return rest.split(delimiter);
		}
	    return numbers.split("(,|\n)");
	}
      
    private static int sum(String[] numbers){
 	    	int total = 0;
		ArrayList<Integer> negatives = new ArrayList<Integer>(numbers.length);
		for(String number : numbers){
			if(toInt(number) < 0) negatives.add(toInt(number));
		}
		if(negatives.size() > 0) throw new RuntimeException("Negatives not allowed");
	        for(String number : numbers){
		    	total += toInt(number);
			if(toInt(number) > 1000) total -= toInt(number);
>>>>>>> 799af897aab0c4fcb287f341ae43ad200b0cc777
		}
		return total;
    }



<<<<<<< HEAD
}
=======
}
>>>>>>> 799af897aab0c4fcb287f341ae43ad200b0cc777
