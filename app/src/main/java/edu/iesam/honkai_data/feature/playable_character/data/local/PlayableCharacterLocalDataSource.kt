package edu.iesam.honkai_data.feature.playable_character.data.local

import android.content.Context
import com.google.gson.Gson
import edu.iesam.honkai_data.feature.playable_character.domain.PlayableCharacter

class PlayableCharacterLocalDataSource(context: Context) {
    private val sharedPreferences = context.getSharedPreferences(
        "playable_characters", Context.MODE_PRIVATE
    )
    private val gson = Gson()

    fun savePlayableCharacters(playableCharacters: List<PlayableCharacter>) {
        val editor = sharedPreferences.edit()
        playableCharacters.forEach {
            editor.putString(it.id.toString(), gson.toJson(it))
        }
        editor.apply()
    }

    fun savePlayableCharacter(playableCharacter: PlayableCharacter) {
        val editor = sharedPreferences.edit()
        editor.putString(playableCharacter.id.toString(), gson.toJson(playableCharacter))
        editor.apply()
    }

    fun getPlayableCharacters():List<PlayableCharacter>{
        val playableCharacters = mutableListOf<PlayableCharacter>()
        sharedPreferences.all.forEach {
            playableCharacters.add(gson.fromJson(it.value as String, PlayableCharacter::class.java))
        }
        return playableCharacters
    }

    fun getPlayableCharacter(id: Int): PlayableCharacter {
        return gson.fromJson(sharedPreferences.getString(id.toString(), ""), PlayableCharacter::class.java)
    }

}