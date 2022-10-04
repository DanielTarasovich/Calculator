import java.util.Scanner;

public class Operands {
static Scanner sc = new Scanner(System.in);


public  int getInt(){
int operanda = 0;
if(sc.hasNextInt()){
    operanda = sc.nextInt();
}else {
    System.out.println("Please, write a number");
    sc.next();
}
return operanda;
}


public  char getChar(){
   char symbol=0;

    if(sc.hasNext()){
        symbol = sc.next().charAt(0);
    }else {
        System.out.println("Please, write a symbol");
        sc.next();
    }
    return symbol;
}

}
