use banksystem;

create table transaction(transactionId int primary key auto_increment, transactionType varchar(255) not null, transactionAmount FLOAT not null, transactionDate DATE, transactionTime TIME, accountid int, FOREIGN KEY(accountid) references account(accountid));
