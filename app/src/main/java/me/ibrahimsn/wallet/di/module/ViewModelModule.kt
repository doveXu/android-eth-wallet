package me.ibrahimsn.wallet.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import me.ibrahimsn.wallet.di.util.ViewModelFactory
import me.ibrahimsn.wallet.di.util.ViewModelKey
import me.ibrahimsn.wallet.ui.importWallet.ImportWalletViewModel
import me.ibrahimsn.wallet.ui.wallet.WalletViewModel
import me.ibrahimsn.wallet.ui.wallets.WalletsViewModel

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(WalletViewModel::class)
    internal abstract fun bindWalletViewModel(viewModel: WalletViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ImportWalletViewModel::class)
    internal abstract fun bindImportWalletViewModel(viewModel: ImportWalletViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WalletsViewModel::class)
    internal abstract fun bindWalletsViewModel(viewModel: WalletsViewModel): ViewModel
}