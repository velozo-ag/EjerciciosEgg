/* Ejercicio 2 */

SELECT nombre FROM producto;

SELECT nombre, precio FROM producto;

SELECT * FROM producto;

SELECT nombre, round(precio) FROM producto;

SELECT f.nombre, count(f.nombre) FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante GROUP BY f.nombre;

SELECT nombre FROM fabricante ORDER BY nombre ASC;

SELECT nombre, precio FROM producto ORDER BY nombre ASC, precio DESC;

SELECT * FROM producto;
