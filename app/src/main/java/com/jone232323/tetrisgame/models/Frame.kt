package com.jone232323.tetrisgame.models

import com.jone232323.tetrisgame.helpers.array2dOfByte

class Frame(private val width:Int) {

    val data: ArrayList<ByteArray> = ArrayList()

    fun addRow(byteStr:String):Frame{

        val row = ByteArray(byteStr.length)

        for (i in byteStr.indices){
            row[i] = "${byteStr[i]}".toByte()
        }

        data.add(row)
        return this
    }

    fun as2dOfByteArray():Array<ByteArray>{
        val bytes = array2dOfByte(data.size,width)

        return data.toArray(bytes)
    }
}