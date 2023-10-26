package com.languagexx.simplenotes.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$ViewHolder;", "noteList", "", "Lcom/languagexx/simplenotes/persistence/Note;", "interaction", "Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$Interaction;", "(Ljava/util/List;Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$Interaction;)V", "notes", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swap", "Interaction", "ViewHolder", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.languagexx.simplenotes.ui.adapter.NoteAdapter.ViewHolder> {
    private final java.util.List<com.languagexx.simplenotes.persistence.Note> notes = null;
    private final com.languagexx.simplenotes.ui.adapter.NoteAdapter.Interaction interaction = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.languagexx.simplenotes.ui.adapter.NoteAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.languagexx.simplenotes.ui.adapter.NoteAdapter.ViewHolder holder, int position) {
    }
    
    public final void swap(@org.jetbrains.annotations.NotNull()
    java.util.List<com.languagexx.simplenotes.persistence.Note> notes) {
    }
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.languagexx.simplenotes.persistence.Note> noteList, @org.jetbrains.annotations.Nullable()
    com.languagexx.simplenotes.ui.adapter.NoteAdapter.Interaction interaction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "interaction", "Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$Interaction;", "(Landroid/view/View;Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$Interaction;)V", "bind", "", "item", "Lcom/languagexx/simplenotes/persistence/Note;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.languagexx.simplenotes.ui.adapter.NoteAdapter.Interaction interaction = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.languagexx.simplenotes.persistence.Note item) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.Nullable()
        com.languagexx.simplenotes.ui.adapter.NoteAdapter.Interaction interaction) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/languagexx/simplenotes/ui/adapter/NoteAdapter$Interaction;", "", "onItemSelected", "", "position", "", "item", "Lcom/languagexx/simplenotes/persistence/Note;", "app_debug"})
    public static abstract interface Interaction {
        
        public abstract void onItemSelected(int position, @org.jetbrains.annotations.NotNull()
        com.languagexx.simplenotes.persistence.Note item);
    }
}