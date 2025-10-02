package com.firefly.domain.lending.loan.servicing.core.loan.servicing.commands;

import com.firefly.common.domain.cqrs.command.Command;
import com.firefly.core.lending.servicing.sdk.model.LoanRateChangeDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class RegisterLoanRateChangeCommand extends LoanRateChangeDTO implements Command<UUID> {

}