package exam2;

import java.util.ArrayList;
import java.util.List;

public class q3 {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Blue");
        list_Strings.add("Green");
        list_Strings.add("White");
        list_Strings.add("Black");
        
        for (String element : list_Strings) {
          System.out.println(element);
          }

	}

}
