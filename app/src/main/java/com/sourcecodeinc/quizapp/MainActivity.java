package com.sourcecodeinc.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variable that stores the score for the quiz.
    private int score = 0;

    //Variable for question one radio group.
    private RadioGroup questionOneRadioGroup;

    //Variable for question two radio group.
    private RadioGroup questionTwoRadioGroup;

    //Variables for question three
    private CheckBox nigeriaCheckBox;
    private CheckBox switzerlandCheckBox;
    private CheckBox swazilandCheckBox;
    private CheckBox nairobiCheckBox;
    private CheckBox kenyaCheckBox;

    //Variable for question four edit text question.
    private EditText editTextMostPopulatedCountry;

    //Variables for question five.
    private CheckBox beninCheckBox;
    private CheckBox ghanaCheckBox;
    private CheckBox ivoryCoastCheckBox;
    private CheckBox moroccoCheckBox;
    private CheckBox zimbabweCheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method gets called when the accra button is clicked
     */
    public void accraOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        questionOneRadioGroup = (RadioGroup) findViewById(R.id.question_one_radioGroup);

        int answerAccraId = 0;

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerAccraId = questionOneRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException npe) {
            Log.e("Null exception thrown", "" + npe);
        }

        //Perform an action based on the option chosen.
        if (answerAccraId == R.id.accra_radio_button) {
            getScore(1);
        }
    }

    /**
     * This method gets called when the london button is clicked.
     */
    public void londonOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        questionOneRadioGroup = (RadioGroup) findViewById(R.id.question_one_radioGroup);

        int answerLondonId = 0;

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerLondonId = questionOneRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException npe) {
            Log.e("Null exception thrown", "" + npe);
        }

        //Perform an action based on the option chosen.
        if (answerLondonId == R.id.london_radio_button) {
            getScore(0);
        }
    }

    /**
     * This method gets called when the kumasi button is clicked.
     */
    public void kumasiOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        questionOneRadioGroup = (RadioGroup) findViewById(R.id.question_one_radioGroup);

        int answerKumasiId = 0;

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerKumasiId = questionOneRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException npe) {
            Log.e("Null exception thrown", "" + npe);
        }

        //Perform an action based on the option chosen.
        if (answerKumasiId == R.id.kumasi_radio_button) {
            getScore(0);
        }
    }

    /**
     * This method gets called when the capeCoast button is clicked.
     */
    public void capeCoastOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        questionOneRadioGroup = (RadioGroup) findViewById(R.id.question_one_radioGroup);

        int answerCapeCoastId = 0;

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerCapeCoastId = questionOneRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException npe) {
            Log.e("Null exception thrown", "" + npe);
        }

        //Perform an action based on the option chosen.
        if (answerCapeCoastId == R.id.capeCoast_radio_button) {
            getScore(0);
        }
    }


    /**
     * This method gets called when the abuja button is clicked
     */
    public void abujaOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        int answerAbujaId = 0;
        questionTwoRadioGroup = (RadioGroup) findViewById(R.id.question_two_radioGroup);

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerAbujaId = questionTwoRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException e) {
            Log.e("question two", "" + e);
        }

        //Perform an action based on the option chosen.
        if (answerAbujaId == R.id.abuja_radio_button) {
            getScore(1);
        }
    }

    /**
     * This method gets called when the lagos button is clicked
     */
    public void lagosOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        int answerLagosId = 0;
        questionTwoRadioGroup = (RadioGroup) findViewById(R.id.question_two_radioGroup);

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerLagosId = questionTwoRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException e) {
            Log.e("question two", "" + e);
        }

        //Perform an action based on the option chosen.
        if (answerLagosId == R.id.lagos_radio_button) {
            getScore(0);
        }
    }

    /**
     * This method gets called when the kigali button is clicked
     */
    public void kigaliOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        int answerKigaliId = 0;
        questionTwoRadioGroup = (RadioGroup) findViewById(R.id.question_two_radioGroup);

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerKigaliId = questionTwoRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException e) {
            Log.e("question two", "" + e);
        }

        //Perform an action based on the option chosen.
        if (answerKigaliId == R.id.kigali_radio_button) {
            getScore(0);
        }
    }

    /**
     * This method gets called when the cario button is clicked
     */
    public void carioOnClick(View view) {
        //find the id of the radio group and store it in a variable.
        int answerCarioId = 0;
        questionTwoRadioGroup = (RadioGroup) findViewById(R.id.question_two_radioGroup);

        //Get the id of the RadioButton that is checked and store it as an integer variable.
        try {
            answerCarioId = questionTwoRadioGroup.getCheckedRadioButtonId();
        } catch (NullPointerException e) {
            Log.e("question two", "" + e);
        }

        //Perform an action based on the option chosen.
        if (answerCarioId == R.id.cario_radio_button) {
            getScore(0);
        }
    }

    /**
     * This method gets called when a check box is selected
     */
    private void questionThree() {
        nigeriaCheckBox = (CheckBox) findViewById(R.id.nigeria_check_box);
        switzerlandCheckBox = (CheckBox) findViewById(R.id.switzerland_check_box);
        swazilandCheckBox = (CheckBox) findViewById(R.id.swaziland_check_box);
        nairobiCheckBox = (CheckBox) findViewById(R.id.nairobi_check_box);
        kenyaCheckBox = (CheckBox) findViewById(R.id.kenya_check_box);

        if (nigeriaCheckBox.isChecked() & swazilandCheckBox.isChecked() & kenyaCheckBox.isChecked()
                && nairobiCheckBox.isChecked() & switzerlandCheckBox.isChecked()) {
            getScore(0);
        } else if ((nigeriaCheckBox.isChecked() & swazilandCheckBox.isChecked()
                & kenyaCheckBox.isChecked()) && (nairobiCheckBox.isChecked())
                | (switzerlandCheckBox.isChecked())) {
            getScore(0);
        } else if (nigeriaCheckBox.isChecked() & swazilandCheckBox.isChecked()
                & kenyaCheckBox.isChecked()) {
            getScore(1);
        }
    }

    /**
     * This method gets called when the editText view is clicked
     */
    private void questionFour() {
        editTextMostPopulatedCountry = (EditText) findViewById(R.id.populated_country_edit_view);
        String nameOfCountry = "";
        try {
            nameOfCountry = editTextMostPopulatedCountry.getText().toString();
        } catch (NullPointerException e) {
            Log.e("question four", "" + e);
        }

        String answer = "nigeria";
        if (nameOfCountry.equalsIgnoreCase(answer)) {
            getScore(1);
        } else {
            getScore(0);
        }
    }

    /**
     * This method gets called when a check box is selected from question five.
     */
    private void questionFive() {
        beninCheckBox = (CheckBox) findViewById(R.id.benin_check_box);
        ghanaCheckBox = (CheckBox) findViewById(R.id.ghana_check_box);
        ivoryCoastCheckBox = (CheckBox) findViewById(R.id.ivory_coast_check_box);
        moroccoCheckBox = (CheckBox) findViewById(R.id.morocco_check_box);
        zimbabweCheckBox = (CheckBox) findViewById(R.id.zimbabwe_check_box);

        if (beninCheckBox.isChecked() & ghanaCheckBox.isChecked() & ivoryCoastCheckBox.isChecked()
                && moroccoCheckBox.isChecked() & zimbabweCheckBox.isChecked()) {
            getScore(0);
        } else if ((beninCheckBox.isChecked() & ghanaCheckBox.isChecked()
                & ivoryCoastCheckBox.isChecked())
                && (moroccoCheckBox.isChecked()) | (zimbabweCheckBox.isChecked())) {
        } else if (beninCheckBox.isChecked() & ghanaCheckBox.isChecked()
                & ivoryCoastCheckBox.isChecked()) {
            getScore(1);
        }
    }

    /**
     * Calculates the score for the quiz application.
     * @param current_score takes in an integer value.
     */
    private void getScore(int current_score) {
        score += current_score;
    }

    /**
     * This method that gets the score of the quiz toasted to the screen
     * when the submit quiz button is clicked
     */
    private void toastScore() {
        Context context = getApplicationContext();
        CharSequence text = "Your score is " + score;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method gets called when the submit button is clicked.
     * This method  toasts the score of the quiz it to the screen,
     * then calls the reset method to reset every radio button, checked box
     * and edit text, and also resets the score of the quiz back to zero.
     */
    public void submitQuiz(View view) {
        questionThree();
        questionFour();
        questionFive();
        toastScore();
        reset();
    }

    /**
     * This is a reset method of the quiz app.
     */
    private void reset() {
        score = 0;  //Resets the score of the quiz.

        //Resets the Question One Radio Group Buttons.
        if (questionOneRadioGroup != null) {
            questionOneRadioGroup.clearCheck();
        }

        //Resets the Question Two Radio Group Buttons.
        if (questionTwoRadioGroup != null) {
            questionTwoRadioGroup.clearCheck();
        }

        //Resets the Question Three Check Boxes.
        if (nairobiCheckBox.isChecked() == true) {
            nairobiCheckBox.setChecked(false);
        }
        if (nigeriaCheckBox.isChecked() == true) {
            nigeriaCheckBox.setChecked(false);
        }
        if (swazilandCheckBox.isChecked() == true) {
            swazilandCheckBox.setChecked(false);
        }
        if (switzerlandCheckBox.isChecked() == true) {
            switzerlandCheckBox.setChecked(false);
        }
        if (kenyaCheckBox.isChecked() == true) {
            kenyaCheckBox.setChecked(false);
        }

        //Resets the Question Four Edit Text.
        editTextMostPopulatedCountry.setText("");

        //Resets the Question Five Check Boxes.
        if (beninCheckBox.isChecked() == true) {
            beninCheckBox.setChecked(false);
        }
        if (ghanaCheckBox.isChecked() == true) {
            ghanaCheckBox.setChecked(false);
        }

        if (moroccoCheckBox.isChecked() == true) {
            moroccoCheckBox.setChecked(false);
        }

        if (ivoryCoastCheckBox.isChecked() == true) {
            ivoryCoastCheckBox.setChecked(false);
        }

        if (zimbabweCheckBox.isChecked() == true) {
            zimbabweCheckBox.setChecked(false);
        }
    }
}
