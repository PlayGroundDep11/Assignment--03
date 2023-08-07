import java.util.Scanner;

public class Assignment{
    private static final Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

        System.out.print("Enter your name :");
        String name = scanner.nextLine() ;

        codeBlock:
        {
        if(name.length() == 0 ||  name.strip().length() ==0 ){
            System.out.println("\033[31mInvalid name\033[0m");
            break codeBlock;
        }

        System.out.print("Enter your age :");
        int age = scanner.nextInt() ;
        scanner.nextLine() ;

        if((age < 10 || age > 18) ){
            System.out.println("\033[31mInvalid age\033[0m");
            break codeBlock ;
        }

        //subject1
        System.out.print("Enter your Subject1 :");
        String subject1 = scanner.nextLine() ;

        if( !(subject1.startsWith("SE-"))  || subject1.strip().length() == 0  || subject1.strip().length()==3 ){
            System.out.println("\033[31mInvalid Subject Entry\033[0m");
            break codeBlock ;
        }
        
        System.out.print("Enter marks of subject1 :");
        double marksSubject1 = scanner.nextDouble() ;
        scanner.nextLine() ;

        if(marksSubject1 < 0 || marksSubject1 >100){
            System.out.println("\033[31mInvalid Subject marks\033[0m");
            break codeBlock ;
        }

        //subject2
        System.out.print("Enter your Subject2 :");
        String subject2 = scanner.nextLine() ;

        if( !(subject2.startsWith("SE-"))  || subject2.strip().length() == 0  || subject2.strip().length()==3 ){
            System.out.println("\033[31mInvalid Subject Entry\033[0m");
            break codeBlock ;
        }
        if(subject1.equalsIgnoreCase(subject2)){
            System.out.println("\033[31mSubject already entered\033[0m");
            break codeBlock ;
        }
        System.out.print("Enter marks of subject2 :");
        double marksSubject2 = scanner.nextDouble() ;
        scanner.nextLine() ;

        if(marksSubject2 < 0 || marksSubject2 >100){
            System.out.println("\033[31mInvalid Subject marks\033[0m");
            break codeBlock ;
        }

        //subject3
        System.out.print("Enter your Subject3 :");
        String subject3 = scanner.nextLine() ;

        if( !(subject3.startsWith("SE-"))  || subject3.strip().length() == 0  || subject3.strip().length()==3 ){
            System.out.println("\033[31mInvalid Subject Entry\033[0m");
            break codeBlock ;
        }
        if( subject3.equalsIgnoreCase(subject2) || subject3.equalsIgnoreCase(subject1) ){
            System.out.println("\033[31mSubject already entered\033[0m");
            break codeBlock ;
        }
        System.out.print("Enter marks of subject3 :");
        double marksSubject3 = scanner.nextDouble() ;
        scanner.nextLine() ;

        if(marksSubject3 < 0 || marksSubject3 >100){
            System.out.println("\033[31mInvalid Subject marks\033[0m");
            break codeBlock ;
        }

        //calculating total
        double total = marksSubject1 + marksSubject2 + marksSubject3 ;
        double average = total/3 ;

        //Status

        String distinguishedPass  = "\033[1;34mDistinguished Pass \033[0m" ;
        String creditPass =  "\033[1;32mCredit Pass\033[0m" ;
        String dpass  = "\033[1;33mPass\033[0m" ;
        String fail =  "\033[1;31mFail\033[0m" ;

        String status ;

        if(average>=75) status = distinguishedPass ;
        else if(average>=65) status = creditPass ;
        else if(average>=55) status = dpass ;
        else status = fail ;


        String statusSubject1 ;
        if(marksSubject1>=75) statusSubject1 = distinguishedPass ;
        else if(marksSubject1>=65) statusSubject1 = creditPass ;
        else if(marksSubject1>=55) statusSubject1 = dpass ;
        else statusSubject1 = fail ;

       

       String statusSubject2 = (marksSubject2>=75) ? distinguishedPass : (marksSubject2>=65) ? creditPass : (marksSubject2>=55) ? dpass : fail ;
        String statusSubject3 = (marksSubject3>=75) ? distinguishedPass : (marksSubject3>=65) ? creditPass : (marksSubject3>=55) ? dpass : fail ;


        System.out.printf("Name\t:\033[1;34m%s\033[0m \n",name.toUpperCase());
        System.out.printf("Age\t: %d years old \n",age) ;
        System.out.printf("Status\t:%s \n",status);
        System.out.printf("Total = %.2f \t Avg = %.2f \n",total,average) ;
        System.out.println("-".repeat(54)) ;
        System.out.printf("|%-15s|%-15s|%-20s|\n"," Subjects "," Marks ", " Status");
        System.out.println("-".repeat(54)) ;
        System.out.printf("|SE-%-12s|%-15.2f| %-18s |\n",subject1.substring(3,subject1.length()),marksSubject1,statusSubject1) ;
        System.out.println("-".repeat(54)) ;
        System.out.printf("|SE-%-12s|%-15.2f| %-18s |\n",subject2.substring(3,subject2.length()),marksSubject2,statusSubject2) ;
        System.out.println("-".repeat(54)) ;
        System.out.printf("|SE-%-12s|%-15.2f| %-18s |\n",subject3.substring(3,subject3.length()),marksSubject3,statusSubject3) ;
        System.out.println("-".repeat(54)) ;











        }
    }
}