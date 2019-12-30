package io.legado.app.base

import androidx.lifecycle.ViewModel
import io.legado.app.constant.Theme

abstract class VMBaseActivity<VM : ViewModel>(
    layoutID: Int,
    fullScreen: Boolean = true,
    theme: Theme = Theme.Auto
) : BaseActivity(layoutID, fullScreen, theme) {

    protected abstract val viewModel: VM

}