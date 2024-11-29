import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class CurrentDateTime {  
    public static void main(String[] args) {  
        LocalDateTime currentDateTime = LocalDateTime.now();  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, hh:mm:ss a");  
        String formattedDateTime = currentDateTime.format(formatter);  
        System.out.println("Current Date and Time: " + formattedDateTime);  
     }  
}