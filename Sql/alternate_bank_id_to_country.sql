create table if not exists alternate_bank_id_to_country(
bank_id varchar(255) not null,
country_code varchar(255) null,
quality_grade varchar(255) null,
bank_id_to_country_system varchar(255) null,
bank_id_to_country_system_code varchar(255) null,
bank_id_to_country_system_description varchar(255) null,
known_quality_issues varchar(255) null,
risk_level Integer null,
mitigation varchar(255) null,
approval_code varchar(255) null,
entity_state varchar(255) null,
constraint alternate_bank_id_to_country_pk primary key(bank_id));