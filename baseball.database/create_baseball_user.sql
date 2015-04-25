-- Use double quotes around username otherwise it will be all upper case.
CREATE USER "baseball_user" PASSWORD password;
-- Set the default schema for the user.
ALTER USER "baseball_user" SET INITIAL SCHEMA baseball;
-- Grant the DBA role to the user.
--GRANT DBA to "baseball_user";
