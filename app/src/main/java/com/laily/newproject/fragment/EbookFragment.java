package com.laily.newproject.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.laily.newproject.Model.Book;
import com.laily.newproject.R;
import com.laily.newproject.adapter.EbookAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class EbookFragment extends Fragment {

    private RecyclerView ebookRecycler;
    private DatabaseReference databaseReference;
    private List<Book> list;
    private EbookAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ebook, container, false);

        ebookRecycler = view.findViewById(R.id.rvEbook);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("pdf");
        getData();
        return view;
    }

    private void getData() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot snapshoot: dataSnapshot.getChildren()){
                    Book book = snapshoot.getValue(Book.class);
                    list.add(book);
                }
                adapter = new EbookAdapter(getContext(),list);
                ebookRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
                ebookRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}