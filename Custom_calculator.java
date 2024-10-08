class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()"; 
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide a number with 0";
    }

    @Override
    public String getMessage(){
        return "I am a getMessage()";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater than 100000";
    }
    @Override
    public String getMessage(){
        return "I am a getMessage()";
    }
}

class MaxMultiplyException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater than 7000 while multiplying";
    }
    @Override
    public String getMessage(){
        return "I am a getMessage()";
    }
}
class CustomCalculator{
    double add(double a,double b) throws InvalidInputException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        if(a==8||b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }

    double subtract(double a,double b) throws MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }

    double multiply(double a,double b) throws MaxInputException,MaxMultiplyException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        else if(a>7000||b>7000){
            throw new MaxMultiplyException();
        }
        return a*b;
    }

    double divide(double a,double b) throws CannotDivideByZeroException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class Custom_calculator {
    public static void main(String[] args) throws CannotDivideByZeroException,MaxInputException,InvalidInputException,MaxMultiplyException{
        CustomCalculator c= new CustomCalculator();
        c.add(10,5);
        c.multiply(10, 990);
        c.divide(12,0);
    }
}
