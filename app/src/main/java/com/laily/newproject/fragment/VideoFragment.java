package com.laily.newproject.fragment;

import android.Manifest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.laily.newproject.Model.Video;
import com.laily.newproject.R;
import com.laily.newproject.adapter.VideoAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class VideoFragment extends Fragment {

    private RecyclerView rvVideo;
    private ArrayList<Video> videoArrayList;
    private VideoAdapter adapterVideo;
    private  static int REQUEST_CODE =1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ActivityCompat.requestPermissions(getActivity(),new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        },REQUEST_CODE) ;
       View view= inflater.inflate(R.layout.fragment_video, container, false);

       rvVideo = view.findViewById(R.id.rvVideo);
       loadVideo();
        return  view;
    }
    private void loadVideo(){
        videoArrayList = new ArrayList<>();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Videos");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                videoArrayList.clear();
                for (DataSnapshot dataSnapshot:snapshot.getChildren()){
                    Video video =dataSnapshot.getValue(Video.class);
                    videoArrayList.add(video);
                }
                adapterVideo = new VideoAdapter(getContext(),videoArrayList);
                rvVideo.setAdapter(adapterVideo);

            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }
}