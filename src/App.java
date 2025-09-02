import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int biljetter = 10;
        boolean fortsätt  = true;

   while(fortsätt){   
    System.out.println("Välj attraktion");
        System.out.println("1.Pumpen");
        System.out.println("2.Flygande mattan");
        System.out.println("3.Cirkuskarusellen");
        System.out.println("4.Gå hem");

        int val = scanner.nextInt();
    
switch (val) {
    case 1:{
    System.out.println("hur lång e du");
    int längd1 =scanner.nextInt();

    if(längd1 >=140){
        if(biljetter > 3 ){
            biljetter-=3;
            System.out.println("du får åka lets go du har -3 kuponger" + biljetter);
        }
        else
        {
            System.out.println("Inte tillräckligt mycket kuponger");
        }
    }
    else {
        System.out.println("Du är för kort");
    }
    
    }
break;

case 2:
    System.out.println("HUr lång e du");
    int längd2 = scanner.nextInt();
    System.out.println("hUR Gammal är du");
    int ålder = scanner.nextInt();

    if ( längd2 >= 120 && ålder >=7){
        if(biljetter >=2){
            biljetter -=2;
            System.out.println("Du får åka du har " + biljetter + "kvar");
        }
        else{
            System.out.println("Inte tillräcklig kupinger");
        }
    }
    else{
System.out.println("To short buddy");
    }
break;

case 3:

if(biljetter>=1){
    biljetter-=1;
    System.out.println("Du får åka du har  biljetter kvar" + biljetter);
} else{
    System.out.println("Broke behöver mer kuponger.");
}
break;

case 4: 
System.out.println("Du går hem tack för idag");

fortsätt=false;
break;

default:
System.out.println("Fel val try again");
    }
    if(biljetter==0){
        System.out.println("Hej då du har slut med kuponger");
        fortsätt = false;
    }
    
}
}
    }
    

