-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public.users
(
    id integer NOT NULL,
    email character varying(30) NOT NULL,
    password character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employees
(
    id integer NOT NULL,
    email character varying(30) NOT NULL,
    password character varying(50) NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    nationality_id character varying(11) NOT NULL,
    date_of_birth date NOT NULL,
    user_id integer NOT NULL,
    personal_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employers
(
    id integer NOT NULL,
    email character varying(30) NOT NULL,
    password character varying(50) NOT NULL,
    company_name character varying(50) NOT NULL,
    website character varying(50) NOT NULL,
    phone_number character varying(20) NOT NULL,
    user_id integer NOT NULL,
    personal_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."systemPersonals"
(
    id integer NOT NULL,
    email character varying(30) NOT NULL,
    password character varying(50) NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    user_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.job_positions
(
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    personal_id integer NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.employees
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public."systemPersonals"
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employees
    ADD FOREIGN KEY (personal_id)
    REFERENCES public."systemPersonals" (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (personal_id)
    REFERENCES public."systemPersonals" (id)
    NOT VALID;


ALTER TABLE public.job_positions
    ADD FOREIGN KEY (personal_id)
    REFERENCES public."systemPersonals" (id)
    NOT VALID;

END;