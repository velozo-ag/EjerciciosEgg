

SELECT * FROM jugador;
SELECT * FROM equipo;
SELECT * FROM estadistica;

/* CANDADO A ------------------------------ */

SELECT asistencias_por_partido , count(*) FROM estadistica GROUP BY asistencias_por_partido ORDER BY Asistencias_por_partido desc; 

SELECT sum(j.peso) FROM equipo e, jugador j WHERE e.conferencia = 'east' AND j.posicion LIKE '%c%' AND j.nombre_equipo = e.nombre;

/* CANDADO B ------------------------------ */

SELECT count(*) 
FROM estadistica e, jugador j 
WHERE e.jugador = j.codigo 
AND j.nombre_equipo = 'heat'
AND e.asistencias_por_partido > (select count(j.nombre) from jugador j where j.nombre_equipo = 'heat');

SELECT count(*) FROM partido WHERE partido.temporada IN ('98/99','99/00');

/* CANDADO C ------------------------------ */

SELECT count(*) FROM jugador, equipo WHERE jugador.procedencia = 'Michigan' AND equipo.conferencia = 'west';
SELECT count(jugador.peso) FROM jugador WHERE peso > 195; 

SELECT avg(Puntos_por_partido) + count(asistencias_por_partido) + sum(tapones_por_partido) from estadistica, jugador, equipo
where equipo.division = 'central' and jugador.codigo = estadistica.jugador and jugador.nombre_equipo = equipo.nombre;

/* CANDADO D ------------------------------ */

SELECT sum(puntos_por_partido) FROM estadistica, jugador WHERE estadistica.jugador = jugador.codigo and jugador.procedencia = 'argentina';
