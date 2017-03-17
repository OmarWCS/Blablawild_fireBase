package fr.wcs.blablawild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {


    ListView mListViewResults;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_results_list);

        mListViewResults = (ListView) findViewById(R.id.List);
        ArrayList<TripResultModel> results = new ArrayList<>();

        Intent intent = getIntent();
        SearchRequestModel result = intent.getParcelableExtra(SearchItineraryActivity.SEARCH);

        Toast.makeText(this, result.getmDateDepart(), Toast.LENGTH_SHORT).show();
        this.setTitle(result.getmDepart() + ">>" + result.getmArrivee());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");

        try {


            results.add(new TripResultModel("Bruce", sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripResultModel("Clark", sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripResultModel("Bary", sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripResultModel("Lex", sdf.parse("21/02/2017-17:00"), 40));
            } catch (ParseException e) {
        }
        TripResultAdapter adapter = new TripResultAdapter(ViewSearchItineraryResultsListActivity.this, results);
        mListViewResults.setAdapter(adapter);
    }
}







