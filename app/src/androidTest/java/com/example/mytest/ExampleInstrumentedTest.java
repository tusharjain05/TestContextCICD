package com.example.mytest;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.mytest", appContext.getPackageName());
    }

    @Test
    public void checkResourceString() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        String appName = appContext.getString(R.string.app_name);
        assertEquals("MyTest", appName);
    }

    @Test
    public void activityLaunchTest() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertNotNull(appContext);
    }

    @Test
    public void resourceIdCheck() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        int resourceId = appContext.getResources().getIdentifier("app_name", "string", appContext.getPackageName());
        assertNotEquals(0, resourceId);
    }

    @Test
    public void packageNameCheck() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertTrue(appContext.getPackageName().startsWith("com.example"));
    }
}
