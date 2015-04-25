package com.daluga.baseball.model.util;

import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.lang3.StringUtils;
//import org.htmlparser.Node;
//import org.htmlparser.NodeFilter;
//import org.htmlparser.Parser;
//import org.htmlparser.filters.StringFilter;
//import org.htmlparser.util.NodeIterator;
//import org.htmlparser.util.NodeList;
//import org.htmlparser.util.ParserException;

public class HTMLUtil {

	public static List<String> parseHTML(String html, String url) {
		
		List<String> results = new ArrayList<String>();
		
//		Parser parser = null;
//		
//		try {
//			parser = new Parser(html);
//			NodeFilter filter = new StringFilter("gid_");
//			
//			NodeList list = new NodeList();
//
//			for (NodeIterator itr = parser.elements(); itr.hasMoreNodes();) {
//				itr.nextNode().collectInto(list, filter);	
//			}
//			
//			for (int i = 0; i < list.size(); i++) {
//				Node node = list.elementAt(i);
//				results.add(url + StringUtils.trim(node.getText()) + "boxscore.xml");
//			}						
//		} catch (ParserException e) {
//			e.printStackTrace();
//		}
		
		//gid_2011_04_20_wasmlb_slnmlb_2/boxscore.xml
		//year_2011/month_04/day_10/gid_2011_04_10_nyamlb_bosmlb_1/boxscore.xml
		//http://gd2.mlb.com/components/game/mlb/year_{year}/month_{month}/day_{day}/
		
		return results;
	}
	
}
