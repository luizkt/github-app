package br.com.fiap.githubapp.model

import com.google.gson.annotations.SerializedName

data class Usuario(
    @SerializedName("name") val name: String,
    @SerializedName("avatar_url") val avatarURL: String
)