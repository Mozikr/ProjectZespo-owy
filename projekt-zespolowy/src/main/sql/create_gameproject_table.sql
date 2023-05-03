CREATE TABLE game_projects (
  id SERIAL PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  short_description VARCHAR(255) NOT NULL,
  long_description TEXT NOT NULL,
  game_url VARCHAR(255),
  picture1_url VARCHAR(255),
  picture2_url VARCHAR(255),
  picture3_url VARCHAR(255),
  icon_url VARCHAR(255)
);
