package com.firefly.domain.lending.loan.servicing.core.loan.servicing.commands;

import com.firefly.common.domain.cqrs.command.Command;
import lombok.Data;

import java.util.UUID;

@Data
public class GenerateScheduleCommand  implements Command<UUID> {

}