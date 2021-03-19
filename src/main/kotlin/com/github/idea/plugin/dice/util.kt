package com.github.idea.plugin.dice

import com.github.syari.spigot.api.string.toColor
import org.bukkit.command.CommandSender

fun CommandSender.send(message: String) {
    sendMessage("&b[Dice] &r$message".toColor())
}