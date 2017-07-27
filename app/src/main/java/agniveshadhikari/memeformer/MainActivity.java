package agniveshadhikari.memeformer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button memify;
    private EditText top_input, bottom_input;
    private TextView top_text, bottom_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_input = (EditText) findViewById(R.id.top_input);
        bottom_input = (EditText) findViewById(R.id.bottom_input);
        top_text = (TextView) findViewById(R.id.top_text);
        bottom_text = (TextView) findViewById(R.id.bottom_text);
        memify = (Button) findViewById(R.id.button);

        memify.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        top_text.setText(top_input.getText().toString());
                        bottom_text.setText(bottom_input.getText().toString());
                    }
                }
        );
    }
}
