package Example;

public class SwitchExpress {

	public static void main(String[] args) {
String day="monday";
String res="";
res=switch(day)
{
//case "saturday","sunday" ->  "6am";
//case "monday" -> "8am";
//default -> "7 am";


//if we want to use Colon then use (yield)
case "tuesday" : yield "6.30 am";
default :yield "7am";

};
System.out.println(res);
	}

}
