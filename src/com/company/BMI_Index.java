package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class BMI_Index {
        public static void main(String[] args) throws IOException{

            float heightArnold , weightArnold, bmiArnold;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("The Program will calculate your BMI");
            System.out.println("Enter your height in cm (and press Enter): ");
            heightArnold = Float.parseFloat(br.readLine())/100;
            System.out.println("Enter your weight in kg (and press Enter): ");
            weightArnold = Float.parseFloat(br.readLine());

            bmiArnold = (float) (weightArnold / (Math.pow(heightArnold, 2)));
            System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiArnold);


            if (bmiArnold < 16){
                System.out.println("You are slim/skinny/suffering from starvation");
            } else if ((bmiArnold >= 16)&&(bmiArnold < 16.99)){
                System.out.println("You're emaciated");
            }else if ((bmiArnold >= 17)&&(bmiArnold < 18.49)){
                System.out.println("You're underweight");
            }else if ((bmiArnold >= 18.50)&&(bmiArnold < 22.99)){
                System.out.println("You're in a low range or the norm");
            }else if ((bmiArnold >= 23)&&(bmiArnold < 24.99)){
                System.out.println("You're in the high range of the norm");
            }else if ((bmiArnold >= 25)&&(bmiArnold < 27.49)){
                System.out.println("You're overweight ot pre-obese");
            }else if ((bmiArnold >= 27.50)&&(bmiArnold < 29.99)){
                System.out.println("You're overweight");
            }else if ((bmiArnold >= 30)&&(bmiArnold < 34.99)){
                System.out.println("You've 1st degree obesity");
            }else if ((bmiArnold >= 35)&&(bmiArnold < 39.99)){
                System.out.println("You've 2nd degree obesity");
            }else if ((bmiArnold > 40)){
                System.out.println("You've 3rd degree obesity");
            }
            
        }

    }

