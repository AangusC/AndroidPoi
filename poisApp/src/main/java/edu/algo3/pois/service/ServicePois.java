package edu.algo3.pois.service;



import java.util.List;

import edu.algo3.pois.domain.Poi;
import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Aangus 01/11/2016.
 */

public interface ServicePois {

    @GET("/pois")
    Call<List<Poi>> getPois();

}
