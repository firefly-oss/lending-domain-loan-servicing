package com.firefly.domain.lending.loan.servicing.core.loan.servicing.workflows;

import com.firefly.common.domain.cqrs.command.CommandBus;
import com.firefly.domain.lending.loan.servicing.core.loan.servicing.commands.RegisterLoanServicingCaseCommand;
import com.firefly.domain.lending.loan.servicing.core.loan.servicing.commands.RemoveLoanServicingCommand;
import com.firefly.transactional.annotations.Saga;
import com.firefly.transactional.annotations.SagaStep;
import com.firefly.transactional.annotations.StepEvent;
import com.firefly.transactional.core.SagaContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

import static com.firefly.domain.lending.loan.servicing.core.loan.utils.constants.GlobalConstants.CTX_LOAN_SERVICING_ID;
import static com.firefly.domain.lending.loan.servicing.core.loan.utils.constants.RegisterLoanServicingConstants.*;


@Saga(name = SAGA_REGISTER_LOAN_SERVICING)
@Service
public class RegisterLoanServicingSaga {

    private final CommandBus commandBus;

    @Autowired
    public RegisterLoanServicingSaga(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    @SagaStep(id = STEP_REGISTER_LOAN_SERVICING, compensate = COMPENSATE_REMOVE_LOAN_SERVICING)
    @StepEvent(type = EVENT_LOAN_SERVICING_REGISTERED)
    public Mono<UUID> registerLoanServicing(RegisterLoanServicingCaseCommand cmd, SagaContext ctx) {
        return commandBus.send(cmd)
                .doOnNext(loanServicingId -> ctx.variables().put(CTX_LOAN_SERVICING_ID, loanServicingId));
    }

    public Mono<Void> removeLoanServicing(UUID loanApplicationId) {
        return commandBus.send(new RemoveLoanServicingCommand(loanApplicationId));
    }

}
