/**
 * Created by hanks on 16/3/15.
 */
object Utilss {

    fun isEmpty(string: String?): Boolean {
        return string != null && string.length == 0
    }

    fun isWeakEmpty(string: String): Boolean {
        return isEmpty(string) && string.trim { it <= ' ' }.length == 0
    }
}
