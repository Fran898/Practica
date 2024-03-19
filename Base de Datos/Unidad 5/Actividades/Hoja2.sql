-- 1
UPDATE usuarios SET nombre="Lourdes", apellidos="Miera Campillo" WHERE user="21meko";
-- 2
SELECT user, votos.* FROM usuarios INNER JOIN votos ON votos.usuario=usuarios.user WHERE usuarios.nombre="Lourdes" AND apellidos="Hernández González";
UPDATE usuarios SET user="13LourHerna" WHERE nombre="Lourdes" AND apellidos="Hernández González";
-- 3
UPDATE usuarios SET contraseña=concat("$",ucase(left(nombre,2)),lcase(left(apellidos,3)),floor(rand()*90)+10);
-- 4 
SELECT user,contraseña,md5(contraseña) FROM usuarios;
UPDATE usuarios SET contraseña=md5(contraseña);
-- 5
SELECT codgrupo FROM grupos WHERE nombre="Repion";
UPDATE canciones SET titulo="La Bahía", duracion="00:05:25" WHERE titulo="La divina Señal" AND grupo=23;
INSERT INTO canciones (grupo, titulo, duracion) VALUES (23, "Las flors", "02:54"), (1, "Martes", "4:21"), (23, "La divina Señal", "5:31");
-- 6
UPDATE canciones SET total_votos= total_votos+3 WHERE grupo =23;
-- 7
SELECT fecha, adddate(fecha, INTERVAL 7 DAYS) FROM votos WHERE fecha<"2022-09-01";
UPDATE votos SET fecha=adddate(fecha, INTERVAL 7 DAY) WHERE fecha<"2022-09-01" ORDER BY fecha DESC;
-- 8
UPDATE votos SET fecha=adddate(fecha, INTERVAL 2 WEEK) ORDER BY fecha DESC LIMIT 10;
-- 9
SELECT * FROM votos WHERE fecha>curdate();
UPDATE votos SET fecha=curdate() WHERE fecha>curdate();
-- 10
SELECT * FROM votos WHERE fecha = "2018-01-03" OR fecha= "2018-01-04";
UPDATE IGNORE votos SET fecha=adddate(fecha, INTERVAl 1 DAY) WHERE fecha = "2018-01-03" OR fecha= "2018-01-04" ORDER BY fecha DESC;