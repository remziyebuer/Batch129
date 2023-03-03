package mentoring;

import java.time.LocalDate;
import java.util.Scanner;

public class Deneme04  {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen e mailinizi giriniz");
        String email = scanner.nextLine();
        validateEmail(email);

    }



        private static boolean validateEmail(String email){


            boolean isValid=false;




            boolean isExistSpace= email.contains(" ");//bosluk iceriyor mu?
            if(isExistSpace){
                System.out.println("Email bosluk icermemeli");
                isValid = false;
            }





            boolean isExistAt=email.contains("@");

            if(!isExistAt){
                System.out.println("Email @ icermelidir");
                isValid= false;
/*

            }else if(email.replace("[^@]","").length()!=1){
                System.out.println("Lutfen sadece bir tane @ kullaniniz");
                isValid=false;
*/

            }else{

                String firstPart = email.split("@")[0];
                boolean firstPartLength = firstPart.length()>0;//icinde eleman olmali bos olmamali
                // yoksa asagidaki kod true verir bos olmasina ragmen
                if(!firstPartLength){
                    System.out.println("@ ten once karakter olmali");
                    isValid =false;

                } else {


                    boolean validateFirstPart = firstPart.replace("[^a-zA-Z0-9_.-]","").isEmpty();
                    if(validateFirstPart){
                        System.out.println("Sadece buyuk kucuk harfler ile _ . ve - ile e mail adresi olusturabilirsiniz");
                        isValid =false;
                    }

                }


                String secondPart = email.split("@")[1];

                boolean validateSecondPart = secondPart.equals("gmail.com")||
                        secondPart.equals("yahoo.com")||
                        secondPart.equals("hotmail.com");
                if(!validateSecondPart){
                    System.out.println("E-mail @ ' ten sonra gmail.com, yahoo.com  ya da hotmail.com ile bitmelidir");
                    isValid=false;
                }

            }


            if(!isValid){
                System.out.println("hosgeldiniz");
            }else {
                System.out.println("Lutfen tekrar deneyiniz");
            }



            return isValid;

        }













    }