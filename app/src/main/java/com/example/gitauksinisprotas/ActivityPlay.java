package com.example.gitauksinisprotas;



import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPlay extends AppCompatActivity {


    CountDownTimer countDownTimer;
    CountDownTimer countDownTimerCustom;

    //names
    private Button namesButtonOk;
    private player[] names = new player[6];
    private TextView vardas1,vardas2,vardas3,vardas4,vardas5,vardas6;
    private TextView player1,player2,player3,player4,player5,player6;
    private Button customTimer;
    private Button buttonPlus;
    private Button buttonMinus;
    private ImageView plusBackground,minusBackground,timerBackground,buttonNextBackground,namesButtonOkBackground, winnerImg;
    private static Button buttonNext;
    private TextView turai;
    private int turasCount = 1;
    private int secCustom = 15;
    private boolean isStarted = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        buttonClick();


    }



    private void buttonClick() {

        //names variables
        namesButtonOk = (Button)findViewById(R.id.buttonNamesOk);
        namesButtonOkBackground = (ImageView)findViewById(R.id.buttonNamesOkBackground);
        vardas1 = (TextView)findViewById(R.id.editTextTextPersonName1);
        vardas2 = (TextView)findViewById(R.id.editTextTextPersonName2);
        vardas3 = (TextView)findViewById(R.id.editTextTextPersonName3);
        vardas4 = (TextView)findViewById(R.id.editTextTextPersonName4);
        vardas5 = (TextView)findViewById(R.id.editTextTextPersonName5);
        vardas6 = (TextView)findViewById(R.id.editTextTextPersonName6);
//        vardas1.setBackgroundColor(Color.argb(255, 255, 153,153));
//        vardas2.setBackgroundColor(Color.argb(255, 255, 153,153));
//        vardas3.setBackgroundColor(Color.argb(255, 255, 153,153));
//        vardas4.setBackgroundColor(Color.argb(255, 204, 229,255));
//        vardas5.setBackgroundColor(Color.argb(255, 204, 229,255));
//        vardas6.setBackgroundColor(Color.argb(255, 204, 229,255));
        vardas1.setBackgroundResource(R.drawable.roundstylelightred);
        vardas2.setBackgroundResource(R.drawable.roundstylelightred);
        vardas3.setBackgroundResource(R.drawable.roundstylelightred);
        vardas4.setBackgroundResource(R.drawable.roundstylelightblue);
        vardas5.setBackgroundResource(R.drawable.roundstylelightblue);
        vardas6.setBackgroundResource(R.drawable.roundstylelightblue);
        player1 = (TextView)findViewById(R.id.textViewPlayer1);
        player2 = (TextView)findViewById(R.id.textViewPlayer2);
        player3 = (TextView)findViewById(R.id.textViewPlayer3);
        player4 = (TextView)findViewById(R.id.textViewPlayer4);
        player5 = (TextView)findViewById(R.id.textViewPlayer5);
        player6 = (TextView)findViewById(R.id.textViewPlayer6);
        //customTimeris
        customTimer = (Button)findViewById(R.id.buttonTimerCustomSec);
        timerBackground = (ImageView) findViewById(R.id.buttonTimerCustomSecBacground);
        buttonPlus = (Button)findViewById(R.id.buttonPlus);
        plusBackground = (ImageView)findViewById(R.id.buttonPlusBacground);
        minusBackground = (ImageView)findViewById(R.id.buttonMinusBacground);
        buttonMinus = (Button)findViewById(R.id.buttonMinus);
        buttonNext = (Button)findViewById(R.id.buttonNext);
        buttonNextBackground = (ImageView)findViewById(R.id.buttonNextBacground);
        turai = (TextView)findViewById(R.id.textPlayerTurai);
        winnerImg = (ImageView)findViewById(R.id.imageViewWinner);






        namesButtonOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // button.setEnabled(false);
                        Handler handler = new Handler();
                        // handler.postDelayed(()->namesButtonOk.setEnabled(true), 500);

                        if (!(isTextViewEmpty(vardas1) ||
                                isTextViewEmpty(vardas2) ||
                                isTextViewEmpty(vardas3) ||
                                isTextViewEmpty(vardas4) ||
                                isTextViewEmpty(vardas5) ||
                                isTextViewEmpty(vardas6)))
                        {
                            names[0] = new player(vardas1.getText().toString(), 0, "1 team", true);
                            names[1] = new player(vardas2.getText().toString(), 0, "1 team", true);
                            names[2] = new player(vardas3.getText().toString(), 0, "1 team", true);
                            names[3] = new player(vardas4.getText().toString(), 0, "2 team", true);
                            names[4] = new player(vardas5.getText().toString(), 0, "2 team", true);
                            names[5] = new player(vardas6.getText().toString(), 0, "2 team", true);

                            vardas1.setEnabled(false);
                            vardas2.setEnabled(false);
                            vardas3.setEnabled(false);
                            vardas4.setEnabled(false);
                            vardas5.setEnabled(false);
                            vardas6.setEnabled(false);

                            vardas1.setVisibility(View.GONE);
                            vardas2.setVisibility(View.GONE);
                            vardas3.setVisibility(View.GONE);
                            vardas4.setVisibility(View.GONE);
                            vardas5.setVisibility(View.GONE);
                            vardas6.setVisibility(View.GONE);
                            namesButtonOk.setVisibility(View.GONE);
                            namesButtonOkBackground.setVisibility(View.GONE);
                            // text "Zaidejai"
                            findViewById(R.id.textPlayerNames).setVisibility(View.GONE);


                            refreshNamesScore();
                            turasCount++;

                            buttonMinus.setVisibility(View.VISIBLE);
                            buttonPlus.setVisibility(View.VISIBLE);
                            plusBackground.setVisibility(View.VISIBLE);
                            minusBackground.setVisibility(View.VISIBLE);
                            buttonNext.setVisibility(View.VISIBLE);
                            customTimer.setVisibility(View.VISIBLE);
                            timerBackground.setVisibility(View.VISIBLE);
                            turai.setVisibility(View.VISIBLE);
                            buttonNextBackground.setVisibility(View.VISIBLE);
                            player1.setVisibility(View.VISIBLE);
                            player2.setVisibility(View.VISIBLE);
                            player3.setVisibility(View.VISIBLE);
                            player4.setVisibility(View.VISIBLE);
                            player5.setVisibility(View.VISIBLE);
                            player6.setVisibility(View.VISIBLE);
                            player1.setTextColor(Color.WHITE);
                            player2.setTextColor(Color.WHITE);
                            player3.setTextColor(Color.WHITE);
                            player4.setTextColor(Color.WHITE);
                            player5.setTextColor(Color.WHITE);
                            player6.setTextColor(Color.WHITE);

                            showAlert("DĖMESIO", "Norint pridėti, ar atimti taškus pasirinkite žaidėją", view.getContext());

                        }else{
                            Toast.makeText(view.getContext(), "Netinkama įvestis, užpildykite visus laukelius vardais neilgesniais nei 10 simbolių", Toast.LENGTH_SHORT).show();
                        }
                    }

                }
        );

        customTimer.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // button.setEnabled(false);
                        Handler handler = new Handler();
                        // handler.postDelayed(()->namesButtonOk.setEnabled(true), 500);

                        //customTimer.setText("15 sek");


                        if(isStarted==false){

                            customTimer.setText(String.valueOf(secCustom + " SEK."));

                            countDownTimerCustom = new CountDownTimer((secCustom * 1000), 1000) {
                                public void onTick(long millisUntilFinished) {

                                    long secCustom = (millisUntilFinished / 1000) % 60;


                                    customTimer.setText(String.valueOf(secCustom + " SEK."));

                                }
                                public void onFinish() {
                                    Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    vibrator.vibrate(300);
                                    customTimer.setText(secCustom + " sek.");

                                    isStarted = false;
                                }
                            }.start();
                            isStarted = true;


                        } else {
                            Toast.makeText(view.getContext(), "Palaukite kol pasibaigs laikas", Toast.LENGTH_SHORT).show();
                        }



                    }
                }
        );

        player1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        selectedColorChange(player1);

                        buttonPlus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {


                                        names[0].score++;
                                        refreshNamesScore();

                                    }
                                }
                        );
                        buttonMinus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        notLessThanZero(names[0]);

                                    }
                                }
                        );


                    }
                }
        );

        player2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        selectedColorChange(player2);

                        buttonPlus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {


                                        names[1].score++;
                                        refreshNamesScore();

                                    }
                                }
                        );
                        buttonMinus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
//                                        if(!(names[1].score <= 0) ){
//                                            names[1].score--;
//                                            refreshNamesScore();
//                                        }
                                        notLessThanZero(names[1]);



                                    }
                                }
                        );

                    }
                }
        );

        player3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        selectedColorChange(player3);

                        buttonPlus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {


                                        names[2].score++;
                                        refreshNamesScore();

                                    }
                                }
                        );
                        buttonMinus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        notLessThanZero(names[2]);

                                    }
                                }
                        );


                    }
                }
        );

        player4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        selectedColorChange(player4);

                        buttonPlus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {


                                        names[3].score++;
                                        refreshNamesScore();

                                    }
                                }
                        );
                        buttonMinus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        notLessThanZero(names[3]);

                                    }
                                }
                        );

                    }
                }
        );

        player5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        selectedColorChange(player5);

                        buttonPlus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {


                                        names[4].score++;
                                        refreshNamesScore();

                                    }
                                }
                        );
                        buttonMinus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        notLessThanZero(names[4]);

                                    }
                                }
                        );


                    }
                }
        );

        player6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        selectedColorChange(player6);

                        buttonPlus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {


                                        names[5].score++;
                                        refreshNamesScore();

                                    }
                                }
                        );
                        buttonMinus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        notLessThanZero(names[5]);

                                    }
                                }
                        );

                    }
                }
        );




        buttonNext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

//                        buttonNext.setEnabled(false);
//                        Handler handler = new Handler();
//                        handler.postDelayed(()->buttonNext.setEnabled(true), 1000);

                        //turasCount++;
                        //System.out.println("Turas: " + turasCount);
                        if (isStarted == false) {
                            if (turasCount == 1) {
                            } else if (turasCount == 2) {

                                if (findTwoMinPlayerScores(names)) {
                                    //TODO: padaryti toasta "Yra daugiau tokiu paciu reiksmiu"
                                    Toast.makeText(view.getContext(), "Yra daugiau tokių pačių reikšmių", Toast.LENGTH_SHORT).show();
                                    System.out.println("Yra daugiau tokiu paciu reiksmiu");


                                } else {

                                    turasCount++;

                                    turai.setText(String.valueOf((turasCount - 1) + " TURAS"));

                                    secCustom = 5;
                                    customTimer.setText(String.valueOf("5 sek."));

                                    removePlayer(findMin(names)); //pasalinam pirma zaideja
                                    removePlayer(findMin(names)); //pasalinam antra zaideja neisima is array


                                    showObjects(); // parodo objektus
                                    clearScore();
                                    refreshNamesScore();

//                                countDownTimerCustom.cancel();
                                    customTimer.setEnabled(true);
                                }

                            } else if (turasCount == 3) {

                                if (findOneMinPlayerScores(names)) {
                                    //TODO: padaryti toasta "Yra daugiau tokiu paciu reiksmiu"
                                    Toast.makeText(view.getContext(), "Yra daugiau tokių pačių reikšmių", Toast.LENGTH_SHORT).show();
                                    System.out.println("Yra daugiau tokiu paciu reiksmiu");
                                } else {
                                    turasCount++;
                                    turai.setText(String.valueOf((turasCount - 1) + " TURAS"));
                                    secCustom = 60;
                                    customTimer.setText(String.valueOf("60 sek."));
                                    removePlayer(findMin(names));
                                    showObjects();
                                    clearScore();
                                    refreshNamesScore();
                                    // countDownTimerCustom.cancel();
                                    customTimer.setEnabled(true);
                                }
                            } else if (turasCount == 4) {

                                if (findOneMinPlayerScores(names)) {
                                    //TODO: padaryti toasta "Yra daugiau tokiu paciu reiksmiu"
                                    Toast.makeText(view.getContext(), "Yra daugiau tokių pačių reikšmių", Toast.LENGTH_SHORT).show();
                                    System.out.println("Yra daugiau tokiu paciu reiksmiu");
                                } else {
                                    turasCount++;
                                    turai.setText(String.valueOf("Finalas"));
                                    secCustom = 20;
                                    customTimer.setText(String.valueOf("20 sek."));
                                    removePlayer(findMin(names));
                                    showObjects();
                                    clearScore();
                                    refreshNamesScore();
                                    //  countDownTimerCustom.cancel();
                                    customTimer.setEnabled(true);
                                }
                            } else if (turasCount == 5) {

                                if (findOneMinPlayerScores(names)) {
                                    //TODO: padaryti toasta "Yra daugiau tokiu paciu reiksmiu"
                                    Toast.makeText(view.getContext(), "Yra daugiau tokių pačių reikšmių", Toast.LENGTH_SHORT).show();
                                    System.out.println("Yra daugiau tokiu paciu reiksmiu");
                                } else {
                                    turasCount++;
                                    turai.setText(String.valueOf("LAIMĖTOJAS"));
                                    secCustom = 20;
                                    customTimer.setVisibility(View.INVISIBLE); // padartt vel matomu
                                    buttonPlus.setVisibility(View.INVISIBLE);
                                    buttonMinus.setVisibility(View.INVISIBLE);
                                    plusBackground.setVisibility(View.INVISIBLE);
                                    minusBackground.setVisibility(View.INVISIBLE);
                                    timerBackground.setVisibility(View.INVISIBLE);
                                    // buttonNext.setText("GRĮŽTI Į PRADŽIĄ"); //

                                    removePlayer(findMin(names));
                                    showObjects();
                                    //clearScore();
                                    refreshNamesScore();
                                    buttonNext.setVisibility(View.INVISIBLE);
                                    buttonNextBackground.setVisibility(View.INVISIBLE);
                                    winnerImg.setVisibility(View.VISIBLE);


                                }
                            }


                        }
                        else {
                            Toast.makeText(view.getContext(), "Palaukite kol pasibaigs laikas", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

    }

    ///////////////////////////////////////////FUNKCIJOS/////////////////////////////////////////////

    public void refreshNamesScore(){
        player1.setText(String.valueOf(names[0].playerName+" "+names[0].score));
        player2.setText(String.valueOf(names[1].playerName+" "+names[1].score));
        player3.setText(String.valueOf(names[2].playerName+" "+names[2].score));
        player4.setText(String.valueOf(names[3].playerName+" "+names[3].score));
        player5.setText(String.valueOf(names[4].playerName+" "+names[4].score));
        player6.setText(String.valueOf(names[5].playerName+" "+names[5].score));
    }

    public void clearScore(){
        names[0].clearScore();
        names[1].clearScore();
        names[2].clearScore();
        names[3].clearScore();
        names[4].clearScore();
        names[5].clearScore();
    }

    //todo:Pataisyti, nes finale lieka keli zaidejai , kai tasku sumos vienodos
    public static player findMin(player[] players) {

        player smallestPlayer = players[0];

        for (int i = 0; i < (players.length-1); i++) { //paturbinimas
            if(players[i].playing==true){
                smallestPlayer = players[i];
            break;
            }
        }

        for (int i = 1; i < players.length; i++) {
            if(players[i].playing){
                if (players[i].score < smallestPlayer.score) {
                    smallestPlayer = players[i];
                }
            }
        }
        smallestPlayer.playing = false;
        return smallestPlayer;
    }

    public static boolean findTwoMinPlayerScores(player[] players) {
//        int smallestScore = Integer.MAX_VALUE;
//        int secondSmallestScore = Integer.MAX_VALUE;
//        int numMinScores = 0;
//
//        for (int i = 0; i < players.length; i++) {
//            if (players[i].playing) {
//                int playerScore = players[i].score;
//                if (playerScore < smallestScore) {
//                    secondSmallestScore = smallestScore;
//                    smallestScore = playerScore;
//                    numMinScores = 1;
//                } else if (playerScore == smallestScore) {
//                    numMinScores++;
//                } else if (playerScore < secondSmallestScore) {
//                    secondSmallestScore = playerScore;
//                    numMinScores = 1;
//                }
//            }
//        }
//
//        if (numMinScores > 2) {
//            return true;
//        } else if (numMinScores == 2) {
//            return false;
//        } else {
//            return false;
//        }
        player winner;
         if(players[0].score + players[1].score + players[2].score > players[3].score + players[4].score + players[5].score) {

             if (!(players[3].score == players[4].score && players[4].score == players[5].score && players[5].score == players[3].score)) {
                        if(findLargestNumberCheckIfTwoEqual(players[3], players[4], players[5])){
                     winner = findLargestNumber(players[3], players[4], players[5]);
                     for (int i = 0; i < 3; i++) {
                         if (players[i] != winner) {
                             players[i].playing = false;
                         }
                     }
                     return false;
                     } else { return true;}

             }else{
                 return true;
             }



         } else if((players[0].score + players[1].score + players[2].score == players[3].score + players[4].score + players[5].score) && (
                                                                                                                                             players[0].score == players[1].score &&
                                                                                                                                             players[1].score == players[2].score &&
                                                                                                                                             players[2].score == players[3].score &&
                                                                                                                                             players[3].score == players[4].score &&
                                                                                                                                             players[4].score == players[5].score &&
                                                                                                                                             players[5].score == players[0].score )
                ){
                    return true;
                } else {

                 if (!(players[0].score == players[1].score && players[1].score == players[2].score && players[2].score == players[0].score)) {
                     if(findLargestNumberCheckIfTwoEqual(players[0], players[1], players[2])){
                     winner = findLargestNumber(players[0], players[1], players[2]);
                     for (int i = 3; i < 5; i++) {
                         if (players[i] != winner) {
                             players[i].playing = false;
                         }
                     }
                     return false;}
                         else {return true;}
                 } else {
                     return true;
                 }


         }



    }

    public static boolean findOneMinPlayerScores(player[] players) {
        int smallestScore = Integer.MAX_VALUE;
        int count = 0;

        // Find the smallest player score
        for (int i = 0; i < players.length; i++) {
            if (players[i].playing && players[i].score < smallestScore) {
                smallestScore = players[i].score;
            }
        }

        // Count the number of players with the smallest score
        for (int i = 0; i < players.length; i++) {
            if (players[i].playing && players[i].score == smallestScore) {
                count++;
            }
        }

        // If there is more than 1 smallest value, return true
        if (count > 1) {
            return true;
        } else {
            return false;
        }
    }




    public void removePlayer(player a) {
        if (a == names[0]) {
            player1.setVisibility(View.GONE);
        } else if (a == names[1]) {
            player2.setVisibility(View.GONE);
        } else if (a == names[2]) {
            player3.setVisibility(View.GONE);
        } else if (a == names[3]) {
            player4.setVisibility(View.GONE);
        } else if (a == names[4]) {
            player5.setVisibility(View.GONE);
        } else if (a == names[5]) {
            player6.setVisibility(View.GONE);
        }
    }
    public void showObjects(){
        for(int i = 0; i<6; i++){
            System.out.println(names[i].playerName+ " Score: "+names[i].score+ " is Playing: "+names[i].playing);
        }
    }

    private void showAlert(String alertDialog, String message, Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(alertDialog)
                .setMessage(message)
                .setPositiveButton("Gerai", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Perform action when "Yes" button is clicked
                    }
                })
//                .setNegativeButton("No", null)
                .show();
    }

    private void notLessThanZero(player a){
        if(!(a.score <= 0) ){
            a.score--;
            refreshNamesScore();
        }
    }

    public static int findBiggest(int a, int b, int c) {
        int biggest = a;
        if (b > biggest) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }
        return biggest;
    }

    private void selectedColorChange(TextView textView){

        player1.setBackground(null);
        player2.setBackground(null);
        player3.setBackground(null);
        player4.setBackground(null);
        player5.setBackground(null);
        player6.setBackground(null);

       // textView.setBackgroundColor(Color.argb(255, 204, 229,255));
        textView.setBackgroundResource(R.drawable.border);
    }

    public static player findLargestNumber(player a, player b, player c) {
        player largest = a;
        if (b.score > largest.score) {
            largest.score = b.score;
        }
        if (c.score > largest.score) {
            largest.score = c.score;
        }
        return largest;
    }

    public static boolean findLargestNumberCheckIfTwoEqual(player a, player b, player c) {
        int largestScore = Math.max(a.score, Math.max(b.score, c.score));
        int count = 0;
        if (a.score == largestScore) {
            count++;
        }
        if (b.score == largestScore) {
            count++;
        }
        if (c.score == largestScore) {
            count++;
        }
        return count == 1;
    }

    public boolean isTextViewEmpty(TextView textView) {
//        return textView.getText().toString().trim().length() == 0;
        String text = textView.getText().toString().trim();
        return text.length() == 0 || text.length() > 10;
    }
}