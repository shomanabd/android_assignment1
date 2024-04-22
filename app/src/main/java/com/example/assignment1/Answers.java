package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Answers {


 static    private List<String> answers;

 static void add(double answer){
     if(answers==null)
         answers=new ArrayList<>();
     answers.add("Test "+(answers.size()+1)+" result: "+answer*100+ "%");
 }

 static List<String> getAllAnswers(){
     return answers;
 }


}
