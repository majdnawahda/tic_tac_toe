package com.example.majd.tic_tac_toe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {
Button button1,button2,button3,button4,button5,button6,button7,button8,button9,again;
   String [][] table=new String[3][3];
    int player=0;
    public int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        again=(Button)findViewById(R.id.again);
        initializ();
        press();

   }


    public void press()
    {

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(player==0) {
                    table [0][0]="x";
                    player=1;
                    button1.setClickable(false);
                    button1.setTextColor(Color.parseColor("#ff0000"));
                    button1.setText("X");}
                else if(player==1){
                    table[0][0]="o";
                    player=0;
                    button1.setClickable(false);
                    button1.setTextColor(Color.parseColor("#0000ff"));
                    button1.setText("O");}
                check();

                if(count==9){
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(player==0) {table [0][1]="x";
                    player=1;
                    button2.setClickable(false);
                    button2.setTextColor(Color.parseColor("#ff0000"));
                    button2.setText("X");
                }
                else if(player==1){table[0][1]="o";
                    player=0;
                    button2.setClickable(false);
                    button2.setTextColor(Color.parseColor("#0000ff"));
                    button2.setText("O");}
                check();

                if(count==9){
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(player==0) {table [0][2]="x";
                    player=1;
                    button3.setClickable(false);
                    button3.setTextColor(Color.parseColor("#ff0000"));
                    button3.setText("X");}
                else if(player==1){table[0][2]="o";
                    player=0;
                    button3.setClickable(false);
                    button3.setTextColor(Color.parseColor("#0000ff"));
                    button3.setText("O");}

                check();
                if(count==9){
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(player==0) {
                    table [1][0]="x";
                    player=1;
                    button4.setClickable(false);
                    button4.setTextColor(Color.parseColor("#ff0000"));
                    button4.setText("X");}
                else if(player==1){
                    table[1][0]="o";
                    player=0;
                    button4.setClickable(false);
                    button4.setTextColor(Color.parseColor("#0000ff"));
                    button4.setText("O");}
                check();
                if(count==9){
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(player==0) {
                    table [1][1]="x";
                    player=1;
                    button5.setClickable(false);
                    button5.setTextColor(Color.parseColor("#ff0000"));
                    button5.setText("X");}
                else if(player==1){
                    table[1][1]="o";
                    player=0;
                    button5.setClickable(false);
                    button5.setTextColor(Color.parseColor("#0000ff"));
                    button5.setText("O");}

                check();
                if(count==9){
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (player == 0) {
                    table[1][2] = "x";
                    player = 1;
                    button6.setClickable(false);
                    button6.setTextColor(Color.parseColor("#ff0000"));
                    button6.setText("X");
                } else if (player == 1) {
                    table[1][2] = "o";
                    player = 0;
                    button6.setClickable(false);
                    button6.setTextColor(Color.parseColor("#0000ff"));
                    button6.setText("O");
                }

                check();
                if (count == 9) {
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (player == 0) {
                    table[2][0] = "x";
                    player = 1;
                    button7.setClickable(false);
                    button7.setTextColor(Color.parseColor("#ff0000"));
                    button7.setText("X");
                } else if (player == 1) {
                    table[2][0] = "o";
                    player = 0;
                    button7.setClickable(false);
                    button7.setTextColor(Color.parseColor("#0000ff"));
                    button7.setText("O");
                }

                check();
                if (count == 9) {
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(player==0) {
                    table [2][1]="x";
                    player=1;
                    button8.setClickable(false);
                    button8.setTextColor(Color.parseColor("#ff0000"));
                    button8.setText("X");}
                else if(player==1){
                    table[2][1]="o";
                    player=0;
                    button8.setClickable(false);
                    button8.setTextColor(Color.parseColor("#0000ff"));
                    button8.setText("O");}

                check();
                if(count==9){
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (player == 0) {
                    table[2][2] = "x";
                    player = 1;
                    button9.setTextColor(Color.parseColor("#ff0000"));
                    button9.setText("X");
                    button9.setClickable(false);
                } else if (player == 1) {
                    table[2][2] = "o";
                    player = 0;
                    button9.setClickable(false);
                    button9.setTextColor(Color.parseColor("#0000ff"));
                    button9.setText("O");
                }

                check();

                if (count == 9) {
                    Toast.makeText(getBaseContext(), "no One Winner .. try again", Toast.LENGTH_SHORT).show();
                    stop();

                }
            }
        });

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initializ();

            }
        });
    }

    public void check() {

        //check horizantal
        for (int i = 0; i != 3; ++i) {
            if (table[i][0] == "x" && table[i][1] == "x" && table[i][2] == "x") {

                Toast.makeText(this,"X winner",Toast.LENGTH_SHORT).show();
                initializ();
                stop();
            }
        }

        for (int i = 0; i != 3; ++i) {
            if (table[i][0] == "o" && table[i][1] == "o" && table[i][2] == "o") {

                Toast.makeText(this,"O winner",Toast.LENGTH_SHORT).show();
                stop();

            }
        }
//check vertical
        for (int i = 0; i != 3; ++i)
        {
            if (table[0][i] == "x" && table[1][i] == "x" && table[2][i] == "x")
            {
                Toast.makeText(this,"X winner",Toast.LENGTH_SHORT).show();
                stop();

            }
        }

        for (int i = 0; i != 3; ++i)
        {
            if (table[0][i] == "o" && table[1][i] == "o" && table[2][i] == "o")
            {
                Toast.makeText(this,"O winner",Toast.LENGTH_SHORT).show();
                stop();
            }
        }


        //check diagonals

        if (table[0][0] == "o" && table[1][1] == "o" && table[2][2] == "o")
        {
            Toast.makeText(this,"O winner",Toast.LENGTH_SHORT).show();
            stop();
        }

        if (table[0][0] == "x" && table[1][1] == "x" && table[2][2] == "x")
        {
            Toast.makeText(this,"X winner",Toast.LENGTH_SHORT).show();
            stop();

        }

        if (table[0][2] == "o" && table[1][1] == "o" && table[2][0] == "o")
        {
            Toast.makeText(this,"O winner",Toast.LENGTH_SHORT).show();
            stop();


        }

        if (table[0][2] == "x" && table[1][1] == "x" && table[2][0] == "x")
        {
            Toast.makeText(this,"X winner",Toast.LENGTH_SHORT).show();
            stop();
    }


    }

    protected void initializ()
    {
        player=0;
        count=0;
        button1 =(Button)findViewById(R.id.B1);
        button2 =(Button)findViewById(R.id.B2);
        button3 =(Button)findViewById(R.id.B3);
        button4 =(Button)findViewById(R.id.B4);
        button5 =(Button)findViewById(R.id.B5);
        button6 =(Button)findViewById(R.id.B6);
        button7 =(Button)findViewById(R.id.B7);
        button8 =(Button)findViewById(R.id.B8);
        button9 =(Button)findViewById(R.id.B9);

        button1.setTextColor(Color.BLACK);
        button2.setTextColor(Color.BLACK);
        button3.setTextColor(Color.BLACK);
        button4.setTextColor(Color.BLACK);
        button5.setTextColor(Color.BLACK);
        button6.setTextColor(Color.BLACK);
        button7.setTextColor(Color.BLACK);
        button8.setTextColor(Color.BLACK);
        button9.setTextColor(Color.BLACK);

        button1.setText("?");
        button2.setText("?");
        button3.setText("?");
        button4.setText("?");
        button5.setText("?");
        button6.setText("?");
        button7.setText("?");
        button8.setText("?");
        button9.setText("?");


        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                table[i][j]="?";
            }

    }

    public void stop()
    {
        button1.setClickable(false);
        button2.setClickable(false);
        button3.setClickable(false);
        button4.setClickable(false);
        button5.setClickable(false);
        button6.setClickable(false);
        button7.setClickable(false);
        button8.setClickable(false);
        button9.setClickable(false);
    }

}