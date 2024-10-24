package edu.iesam.honkai_data.feature.playable_character.data.remote

import edu.iesam.honkai_data.app.api.Ktor
import edu.iesam.honkai_data.feature.playable_character.domain.PlayableCharacter
import io.ktor.client.call.body
import io.ktor.client.request.get

class PlayableCharacterRemoteDataSource {
    val client = Ktor().client

    suspend fun getPlayableCharacters(): List<PlayableCharacter> {
        val response: List<PlayableCharacter> = client.get("https://api.example.com/playable_characters").body()
        return response
    }

    suspend fun getPlayableCharacter(id: Int): PlayableCharacter {
        val response: PlayableCharacter = client.get("https://api.example.com/playable_characters/$id").body()
        return response
    }
}