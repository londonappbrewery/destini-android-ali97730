package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
            TextView mTextView;
            Button upper_button;
            Button lower_button;
            int mystoryindex;
            int upperbuttonindex;
            int lowerbuttonindex;

           final int[] storyid = new int[] {

              R.string.T1_Story,
              R.string.T2_Story,
              R.string.T3_Story,
              R.string.T4_End,
                   R.string.T5_End,
                   R.string.T6_End,

           };
    final int[] upperbuttonid = new int[] {

            R.string.T1_Ans1,
            R.string.T2_Ans1,
            R.string.T3_Ans1
    };

    final int[] lowerbuttonid = new int[] {

            R.string.T1_Ans2,
            R.string.T2_Ans2,
            R.string.T3_Ans2

    };







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
      mTextView = (TextView) findViewById(R.id.storyTextView);
      upper_button = (Button) findViewById(R.id.buttonTop);
      lower_button = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        upper_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mystoryindex == 0)
                {
                    mystoryindex=2;
                    upperbuttonindex = 2;
                    lowerbuttonindex = 2;
                    updateview();
                }else if ( mystoryindex == 2)
                {
                    mystoryindex = 5;
                    updateview();

                }
                else if (mystoryindex == 1)
                {
                    mystoryindex = 2;
                    upperbuttonindex = 2;
                    lowerbuttonindex = 2;
                    updateview();
                }
                else {
                    mystoryindex = 5;
                    updateview();

                }




            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        lower_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mystoryindex == 0)
                {
                    mystoryindex=1;
                    upperbuttonindex = 1;
                    lowerbuttonindex = 1;
                    updateview();
                }
                else if( mystoryindex == 1 )
                {
                    mystoryindex = 3;
                    updateview();

                } else
                {
                    mystoryindex = 4;
                    updateview();
                }
                

            }
        });

    }
    public void updateview()
    {

        mTextView.setText(storyid[mystoryindex]);
        if (mystoryindex >= 3)
        {
            upper_button.setVisibility(View.GONE);
            lower_button.setVisibility(View.GONE);
        }else {
            upper_button.setText(upperbuttonid[upperbuttonindex]);
            lower_button.setText(lowerbuttonid[lowerbuttonindex]);
        }
    }
}
