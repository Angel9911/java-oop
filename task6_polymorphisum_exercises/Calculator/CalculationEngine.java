package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Calculator;

public class CalculationEngine {

    private int result;
    private Operation currentOperation;

    public CalculationEngine() {
        this.result = 0;
        this.currentOperation = null;
    }

    public void pushNumber(int number){
        if(this.currentOperation != null){
            this.currentOperation.operation(number);
            if(this.currentOperation.getNumbers().size() == 2){
                this.result = this.currentOperation.getResult();
                this.currentOperation = null;
            }
        }else{
            this.result = number;
        }

    }
    public void pushOperations(Operation operation){
        if(this.currentOperation.getNumbers().size() == 2){
            this.currentOperation.addOperand(this.currentOperation.getResult());
        } else {
            this.currentOperation = operation;
            this.currentOperation.addOperand(this.result);
        }
    }
    public int getResult() {
        return result;
    }
}
