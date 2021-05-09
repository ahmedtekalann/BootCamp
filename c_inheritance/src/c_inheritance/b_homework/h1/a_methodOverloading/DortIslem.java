package c_inheritance.b_homework.h1.a_methodOverloading;

public class DortIslem {
	
	public int addition(int num1, int num2){
        return num1+num2;
    }
    public int addition(int... numbers){
        int sum=0;
        for (Integer number : numbers){
            sum+=number;
        }
        return sum;
    }    

}
