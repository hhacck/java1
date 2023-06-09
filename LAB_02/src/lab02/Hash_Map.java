package lab02;

import java.util.*;
public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String state,capital;
		Scanner sc=new Scanner(System.in);
		Map<String,String> cmap= new HashMap<>();
		while(true) {
			System.out.println("1.Create \n2.Display \n3.Search \n4.Remove \n5.update \n6.Sort \n7Size \n8.Clear \nEnter u r choice ");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter State");
				state=sc.next();
				System.out.println("enter Capital");
				capital = sc.next();
				cmap.put(state, capital);
				
			}
			else if(ch==2) {
				for(Map.Entry<String, String> e:cmap.entrySet())
				{
					System.out.println(e.getKey()+" "+e.getValue());
				}
				System.out.println("========================Other method=======================================");
				Iterator <String> it=cmap.keySet().iterator();
				while(it.hasNext()) {
					String key=(String)it.next();
					System.out.println("State "+key+"\tCapital "+cmap.get(key));
				}
			}
			else if(ch==3) {
				System.out.println("enter State name to get capital");
				state=sc.next();
				if(cmap.containsKey(state)) {
					System.out.println("State = "+state+"\tCapital = "+cmap.get(state)+"");
				}
				else {
					System.out.println("State not present");
				}
			}
			else if(ch==4) {
				System.out.println("enter State to remove");
				state = sc.next();
				cmap.remove(state);
			}
			else if(ch==5) {
				System.out.println("Enter the State name to change Capital");
				state=sc.next();
				System.out.println("Enter the Capital name");
				capital = sc.next();
						
				cmap.replace(state, capital);
			}
			else if(ch==6) {
				TreeMap<String, String> sorted = new TreeMap<>();
				
				sorted.putAll(cmap);
				
				for (Map.Entry<String, String> entry : sorted.entrySet()) {
					System.out.println("Key = " + entry.getKey() +"Value = " + entry.getValue());
				}
			}
			else if(ch==7) {
				System.out.println(cmap.size());
			}
			else if(ch==8) {
				cmap.clear();
				System.out.println("Hash Map is cleared");
				System.out.println(cmap.size());
			}
		}
		
	}

}


