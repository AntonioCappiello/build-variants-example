package antoniocappiello.com.buildvariantsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast basicToast;
    private Toast coolToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basicToast = Toast.makeText(this, "This is just a free app", Toast.LENGTH_SHORT);
        coolToast = Toast.makeText(this, "This is the paid app", Toast.LENGTH_SHORT);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(BuildConfig.EXTRA_FEATURES) {
                    executeCoolMethod();
                }
                else {
                    executeBasicMethod();
                }
            }
        });


    }

    private void executeBasicMethod() {
        basicToast.show();
    }

    private void executeCoolMethod() {
        coolToast.show();
    }
}
