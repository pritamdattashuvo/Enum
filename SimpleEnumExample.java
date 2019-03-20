
public class SimpleEnumExample {
	enum Months{
		JAN("january"),
		FEB("february"),
		MAR("march"),
		APR("april"),
		MAY("may"),
		JUN("june"),
		JUL("july"),
		AUG("august"),
		SEP("september"),
		OCT("october"),
		NOV("november"),
		DEC("december");
		
		private final String monthname;

		private Months(String monthname) {
			this.monthname = monthname;
		}
		
		public String enumInSwitch(Months Mo) {
		       switch(Mo) {
		           case JAN:
		               return "Its January!!";
		           case FEB:
		               return "Its Monday";
		           case MAR:
		               return "Its MARCH";
		           case APR:
		               return "Its APRIL";
		           default:
		               return "Rest of the months....";
		       }
		}
	}
}
