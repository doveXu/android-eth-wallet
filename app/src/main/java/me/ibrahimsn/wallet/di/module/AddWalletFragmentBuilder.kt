package me.ibrahimsn.wallet.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.ibrahimsn.wallet.ui.addWallet.AddWalletFragment
import me.ibrahimsn.wallet.ui.addWallet.createWallet.CreateWalletFragment
import me.ibrahimsn.wallet.ui.addWallet.importWallet.ImportWalletFragment
import me.ibrahimsn.wallet.ui.send.send.SendFragment

@Module
abstract class AddWalletFragmentBuilder {

    /**
     * Build Add Wallet Fragment
     */
    @ContributesAndroidInjector
    internal abstract fun buildAddWalletFragment(): AddWalletFragment

    /**
     * Build Create Wallet Fragment
     */
    @ContributesAndroidInjector
    internal abstract fun buildCreateWalletFragment(): CreateWalletFragment

    /**
     * Build Import Wallet Fragment
     */
    @ContributesAndroidInjector
    internal abstract fun buildImportWalletFragment(): ImportWalletFragment
}