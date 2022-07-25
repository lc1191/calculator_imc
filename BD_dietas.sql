#Creacion tabla
CREATE TABLE dietas(
dieta VARCHAR(200),
calorias INTEGER(4),
desayuno VARCHAR(100),
mediamañana VARCHAR(100),
almuerzo VARCHAR(100),
merienda VARCHAR(100),
cena VARCHAR(100)
);

#Dietas														
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta hipocalorica, controla y limita las calorias que podemos consumir para perder peso' 	,	1000	,	'Leche de vaca descremada y pan de centeno con mantequilla light' 	,	'Pieza de fruta (Manzana)' 	,	'Verduras y pollo al horno' 	,	'Yogur natural' 	,	'Pescado blanco con arroz' 	);
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta alcalina, alimentos alcalinos ricos en minerales beneficiosos para el cuerpo por alto contenido en vitaminas' 	,	1400	,	'Leche descremada con avena' 	,	'Te verde' 	,	'Arroz con faisan' 	,	'Leche de cabra' 	,	'Queso blanco desnatado' 	);
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta por puntos, tipo de dieta según edad, peso, estatura y actividad' 	,	1600	,	'Leche entera y pan de trigo integral con aceite de oliva' 	,	'Frutos secos' 	,	'Calamares con salsa alioli' 	,	'Zumo natural' 	,	'Revuelto de verduras a la plancha' 	);
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta paleo, limita los alimentos procesados, conteniendo alimentos frescos' 	,	1800	,	'Requeson con avena' 	,	'Pieza de fruta (Pera)' 	,	'Atun fresco con patatas al horno' 	,	'Tostada con aceite de oliva' 	,	'Arroz con huevo revuelto' 	);
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta proteica, provocan una perdida de peso, pero son delicadas por la cantidad de proteinas' 	,	2000	,	'Leche de vaca descremada y pan de trigo integral con aceite de oliva' 	,	'Yogur con frutos secos' 	,	'Filete de ternera con verduras' 	,	'Pan de centeno con jamon y queso' 	,	'Merluza en salsa verde' 	);
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta detox, consiste en depurar nuestro organismo a base de alimentos naturales' 	,	2100	,	'Te zarzamora y ciruelas' 	,	'Pieza de fruta (Kiwis)' 	,	'Pavo al horno con guisantes y maiz' 	,	'Yogur desnatado' 	,	'Dorada al horno con guarnicion de verduras' 	);
INSERT INTO `dietas`(`dieta`, `calorias`, `desayuno`, `mediamañana`, `almuerzo`, `merienda`, `cena`) VALUES (	'Dieta hipercalorica, tienen un aporte energetico mayor del que necesitamos' 	,	2500	,	'Leche de oveja  y pan de trigo blanco con jamon' 	,	'Tostada con huevo entero' 	,	'Lomo embuchado con patatas al horno' 	,	'Galletas de chocolate' 	,	'Anchoas con arroz' 	);
