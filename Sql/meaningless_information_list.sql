create table if not exists meaningless_information_list(
meaningless_information_list Integer not null,
meaningless_information_list_description Integer null,
rs_version_information_list_code varchar(255) null,
rs_version_information_list_description varchar(255) null,
segment_code varchar(255) null,
segment_description varchar(255) null,
counter_party_available char null,
meaningless_information_counter_party varchar(255) null,
keywords varchar(255) null,
sources varchar(255) null,
branch_bic_id varchar(255) null,
branch_bic_code varchar(255) null,
bic_short_name varchar(255) null,
valid_row varchar(255) null,
uploaded_by varchar(255) null,
uploaded_content varchar(255) null,
validation_rule Integer null,
amended_on varchar(255) null,
entity_state varchar(255) null,
remarks varchar(255) null,
constraint meaningless_information_list_pk primary key(meaningless_information_list));