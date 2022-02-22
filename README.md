# ProyectoFinalJAVA2021
API Rest desarrollada con Java Maven y Spring - Proyecto final para la aprobacion del INFORMATORIO 2021

---ENUNCIADO---

El Informatorio planea lanzar en varias plataformas (Web, iOS y
Android) una aplicación donde se publicaran varios proyectos startup
(emprendimientos). Donde los emprendedores podrán publicar sus
ideas y de esa forma conseguir votos e inclusive recaudar fondos.
Los emprendimientos podrán ser de diferentes rubros (apps,
desarrollo de productos, etc).
Se podrán conseguir votos y aportes en cualquier momento. Pero
también existirá la posibilidad de suscribirse a eventos en donde el
ganador recibirá el premio del evento.

De las siguientes entidades se necesita conocer y registrar
USUARIO:

● id (autogenerado)
● nombre
● apellido
● email (unico):
● password (se almacenará pero no deberá ser mostrado);
● fecha de creación (o alta)
● ciudad
● provincia
● país
● tipo: USUARIO | COLABORADOR | OWNER

De las siguientes entidades se necesita conocer y registrar
EMPRENDIMIENTO:
● id (autogenerado)
● nombre
● descripción
● contenido (cuerpo de la publicación)
● fecha de creación (o alta)
● Objetivo: $ (recaudacion)
● publicado (true o false)
● URL (capturas) - puede tener 0 o varias
● Tags (ejemplo: #salud, #diversion, etc. Obs: el “#” es decorado)

De las siguientes entidades se necesita conocer y registrar
VOTO:
● id (autogenerado)
● generado por (mobile, web, servicio)
● Usuario (username)
● fecha de creación (o alta)
● Observación: Se asume que los votos son LIKES (no hay negativos)

De las siguientes entidades se necesita conocer y registrar
EVENTO:
● id (autogenerado)
● Detalles del evento (Descripción, info de auspiciantes, premio)
● fecha de creación (o alta)
● fecha de cierre (o alta)
● Estado: ABIERTO | EN CURSO | FINALIZADO
● suscriptores (Emprendimientos que se registraron)
● premio: $


PARA USUARIO SE DEBERÁ PODER REALIZAR LAS
SIGUIENTES OPERACIÓN CON LA API

1 ALTA, BAJA Y MODIFICACIÓN
2 CONSULTA (OBTENER TODOS LOS USUARIOS) ESCONDER EL ATRIBUTO
PASSWORD DE CADA UNO
3 CONSULTA (OBTENER TODOS LOS USUARIOS DE LA CIUDAD DE
RESISTENCIA)
IDEM A #2
4 CONSULTA (OBTENER TODOS LOS USUARIOS QUE FUERON
CREADOS LUEGO DE UNA FECHA DADA)
IDEM A #2

PARA EMPRENDIMIENTOS SE DEBERÁ PODER REALIZAR
LAS SIGUIENTES OPERACIÓN CON LA API

1 ALTA, BAJA Y MODIFICACIÓN DE EMPRENDIMIENTOS
2 CONSULTA - OBTENER TODOS LOS EMPRENDIMIENTOS
3 CONSULTA - OBTENER TODOS LOS EMPRENDIMIENTOS QUE
CONTENGA UN TAG DADO
LA PALABRA PUEDE COINCIDIR EN
CUALQUIER PARTE DEL NOMBRE
4 TRAER TODOS LOS EMPRENDIMIENTOS SIN PUBLICAR

PARA VOTO SE DEBERÁ PODER REALIZAR LAS SIGUIENTES
OPERACIÓN CON LA API

1 ALTA VOTO
2 CONSULTA - OBTENER TODOS LOS VOTOS de Un USUARIO

PARA EVENTO SE DEBERÁ PODER REALIZAR LAS
SIGUIENTES OPERACIÓN CON LA API

1 ALTA, BAJA Y MODIFICACIÓN DE EVENTO
2 CONSULTAR UNA EVENTO (RANKING de Emprendimientos)

