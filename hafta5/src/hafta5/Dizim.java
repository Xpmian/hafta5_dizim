package hafta5;

import java.util.ArrayList;

public class Dizim 
{

	public static void main(String[] args) 
	{
		ArrayList<String> item = new ArrayList<String>();
		item.add("red");
		item.add("yellow");
		item.add(0,"green");
		for(String renk : item)
		{
			System.out.print(" " + renk );
		}
        item.remove(2);
        System.out.println("");
        System.out.print(item);
        System.out.println("");
        System.out.println(item.get(1));
        item.contains("red");
        System.out.println(item.contains("red") ? "evet var" : " hayır yok");
 	}

}
