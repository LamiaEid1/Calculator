public class Calculator {
    public static double calculator(double firstNum, char opp, double secondNum ){
        double result = 0;
        switch (opp) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum - secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/' :
            if (secondNum != 0) {
                result = firstNum / secondNum;
            }else{
                System.out.println("Error: Division by zero.");
                return Double.NaN;
            }
                break;
            default: 
              System.out.println("Not valid choice.");
                break;
        }
        return result;
    }
 
}
