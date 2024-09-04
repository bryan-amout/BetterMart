package com.example.bettermart.models

class Adminlogin {
    var emailadmin:String = "admin@gmail.com"
    var passwordadmin:String = "123456"
    var id:String = ""

    constructor(name: String, email: String, password: String, id: String) {
        this.emailadmin = emailadmin
        this.passwordadmin = passwordadmin
        this.id = id
    }

    constructor()
}