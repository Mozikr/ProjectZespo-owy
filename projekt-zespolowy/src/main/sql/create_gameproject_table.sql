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

INSERT INTO game_projects (title, short_description, long_description, game_url, picture1_url, picture2_url, picture3_url, icon_url)
VALUES
('Game 1', 'A short description of game 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vel ultrices turpis. Suspendisse non lectus vitae orci sollicitudin rutrum vel vel nulla. Nullam faucibus diam vel suscipit fringilla. Donec pellentesque augue id pharetra ullamcorper. Donec eu felis orci. Maecenas vitae semper nisl, eu tincidunt lacus. Sed at orci ut massa eleifend lacinia ut a diam. Nulla facilisi. Suspendisse mollis, purus vel auctor varius, nulla felis interdum nibh, ut ultricies elit elit in elit.', 'http://www.game1.com', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg'),
('Game 2', 'A short description of game 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vel ultrices turpis. Suspendisse non lectus vitae orci sollicitudin rutrum vel vel nulla. Nullam faucibus diam vel suscipit fringilla. Donec pellentesque augue id pharetra ullamcorper. Donec eu felis orci. Maecenas vitae semper nisl, eu tincidunt lacus. Sed at orci ut massa eleifend lacinia ut a diam. Nulla facilisi. Suspendisse mollis, purus vel auctor varius, nulla felis interdum nibh, ut ultricies elit elit in elit.', 'http://www.game2.com', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg'),
('Game 3', 'A short description of game 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vel ultrices turpis. Suspendisse non lectus vitae orci sollicitudin rutrum vel vel nulla. Nullam faucibus diam vel suscipit fringilla. Donec pellentesque augue id pharetra ullamcorper. Donec eu felis orci. Maecenas vitae semper nisl, eu tincidunt lacus. Sed at orci ut massa eleifend lacinia ut a diam. Nulla facilisi. Suspendisse mollis, purus vel auctor varius, nulla felis interdum nibh, ut ultricies elit elit in elit.', 'http://www.game3.com', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg', 'https://img.itch.zone/aW1hZ2UvMTg2NTgwNi8xMDk2MjU2Mi5qcGc=/original/pjB6Jh.jpg');
