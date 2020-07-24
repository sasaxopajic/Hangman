package sasa.pajic.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start;
    private LinearLayout player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.new_game);
        start.setOnClickListener(this);

        player1 = (LinearLayout) findViewById(R.id.player_1);
        player2 = (LinearLayout) findViewById(R.id.player_2);

        player1.setVisibility(View.VISIBLE);
        player2.setVisibility(View.INVISIBLE);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.new_game:
                player1.setVisibility(View.INVISIBLE);
                player2.setVisibility(View.VISIBLE);
                break;
        }
    }
}
