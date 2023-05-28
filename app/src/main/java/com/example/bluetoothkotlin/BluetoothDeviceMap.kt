package com.example.bluetoothkotlin

import android.bluetooth.BluetoothClass

class BluetoothDeviceMap {
    val map = mapOf(
        BluetoothClass.Device.PHONE_SMART to R.drawable.ic_baseline_smartphone_24,
        BluetoothClass.Device.TOY_GAME to R.drawable.ic_baseline_gamepad_24,
        BluetoothClass.Device.PHONE_UNCATEGORIZED to R.drawable.ic_baseline_smartphone_24,
        BluetoothClass.Device.COMPUTER_LAPTOP to R.drawable.ic_baseline_computer_24,
        BluetoothClass.Device.COMPUTER_DESKTOP to R.drawable.ic_baseline_computer_24,
        BluetoothClass.Device.COMPUTER_UNCATEGORIZED to R.drawable.ic_baseline_computer_24,
        BluetoothClass.Device.PERIPHERAL_KEYBOARD to R.drawable.ic_baseline_keyboard_24,
        BluetoothClass.Device.AUDIO_VIDEO_HEADPHONES to R.drawable.ic_baseline_headphones_24,
        BluetoothClass.Device.AUDIO_VIDEO_WEARABLE_HEADSET to R.drawable.ic_baseline_headset_mic_24,
        BluetoothClass.Device.AUDIO_VIDEO_HANDSFREE to R.drawable.ic_baseline_headset_mic_24,
        BluetoothClass.Device.AUDIO_VIDEO_LOUDSPEAKER to R.drawable.ic_baseline_speaker_24,
        BluetoothClass.Device.AUDIO_VIDEO_PORTABLE_AUDIO to R.drawable.ic_baseline_speaker_24,
        1288 to R.drawable.ic_baseline_gamepad_24,
        7936 to R.drawable.ic_baseline_headphones_24
    )

    fun getDrawable(device: Int): Int {
        return map.getOrDefault(device, R.drawable.ic_baseline_bluetooth_24)
    }
}