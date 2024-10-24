package edu.iesam.honkai_data.feature.playable_character.data

import edu.iesam.honkai_data.feature.playable_character.data.local.PlayableCharacterLocalDataSource
import edu.iesam.honkai_data.feature.playable_character.data.remote.PlayableCharacterRemoteDataSource
import edu.iesam.honkai_data.feature.playable_character.domain.PlayableCharacter
import edu.iesam.honkai_data.feature.playable_character.domain.PlayableCharacterRepository

class PlayableCharacterDataRepository(
    private val remoteDataSource: PlayableCharacterRemoteDataSource,
    private val localDataSource: PlayableCharacterLocalDataSource
): PlayableCharacterRepository {
    override suspend fun getPlayableCharacters(): List<PlayableCharacter> {
        TODO("Not yet implemented")
    }

    override suspend fun getPlayableCharacter(id: Int): PlayableCharacter {
        TODO("Not yet implemented")
    }
}