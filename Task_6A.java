import java.util.Scanner;

public class Task_6A {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        
       System.out.print("Enter your name :"); 
       String name = scanner.nextLine().strip();

       char d = name.charAt(1);
       final String RED = "\033[31;1m";
       final String RESET = "\033[0;0m";
       
       if(d >='a' && d <='z' || d>='A' && d <='Z'){
            System.out.print("Enter your age :");
            Double age = scanner.nextDouble(); 
           

            if(age>10 && age<18){

                

                scanner.nextLine();
                System.out.print("Enter Subject1:"); 
                String subject1 = scanner.nextLine();
                if(subject1.startsWith("SC-")){
                    System.out.print("Enter subject1 marks :");
                    int sub1 = scanner.nextInt();

                    if(sub1>0 && sub1<100){
                        scanner.nextLine();
                        System.out.print("Enter Subject2:"); 
                        String subject2 = scanner.nextLine();
                        if(!(subject1.equals(subject2)) && subject2.startsWith("SC-")  ){
                        System.out.print("Enter subject2 marks : ");
                        int sub2 = scanner.nextInt();

                        if(sub2>0 && sub2<100){
                        scanner.nextLine();
                        System.out.print("Enter Subject3:"); 
                        String subject3 = scanner.nextLine();
                        if(subject3.startsWith("SC-") && !(subject2.equals(subject3)) && !(subject1.equals(subject3))){
                        System.out.print("Enter subject3 marks :");
                        int sub3 = scanner.nextInt();

                            if(sub3>0 && sub3<100){

                                double avg = (sub1 + sub2 + sub3)/3;
                                int total = sub1 + sub2 + sub3;

                                String status1 =(sub1>75? "credit pass": sub1> 55? "pass":"fail");
                                String status2 =(sub2>75? "credit pass": sub2> 55? "pass":"fail");
                                String status3 =(sub3>75? "credit pass": sub3> 55? "pass":"fail");

                                String status = (avg>75 ? "Credit pass": avg>55 ? "pass":"fail");



                                String dottedline = "+--------------------+-------------------+";
                                System.out.println(dottedline);
                                System.out.printf("|  %-15s   |  %-15s  |\n","NAME",name);
                                System.out.println(dottedline);
                                System.out.printf("|   %-15s  |  %-15s  |\n","AGE",age);
                                System.out.println(dottedline);
                                System.out.printf("|   %-15s  |  %-15s  |\n","STATUS",status);
                                System.out.println(dottedline);
                                System.out.printf("|Total=%-10s     Average=%-11.2f|\n",total,avg);
                                System.out.println(dottedline);
                                System.out.printf("| %-10s  |  %-10s   |  %-8s|\n","Subject","marks","status");
                                System.out.println(dottedline);
                                System.out.printf("| SC-%03d %-5s| %-10s | %-10s  |\n",Integer.valueOf(subject1.substring(3)),"",sub1,status1);
                                System.out.printf("| SC-%03d %-5s| %-10s | %-10s  |\n",Integer.valueOf(subject2.substring(3)),"",sub1,status1);
                                System.out.printf("| SC-%03d %-5s| %-10s | %-10s  |\n",Integer.valueOf(subject3.substring(3)),"",sub1,status1);
                                System.out.println(dottedline);

                            }else{
                                System.out.printf("\\033[31m%s\\033[1m","Invalid Input");
                            }


                        }else{
                            System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);  

                        }

                        

                    }else{
                        System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);  
                    }
                    

                    
                }else{
                    System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);  

                }

                }else{
                    System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);  

                }
                    
                }else{
                    System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);  

                }
            }else{
                System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);  
            }
       }
       else{
         System.out.printf("%s%s%s/n",RED,"Invalid Input",RESET);   
            
       }
       
    }
}
