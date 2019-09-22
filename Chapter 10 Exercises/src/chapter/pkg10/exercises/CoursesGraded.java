/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg10.exercises;

/**
 *
 * @author ben_d
 */
public class CoursesGraded implements Analyzable {
    
    private GradedActivity[] activities;
    
    public CoursesGraded(){
        activities = new GradedActivity[4];
        activities[0] = new GradedActivity();
        activities[1] = new PassFailExam(10, 0, 70);
        activities[2] = new Essay();
        activities[3] = new FinalExam(50, 0);
    }
    
    @Override
    public double getAverage(){
        double total = 0;
        for(int i = 0; i < activities.length; i++){
            total += activities[i].getScore();
        }
        return total / activities.length;
    }
    
    @Override
    public GradedActivity getHighest(){
        int highest = 0;
        double score = activities[0].getScore();
        for(int i = 1; i < activities.length; i++){
            if(activities[i].getScore() > score){
                score = activities[i].getScore();
                highest = i;
            }
        }
        return activities[highest];
    }
    
    @Override
    public GradedActivity getLowest(){
        int lowest = 0;
        double score = activities[0].getScore();
        for(int i = 1; i < activities.length; i++){
            if(activities[i].getScore() < score){
                score = activities[i].getScore();
                lowest = i;
            }
        }
        return activities[lowest];
    }
    
    public void setLab(GradedActivity activity){
        this.activities[0] = new GradedActivity(activity);
    }
    
    public void setPassFailExam(PassFailExam exam){
        this.activities[1] = new PassFailExam(exam);
    }
    
    public void setEssay(Essay essay){
        this.activities[2] = new Essay(essay);
    }
    
    public void setFinalExam(FinalExam exam){
        this.activities[3] = new FinalExam(exam);
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int i = 0; i < activities.length; i++){
            str += "Score: " + activities[i].getScore() + ", Grade: " + activities[i].getGrade() + "\n";
        }
        return str;
    }
    
}
