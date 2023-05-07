CREATE TABLE game_projects (
  id SERIAL PRIMARY KEY,
  title VARCHAR(255),
  short_description VARCHAR(255),
  long_description TEXT,
  game_url VARCHAR(255),
  picture1_url VARCHAR(255),
  picture2_url VARCHAR(255),
  picture3_url VARCHAR(255),
  icon_url VARCHAR(255)
);

INSERT INTO game_projects (title, short_description, long_description, game_url, picture1_url, picture2_url, picture3_url, icon_url)
VALUES
('NINJA FROG',
'Ninja Frog is about a young frog which really wants to become the best ninja on the frog planet. You can try to help making his dream come true.', 'Ninja Frog is an indie game created using Unity that follows the story of a young frog with an immense desire to become the best ninja on the frog planet. In the game, you can assist the frog in making his dream come true by helping him overcome obstacles and challenges in his path to becoming the ultimate ninja.
<br/><br/>As the player, you will control the movements and actions of the frog, including jumping, running, and attacking. You will have to navigate through various levels, each with its own set of obstacles, enemies, and puzzles. You will need to use your ninja skills and intelligence to outsmart the enemies and solve puzzles to progress through the game.
<br/><br/>The game features vibrant and colorful graphics that create a visually appealing and immersive experience. The sounds and background music also enhance the gameplay and help to immerse the player into the world of Ninja Frog.
<br/><br/>Overall, Ninja Frog is an entertaining and engaging game that challenges players to test their skills and help a young frog achieve his dreams of becoming the ultimate ninja. With its fun gameplay, colorful graphics, and immersive world, Ninja Frog is sure to be a hit with players of all ages.', 'https://mozikr.itch.io/ninja-frog',
'https://img.itch.zone/aW1hZ2UvMTMwNDk3NC83NTkxMjk5LnBuZw==/original/%2FDN%2BMa.png',
'https://img.itch.zone/aW1hZ2UvMTMwNDk3NC83NTkxMzAyLnBuZw==/original/Swh6Gi.png',
'https://img.itch.zone/aW1hZ2UvMTMwNDk3NC83NTkxMzA2LnBuZw==/original/MHR%2Bt8.png',
'https://img.itch.zone/aW1nLzc1OTE4MzcucG5n/315x250%23c/9bf7YF.png'),

('HURRY CUBE',
'In Hurry Cube, you control a red cube and your objective is to avoid obstacles along the way. The game features a simple yet challenging gameplay that requires quick reflexes and precise movements.',
'Hurry Cube is an exciting and addictive game created using Unity that challenges players to navigate a red cube through a series of obstacles. The game features a simple yet challenging gameplay that requires quick reflexes and precise movements to avoid the obstacles and progress through the levels.
<br/><br/>As the player, you control the red cube and must use your skills to dodge obstacles along the way. The game features a variety of obstacles, each with its own unique challenge. As you progress through the levels, the obstacles become increasingly difficult, testing your reflexes and agility to the limit.
<br/><br/>One of the unique features of Hurry Cube is its minimalist design. The games graphics are simple and clean, with a focus on gameplay and mechanics rather than flashy visuals. This creates a highly immersive experience, where the player can focus on the action without being distracted by unnecessary elements.
<br/><br/>In addition to its gameplay and design, Hurry Cube also features a catchy soundtrack that keeps the player engaged and motivated throughout the game. The sound effects are also well-designed, adding to the overall experience.
<br/><br/>Overall, Hurry Cube is a highly addictive game that challenges players to test their reflexes and agility. With its simple yet challenging gameplay, minimalist design, and catchy soundtrack, this game is sure to provide hours of entertainment for players of all ages.',
'https://mozikr.itch.io/hurrycube',
'https://img.itch.zone/aW1hZ2UvNzMxNjg2LzQwNjg0NjQucG5n/original/Vypcai.png',
'https://img.itch.zone/aW1hZ2UvNzMxNjg2LzQwNjg0NjcucG5n/original/wIKzu7.png',
'https://img.itch.zone/aW1hZ2UvNzMxNjg2LzQwNjg0NjYucG5n/original/2rP122.png',
'https://img.itch.zone/aW1nLzQwNjg0OTcucG5n/315x250%23c/X8vdoA.png'),

('VOID',
'In Void, you find yourself stranded in a void and must fend off waves of incoming monsters. Armed with a variety of weapons and power-ups, you must fight your way through the hordes of monsters to survive.',
'Void is a thrilling game that immerses players into a world where they must fight off hordes of monsters to survive. In this game, you find yourself stranded in a void, and it is up to you to fend off the incoming waves of monsters. With a variety of weapons and power-ups at your disposal, you must fight your way through the endless waves of monsters to stay alive.
<br/><br/>As the player, you control a character with a variety of weapons, including guns, swords, and grenades. The monsters come in all shapes and sizes, ranging from small and fast to large and powerful, and each type requires a different strategy to defeat. To make matters more challenging, the monsters come in waves, and with each wave, their numbers and strength increase.
<br/><br/>To help you in your quest to survive, the game features a variety of power-ups that can be collected throughout the game. These power-ups can boost your health, increase your damage output, or grant temporary invincibility.
<br/><br/>The games graphics and sound effects create an immersive experience that adds to the intensity of the gameplay. The monsters are well-designed and menacing, and the explosions and gunfire add to the chaos of the battle.
<br/><br/>Overall, Void is an exciting and challenging game that requires quick reflexes and strategic thinking. With its variety of weapons, power-ups, and challenging monsters, the game offers a high level of replayability and is sure to keep players entertained for hours on end.',
'https://mozikr.itch.io/void',
'https://img.itch.zone/aW1hZ2UvNjI3NDM1LzMzNTE1MDAucG5n/original/kscpUf.png',
'https://img.itch.zone/aW1hZ2UvNjI3NDM1LzMzNTE1MDEucG5n/original/lA35%2Fd.png',
'https://img.itch.zone/aW1hZ2UvNjI3NDM1LzMzNTE1MDMucG5n/original/FE4Hzj.png',
'https://img.itch.zone/aW1nLzMzNDU3MzAucG5n/315x250%23c/M9RPeX.png');