package com.languagexx.simplenotes.persistence;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/languagexx/simplenotes/persistence/NoteDao;", "", "delete", "", "note", "Lcom/languagexx/simplenotes/persistence/Note;", "deleteById", "id", "", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "insert", "", "update", "app_debug"})
public abstract interface NoteDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note note);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note note);
    
    @androidx.room.Query(value = "delete from tbl_note where id = :id")
    public abstract void deleteById(int id);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note note);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from tbl_note")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.languagexx.simplenotes.persistence.Note>> getAllNotes();
}