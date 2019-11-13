import java.util.*;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ActivitySelection {

	public  static void Activity_Selection(String m[],int s[],int f[]){ 
System.out.println("following activities are selected");
int i,j;
i=0;

System.out.println(m[i]+"  "+s[i]+"  "+f[i]);
for(j=1;j<5;j++)
{
	if(s[j]>=f[i])
		System.out.println(m[j]+"  "+s[j]+"  "+f[j]);
	i=j;
}
	}
public static void main(String args[])throws Exception	{
	Object obj=new JSONParser().parse(new FileReader("C:\Users\win10\1941012832"));
	JSONObject jo=(JSONObject) obj;
	int k;
	String m[];
	int s[];
	int f[];
	m=new String[5];
	s=new int[5];
  	f=new int[5];
  	for(k=0;k<5;k++)
  	{
  		
  		m[k]=(String) jo.get("Job Title");
		s[k]=(int) jo.get("Start time");
		f[k]=(int) jo.get("Finish time");
		
  		
  	}
  	Activity_Selection(m,s,f);
	


	
	
}
}


