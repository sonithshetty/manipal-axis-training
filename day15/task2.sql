use banksystem;

CREATE TABLE bank(Name varchar(255), Address varchar(255), BankCode varchar(255));
ALTER TABLE bank ADD BankID int auto_increment primary key;

CREATE TABLE customer(CustomerID int, CustomerName varchar(255), CustomerEmail varchar(255), CustomerPassword varchar(255), CustomerPhone long, CustomerCardNo long);
CREATE TABLE account(AccountNo long, AccountBalance float, AccountType varchar(255));

ALTER TABLE account ADD BankID int;
ALTER TABLE account ADD constraint BankID foreign key (BankID) REFERENCES bank(BankID);

CREATE TABLE transaction(TransactionID int primary key auto_increment, TransactionDate DATE, TransactionAmount float not null, TransactionType varchar(255) not null, CurrentBalance float);
ALTER TABLE transaction ADD AccountID int;
ALTER TABLE transaction ADD constraint AccountID foreign key (AccountID) REFERENCES account(AccountID);

CREATE TABLE atm(Deposit bool, Withdraw bool, CheckBalance bool);
ALTER TABLE atm ADD AccountID int;
ALTER TABLE atm ADD constraint AccountID1 foreign key (AccountID) REFERENCES account(AccountID);

ALTER TABLE atm ADD TransactionID int;
ALTER TABLE atm ADD constraint TransactionID foreign key (TransactionID) REFERENCES transaction(TransactionID);

