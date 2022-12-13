import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;

public class Fangraphs {
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> player4 = new ArrayList<String>();
		ArrayList<String> player5 = new ArrayList<String>();
		ArrayList<String> player6 = new ArrayList<String>();
		ArrayList<String> player7 = new ArrayList<String>();
		Document doc1 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0")
				.timeout(25000).get();
		Document doc2 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&team=&rost=&age=&filter=&players=")
				.timeout(25000).get();
		Document doc3 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&team=&rost=&age=&filter=&players=")
				.timeout(25000).get();
		Elements body1 = doc1.select("tbody");
		Elements body2 = doc2.select("tbody");
		Elements body3 = doc3.select("tbody");
		
		
		//2022
		for(Element e: body1.select("tr.rgRow")) {
		    player1.add(e.selectFirst("td.grid_line_regular a").text());
		    
		}
		for(Element e: body1.select("tr.rgAltRow")) {
			player2.add(e.selectFirst("td.grid_line_regular a").text());
		}
		
		interleave(player1, player2);
		System.out.println("Top 10 League Leaders in WAR for 2022 ");
		for (int i = 0; i < player1.size() - 20;i++) {
		    System.out.println(player1.get(i));        		
		}
		System.out.println("");
		
		//2021
		for(Element e: body2.select("tr.rgRow")) {
		    player3.add(e.selectFirst("td.grid_line_regular a").text());
		    
		}
		for(Element e: body2.select("tr.rgAltRow")) {
			player4.add(e.selectFirst("td.grid_line_regular a").text());
		}
		
		interleave(player3, player4);
		System.out.println("Top 10 League Leaders in WAR for 2021 ");
		for (int i = 0; i < player3.size() - 20;i++) {
		    System.out.println(player3.get(i));        		
		}
		System.out.println("");
		
		//2020
		for(Element e: body3.select("tr.rgRow")) {
		    player5.add(e.selectFirst("td.grid_line_regular a").text());
		    
		}
		for(Element e: body3.select("tr.rgAltRow")) {
			player6.add(e.selectFirst("td.grid_line_regular a").text());
		}
		
		interleave(player5, player6);
		System.out.println("Top 10 League Leaders in WAR for 2020 ");
		for (int i = 0; i < player5.size() - 20;i++) {
		    System.out.println(player5.get(i));        		
		}
		System.out.println("");
		
		//Total
		System.out.println("Total WAR Leaders in the past 3 seasons ");
		for (int i = 0; i < player1.size() - 20;i++) {
		    player7.add(player1.get(0)); 
		    player7.add(player1.get(1));
		    player7.add(player1.get(2));
		    player7.add(player3.get(0));
		    player7.add(player1.get(3));
		    player7.add(player1.get(4));
		    player7.add(player3.get(1));
		    player7.add(player1.get(5));
		    player7.add(player3.get(2));
		    player7.add(player1.get(6));
		}
		System.out.println(player7.get(0));
		System.out.println(player7.get(1));
		System.out.println(player7.get(2));
		System.out.println(player7.get(3));
		System.out.println(player7.get(4));
		System.out.println(player7.get(5));
		System.out.println(player7.get(6));
		System.out.println(player7.get(7));
		System.out.println(player7.get(8));
		System.out.println(player7.get(9));
		
		
		
	}
	
	private static void interleave(ArrayList<String> a1, ArrayList<String> a2) {
	    int i = -1;
	    for(String elem: a2) {
	        if(i < a1.size()-1) {
	            i += 2;
	        } else {
	            i += 1;
	        }
	        a1.add(i, elem);
	    }
	}

}
