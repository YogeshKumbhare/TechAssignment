create the table in postgres sql and copy all the excel sheet data excel to database .

create table citi
(
  id serial NOT NULL,
  town VARCHAR(150),
  urban_state VARCHAR(50),
  state_code VARCHAR(50) ,
  state VARCHAR(255),
  district_code VARCHAR(50) ,
  district VARCHAR(100), 
  CONSTRAINT citi_pkey PRIMARY KEY (id)
);

Excel to database command 

\copy citi from 'C:\Users\yogesh_kumbhare\Desktop\City List.csv' DELIMITER ',' CSV HEADER;