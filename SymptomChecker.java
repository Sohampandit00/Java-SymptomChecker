1. /**
2. * Write a description of class sickness here.
3. *
4. * @author (your name)
5. * @version (a version number or a date)
6. */
7. import java.util.Scanner;
8. public class sickness
9. {
	10. public static void main(String[] args){
		11. Scanner myScan = new Scanner(System.in);
		12. System.out.println("Do you have a fever? Enter yes or no.");
		13. String askingFever = myScan.nextLine();
		14. System.out.println("Do you have any symptoms? Enter yes or no.");
		15. String askingSymptoms = myScan.nextLine();
		16. 
		17. if(askingFever.equals("yes") && askingSymptoms.equals("yes")){
		18. System.out.println("make a doctor's appointment");
		19. }else if(askingFever.equals("yes") && askingSymptoms.equals("no")){
		20. System.out.println("rest");
		21. }else if(askingFever.equals("no") && askingSymptoms.equals("Yes")){
		22. System.out.println("hopefully symptoms improve");
		23. }else{
		24. System.out.println("Please enter a valid input");
		25. }
	26. 
	27. 
	28. 
	29. }
30. }
