
public class change {
	public static void main(String[] args) throws Exception {
	       String str = java.net.URLEncoder.encode("仿网站", "UTF-8");
	       String[] s = str.substring(1).split("%");
	       StringBuffer s8 = new StringBuffer();
	       for(int i=0;i<s.length;i++){
	    	   s8.append("\\"+Integer.toOctalString(Integer.valueOf(s[i],16)));
	       }
	       System.out.println(s8.toString());
	    }
}
