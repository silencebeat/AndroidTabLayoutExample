package candra.me.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by candra on 05-May-16.
 */
public class MyFragment extends Fragment {

    TextView textView;
    public static final String TEXT = "TEXT";

    public static MyFragment Init(String text){
        MyFragment oneFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TEXT, text);
        oneFragment.setArguments(bundle);
        return oneFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        textView = (TextView) view.findViewById(R.id.text);

        Bundle bundle = getArguments();

        textView.setText(bundle.getString(TEXT));

        return view;
    }
}
