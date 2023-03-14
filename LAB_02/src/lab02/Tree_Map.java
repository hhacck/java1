package lab02;

import java.util.*;
public class Tree_Map<K,V> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("Karnataka","Bengaluru");
		tm.put("Tamil Nadu","Chennai");
		tm.put("Maharastra","Mumbai");
		System.out.println(tm.get("Karnataka"));
		Iterator<String> itr=tm.keySet().iterator();
		while(itr.hasNext()) {
			String state=(String)itr.next();
			System.out.println(""+state+"\t"+tm.get(state));
		}
		System.out.println("=================================================");
		TreeMap<String,String> sorted=new TreeMap<>();
		sorted.putAll(tm);
		for(Map.Entry<String, String> entry:sorted.entrySet()) {
			System.out.println(""+entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println(tm.size());
		tm.putIfAbsent("abc", "xyz");
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.pollFirstEntry());
		tm.remove("Karnataka");
		tm.clear();
	}

}


