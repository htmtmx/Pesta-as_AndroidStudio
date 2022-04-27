package com.example.pestanias;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        // Inflate the layout for this fragment
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_maps);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                LatLng fesc = new LatLng(19.6902162, -99.1875807);
                googleMap.addMarker(new MarkerOptions()
                        .position(fesc)
                        .title("Marker in FESC"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLng(fesc));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(fesc,15));
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng latLng) {
                        //Inicializar el marcador
                        MarkerOptions markerOptions = new MarkerOptions();
                        //Enviar la posición del marcador
                        markerOptions.position(latLng);
                        //Colocamos titulo al marcador
                        markerOptions.title("Latitud: " + latLng.latitude + ", Longitud: " + latLng.longitude);
                        //Remover todos los marcadores
                        googleMap.clear();
                        //Habilitar la animación del zoom
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));
                        //Agregar marcador
                        googleMap.addMarker(markerOptions);
                    }
                });
            }
        });
        return view;
    }
}