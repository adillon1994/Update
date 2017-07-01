package com.alberto.update;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.alberto.update.data.model.SOservice;
import com.alberto.update.data.remote.MlbAPI;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.pitcher) TextView pitcher;
    @Bind(R.id.homename) TextView homename;
    @Bind(R.id.visitorname) TextView visitorname;
    @Bind(R.id.visitorscore) TextView visitorscore;
    @Bind(R.id.homescore) TextView homescore;

    @Bind(R.id.button_refresh) Button button_refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_refresh) public void onClick_button_refresh(){

        MlbAPI.Factory.getIstance().getSOservice().enqueue(new Callback<SOservice>() {
            @Override
            public void onResponse(Response<SOservice> response) {
                pitcher.setText(response.body().getData().getGames().getGame().get(0).getHomeProbablePitcher().getLast());
                homename.setText(response.body().getData().getGames().getGame().get(0).getHomeTeamName());
                visitorname.setText(response.body().getData().getGames().getGame().get(0).getAwayTeamName());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Failed",t.getMessage());
            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        onClick_button_refresh();
    }
}
