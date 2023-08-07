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
        
        System.out.println("Enter marks of subject1 :");
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
        
        System.out.println("Enter marks of subject2 :");
        double marksSubject2 = scanner.nextDouble() ;
        scanner.nextLine() ;

        if(marksSubject2 < 0 || marksSubject2 >100){
            System.out.println("\033[31mInvalid Subject marks\033[0m");
            break codeBlock ;
        }
        if(subject1.equalsIgnoreCase(subject2)){
            System.out.println("\033[31mSubject already entered\033[0m");
        }










        }
    }
}