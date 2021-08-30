package com.aeroxr1.multiplepopupusecase.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun clickOnUpdateButton(){

        //questo solo per schermata 1
        showProgressDownload()
        val json = downloadVersionUseCase()
        stopShowProgress()

        // da qui in poi sia per schermata 1 che per schermata 2
        if(shouldShowPopupUrlUseCase(json)){
           showPopupUrl("title", "message", "urlToOpen")
        } else if(showUrlUseCase(json)){
            openUrl("title", "message")
        } else if (shouldUpdateApp()){
            showDownloadProgressDialog()
            downloadAppUseCase()
            //gestione progress
        }

    }

    fun clickOkOnPopupUrl(){
        if(showUrlUseCase(json)){
            openUrl("title", "message")
        } else if (shouldUpdateApp()){
            showDownloadProgressDialog()
            downloadAppUseCase()
            //gestione progress
        }
    }





}