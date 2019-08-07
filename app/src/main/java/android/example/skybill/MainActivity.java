package android.example.skybill;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FrameLayout mFragmentHome;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setupMyBillsFragment();
                    return true;
                case R.id.navigation_dashboard:
                    setupMyGroupedBillsFragment();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mFragmentHome = findViewById(R.id.fragmentHome);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setupMyBillsFragment();
    }

    private void setupMyBillsFragment() {
        MyBillsFragment myBillsFragment = new MyBillsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentHome, myBillsFragment, "MY BILLS");
        transaction.commit();
    }

    private void setupMyGroupedBillsFragment() {
        GroupedBillsFragment groupedBillsFragment = new GroupedBillsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentHome, groupedBillsFragment, "GROUPED BILLS");
        transaction.commit();
    }

}
