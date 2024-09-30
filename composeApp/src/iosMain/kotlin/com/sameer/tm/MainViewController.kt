package com.sameer.tm

import BatteryManger
import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    App(batteryManger = remember { BatteryManger() })
}