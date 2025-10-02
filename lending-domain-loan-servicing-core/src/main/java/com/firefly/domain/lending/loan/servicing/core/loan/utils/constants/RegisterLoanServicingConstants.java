package com.firefly.domain.lending.loan.servicing.core.loan.utils.constants;

public class RegisterLoanServicingConstants {

    // ============================== SAGA CONFIGURATION ==============================
    public static final String SAGA_REGISTER_LOAN_SERVICING = "RegisterLoanServicingSaga";

    // ============================== STEP IDENTIFIERS ==============================
    public static final String STEP_REGISTER_LOAN_SERVICING = "registerLoanServicing";
    public static final String STEP_REGISTER_LOAN_ACCRUAL = "registerLoanAccrual";

    // ============================== COMPENSATE METHODS ==============================
    public static final String COMPENSATE_REMOVE_LOAN_SERVICING = "removeLoanServicing";
    public static final String COMPENSATE_REMOVE_LOAN_ACCRUAL = "removeLoanAccrual";

    // ============================== EVENT TYPES ==============================
    public static final String EVENT_LOAN_SERVICING_REGISTERED = "loanServicing.registered";
    public static final String EVENT_LOAN_ACCRUAL_REGISTERED = "loanAccrual.registered";


}
