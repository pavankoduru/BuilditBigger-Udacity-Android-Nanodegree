package com.udacity.gradle.builditbigger.paid;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import com.udacity.gradle.builditbigger.JokesDisplayAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityPaidTest {
    Context context;
    String Joke;

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityPaidTest() {

        context= InstrumentationRegistry.getTargetContext();
       // Assert.assertNotNull(Joke);
        Assert.assertEquals(true,Joke.length());
        Assert.assertNotNull(Joke);
        try {
            Joke=new JokesDisplayAsyncTask().execute(new Pair<Context, String>(context,"")).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* Assert.assertNotEquals(Joke);
        Assert.assertEquals(true,Joke.length());*/


        }
    }
