INSERT INTO CUSTOMER(ID, FIRST_NAME, LAST_NAME) VALUES
(100, 'PraveenKumar', 'Ganthali'),
(101, 'Tom', 'Hardy'),
(102, 'Drew', 'Barrymore');

INSERT INTO TRANSACTION(ID, POSTED_TIME, CUSTOMER_ID, AMOUNT) VALUES
(2000, parsedatetime('01-01-2020 10:45:55', 'dd-MM-yyyy hh:mm:ss'), '100', 120),
(2001, parsedatetime('01-01-2020 11:30:55', 'dd-MM-yyyy hh:mm:ss'), '100', 50),
(2002, parsedatetime('01-01-2020 13:55:55', 'dd-MM-yyyy hh:mm:ss'), '100', 4500),
(2003, parsedatetime('01-01-2020 10:45:55', 'dd-MM-yyyy hh:mm:ss'), '101', 120),
(2004, parsedatetime('01-02-2020 11:30:55', 'dd-MM-yyyy hh:mm:ss'), '101', 150),
(2005, parsedatetime('01-03-2020 13:55:55', 'dd-MM-yyyy hh:mm:ss'), '101', 22500),
(2006, parsedatetime('01-01-2020 10:45:55', 'dd-MM-yyyy hh:mm:ss'), '102', 12),
(2007, parsedatetime('01-02-2020 11:30:55', 'dd-MM-yyyy hh:mm:ss'), '102', 500),
(2008, parsedatetime('01-03-2020 13:55:55', 'dd-MM-yyyy hh:mm:ss'), '102', 9500);
