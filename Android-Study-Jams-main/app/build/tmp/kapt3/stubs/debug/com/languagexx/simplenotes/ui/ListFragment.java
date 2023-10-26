package com.languagexx.simplenotes.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006H\u0016J\u001a\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u0016H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lcom/languagexx/simplenotes/ui/ListFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$Interaction;", "()V", "allNotes", "", "Lcom/languagexx/simplenotes/persistence/Note;", "getAllNotes", "()Ljava/util/List;", "setAllNotes", "(Ljava/util/List;)V", "noteAdapter", "Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter;", "noteViewModel", "Lcom/languagexx/simplenotes/ui/NoteViewModel;", "viewmodelProviderFactory", "Lcom/languagexx/simplenotes/util/ViewModelProviderFactory;", "getViewmodelProviderFactory", "()Lcom/languagexx/simplenotes/util/ViewModelProviderFactory;", "setViewmodelProviderFactory", "(Lcom/languagexx/simplenotes/util/ViewModelProviderFactory;)V", "initRecyclerView", "", "initSwipeToDelete", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "observerLiveData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "position", "", "item", "onViewCreated", "view", "setupViewModel", "app_debug"})
public final class ListFragment extends dagger.android.support.DaggerFragment implements com.languagexx.simplenotes.ui.adapter.NoteAdapter.Interaction {
    private com.languagexx.simplenotes.ui.adapter.NoteAdapter noteAdapter;
    private com.languagexx.simplenotes.ui.NoteViewModel noteViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.languagexx.simplenotes.util.ViewModelProviderFactory viewmodelProviderFactory;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.languagexx.simplenotes.persistence.Note> allNotes;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.languagexx.simplenotes.util.ViewModelProviderFactory getViewmodelProviderFactory() {
        return null;
    }
    
    public final void setViewmodelProviderFactory(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.util.ViewModelProviderFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.languagexx.simplenotes.persistence.Note> getAllNotes() {
        return null;
    }
    
    public final void setAllNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.languagexx.simplenotes.persistence.Note> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observerLiveData() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void setupViewModel() {
    }
    
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback initSwipeToDelete() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemSelected(int position, @org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.persistence.Note item) {
    }
    
    public ListFragment() {
        super();
    }
}