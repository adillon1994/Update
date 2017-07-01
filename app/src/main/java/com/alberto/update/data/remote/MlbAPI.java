package com.alberto.update.data.remote;

import com.alberto.update.data.model.Data;
import com.alberto.update.data.model.SOservice;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by Alberto on 7/1/2017.
 */

public interface MlbAPI {

    //http://gd2.mlb.com/components/game/mlb/year_2017/month_07/day_02/master_scoreboard.json

    String BASE_URL= "http://gd2.mlb.com/";

    @GET("components/game/mlb/year_2017/month_07/day_03/master_scoreboard.json")
    Call<SOservice> getSOservice();

    class Factory{

        private static MlbAPI service;

        public static MlbAPI getIstance(){

            if (service==null){
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();

                service = retrofit.create(MlbAPI.class);
                return service;

            }else {
                return service;
            }

        }
    }


}
