package za.co.codetribe.kid.notifications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import za.co.codetribe.kid.R;

public class NotificationsActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        finish();
        return super.onOptionsItemSelected(item);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
