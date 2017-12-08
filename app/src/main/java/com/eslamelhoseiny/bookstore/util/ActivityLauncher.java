package com.eslamelhoseiny.bookstore.util;

import android.content.Context;
import android.content.Intent;

import com.eslamelhoseiny.bookstore.activities.AddBookActivity;
import com.eslamelhoseiny.bookstore.activities.EditBookActivity;
import com.eslamelhoseiny.bookstore.activities.EditProfileActivity;
import com.eslamelhoseiny.bookstore.activities.LoginActivity;
import com.eslamelhoseiny.bookstore.activities.MyBooksActivity;
import com.eslamelhoseiny.bookstore.activities.PDFViewerActivity;
import com.eslamelhoseiny.bookstore.activities.RegisterActivity;
import com.eslamelhoseiny.bookstore.data.Book;
import com.eslamelhoseiny.bookstore.data.Publisher;

/**
 * Created by Eslam Elhoseiny on 9/29/2017.
 */

public final class ActivityLauncher {

    public static final String BOOK_KEY = "book";
    public static final String PUBLISHER_KEY = "publisher";

    public static void openLoginActivity(Context context){
        Intent i = new Intent(context, LoginActivity.class);
        context.startActivity(i);
    }


    public static void openRegistrationActivity(Context context){
        Intent i = new Intent(context, RegisterActivity.class);
        context.startActivity(i);
    }

    public static void openMyBooksActivity(Context context){
        Intent i = new Intent(context, MyBooksActivity.class);
        context.startActivity(i);
    }

    public static void openAddBookActivity(Context context){
        Intent i = new Intent(context, AddBookActivity.class);
        context.startActivity(i);
    }

    public static void openEditBookActivity(Context context, Book book){
        Intent i = new Intent(context, EditBookActivity.class);
        i.putExtra(BOOK_KEY, book);
        context.startActivity(i);
    }
    public static void openEditPublisherActivity(Context context, Publisher publisher){
        Intent i = new Intent(context, EditProfileActivity.class);
        i.putExtra(PUBLISHER_KEY, publisher);
        context.startActivity(i);
    }
    public static void openPDFViewerActivity(Context context, Book book){
        Intent i = new Intent(context, PDFViewerActivity.class);
        i.putExtra(BOOK_KEY, book);
        context.startActivity(i);
    }


}
