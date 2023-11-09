package com.example.appbruno;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    ArrayList<Reserva> lista;
    Reserva res;
    Reserva r;
    Activity a;
    int id = 0;

    public Adaptador (ArrayList<Reserva> lista, Reserva res, Activity a) {
        this.lista = lista;
        this.res = res;
        this.a = a;
    }

    @Override
    public int getCount () {
        return 0;
    }

    @Override
    public Object getItem (int i) {
        return null;
    }

    @Override
    public long getItemId (int i) {
        return 0;
    }

    @Override
    public View getView (int i, View view, ViewGroup viewGroup) {
        return null;
    }
}


