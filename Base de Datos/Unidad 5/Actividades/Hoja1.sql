INSERT INTO grupos SET nombre="Repion", localidad="Camargo", estilo="pop-rock alternativo", annoGrab="2014";
INSERT INTO canciones (grupo, titulo, duracion) VALUES (1, "Las flors", "02:54"), (1, "Martes", "4:21"), (1, "La divina Señal", "5:31");
INSERT INTO componentes (nombre, apellidos, funcion, grupo) VALUES ("Marina", "Iñesta", "VOZ", 1), ("Teresa", "Iñesta", "BATERIA", 1), ("Diego", "García", "GUITARRA", 1);
INSERT INTO usuarios (nombre, apellidos, fechaNac, user, password) VALUES ("Ana", "Arias Rodríguez", "1998-08-24", "AnaArias01", "K88$abc");
INSERT INTO votos (usuario, fecha, cancion) VALUES ("AnaArias01", "2024-10-30", 1);
INSERT INTO votos (usuario, fecha, cancion) VALUES ("AnaArias01", "2024-10-30", 2);
INSERT INTO votos (usuario, fecha, cancion) VALUES ("AnaArias01", "2024-10-17", 3);

INSERT INTO usuarios (nombre, apellidos, fechaNac) VALUES ("Alicia", "Ruiz Villalba", "1999-04-25"), ("Elena", "Hierro Arenas", "1999-03-03"), ("Elisa Maria", "Buznego Martinez", "1999-01-03"), ("David", "Lopez Torcida", "1998-10-04");
