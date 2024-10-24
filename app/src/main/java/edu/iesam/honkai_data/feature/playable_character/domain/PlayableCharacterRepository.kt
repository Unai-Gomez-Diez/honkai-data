package edu.iesam.honkai_data.feature.playable_character.domain

interface PlayableCharacterRepository {

    suspend fun getPlayableCharacters(): List<PlayableCharacter>

    suspend fun getPlayableCharacter(id: Int): PlayableCharacter
}