fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val personalInfo = client?.personalInfo ?: return
    val email = personalInfo.email ?: return
    message?.let {
        mailer.sendMessage(email, it)
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
