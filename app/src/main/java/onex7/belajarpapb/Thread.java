package onex7.belajarpapb;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Thread extends AppCompatActivity implements View.OnClickListener{

    TextView number;
    Button start, stop;

    Random rand = new Random();
    RandomNum random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread);

        number = (TextView) findViewById(R.id.number);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.start) {
            random = (RandomNum) new RandomNum().execute(rand);
            start.setEnabled(false);
            stop.setEnabled(true);
        } else {
            random.cancel(true);
            start.setEnabled(true);
            stop.setEnabled(false);
        }
    }

    private class RandomNum extends AsyncTask<Random, String, Integer> {
        int r;

        @Override
        protected Integer doInBackground(Random... rand) {
            while (true) {
                try {
                    java.lang.Thread.sleep(500);
                    r = rand[0].nextInt(10);
                    publishProgress(String.valueOf(r));
                    if (isCancelled()) break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return r;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            number.setText(values[0]);
        }

        @Override
        protected void onPostExecute(Integer result) {
            number.setText(result.toString());
        }

    }
}