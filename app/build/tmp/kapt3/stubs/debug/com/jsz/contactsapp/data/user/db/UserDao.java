package com.jsz.contactsapp.data.user.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0017\u00a8\u0006\u000e"}, d2 = {"Lcom/jsz/contactsapp/data/user/db/UserDao;", "", "deleteAll", "", "findById", "Lcom/jsz/contactsapp/data/user/db/DbUser;", "userId", "", "getAll", "Lio/reactivex/Observable;", "", "insertAll", "users", "replace", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM user")
    public abstract io.reactivex.Observable<java.util.List<com.jsz.contactsapp.data.user.db.DbUser>> getAll();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM user WHERE userId LIKE :userId LIMIT 1")
    public abstract com.jsz.contactsapp.data.user.db.DbUser findById(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.jsz.contactsapp.data.user.db.DbUser> users);
    
    @androidx.room.Query(value = "DELETE FROM user")
    public abstract void deleteAll();
    
    @androidx.room.Transaction
    public abstract void replace(@org.jetbrains.annotations.NotNull
    java.util.List<com.jsz.contactsapp.data.user.db.DbUser> users);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction
        public static void replace(@org.jetbrains.annotations.NotNull
        com.jsz.contactsapp.data.user.db.UserDao $this, @org.jetbrains.annotations.NotNull
        java.util.List<com.jsz.contactsapp.data.user.db.DbUser> users) {
        }
    }
}