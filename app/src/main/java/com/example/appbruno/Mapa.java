package com.example.appbruno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    TextView txtLat, txtLong;
    GoogleMap nMap;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_mapa);

        txtLat = findViewById(R.id.txt_Latitud);
        txtLong = findViewById(R.id.txt_Longitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady (@NonNull GoogleMap googleMap) {
        nMap = googleMap;
        nMap.setOnMapClickListener(this);
        nMap.setOnMapLongClickListener(this);

        LatLng Clinica = new LatLng(-38.7333584,-72.6161654);
        nMap.addMarker(new MarkerOptions ().position(Clinica).title("Clínica Dental"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Clinica));

    }
    @Override
    public void onMapClick (@NonNull LatLng latLng) {
        txtLat.setText("" + latLng.latitude);
        txtLong.setText("" + latLng.longitude);
    }

    @Override
    public void onMapLongClick (@NonNull LatLng latLng) {
        txtLat.setText("" + latLng.latitude);
        txtLong.setText("" + latLng.longitude);
    }


}