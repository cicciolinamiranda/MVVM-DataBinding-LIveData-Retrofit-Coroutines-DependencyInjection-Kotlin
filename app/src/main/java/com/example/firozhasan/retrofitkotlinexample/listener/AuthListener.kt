package com.example.firozhasan.retrofitkotlinexample.listener

import com.example.firozhasan.retrofitkotlinexample.model.modelClass.UserX

interface AuthListener{
    fun onStarted()
    fun onSuccess(user: UserX?)
    fun onFailure(message: String)
    fun gotoMainActivity()
}