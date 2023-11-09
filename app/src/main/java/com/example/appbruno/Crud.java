package com.example.appbruno;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Crud {
    SQLiteDatabase bd;
    ArrayList < Reserva > lista = new ArrayList < Reserva > ( );
    Reserva r;
    Context ct;
    String nombreDB = "DBReserva";
    String tabla = "create table if not exists reserva(id integer primary key autoincrement,nombre text, profesional text,fecha text)";

    public Crud ( Context c ) {
        this.ct = c;
        bd = c.openOrCreateDatabase ( nombreDB , Context.MODE_PRIVATE , null );
        bd.execSQL ( tabla );
    }

    public boolean insert ( Reserva r ) {
        ContentValues contenedor = new ContentValues ( );
        return ( bd.insert ( "reserva" , null , contenedor ) ) > 0;
    }

    public boolean eliminar ( int id ) {
        return ( bd.delete ( "reserva" , "id=" + id , null ) ) > 0;
    }

    public ArrayList < Reserva > verTodo ( ) {

        lista.clear ( );
        Cursor cursor = bd.rawQuery ( "Select * from reserva" , null );
        if ( cursor != null && cursor.getCount ( ) > 0 ) {
            cursor.moveToFirst ( );
        }
        do {
        } while ( cursor.moveToNext ( ) );

        return lista;
    }

}
