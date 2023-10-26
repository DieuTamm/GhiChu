package com.languagexx.simplenotes.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.languagexx.simplenotes.persistence.Note
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class EditFragmentArgs(
  val note: Note?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): EditFragmentArgs {
      bundle.setClassLoader(EditFragmentArgs::class.java.classLoader)
      val __note : Note?
      if (bundle.containsKey("note")) {
        if (Parcelable::class.java.isAssignableFrom(Note::class.java) ||
            Serializable::class.java.isAssignableFrom(Note::class.java)) {
          __note = bundle.get("note") as Note?
        } else {
          throw UnsupportedOperationException(Note::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"note\" is missing and does not have an android:defaultValue")
      }
      return EditFragmentArgs(__note)
    }
  }
}
