
import java.util.ArrayList;
enum AbbreviationOfDays{
   SUNDAY("SUN"), MONDAY("MON"), TUESDAY("TUES"), WEDNESDAY("WED"),
   THURSDAY("THURS"), FRIDAY("FRI"), SATURDAY("SAT");
   private String abbreviation;
   public String getAbbreviation() {
       return this.abbreviation;
   }
   AbbreviationOfDays(String abbreviation) {
           this.abbreviation = abbreviation;
   }
}
public class EnumFields {
   public ArrayList<String> enumFields() {
       AbbreviationOfDays[] abbreviationOfDays = AbbreviationOfDays.values();
       ArrayList<String> daysList = new ArrayList<String>();
       for (AbbreviationOfDays day : abbreviationOfDays) {
           daysList.add(day.getAbbreviation().toString());
       }
       return daysList;
   }
}