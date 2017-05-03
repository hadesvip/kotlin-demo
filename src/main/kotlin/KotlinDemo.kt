import com.domain.User

/**
 * Created by wangyong on 2017/5/3.
 */

fun main(args: Array<String>) {
    var user = User()
    user.password = "123456"
    user.userName = "admin"

    println(user.userName)
    println("hello,kotlin")
}

