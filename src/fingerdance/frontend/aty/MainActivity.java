package fingerdance.frontend.aty;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import fingerdance.backend.core.UserData;
import fingerdance.backend.securityguard.CameraSecurityGuard;
import fingerdance.frontend.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClick(){
    	System.out.println("TETE");
    	UserData userData = new UserData("1233", 5, 7, -1);
    	try{
    		CameraSecurityGuard guard = new CameraSecurityGuard();
        	guard.record(userData);
    	}catch(Exception e){
    		Log.e("DDG", e.getMessage());
    	}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
