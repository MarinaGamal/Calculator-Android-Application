package com.example.calculator;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView Screen;
    Button No0;
    Button No1;
    Button No2;
    Button No3;
    Button No4;
    Button No5;
    Button No6;
    Button No7;
    Button No8;
    Button No9;
    Button addition;
    Button subtract;
    Button multiply;
    Button divide;
    Button clear;
    Button delete;
    Button dot;
    Button sign;
    Button equals;
    Button modulus;
    Calculator Calc = new Calculator();
    double firstOp;
    double secondOp;
    char operator;
    boolean operatorIsPressed;
    boolean EqualIsPressed;
    boolean operandIsPressed;
    boolean isPressed = false;
    boolean HoldOperation = false;
    boolean errorFlag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen = (TextView) findViewById(R.id.textView);
        No0 = (Button) findViewById(R.id.button0);
        No1 = (Button) findViewById(R.id.button1);
        No2 = (Button) findViewById(R.id.button2);
        No3 = (Button) findViewById(R.id.button3);
        No4 = (Button) findViewById(R.id.button4);
        No5 = (Button) findViewById(R.id.button5);
        No6 = (Button) findViewById(R.id.button6);
        No7 = (Button) findViewById(R.id.button7);
        No8 = (Button) findViewById(R.id.button8);
        No9 = (Button) findViewById(R.id.button9);
        addition = (Button) findViewById(R.id.buttonAdd);
        subtract = (Button) findViewById(R.id.buttonSubtract);
        multiply = (Button) findViewById(R.id.buttonMultiply);
        divide = (Button) findViewById(R.id.buttonDivision);
        clear = (Button) findViewById(R.id.buttonClear);
        delete = (Button) findViewById(R.id.buttonDelete);
        dot = (Button) findViewById(R.id.buttonDot);
        sign = (Button) findViewById(R.id.buttonSign);
        equals = (Button) findViewById(R.id.buttonEqual);
        modulus = (Button) findViewById(R.id.buttonModulus);

        Screen.setText("0");


        View.OnClickListener NumbersListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                InputFilter[] filterArray = new InputFilter[1];
                filterArray[0] = new InputFilter.LengthFilter(10);
                Screen.setFilters(filterArray);
                if (!errorFlag)
                {
                    switch (v.getId())
                    {
                        case R.id.button0:
                            {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().toString().equals(""))
                                {
                                    String number = Screen.getText() + "0";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                                else if (Screen.getText().toString().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "0";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    } else {
                                        Screen.setText("0");
                                    }
                                }
                                else {
                                    String number = Screen.getText() + "0";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }

                            }
                            else {
                                if (Screen.getText().toString().equals(""))
                                {
                                    operatorIsPressed = false;
                                    Screen.setText("");
                                    String number = Screen.getText() + "0";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                                else if (Screen.getText().toString().charAt(0) == '0')
                                {

                                }
                                else {
                                    operatorIsPressed = false;
                                    Screen.setText("");
                                    String number = Screen.getText() + "0";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }

                            }
                            break;
                        }
                        case R.id.button1: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed) {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "1";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "1";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                }
                                else {
                                    String number = Screen.getText() + "1";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "1";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.button2: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "2";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "2";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }

                                }
                                else {
                                    String number = Screen.getText() + "2";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "2";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.button3: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "3";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "3";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                }
                                else {
                                    String number = Screen.getText() + "3";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "3";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.button4: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            System.out.println(Screen.getText());
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "4";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "4";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                }
                                else {
                                    String number = Screen.getText() + "4";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "4";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.button5: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "5";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "5";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }

                                }
                                else {
                                    String number = Screen.getText() + "5";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "5";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.button6: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "6";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "6";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }

                                }
                                else {
                                    String number = Screen.getText() + "6";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "6";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.button7: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "7";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "7";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                }
                                else {
                                    String number = Screen.getText() + "7";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "7";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }

                            break;
                        }
                        case R.id.button8: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "8";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "8";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }

                                }
                                else {
                                    String number = Screen.getText() + "8";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "8";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }

                            break;
                        }
                        case R.id.button9: {
                            operandIsPressed = true;
                            HoldOperation = false;
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().charAt(0) == '0')
                                {
                                    if (Screen.getText().length() > 1)
                                    {
                                        String number = Screen.getText() + "9";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                    else {
                                        Screen.setText("");
                                        String number = Screen.getText() + "9";
                                        Screen.setText(number);
                                        EqualIsPressed = false;
                                    }
                                }
                                else {
                                    String number = Screen.getText() + "9";
                                    Screen.setText(number);
                                    EqualIsPressed = false;
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                Screen.setText("");
                                String number = Screen.getText() + "9";
                                Screen.setText(number);
                                EqualIsPressed = false;
                            }
                            break;
                        }
                        case R.id.buttonDot: {
                            if (!operatorIsPressed)
                            {
                                if (Screen.getText().toString().contains("."))
                                {

                                }
                                else {
                                    String number = Screen.getText() + ".";
                                    Screen.setText(number);
                                }
                            }
                            else {
                                operatorIsPressed = false;
                                if (Screen.getText().toString().contains(".")) {

                                }
                                else {
                                    String number = Screen.getText() + ".";
                                    Screen.setText(number);
                                }
                            }

                            break;

                        }
                        default:
                            break;
                    }
                }
            }
        };

        View.OnClickListener OperatorsListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!errorFlag) {
                    switch (v.getId()) {
                        case R.id.buttonAdd: {
                            if (operandIsPressed) {
                                if (!isPressed) {
                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = '+';
                                    operatorIsPressed = true;
                                    isPressed = true;
                                    HoldOperation = true;
                                } else {
                                    if (!HoldOperation) {
                                        if (operator == '+') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.addition(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '+';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '-') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.subtraction(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '+';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == 'x') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.multiplication(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '+';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '/') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.division(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '+';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        }
                                    }


                                }
                            }
                            break;
                        }
                        case R.id.buttonSubtract: {
                            if (operandIsPressed) {
                                if (!isPressed) {
                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = '-';
                                    operatorIsPressed = true;
                                    isPressed = true;
                                    HoldOperation = true;
                                } else {
                                    if (!HoldOperation) {
                                        if (operator == '+') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.addition(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '-';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '-') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.subtraction(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '-';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == 'x') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.multiplication(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '-';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '/') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.division(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '-';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        }
                                    }

                                }
                            }
                            break;

                        }
                        case R.id.buttonMultiply:
                            if (operandIsPressed) {
                                if (!isPressed) {
                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = 'x';
                                    operatorIsPressed = true;
                                    isPressed = true;
                                    HoldOperation = true;
                                } else {
                                    if (!HoldOperation) {
                                        if (operator == '+') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.addition(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = 'x';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '-') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.subtraction(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = 'x';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == 'x') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.multiplication(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = 'x';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '/') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.division(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = 'x';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        }
                                    }


                                }
                            }
                            break;
                        case R.id.buttonDivision:
                            if (operandIsPressed) {
                                if (!isPressed) {
                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = '/';
                                    operatorIsPressed = true;
                                    isPressed = true;
                                    HoldOperation = true;
                                } else {
                                    if (!HoldOperation) {
                                        if (operator == '+') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.addition(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '/';
                                            operatorIsPressed = true;
                                            HoldOperation = true;

                                        } else if (operator == '-') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.subtraction(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '/';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == 'x') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.multiplication(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '/';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        } else if (operator == '/') {
                                            secondOp = Double.parseDouble(Screen.getText().toString());
                                            double answer = Calc.division(firstOp, secondOp);
                                            String stringanswer = String.valueOf(answer);
                                            if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                                DecimalFormat formatter = new DecimalFormat("#.##E0");
                                                String s = formatter.format(answer);
                                                Screen.setText(s + "");
                                            } else
                                                Screen.setText(stringanswer + "");
                                            firstOp = Double.parseDouble(Screen.getText().toString());
                                            operator = '/';
                                            operatorIsPressed = true;
                                            HoldOperation = true;
                                        }
                                    }
                                }
                            }
                            break;

                        case R.id.buttonEqual:
                            if (operandIsPressed) {
                                secondOp = Double.parseDouble(Screen.getText().toString());
                                operatorIsPressed = true;
                                EqualIsPressed = true;
                                isPressed = false;
                                if (operator == '+') {
                                    double answer = Calc.addition(firstOp, secondOp);
                                    String stringanswer = String.valueOf(answer);
                                    if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                        DecimalFormat formatter = new DecimalFormat("#.##E0");
                                        String s = formatter.format(answer);
                                        Screen.setText(s + "");
                                    } else
                                        Screen.setText(stringanswer + "");
                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = ' ';

                                } else if (operator == '-') {
                                    double answer = Calc.subtraction(firstOp, secondOp);
                                    String stringanswer = String.valueOf(answer);
                                    if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                        DecimalFormat formatter = new DecimalFormat("#.##E0");
                                        String s = formatter.format(answer);
                                        Screen.setText(s + "");
                                    } else
                                        Screen.setText(stringanswer + "");
                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = ' ';
                                } else if (operator == 'x') {
                                    double answer = Calc.multiplication(firstOp, secondOp);
                                    String stringanswer = String.valueOf(answer);
                                    if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                        DecimalFormat formatter = new DecimalFormat("#.##E0");
                                        String s = formatter.format(answer);
                                        Screen.setText(s + "");
                                    } else
                                        Screen.setText(stringanswer + "");

                                    firstOp = Double.parseDouble(Screen.getText().toString());
                                    operator = ' ';
                                } else if (operator == '/') {
                                    try {
                                        double answer = Calc.division(firstOp, secondOp);
                                        String stringanswer = String.valueOf(answer);
                                        if (stringanswer.contains("e") || stringanswer.contains("E")) {
                                            DecimalFormat formatter = new DecimalFormat("#.##E0");
                                            String s = formatter.format(answer);
                                            Screen.setText(s + "");
                                        } else
                                            Screen.setText(stringanswer + "");
                                        firstOp = Double.parseDouble(Screen.getText().toString());
                                        operator = ' ';
                                    } catch (Exception e) {
                                        Screen.setText("Math Error");
                                        errorFlag = true;
                                    }
                                }
                            }
                            break;
                        case R.id.buttonModulus:
                            if (operandIsPressed) {
                                firstOp = Double.parseDouble(Screen.getText().toString());
                                Screen.setText(Calc.modulus(firstOp) + "");
                                firstOp = Double.parseDouble(Screen.getText().toString());

                            }
                            break;

                        default:
                            break;
                    }
                }
            }
        };

        View.OnClickListener ClearListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText("0");
                operandIsPressed = false;
                firstOp = 0;
                secondOp = 0;
                operator = ' ';
                isPressed = false;
                HoldOperation = false;
                errorFlag = false;

            }
        };

        View.OnClickListener SignListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!errorFlag) {
                    InputFilter[] filterArray = new InputFilter[1];
                    if (!Screen.getText().toString().contains("-")) {

                        filterArray[0] = new InputFilter.LengthFilter(11);
                        Screen.setFilters(filterArray);
                    } else {
                        filterArray[0] = new InputFilter.LengthFilter(10);
                        Screen.setFilters(filterArray);
                    }
                    if (operandIsPressed) {
                        double number = Double.parseDouble(Screen.getText().toString().replaceAll(",", ""));
                        if (number == 0) {
                        } else {

                            number = number * -1;
                            BigDecimal bd = new BigDecimal(number);
                            DecimalFormat formatter = new DecimalFormat("#,###,###");
                            String yourFormattedAnswer = formatter.format(bd);
                            Screen.setText(bd + "");

                        }
                    }
                }

            }
        };


        View.OnClickListener DeleteListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!errorFlag) {
                    if (!EqualIsPressed) {
                        String text = Screen.getText().toString();
                        if (text.length() > 1) {

                            text = text.substring(0, text.length() - 1);
                            Screen.setText(text);
                        } else if (text.length() <= 1) {
                            Screen.setText("0");
                        }
                    } else {

                    }
                }
            }
        };
        No0.setOnClickListener(NumbersListener);
        No1.setOnClickListener(NumbersListener);
        No2.setOnClickListener(NumbersListener);
        No3.setOnClickListener(NumbersListener);
        No4.setOnClickListener(NumbersListener);
        No5.setOnClickListener(NumbersListener);
        No6.setOnClickListener(NumbersListener);
        No7.setOnClickListener(NumbersListener);
        No8.setOnClickListener(NumbersListener);
        No9.setOnClickListener(NumbersListener);
        dot.setOnClickListener(NumbersListener);
        addition.setOnClickListener(OperatorsListener);
        subtract.setOnClickListener(OperatorsListener);
        multiply.setOnClickListener(OperatorsListener);
        divide.setOnClickListener(OperatorsListener);
        equals.setOnClickListener(OperatorsListener);
        modulus.setOnClickListener(OperatorsListener);
        clear.setOnClickListener(ClearListener);
        sign.setOnClickListener(SignListener);
        delete.setOnClickListener(DeleteListener);

    }
}

