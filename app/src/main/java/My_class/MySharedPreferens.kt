package My_class

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreferens {
    private const val NAME = "MySharedPreferens"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var dateString: String?
        get() = preferences.getString("StringDate", "[]")
        set(value) = preferences.edit {
            if (value != null) {
                it.putString("StringDate", value)
            }
        }
}

fun gsontoArray(gsonString: String): ArrayList<Users> {
    var arrayList = ArrayList<Users>()
    val type = object : TypeToken<ArrayList<Users>>() {}.type
    arrayList = Gson().fromJson(gsonString, type)
    return arrayList
}

  fun arraytoGson(arrayList: ArrayList<Users>):String{
      return Gson().toJson(arrayList)
  }