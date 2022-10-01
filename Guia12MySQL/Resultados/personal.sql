/* EJERCICIO 1 */

SELECT * FROM empleado;
SELECT * FROM departamento;

SELECT nombre_depto FROM departamento GROUP BY nombre_depto;

SELECT nombre, salario FROM empleado;

SELECT comision FROM empleado GROUP BY comision;

SELECT * FROM empleado WHERE cargo = 'Secretaria';

SELECT * FROM empleado WHERE cargo = 'Vendedor' ORDER BY nombre;

SELECT nombre, cargo FROM empleado ORDER BY salario;

SELECT nombre, cargo FROM empleado ORDER BY nombre;

SELECT salario, comision FROM empleado WHERE id_depto = 2000 ORDER BY comision;

SELECT nombre, salario + comision + 500 FROM empleado WHERE id_depto = 3000 ORDER BY nombre;

SELECT * FROM empleado WHERE nombre LIKE 'j%';

SELECT nombre, salario, comision, salario + comision FROM empleado WHERE comision > 1000;

SELECT nombre, salario FROM empleado WHERE comision = 0;

SELECT nombre, salario, comision FROM empleado WHERE comision > salario;

SELECT nombre, salario, comision FROM empleado WHERE comision <= (salario * 0.3);

SELECT * FROM empleado WHERE nombre NOT LIKE '%ma%';

SELECT nombre_depto FROM departamento WHERE nombre_depto != 'ventas' AND nombre_depto != 'investigacion' AND nombre_depto != 'mantenimiento';

SELECT nombre_depto FROM departamento WHERE nombre_depto = 'ventas' OR nombre_depto = 'investigacion' OR nombre_depto = 'mantenimiento';

SELECT max(salario) FROM empleado;

SELECT max(nombre) FROM empleado ORDER BY nombre ASC;

SELECT max(salario), min(salario), max(salario) - min(salario) FROM empleado;

SELECT d.nombre_depto, avg(e.salario) FROM departamento d, empleado e WHERE e.id_depto = d.id_depto GROUP BY d.nombre_depto;

SELECT d.nombre_depto, count(*) FROM empleado e, departamento d WHERE e.id_depto = d.id_depto GROUP BY d.nombre_depto HAVING count(*) > 3;

SELECT cod_jefe, nombre FROM empleado WHERE cargo LIKE 'jefe%';

SELECT d.nombre_depto, count(8) FROM departamento d, empleado e WHERE e.id_depto = d.id_depto GROUP BY d.nombre_depto HAVING count(*) = 0;
