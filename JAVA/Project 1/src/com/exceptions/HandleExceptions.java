package com.exceptions;


class notInRangeId extends Exception{
    notInRangeId(String str){
        super(str);
    }
}
class wrongAge extends Exception{
    wrongAge(String str){
        super(str);
    }
}
class noSubjectsChoosen extends Exception{
    noSubjectsChoosen(String str){
        super(str);
    }
}

class Register extends Exception{
    public void registerFrom(int id,int age,int noOfSub ) throws notInRangeId, wrongAge, noSubjectsChoosen {
        if(id>100){
            throw new notInRangeId("Id more than 100");
        }
        if(age>100){
            throw new wrongAge("too old for school");
        }
        if(noOfSub==0){
            throw new noSubjectsChoosen("Please regester for atleast one");
        }
    }
}

public class HandleExceptions {
    public static void main(String[] args)  {

       try{
           Register register=new Register();
           register.registerFrom(200,100,1000);
        }
        catch (notInRangeId | wrongAge | noSubjectsChoosen | NullPointerException e){
            System.out.println(e.getMessage());
        }
       finally {
           System.out.println("Executes anyway");
       }
    }
}
