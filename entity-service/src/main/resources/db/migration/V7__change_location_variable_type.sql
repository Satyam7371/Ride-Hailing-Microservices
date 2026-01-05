ALTER TABLE exact_location
DROP
COLUMN latitude;

ALTER TABLE exact_location
DROP
COLUMN longitude;

ALTER TABLE exact_location
    ADD latitude DOUBLE NULL;

ALTER TABLE exact_location
    ADD longitude DOUBLE NULL;