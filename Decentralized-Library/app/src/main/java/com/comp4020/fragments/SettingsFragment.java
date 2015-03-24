package com.comp4020.fragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Switch;

import com.comp4020.adapters.LibraryGridArrayAdapter;
import com.comp4020.decentralized_library.DetailsActivity;
import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;
import com.comp4020.utils.Globals;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link com.comp4020.fragments.SettingsFragment.SettingsFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {

    private SettingsFragmentCallbacks mListener;
    private Switch viewSwitch;
    private Switch lengthSwitch;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SettingsFragment.
     */
    public static SettingsFragment newInstance() {

        return new SettingsFragment();
    }

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_settings, container, false);

        viewSwitch = (Switch) contentView.findViewById(R.id.viewSwitch);

        // Persist switch position
        viewSwitch.setChecked(Globals.gridViewType);
/*
        viewSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Globals.gridViewType = viewSwitch.isChecked();
            }
        });
*/
        lengthSwitch = (Switch) contentView.findViewById(R.id.lengthSwitch);

        // Persist switch position
        lengthSwitch.setChecked(Globals.longLists);
/*
        lengthSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Globals.longLists = lengthSwitch.isChecked();
            }
        });
*/


        return contentView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (SettingsFragmentCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface SettingsFragmentCallbacks {

        public void onSettingsFragmentInteraction(Uri uri);
    }

}
