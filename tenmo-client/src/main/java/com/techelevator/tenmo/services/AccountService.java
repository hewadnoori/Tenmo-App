package com.techelevator.tenmo.services;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.AuthenticatedUser;
import com.techelevator.tenmo.model.Transfer;

public interface AccountService {
    Account getBalance(AuthenticatedUser authenticatedUser);
    public Transfer[] list_transaction(AuthenticatedUser authenticatedUser);
    public Account approveTransferFunds(AuthenticatedUser authenticatedUser,Transfer transfer);
    public Transfer[] list_pending_requests(AuthenticatedUser authenticatedUser);
}