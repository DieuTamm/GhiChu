package com.languagexx.simplenotes.di;

import com.languagexx.simplenotes.ui.ListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeListFragment {
  private FragmentBuildersModule_ContributeListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ListFragmentSubcomponent extends AndroidInjector<ListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ListFragment> {}
  }
}
