package com.pavan.libjokes;

import java.util.Random;

public class MyJokeClass {
    public static final String[] jokes={"StandupComedybyManoj","ExtraJabardasth","Jabardasth"};
    public static String getJokes()
    {
        Random random=new Random();
        int s=random.nextInt(jokes.length);
        return jokes[s];
    }
}
