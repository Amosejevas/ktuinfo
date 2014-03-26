package com.teamtreehouse.blogreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainLoginActivity extends Activity {

	static String userData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

	    final TextView usernameText = (TextView) findViewById(R.id.username_text);
	    final TextView passwordText = (TextView) findViewById(R.id.password_text);
	    Button getLoginButton = (Button) findViewById(R.id.login_button);
	    
	    getLoginButton.setOnClickListener(new View.OnClickListener() {
   
			public void onClick(View arg0) {
				String username = (String) usernameText.getText().toString();
				String password = (String) passwordText.getText().toString();
				userData = username + '&' + password;
				Intent intent = new Intent (MainLoginActivity.this, MainListActivity.class);
				startActivity(intent);
			}
		});
	    
    }
    public static String getX() {
        return userData;
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
}
