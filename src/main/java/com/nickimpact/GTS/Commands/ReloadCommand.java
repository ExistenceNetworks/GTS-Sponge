package com.nickimpact.GTS.Commands;

import com.nickimpact.GTS.Configuration.MessageConfig;
import com.nickimpact.GTS.GTS;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;

/**
 * Created by Nick on 12/15/2016.
 */
public class ReloadCommand implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        GTS.getInstance().getConfig().reload();
        GTS.getInstance().getMessageConfig().reload();
        src.sendMessage(MessageConfig.getMessage("Admin.Reload"));
        return CommandResult.success();
    }
}
