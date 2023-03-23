INSERT INTO HW10S.Client (name) VALUES
                              ('John'),
                              ('Mary'),
                              ('Peter'),
                              ('Alice'),
                              ('Bob'),
                              ('Jane'),
                              ('David'),
                              ('Karen'),
                              ('Michael'),
                              ('Sarah');
INSERT INTO HW10S.Planet (ID, name) VALUES
                                  ('EARTH', 'Earth'),
                                  ('MARS', 'Mars'),
                                  ('JUPITER', 'Jupiter'),
                                  ('SATURN', 'Saturn'),
                                  ('NEPTUNE', 'Neptune');
INSERT INTO HW10S.Ticket (created_at, client_id, from_planet_id, to_planet_id)
VALUES
  ( '2023-03-21 10:00:00+02', 1, 'EARTH', 'MARS'),
  ( '2023-03-21 11:00:00+02', 2, 'MARS', 'JUPITER'),
  ( '2023-03-21 12:00:00+02', 3, 'JUPITER', 'SATURN'),
  ( '2023-03-21 13:00:00+02', 4, 'SATURN', 'NEPTUNE'),
  ( '2023-03-21 14:00:00+02', 5, 'NEPTUNE', 'EARTH'),
  ( '2023-03-21 15:00:00+02', 6, 'EARTH', 'MARS'),
  ( '2023-03-21 16:00:00+02', 7, 'MARS', 'JUPITER'),
  ( '2023-03-21 17:00:00+02', 8, 'JUPITER', 'SATURN'),
  ( '2023-03-21 18:00:00+02', 9, 'SATURN', 'NEPTUNE'),
  ( '2023-03-21 19:00:00+02', 10, 'NEPTUNE', 'EARTH');