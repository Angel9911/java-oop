package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Calculator;

public class MultiplicationOperation extends Operation{

    public MultiplicationOperation() {
        super();
    }

    @Override
    public void operation(int number) {
        if(super.numbersSize()==2){
            int result = super.getNumbers().get(0) * super.getNumbers().get(1);
            super.setResult(result);
        }else{
            super.addOperand(number);
        }
    }
}
