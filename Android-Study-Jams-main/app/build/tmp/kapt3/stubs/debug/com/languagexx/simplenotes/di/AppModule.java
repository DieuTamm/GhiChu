package com.languagexx.simplenotes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/languagexx/simplenotes/di/AppModule;", "", "()V", "providesAppDatabase", "Lcom/languagexx/simplenotes/persistence/NoteDatabase;", "app", "Landroid/app/Application;", "providesNoteDao", "Lcom/languagexx/simplenotes/persistence/NoteDao;", "db", "providesRepository", "Lcom/languagexx/simplenotes/repository/NoteRepository;", "noteDao", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.languagexx.simplenotes.persistence.NoteDatabase providesAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.languagexx.simplenotes.persistence.NoteDao providesNoteDao(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.NoteDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.languagexx.simplenotes.repository.NoteRepository providesRepository(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.NoteDao noteDao) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}