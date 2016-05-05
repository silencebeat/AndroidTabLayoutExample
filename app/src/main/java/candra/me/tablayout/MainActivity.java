package candra.me.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setViewPager(ViewPager viewPager){
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(MyFragment.Init("ONE"), "ONE");
        adapter.addFragment(MyFragment.Init("TWO"), "TWO");
        adapter.addFragment(MyFragment.Init("THREE"), "THREE");
        adapter.addFragment(MyFragment.Init("FOUR"), "FOUR");
        adapter.addFragment(MyFragment.Init("FIVE"), "FIVE");
        adapter.addFragment(MyFragment.Init("SIX"), "SIX");
        adapter.addFragment(MyFragment.Init("SEVEN"), "SEVEN");
        adapter.addFragment(MyFragment.Init("EIGHT"), "EIGHT");
        adapter.addFragment(MyFragment.Init("NINE"), "NINE");
        adapter.addFragment(MyFragment.Init("TEN"), "TEN");
        viewPager.setAdapter(adapter);
    }

    class Adapter extends FragmentPagerAdapter{

        private ArrayList<Fragment> fragments = new ArrayList<>();
        private ArrayList<String> strings = new ArrayList<>();

        public Adapter(FragmentManager manager){
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        public void addFragment(Fragment fragment, String title){
            fragments.add(fragment);
            strings.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return strings.get(position);
        }
    }
}
