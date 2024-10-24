package edu.iesam.honkai_data.feature.playable_character.domain

class GetPlayableCharactersUseCase(private val repository: PlayableCharacterRepository) {
    suspend fun invoke(): List<PlayableCharacter> {
        return repository.getPlayableCharacters()
    }
}