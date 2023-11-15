package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Operation {
    private final List<Integer> numbers;
    private int result;

    public Operation() {
        this.numbers = new ArrayList<>();
    }

    public abstract void operation(int number);

    public void addOperand(int number){
        this.numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int numbersSize(){
        return this.numbers.size();
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return this.result;
    }
}
