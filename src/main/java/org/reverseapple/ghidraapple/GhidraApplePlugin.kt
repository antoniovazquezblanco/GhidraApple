package org.reverseapple.ghidraapple

import ghidra.app.plugin.ProgramPlugin
import ghidra.framework.plugintool.PluginInfo
import ghidra.framework.plugintool.PluginTool
import ghidra.framework.plugintool.util.PluginStatus
import ghidra.program.model.listing.Program

@PluginInfo(
    status = PluginStatus.RELEASED,
    packageName = "GhidraApple",
    category = "test category",
    shortDescription = "short desc",
    description = "long desc"
)
class GhidraApplePlugin(tool: PluginTool) : ProgramPlugin(tool) {

    private lateinit var program: Program

}