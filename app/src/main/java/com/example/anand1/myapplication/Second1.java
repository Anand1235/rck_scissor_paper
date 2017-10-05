package com.example.anand1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;




    public class Second1 extends AppCompatActivity {
        Button b_rock, b_scissor, b_paper;
        ImageView ur_choice, cpu_choice;
        int human,computer;
        TextView textView6,textView8;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            b_rock = (Button)findViewById(R.id.b_rock);
            b_scissor = (Button)findViewById(R.id.b_scissor);
            b_paper = (Button)findViewById(R.id.b_paper);
            ur_choice = (ImageView)findViewById(R.id.ur_choice);
            cpu_choice = (ImageView)findViewById(R.id.cpu_choice);
            textView6 = (TextView)findViewById(R.id.textView6);
            textView8 = (TextView)findViewById(R.id.textView8);

            b_rock.setOnClickListener(new View.OnClickListener() {
                                          @Override

                                          public void onClick(View view) {
                                              ur_choice.setImageResource(R.drawable.rock);
                                              String msg = play_turn("rock");
                                              Toast.makeText(Second1.this,msg, Toast.LENGTH_SHORT).show();
                                              textView6.setText(Integer.toString(human));
                                              textView8.setText(Integer.toString(computer));



                                          }


                                      }
            );
            b_scissor.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 ur_choice.setImageResource(R.drawable.scissor);
                                                 String msg = play_turn("scissor");
                                                 Toast.makeText(Second1.this,msg, Toast.LENGTH_SHORT).show();
                                                 textView6.setText(Integer.toString(human));
                                                 textView8.setText(Integer.toString(computer));





                                             }


                                         }
            );
            b_paper.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               ur_choice.setImageResource(R.drawable.paper);
                                               String msg = play_turn("paper");
                                               Toast.makeText(Second1.this,msg, Toast.LENGTH_SHORT).show();
                                               textView6.setText(Integer.toString(human));
                                               textView8.setText(Integer.toString(computer));




                                           }
                                       }
            );
        }
        public String play_turn (String pc){
            String cc="";
            Random r = new Random();
            int ccn=r.nextInt(3)+1;
            if (ccn==1){
                cc="rock";
            }
            else if (ccn==2) {
                cc = "scissor";
            }
            else if (ccn==3){
                cc="paper";
            }
            if(cc=="rock") {
                cpu_choice.setImageResource(R.drawable.rock);
            }
            else if(cc=="scissor"){
                cpu_choice.setImageResource(R.drawable.scissor);
            }
            else if(cc=="paper"){
                cpu_choice.setImageResource(R.drawable.paper);
            }
            if(cc==pc){
                return "draw";
            }
            else if (pc=="rock" && cc=="scissor"){
                human++;
                return "u win";
            }
            else if (pc=="rock" && cc=="paper"){
                computer++;
                return "u lose";

            }
            else if (pc=="scissor" && cc=="rock"){
                computer++;
                return "u lose";

            }
            else if (pc=="scissor" && cc=="paper"){
                human++;
                return "u win";
            }
            else if(pc=="paper" && cc=="rock"){
                human++;
                return "u win";


            }
            else if(pc=="paper" && cc=="scissor"){
                computer++;
                return "u lose";

            }
            else return "cant";







        };

    }


