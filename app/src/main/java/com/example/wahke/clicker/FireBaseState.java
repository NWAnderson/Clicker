package com.example.wahke.clicker;

import android.content.Context;

import com.firebase.client.Firebase;

/**
 * Created by wahke on 9/15/2016.
 */

public class FireBaseState {
    Context context;
    Firebase firebase;
    FireBaseState(Context _context) {
        context=_context;
        Firebase.setAndroidContext(context);
        firebase = new Firebase("https://clicker-7e461.firebaseio.com");   //firebase url for linking
    }
}
