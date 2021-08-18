package ru.vdv.myapp.mygitapiapp.model

import android.content.Context
import android.net.Uri
import android.graphics.Bitmap
import android.provider.MediaStore
import android.util.Log
import androidx.core.net.toUri
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream

/**
 * Класс Конвертер файлов изображений из jpg d png
 *
 */

class ConverterJpgToPng(val currentContext: Context) {
    private val TAG = "VDV_ConverterJpgToPng"

    fun convert(uri: Uri): Uri{
        val tempConvertedFile = File.createTempFile("tmpConvert", ".png")
        Log.d(TAG, "временный файл создан$tempConvertedFile")
        uri.let {
            Log.d(TAG, "Нажата кнопка старта конвертации")
            val fos = FileOutputStream(tempConvertedFile)
            val bos = BufferedOutputStream(fos)
            val mim =
                MediaStore.Images.Media.getBitmap(currentContext.contentResolver, uri)
            mim.compress(Bitmap.CompressFormat.PNG, 100, bos)
            bos.close()
            fos.close()
            Log.d(TAG,"Результат " + tempConvertedFile.toUri())
        }
        return tempConvertedFile.toUri()
    }


    /**
     * Прерывает процесс конвертации
     *
     */
    fun stopConverting() {

    }

}