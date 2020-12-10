package com.test.test.date;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Datetest {
	//初始值為1970年.1月.1日.0點
	public static void main(String[] args) {
		String date = "2011-02-05";
		Date d = new Date();
		Calendar calendar = new GregorianCalendar();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		try {
			d = df.parse(date);//日期轉換方法
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		calendar.setTime(d);
//		calendar.set(Calendar.DATE, 1);
//		System.out.println(Calendar.DAY_OF_WEEK);
//		System.out.println(calendar.getActualMaximum(Calendar.DATE));
//		System.out.println("日	一	二	三	四	五	六");
//		StringBuilder sb = new StringBuilder();
//		double T = 21400;
//		T = T / 2.0 + 0.5;
//		Date d = new Date(System.currentTimeMillis());
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		String n="";
//		n = df.format(d);
//		System.out.println(n);
		
		/*StringTokenizer st = new StringTokenizer(str,"+| ");
		int i = 0;
		String[] a = new String[4];	//字串分割
		while(st.hasMoreTokens()) {
			a[i] = st.nextToken();
			i++;
		}*/
		/*String a = "15";
		String b = " 12| 11| 13| 14| 15|";
		char[] xc = a.toCharArray();
		for(int i=0;i<xc.length;i++) {
			int j = "０１２３４５６７８９號　".indexOf(xc[i]);//檢查是否在String("０１２３４５６７８９號　")有就給數字沒有回傳-1
			b+=xc[i];//寫進去
		}
		System.out.println(a.matches(b));//a(15)檢查b(12|11|13|14|15|)裡是否有a的值 b值裡的|分辨它們是不同的*/
//		String c = "8.00";
//		BigDecimal bd = new BigDecimal(-1);
		
//		StringBuilder sb = new StringBuilder();
//		String str = "0. 5";
//		char[] xc = str.toCharArray();
//		String b = "";
//		for(int i=0;i<xc.length;i++) {
//			if(xc[i]!=' ') {
//				b+=xc[i];
//			}
//		}//結果0.5
//		String date = "2019-05-09";
//		Date d = new Date();
//		Date d1 = new Date(System.currentTimeMillis());
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
//		try {
//			d = df.parse(date);//日期轉換方法
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		long a = (d1.getTime()-d.getTime()) / 1000 / 60 / 60 / 24;
//		BigDecimal bd1 = new BigDecimal("0");
//		BigDecimal bd2 = new BigDecimal("12");
//		bd1=bd1.add(bd2);
//		DecimalFormat f = new DecimalFormat("$#,##0;-$#,##0");
//		String[] a = new String[] {"1","2"};
//		Date s = new Date();
//		String d = "cascadeflo EC - 100 W";
//		int num = d.length()-2;
		String[] a = new String[] {"jj","ob","lais"} ;
		String[] b = new String[] {"jj","ob","lais"} ;
		Map<String,Object> map = new HashMap<String,Object>();
    	map.put("total", 13);
    	map.put("rows", a);
    	map.put("total", 3);
    	map.put("rows", b);
    	String bs = "a,b,c,";
    	String bs2 = "紅50";
    	//bs.substring(11, 13)
    	//bs.substring(14, 16)
    	double dd = Math.random()*1000.00;
    	BigDecimal bd = new BigDecimal(dd);
    	bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
    	System.out.println(bd.toString());
	}
	
	public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9a-zA-Z]*");
        Matcher isNum = pattern.matcher(str);           
        if( !isNum.matches() ){               
            return false;
        }  return true;
	 }
	
	 private static boolean MOD() {
			return 100%100 == 0;
	 }
	
	//判斷是否有空白
		private static boolean isBlank(String str) {
			for(int i=0;i<str.length();i++) {
				if(str.subSequence(i, i+1).equals(" ")) {
					return false;
				}
			}
			return true;
		}
		
		//判斷是否是英文
		private static boolean isEnglish(String str){
		      Pattern pattern = Pattern.compile("[a-zA-Z]*");
		      Matcher isNum = pattern.matcher(str);           
		      if( !isNum.matches() ){               
		          return false;
		      } return true;
		}
		
		//判斷是否是數字
		private static boolean isNumber(String str){
			   Pattern pattern = Pattern.compile("[0-9]*");
			   Matcher isNum = pattern.matcher(str);           
			   if( !isNum.matches() ){               
			       return false;
			   } return true;
		}
		
		public static boolean isInteger(String str) {  
	        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	        return pattern.matcher(str).matches();  
		}
		//此方法放入兩個參數分別是需要分割的字串和要放入字串陣列
		private static void Tokenizer(String values,String[] StringArrays) {
			StringTokenizer st = new StringTokenizer(values,"+| ");
			int i = 0;
			while(st.hasMoreTokens()) {
				StringArrays[i] = st.nextToken();
				i++;
			}
		}
	 
}


class Data{
	byte[] value;
	int num;
	
	public byte[] getValue() {
		return value;
	}
	public void setValue(byte[] value) {
		this.value = value;
	}
	
	
}