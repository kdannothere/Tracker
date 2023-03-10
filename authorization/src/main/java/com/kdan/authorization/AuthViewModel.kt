package com.kdan.authorization

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AuthViewModel : ViewModel() {
    val auth: FirebaseAuth = Firebase.auth
    val isUserLoggedIn
        get() = auth.currentUser != null
    var email = ""
    var password = ""
    val messageCodes = mutableListOf<Int>()
    val showDialog = mutableStateOf(false)

    fun logOut() = run { auth.signOut() }
}