package com.gv.recyclermasterkotlin.model

data class Email (
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var  selected:Boolean=false
)

class EmailBuilder {
    var user: String= ""
    var subject: String=""
    var preview: String=""
    var date: String=""
    var stared: Boolean= false
    var unread: Boolean=false

    fun buid() : Email = Email(user,subject,preview,date,stared,unread,false)
}
fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).buid()

fun fakeEmails() :MutableList<Email> = mutableListOf(

    email { user ="Facebook"
    subject="Veja a batata doce da vida e ganhe desconto em sua viagem"
    preview="Ola Victor , vc precisa ver a vida sobre tudo que há"
    date="06 jan"
    stared=false},

    email { user ="Youtube"
        subject="Veja a batata doce da vida e ganhe desconto em sua viagem"
        preview="Ola Victor , vc precisa ver a vida sobre tudo que há"
        date="12 jan"
        stared=false},

    email { user ="Insta"
        subject="Veja a batata doce da vida e ganhe desconto em sua viagem"
        preview="Ola Victor , vc precisa ver a vida sobre tudo que há"
        date="13 jan"
        stared=false
          unread=true},

    email { user ="twiter"
        subject="Veja a batata doce da vida e ganhe desconto em sua viagem"
        preview="Ola Victor , vc precisa ver a vida sobre tudo que há"
        date="15 jan"
        stared=false}
)