package edu.iesam.honkai_data.feature.playable_character.domain

class GetPlayableCharacterUseCase(private val repository: PlayableCharacterRepository) {
    suspend fun invoke(id: Int): PlayableCharacter {
        return repository.getPlayableCharacter(id)
    }
}