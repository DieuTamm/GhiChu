package com.languagexx.simplenotes.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/languagexx/simplenotes/ui/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "noteRepository", "Lcom/languagexx/simplenotes/repository/NoteRepository;", "(Lcom/languagexx/simplenotes/repository/NoteRepository;)V", "getNoteRepository", "()Lcom/languagexx/simplenotes/repository/NoteRepository;", "delete", "", "note", "Lcom/languagexx/simplenotes/persistence/Note;", "deleteById", "id", "", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.languagexx.simplenotes.repository.NoteRepository noteRepository = null;
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note note) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note note) {
    }
    
    public final void deleteById(int id) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note note) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.languagexx.simplenotes.persistence.Note>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.languagexx.simplenotes.repository.NoteRepository getNoteRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.repository.NoteRepository noteRepository) {
        super();
    }
}