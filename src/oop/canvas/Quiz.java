package oop.canvas;

public class Quiz {
/*  - declare these `instance variables`:
    - topic (String)
    - total number of questions (int)
    - total points (double)

  - create a `constructor` to initialize all the variables

  - create a void instance method: `takeQuiz()`
    - the method will print:
      > Taking the $topic quiz

  - create a `toString()` to print the Quiz objects in this format:
    > Quiz | $topic quiz with $questions questions for a total of $point total points
---*/
    public String topic;
    public  int totalNumberOfQuestions;
    public  double totalPoints;

    public Quiz(String topic, int totalNumberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeQuiz(){
        System.out.println("Taking the "+topic+" quiz");
    }


    public String toString() {
        return "> Quiz | "+topic+" quiz with "+totalNumberOfQuestions+" for a total of "+totalPoints;
    }
}
