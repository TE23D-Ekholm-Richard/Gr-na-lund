import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int biljetter = 10;

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

case 2:{
    
}
    }
}
        
    }

