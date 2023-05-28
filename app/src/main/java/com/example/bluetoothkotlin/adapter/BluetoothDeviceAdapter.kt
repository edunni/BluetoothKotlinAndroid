package com.example.bluetoothkotlin.adapter

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.bluetoothkotlin.BluetoothDeviceMap
import com.example.bluetoothkotlin.R
import com.google.android.material.imageview.ShapeableImageView

class BluetoothDeviceAdapter(private val bluetoothDevices: ArrayList<BluetoothDevice>, private val context: Context) : RecyclerView.Adapter<BluetoothDeviceAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deviceIcon: ShapeableImageView
        var deviceName: TextView
        var deviceMacadress: TextView

        init {
            deviceIcon = itemView.findViewById(R.id.deviceIcon)
            deviceName = itemView.findViewById(R.id.deviceName)
            deviceMacadress = itemView.findViewById(R.id.deviceMacadress)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.bluetooth_device_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bluetoothDevices.size
    }

    @SuppressLint("MissingPermission")
    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val bluetoothDevice = bluetoothDevices[position]
//        if (ActivityCompat.checkSelfPermission(
//                context,
//                Manifest.permission.BLUETOOTH_CONNECT
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//
//            return
//        }

        holder.deviceName.setText(bluetoothDevice.name)
        holder.deviceMacadress.setText(bluetoothDevice.address)
        val drawable: Int =
            BluetoothDeviceMap().getDrawable(bluetoothDevice.bluetoothClass.deviceClass)
        holder.deviceIcon.setImageResource(drawable)
        Log.d("hugo", "name: ${bluetoothDevice.name} adres: ${bluetoothDevice.address}")
    }

}