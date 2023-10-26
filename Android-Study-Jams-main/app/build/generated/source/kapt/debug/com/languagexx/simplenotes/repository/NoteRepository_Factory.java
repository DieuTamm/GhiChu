// Generated by Dagger (https://dagger.dev).
package com.languagexx.simplenotes.repository;

import com.languagexx.simplenotes.persistence.NoteDao;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteRepository_Factory implements Factory<NoteRepository> {
  private final Provider<NoteDao> noteDaoProvider;

  public NoteRepository_Factory(Provider<NoteDao> noteDaoProvider) {
    this.noteDaoProvider = noteDaoProvider;
  }

  @Override
  public NoteRepository get() {
    return new NoteRepository(noteDaoProvider.get());
  }

  public static NoteRepository_Factory create(Provider<NoteDao> noteDaoProvider) {
    return new NoteRepository_Factory(noteDaoProvider);
  }

  public static NoteRepository newInstance(NoteDao noteDao) {
    return new NoteRepository(noteDao);
  }
}
