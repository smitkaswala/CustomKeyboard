package com.wallet.customkeyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.lifecycleScope
import com.wallet.customkeyboard.databinding.ActivityMainBinding
import com.wallet.customkeyboard.ui.CustomKeyboardView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*if (binding.incKeyboard.customKeyboardView.isExpanded) binding.incKeyboard.customKeyboardView.translateLayout()
        else finish()*/

        binding.incKeyboard.customKeyboardView.registerEditText(CustomKeyboardView.KeyboardType.QWERTY, binding.testQwertyField)

    }


}