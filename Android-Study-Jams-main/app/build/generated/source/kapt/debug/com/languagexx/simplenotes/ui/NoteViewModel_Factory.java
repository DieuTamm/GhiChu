// Generated by Dagger (https://dagger.dev).
package com.languagexx.simplenotes.ui;

import com.languagexx.simplenotes.repository.NoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteViewModel_Factory implements Factory<NoteViewModel> {
  private final Provider<NoteRepository> noteRepositoryProvider;

  public NoteViewModel_Factory(Provider<NoteRepository> noteRepositoryProvider) {
    this.noteRepositoryProvider = noteRepositoryProvider;
  }

  @Override
  public NoteViewModel get() {
    return new NoteViewModel(noteRepositoryProvider.get());
  }

  public static NoteViewModel_Factory create(Provider<NoteRepository> noteRepositoryProvider) {
    return new NoteViewModel_Factory(noteRepositoryProvider);
  }

  public static NoteViewModel newInstance(NoteRepository noteRepository) {
    return new NoteViewModel(noteRepository);
  }
}
