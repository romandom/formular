CREATE TABLE form(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	kind_of_request varchar(20) NOT NULL,
	policy_number varchar(20) NOT NULL,
	name varchar(20) NOT NULL,
	surname varchar(20) NOT NULL,
	your_request varchar(5000) NOT NULL
);

CREATE TABLE kind_of_request(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    kind_of_request varchar(20) NOT NULL
);
