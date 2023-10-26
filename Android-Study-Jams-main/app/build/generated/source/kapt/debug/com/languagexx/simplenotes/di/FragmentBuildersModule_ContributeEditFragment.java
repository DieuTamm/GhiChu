package com.languagexx.simplenotes.di;

import com.languagexx.simplenotes.ui.EditFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeEditFragment.EditFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeEditFragment {
  private FragmentBuildersModule_ContributeEditFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EditFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface EditFragmentSubcomponent extends AndroidInjector<EditFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditFragment> {}
  }
}
