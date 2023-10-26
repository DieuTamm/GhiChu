package com.languagexx.simplenotes.di;

import com.languagexx.simplenotes.ui.AddFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBuildersModule_ContributeAddFragment.AddFragmentSubcomponent.class)
public abstract class FragmentBuildersModule_ContributeAddFragment {
  private FragmentBuildersModule_ContributeAddFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AddFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AddFragmentSubcomponent extends AndroidInjector<AddFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AddFragment> {}
  }
}
