package com.sadek.flavors.paid;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ldoublem.loadingviewlib.LVCircularCD;
import com.sadek.apps.joketeller.GCEAsyncTask;
import com.sadek.apps.joketeller.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements OnTaskCompleted{
    Button mJokeButton;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        mJokeButton = (Button) root.findViewById(R.id.btn_joke);

        mJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });
        return root;

    }
    public void loadData() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
        endpointsAsyncTask.execute();
    }
    @Override
    public void onTaskCompleted(String result) {
        Intent intent = new Intent(getActivity(), JokeActivity.class);

        intent.putExtra(JokeActivity.JOKE_KEY, result);
        startActivity(intent);
    }
}