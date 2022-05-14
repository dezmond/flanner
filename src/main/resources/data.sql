DROP TABLE IF EXISTS meal;

CREATE TABLE meal (
  id INT PRIMARY KEY,
  meal_Name VARCHAR(250) NOT NULL  
);

INSERT INTO meal (id, name) VALUES
  (1, 'Egg & Bacon'),
  (2, 'Jacket Potato'),
  (3, 'Flinglish');