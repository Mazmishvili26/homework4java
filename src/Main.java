import toBinary.Binary;
import toDecimal.Decimal;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Main {

    public static void main(String  args[]) throws IOException {

//        1. მთელი 24, 39, -90 რიცხვები ჩაწერეთ data.txt ფაილში, ფაილი შექმენით myFiles
//        საქაღალდეში.

//            try {
//
//                PrintWriter pt = new PrintWriter(new FileWriter("C:\\\\Users\\\\nikam\\\\IdeaProjects\\\\filesProject\\\\src\\\\myFiles/data.txt"));
//
//                pt.println(24);
//                pt.println(39);
//                pt.println(-90);
//                pt.close();
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }


//        -----------------------------------------------------------------------------------------------


//        2. 0-დან 100-მდე მთელი რიცხვები ჩაწერეთ data1.txt ფაილში. myFiles საქაღალდეში.


//        try {
//            PrintWriter fileout = new PrintWriter(new FileWriter("C:\\Users\\nikam\\IdeaProjects\\filesProject\\src\\myFiles/data1.txt"));
//
//            for (int i = 0; i < 100; i++) {
//                fileout.println(i);
//            }
//            fileout.close();
//            System.out.println("success...");
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//        -----------------------------------------------------------------------------------------------


//        3. myFiles1 საქაღალდეში საქაღალდეში შექმენით 30 ფაილი, ფაილებში ჩაწერეთ სიტყვა
//„Programmer“.

//        int i = 0;
//
//        while( i <= 30){
//            FileWriter fr = new FileWriter("C:\\Users\\nikam\\IdeaProjects\\filesProject\\src\\myFiles1/file.txt" + i);
//            fr.write("Programmer");
//            fr.close();
//            i++;
//        }


        //        -----------------------------------------------------------------------------------------------

//        4. myFiles2 საქაღალდეში საქაღალდეში შექმენით 30 ფაილი, ფაილებში ჩაწერეთ
//        სიტყვები „Programmer1“, „Programmer2“ .... „Programmer30“.



//        int i = 0;
//
//        while (i<=30){
//            FileWriter fr = new FileWriter("C:\\Users\\nikam\\IdeaProjects\\filesProject\\src\\myFiles2/".concat(i + "file.txt"));
//            fr.write("Programmer" + i);
//            fr.close();
//            i++;
//        }


//        -----------------------------------------------------------------------------------------------


//        5. კლავიატურიდან გადაცემული [a, b] შუალედიდან ჩაწერეთ data2.txt ფაილში 100
//        შემთხვევითი მთელი რიცხვი. ფაილი შექმენით myFiles საქაღალდეში.

//        int n = 100;
//
//        try {
//            FileWriter fw = new FileWriter("C:\\\\Users\\\\nikam\\\\IdeaProjects\\\\filesProject\\\\src\\\\myFiles/file3.txt");
//            BufferedWriter writer = new BufferedWriter(fw);
//            int line;
//            Random random = new Random();
//            while (n > 0){
//                line = random.nextInt(100);
//                writer.write(line + "\n");
//                n--;
//            }
//            writer.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }



//        -----------------------------------------------------------------------------------------------


//
//        6. კლავიატურიდან გადაცემული [a, b] შუალედიდან დაამატეთ data3.txt ფაილში 50
//        შემთხვევითი ნამდვილი რიცხვი. დამატებული რიცხვები გამოყავით მასში არსებული
//        რიცხვებიდან. myFiles საქაღალდეში.

//        int n = 100;
//
//        try {
//            FileWriter fw = new FileWriter("C:\\\\Users\\\\nikam\\\\IdeaProjects\\\\filesProject\\\\src\\\\myFiles/file3.txt", true);
//            PrintWriter pw = new PrintWriter(fw);
//            int line;
//            Random random = new Random();
//            while (n > 0){
//                line = random.nextInt(50);
//                pw.println("added " + line );
//                n--;
//            }
//            pw.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }



 //        -----------------------------------------------------------------------------------------------

//        7. დაწერეთ პროგრამა, რომელიც ფუნქციის მნიშვნელობებს დაითვლის [0; 2 ]
//        შუალედში მეასედების სიზუსტით და შესაბამის მნიშვნელობებს ჩაწერს function.txt
//        ფაილში myFiles საქაღალდეში.





//        -----------------------------------------------------------------------------------------------



//        8. დაწერეთ პროგრამა, რომელიც ფუნქციის მნიშვნელობებს დაითვლის [0; 2 ]
//        შუალედში მეასედების სიზუსტით და შესაბამის მნიშვნელობებს ჩაწერს function.txt
//        ფაილში.





//        -----------------------------------------------------------------------------------------------


//        9. დაწერეთ ფუნქცია, რომელიც ჩაწერს 10 000-ს ‘.txt’ გაფართოების ფაილს myFiles
//        საქაღალდეში, ფაილებში ჩაწერს 1-დან 10 000-მდე რიცხვებს და შესაბამისად ფაილის
//        სახელი იქნება ის რიცხვი რაც ჩაწერილია შესაბამის ფაილში. მაგ(თუ ფაილში
//                ჩაწერილია რიცხვი 12 მაშინ ამ ფაილის სახელი იქნება 12.txt).



//        int i = 0;
//
//        while (i<=10000){
//
//            PrintWriter fr = new PrintWriter("C:\\Users\\nikam\\IdeaProjects\\filesProject\\src\\myFiles/".concat(i + ".txt"));
//            fr.println(i);
//            fr.close();
//            i++;
//        }





//        -----------------------------------------------------------------------------------------------




//        10. დაწერეთ პროგრამა, რომელიც ათობით რიცხვს გადაიყვანს ორობითში.

//        დაიმპორტებულია toBinary packegidan

//        Binary bn = new Binary();
//
//        bn.numToBinary();




//        -----------------------------------------------------------------------------------------------



//        11. დაწერეთ პროგრამა, რომელიც ორობით რიცხვს გადაიყვანს ათობითში.


//        დაიმპორტებულია toDecimal packegidan



//        Decimal dc = new Decimal();
//
//        dc.numToDecimal();



//        -----------------------------------------------------------------------------------------------


//        14. შეიტანეთ ორი a და b რიცხვები, ჩაწერეთ numbers.txt ფაილში ამ რიცხვებს შორის
//        მოთავსებული 40 მთელი რიცხვი, დაადგინეთ რამდენია ლუწი და რამდენი კენტი
//        ფაილში ჩაწერილ რიცხვებს შორის, მოახდინეთ ლუწი რიცხვებისა და კენტი
//        რიცხვების ჯამის გამოტანა ეკრანზე და მიღებულ ჯამებს შორის 5 შემთხვევითი
//        რიცხვი ჩაწეროთ ფაილში numbers2.txt ფაილში.



//        ფაილში ჩანაწერის გაკეთება

//            try {
//                PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\nikam\\IdeaProjects\\filesProject\\src\\Numbers/number.txt"));
//                for (int i = 0 ; i <= 40; i++){
//                pw.println(i);
//            }
//                pw.close();
//                System.out.println("success...");
//
//            }catch (Exception e){
//                System.out.println(e);
//            }
//
//
//
////            ფაილის წაკითხვა
//
//
//            int even = 0, odd = 0;
//
//            try {
//                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nikam\\IdeaProjects\\filesProject\\src\\Numbers/number.txt"));
//                String line;
//                while((line = reader.readLine()) != null){
//
//                    int i = Integer.parseInt(line);
//
//
//                        if(i %2 == 0)
//
//                        {
//                            even = i;
//                        }
//
//                        else
//                        {
//                            odd = i;
//                        }
//
//                }
//                reader.close();
//
//                System.out.println("even length " + even / 2);
//
//                if(odd % 2 != 0){
//                    odd = odd + 1;
//                    int oddLength = odd / 2;
//                    System.out.println("odd length : "  + oddLength);
//
//                    System.out.println( even / 2 + oddLength + " is odd length + even length");
//                }
//
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }















    }
}

