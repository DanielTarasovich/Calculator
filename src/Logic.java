
public class Logic {
     public int operation(int number, char symbol, int number2){

        int result = 0;

        switch (symbol){
            case '+':{
              result = number+number2;
                System.out.println("Your result: " + result);
              break;
            }
            case '-':{
                result = number-number2;
                System.out.println("Your result: " + result);
                break;
            }
            case '*':{
                result = number*number2;
                System.out.println("Your result: " + result);
                break;
            }
            case '/':{
                result = number/number2;
                System.out.println("Your result: " + result);
                break;
            }
            default:{
                System.out.println("Your result: " + result);
            }

        }
return  result;

    }

}
