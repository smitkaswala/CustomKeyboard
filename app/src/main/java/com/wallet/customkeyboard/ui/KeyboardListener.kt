package com.wallet.customkeyboard.ui

interface KeyboardListener {

    fun characterClicked(c: String)
    fun specialKeyClicked(key: KeyboardController.SpecialKey)
    fun onFontChanged(font: BaseFont)
    fun onNumericChanged(numeric: BaseNumeric)

}