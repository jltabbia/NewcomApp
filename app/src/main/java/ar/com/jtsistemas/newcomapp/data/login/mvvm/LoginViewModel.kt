package ar.com.jtsistemas.newcomapp.data.login.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LoginViewModel(val user: String, val pass: String): ViewModel() {

}
@Suppress("UNCHECKED_CAST")
class LoginViewModelFactory(val user:String, val pass:String): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(user, pass) as T
    }
}