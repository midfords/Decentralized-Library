package com.comp4020.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
<<<<<<< HEAD
=======
import android.util.Log;
>>>>>>> origin/Development
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;
import com.comp4020.adapters.LibraryListArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ExchangesFragment.BorrowingFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link ExchangesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExchangesFragment extends Fragment {

    private static final String ARG_TITLES = "titles";
    private static final String ARG_AUTHORS = "authors";
    private static final String ARG_COVERS = "covers";
    private static final String ARG_SECTION = "section";
    private ListView listView;
    private TextView textView;
    private String[] titles;
    private String[] authors;
<<<<<<< HEAD
=======
    private String[] requestFrom;
>>>>>>> origin/Development
    private String[] covers;
    private String section;

    private BorrowingFragmentCallbacks mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BorrowingFragment.
     */
    public static ExchangesFragment newInstance() {

        ExchangesFragment fragment = new ExchangesFragment();
        Bundle args = Data.getRequests();
        args.putString(ARG_SECTION, "Requests");
        fragment.setArguments(args);
        return fragment;
    }

    public static ExchangesFragment newInstance(String section) {

        ExchangesFragment fragment = new ExchangesFragment();

        Bundle args = new Bundle();
        args.putString(ARG_SECTION, section);
        if(section.equals("Requests")) {
            args = Data.getRequests();
            args.putString(ARG_SECTION, "Requests");
        }
        else if(section.equals("Requested")) {
            args = Data.getRequested();
            args.putString(ARG_SECTION, "Requested");
        }
        else if(section.equals("Borrowed")) {
            args = Data.getBorrowed();
            args.putString(ARG_SECTION, "Borrowed");
        }
        else if(section.equals("Lent")) {
            args = Data.getLent();
            args.putString(ARG_SECTION, "Lent");
        }
        fragment.setArguments(args);
        return fragment;
    }

    public ExchangesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            titles = getArguments().getStringArray(ARG_TITLES);
            authors = getArguments().getStringArray(ARG_AUTHORS);
            covers = getArguments().getStringArray(ARG_COVERS);
            section = getArguments().getString(ARG_SECTION);
<<<<<<< HEAD
=======

            if(section.equals("Requests")) {
                authors = getArguments().getStringArray("requestFrom");
            }
>>>>>>> origin/Development
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_exchanges, container, false);

        textView = (TextView) contentView.findViewById(R.id.sectionLabel);
        textView.setText(section);

        listView = (ListView) contentView.findViewById(R.id.exchangeListView);
        listView.setAdapter(new LibraryListArrayAdapter(contentView.getContext(),
                R.layout.row_layout_book, titles, authors, covers));

<<<<<<< HEAD
        return contentView;
    }

    // TODO: Rename method, update argument and hook method into UI event
=======


        return contentView;
    }

>>>>>>> origin/Development
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onBorrowingFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (BorrowingFragmentCallbacks) activity;
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
    public interface BorrowingFragmentCallbacks {

        public void onBorrowingFragmentInteraction(Uri uri);
    }

}
