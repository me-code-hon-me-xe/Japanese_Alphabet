package edu.hanu.a1_2001040023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout1;
    GridLayout gridLayout;
    Button buttonHiragana;
    Button buttonKatakana;
    TextView textViewHiragana;
    TextView textViewKatakana;

    MediaPlayer mediaPlayer;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Create material Instance
        gridLayout1 = findViewById(R.id.gridlayout1);
        gridLayout = findViewById(R.id.gridlayout);
        buttonHiragana = findViewById(R.id.buttonHiragana);
        buttonKatakana = findViewById(R.id.buttonKatakana);
        textViewHiragana = findViewById(R.id.Hiragana);
        textViewKatakana = findViewById(R.id.Katakana);
        // Commit

//Set visibility for Hiragana button
        textViewHiragana.animate().alpha(1).setDuration(200);
        gridLayout.animate().alpha(1).setDuration(200);
        textViewKatakana.animate().alpha(0).setDuration(200);
        gridLayout1.animate().alpha(0).setDuration(200);
        buttonHiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewKatakana.animate().alpha(0).setDuration(200);
                gridLayout1.animate().alpha(0).setDuration(200);
                textViewHiragana.animate().alpha(1).setDuration(200);
                gridLayout.animate().alpha(1).setDuration(200);
                buttonHiragana.setBackgroundColor(getResources().getColor(R.color.teal_200));
                buttonKatakana.setBackgroundColor(getResources().getColor(R.color.ActionBarTitleColor));
            }
        });

//Set visibility for Katakana button
        buttonKatakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHiragana.animate().alpha(0).setDuration(200);
                gridLayout.animate().alpha(0).setDuration(200);
                textViewKatakana.animate().alpha(1).setDuration(200);
                gridLayout1.animate().alpha(1).setDuration(200);
                buttonKatakana.setBackgroundColor(getResources().getColor(R.color.teal_200));
                buttonHiragana.setBackgroundColor(getResources().getColor(R.color.ActionBarTitleColor));
            }
        });

//Create Instance for imageView
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView7 = findViewById(R.id.imageView7);
        ImageView imageView8 = findViewById(R.id.imageView8);
        ImageView imageView9 = findViewById(R.id.imageView9);
        ImageView imageView10 = findViewById(R.id.imageView10);
        ImageView imageView11 = findViewById(R.id.imageView11);
        ImageView imageView12 = findViewById(R.id.imageView12);
        ImageView imageView13 = findViewById(R.id.imageView13);
        ImageView imageView14 = findViewById(R.id.imageView14);
        ImageView imageView15 = findViewById(R.id.imageView15);
        ImageView imageView16 = findViewById(R.id.imageView16);
        ImageView imageView17 = findViewById(R.id.imageView17);
        ImageView imageView18 = findViewById(R.id.imageView18);
        ImageView imageView19 = findViewById(R.id.imageView19);
        ImageView imageView20 = findViewById(R.id.imageView20);
        ImageView imageView21 = findViewById(R.id.imageView21);
        ImageView imageView22 = findViewById(R.id.imageView22);
        ImageView imageView23 = findViewById(R.id.imageView23);
        ImageView imageView24 = findViewById(R.id.imageView24);
        ImageView imageView25 = findViewById(R.id.imageView25);
        ImageView imageView26 = findViewById(R.id.imageView26);
        ImageView imageView27 = findViewById(R.id.imageView27);
        ImageView imageView28 = findViewById(R.id.imageView28);
        ImageView imageView29 = findViewById(R.id.imageView29);
        ImageView imageView30 = findViewById(R.id.imageView30);
        ImageView imageView31 = findViewById(R.id.imageView31);
        ImageView imageView32 = findViewById(R.id.imageView32);
        ImageView imageView34 = findViewById(R.id.imageView34);
        ImageView imageView35 = findViewById(R.id.imageView35);
        ImageView imageView36 = findViewById(R.id.imageView36);
        ImageView imageView37 = findViewById(R.id.imageView37);
        ImageView imageView38 = findViewById(R.id.imageView38);
        ImageView imageView40 = findViewById(R.id.imageView40);
        ImageView imageView42 = findViewById(R.id.imageView42);
        ImageView imageView43 = findViewById(R.id.imageView43);
        ImageView imageView44 = findViewById(R.id.imageView44);
        ImageView imageView45 = findViewById(R.id.imageView45);
        ImageView imageView46 = findViewById(R.id.imageView46);
        ImageView imageView47 = findViewById(R.id.imageView47);
        ImageView imageView48 = findViewById(R.id.imageView48);
        ImageView imageView49 = findViewById(R.id.imageView49);
        ImageView imageView50 = findViewById(R.id.imageView50);
        ImageView imageView51 = findViewById(R.id.imageView51);
        ImageView imageView55 = findViewById(R.id.imageView55);
        ImageView imageView56 = findViewById(R.id.imageView56);
        ImageView imageView57 = findViewById(R.id.imageView57);
        ImageView imageView58 = findViewById(R.id.imageView58);
        ImageView imageView59 = findViewById(R.id.imageView59);
        ImageView imageView60 = findViewById(R.id.imageView60);
        ImageView imageView61 = findViewById(R.id.imageView61);
        ImageView imageView62 = findViewById(R.id.imageView62);
        ImageView imageView63 = findViewById(R.id.imageView63);
        ImageView imageView64 = findViewById(R.id.imageView64);
        ImageView imageView65 = findViewById(R.id.imageView65);
        ImageView imageView66 = findViewById(R.id.imageView66);
        ImageView imageView67 = findViewById(R.id.imageView67);
        ImageView imageView68 = findViewById(R.id.imageView68);
        ImageView imageView69 = findViewById(R.id.imageView69);
        ImageView imageView70 = findViewById(R.id.imageView70);
        ImageView imageView71 = findViewById(R.id.imageView71);
        ImageView imageView72 = findViewById(R.id.imageView72);
        ImageView imageView73 = findViewById(R.id.imageView73);
        ImageView imageView74 = findViewById(R.id.imageView74);
        ImageView imageView75 = findViewById(R.id.imageView75);
        ImageView imageView76 = findViewById(R.id.imageView76);
        ImageView imageView77 = findViewById(R.id.imageView77);
        ImageView imageView78 = findViewById(R.id.imageView78);
        ImageView imageView79 = findViewById(R.id.imageView79);
        ImageView imageView80 = findViewById(R.id.imageView80);
        ImageView imageView81 = findViewById(R.id.imageView81);
        ImageView imageView82 = findViewById(R.id.imageView82);
        ImageView imageView83 = findViewById(R.id.imageView83);
        ImageView imageView84 = findViewById(R.id.imageView84);
        ImageView imageView85 = findViewById(R.id.imageView85);
        ImageView imageView86 = findViewById(R.id.imageView86);
        ImageView imageView87 = findViewById(R.id.imageView87);
        ImageView imageView88 = findViewById(R.id.imageView88);
        ImageView imageView89 = findViewById(R.id.imageView89);
        ImageView imageView91 = findViewById(R.id.imageView91);
        ImageView imageView93 = findViewById(R.id.imageView93);
        ImageView imageView94 = findViewById(R.id.imageView94);
        ImageView imageView95 = findViewById(R.id.imageView95);
        ImageView imageView96 = findViewById(R.id.imageView96);
        ImageView imageView97 = findViewById(R.id.imageView97);
        ImageView imageView98 = findViewById(R.id.imageView98);
        ImageView imageView99 = findViewById(R.id.imageView99);
        ImageView imageView103 = findViewById(R.id.imageView103);
        ImageView imageView104 = findViewById(R.id.imageView104);

//set clickable and audio resources for each image view
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.a;
                play(id);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.i;
                play(id);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.u;
                play(id);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.e;
                play(id);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.o;
                play(id);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ka;
                play(id);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ki;
                play(id);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ku;
                play(id);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ke;
                play(id);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ko;
                play(id);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.sa;
                play(id);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.shi;
                play(id);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.su;
                play(id);
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.se;
                play(id);
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.so;
                play(id);
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ta;
                play(id);
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.chi;
                play(id);
            }
        });
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.tsu;
                play(id);
            }
        });
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.te;
                play(id);
            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.to;
                play(id);
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.na;
                play(id);
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ni;
                play(id);
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.nu;
                play(id);
            }
        });
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ne;
                play(id);
            }
        });
        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.no;
                play(id);
            }
        });
        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ha;
                play(id);
            }
        });
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.hi;
                play(id);
            }
        });
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.fu;
                play(id);
            }
        });
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.he;
                play(id);
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ho;
                play(id);
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ma;
                play(id);
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.mi;
                play(id);
            }
        });
        imageView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.mu;
                play(id);
            }
        });
        imageView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.me;
                play(id);
            }
        });
        imageView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.mo;
                play(id);
            }
        });
        imageView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ya;
                play(id);
            }
        });
        imageView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.yu;
                play(id);
            }
        });
        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.yo;
                play(id);
            }
        });
        imageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ra;
                play(id);
            }
        });
        imageView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ri;
                play(id);
            }
        });
        imageView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ru;
                play(id);
            }
        });
        imageView46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.re;
                play(id);
            }
        });
        imageView50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ro;
                play(id);
            }
        });
        imageView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.wa;
                play(id);
            }
        });
        imageView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.o;
                play(id);
            }
        });
        imageView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.o;
                play(id);
            }
        });
        imageView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.n;
                play(id);
            }
        });
        imageView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.a;
                play(id);
            }
        });
        imageView48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.i;
                play(id);
            }
        });
        imageView49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.u;
                play(id);
            }
        });

        imageView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.e;
                play(id);
            }
        });
        imageView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.o;
                play(id);
            }
        });
        imageView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ka;
                play(id);
            }
        });
        imageView60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ki;
                play(id);
            }
        });
        imageView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ku;
                play(id);
            }
        });
        imageView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ke;
                play(id);
            }
        });
        imageView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ko;
                play(id);
            }
        });
        imageView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.sa;
                play(id);
            }
        });
        imageView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.shi;
                play(id);
            }
        });
        imageView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.su;
                play(id);
            }
        });
        imageView67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.se;
                play(id);
            }
        });
        imageView68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.so;
                play(id);
            }
        });
        imageView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ta;
                play(id);
            }
        });
        imageView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.chi;
                play(id);
            }
        });
        imageView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.tsu;
                play(id);
            }
        });
        imageView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.te;
                play(id);
            }
        });
        imageView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.to;
                play(id);
            }
        });
        imageView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.na;
                play(id);
            }
        });
        imageView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ni;
                play(id);
            }
        });
        imageView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.nu;
                play(id);
            }
        });
        imageView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ne;
                play(id);
            }
        });
        imageView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.no;
                play(id);
            }
        });
        imageView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ha;
                play(id);
            }
        });
        imageView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.hi;
                play(id);
            }
        });
        imageView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.fu;
                play(id);
            }
        });
        imageView82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.he;
                play(id);
            }
        });
        imageView83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ho;
                play(id);
            }
        });
        imageView84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ma;
                play(id);
            }
        });
        imageView85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.mi;
                play(id);
            }
        });
        imageView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.mu;
                play(id);
            }
        });
        imageView87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.me;
                play(id);
            }
        });
        imageView88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.mo;
                play(id);
            }
        });
        imageView89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ya;
                play(id);
            }
        });

        imageView91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.yu;
                play(id);
            }
        });

        imageView93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.yo;
                play(id);
            }
        });
        imageView94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ra;
                play(id);
            }
        });
        imageView95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ri;
                play(id);
            }
        });
        imageView96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ru;
                play(id);
            }
        });
        imageView97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.re;
                play(id);
            }
        });
        imageView98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.ro;
                play(id);
            }
        });
        imageView99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.wa;
                play(id);
            }
        });

        imageView103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.o;
                play(id);
            }
        });
        imageView104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = R.raw.n;
                play(id);
            }
        });

    }

    //create method to initialize playing status for audio
    public void play(int id) {
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }

    public void pressed(Button button) {
        if (button.isPressed() == true) {
            button.setTextColor(Color.RED);
        } else {
            button.setTextColor(Color.BLACK);
        }
    }

}