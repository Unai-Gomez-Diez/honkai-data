package edu.iesam.honkai_data.feature.playable_character.domain

import kotlinx.serialization.Serializable

@Serializable
data class PlayableCharacter(
    val id: Int,
    val name: String,
    val rarity: Int,
    val path: String,
    val element: String,
    val release: String,
    val introduction: String,
    val img: String
)