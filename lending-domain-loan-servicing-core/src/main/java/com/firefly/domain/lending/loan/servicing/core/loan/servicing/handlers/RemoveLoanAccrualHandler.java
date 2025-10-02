package com.firefly.domain.lending.loan.servicing.core.loan.servicing.handlers;

import com.firefly.common.domain.cqrs.annotations.CommandHandlerComponent;
import com.firefly.common.domain.cqrs.command.CommandHandler;
import com.firefly.core.lending.servicing.sdk.api.LoanAccrualApi;
import com.firefly.domain.lending.loan.servicing.core.loan.servicing.commands.RemoveLoanAccrualCommand;
import reactor.core.publisher.Mono;

@CommandHandlerComponent
public class RemoveLoanAccrualHandler extends CommandHandler<RemoveLoanAccrualCommand, Void> {

    private final LoanAccrualApi loanAccrualApi;

    public RemoveLoanAccrualHandler(LoanAccrualApi loanAccrualApi) {
        this.loanAccrualApi = loanAccrualApi;
    }

    @Override
    protected Mono<Void> doHandle(RemoveLoanAccrualCommand cmd) {
        return loanAccrualApi.delete6(cmd.loanServicingCaseId(), cmd.loanAccrualId()).then();
    }
}