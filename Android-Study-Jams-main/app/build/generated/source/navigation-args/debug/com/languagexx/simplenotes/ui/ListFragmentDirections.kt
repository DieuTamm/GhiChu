package com.languagexx.simplenotes.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.languagexx.simplenotes.R
import com.languagexx.simplenotes.persistence.Note
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class ListFragmentDirections private constructor() {
  private data class ActionListFragmentToEditFragment(
    val note: Note?
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_listFragment_to_editFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Note::class.java)) {
        result.putParcelable("note", this.note as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(Note::class.java)) {
        result.putSerializable("note", this.note as Serializable?)
      } else {
        throw UnsupportedOperationException(Note::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionListFragmentToAddFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listFragment_to_addFragment)

    fun actionListFragmentToEditFragment(note: Note?): NavDirections =
        ActionListFragmentToEditFragment(note)
  }
}
