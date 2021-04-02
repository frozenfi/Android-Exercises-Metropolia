# Android-Exercises-Metropolia

Exercise questions
---------------------------------------------------------------------------------
Lab 02
Do the steps “Create an Android project”, “Run your app”, and “Build a simple user interface” in https://developer.android.com/training/basics/firstapp/index.html Don’t implement the second activity part of the project yet Add 5 different type of UI components to your app and arrange them in a nice way on the main activity. Explain briefly what is the purpose of the UI components you selected as a comment in xml (e.g. <!-- this is a comment -->)
----------------------------------------------------
Create a layout where you have a centered text view at 25% from the top of the display, and a row of three buttons with labels “plus”, “minus”, and “reset” at 25% from the bottom of the display. Buttons should be evenly spaced in horizontal direction. 
--------------------------------------------------------------------------------
Develop an application that has a text field (TextView class instance) to show a counter value (initially zero), and three buttons: plus, minus and reset which manipulate the value by incrementing it by 1, decrementing it by 1, and zeroing it.
----------------------------------------------------------------------------------
Exercise 2-3 but with following additions: counter has minimum, maximum, starting and step values that are defined by constructor parameters when it is created (e.g. try with start value 1 and step of 7). A second constructor without parameters will initiate with default values as (-100, 100, 0, 1). Buttons react to clicks - a click increments/decrements by step. Create a separate Counter class to implement the counter logic - in your activity only call methods of that class (and there should not be any Android specific things in the counter class). Try to encapsulate the counter as much as possible; for example, make the variable that holds the current value private.
----------------------------------------------------------------------------------
Lab 03
Create an application using the previous lab Counter class (code reusing). Now the counter value should be shown in large font, reset button must be an image (name must start with letters only) and there should be a radiogroup containing three radio buttons. Those buttons control how the counter value is displayed, in binary or decimal or hexadecimal numbers.
----------------------------------------------------------------------------------
Lab 04
Complete the tutorial at https://developer.android.com/training/basics/firstapp/ by doing the steps in “Start another activity”. Modify it so, in main activity, instead of message, it will ask for user name and age (2 EditText) and in display activity, it will show text as “Hello XX, you are YY year old” (send XX and YY with values of name and age coming from the EditTexts in main activity as extras to display activity).
--------------------------------------------------------------------------------
Lab 05
Create an application which uses Log.d() method to log (to the logcat output) when a call to the following methods is made: onCreate(), onStart(), onResume(), onPause(), onStop(), onRestart() and onDestroy(). Create also three Counters (use Counter.java from lab 2-4 or lab03 and don’t modify it at all) to count how many times onCreate() and onStart() methods have been called and how many times ‘Hit Me!’ button has been pressed. Create a reset button which resets all counters to zero. The values of these counters must be saved to the SharedPreferences on the onPause() method and retrieved from the SharedPreferences on the onCreate() method.
-------------------------------------------------------------------------------
Lab 06
Create an application which shows a list of presidents. When the president name is tapped, a new activity shows up that displays the name of the president, start and end dates of duty and small description of the president selected. Create a President class which represent the president data and Singleton to hold the President list in your application. You can use the following code to initialize your president list. ADD the president of your home country too
-------------------------------------------------------------------------------




