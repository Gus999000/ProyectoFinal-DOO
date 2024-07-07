# ProyectoFinal-DOO
Nombres:

Gustavo Alonso Benítez Céspedes

Gustavo Alonso González Anabalón

Tema 2: Sistema de reserva de asientos de autobús:

El sistema de reserva de asientos de autobús permite al personal de una empresa de autobús elegir y reservar asientos de forma conveniente por su cliente. Los usuarios pueden  visualizar una representación gráfica de los asientos disponibles en el  autobús y seleccionar los que deseen ocupar. El sistema muestra información detallada sobre cada asiento, como su ubicación, número y  categoría (por ejemplo, semi cama, Salón Cama).

Una vez que los usuarios seleccionan los asientos deseados, el sistema verifica la disponibilidad y permite confirmar la reserva mostrando el precio a pagar. En caso de que algún asiento ya esté reservado por otro pasajero, se informa al usuario para que pueda elegir otro asiento disponible. El personal confirma el pago (no gestionado por el sistema) lo que reserva los asientos.

El sistema debe gestionar varios tipos de autobuses (por ejemplo, con diferente número de plazas, o de 1 o 2 pisos...).

El sistema debe mostrar un menú que permita seleccionar el autobús en función de su horario y recorrido (se supone que estos datos están disponibles con los autobuses vacíos cuando se lanza el software).

Cambiamos el sistema de autobuses a naves espaciales y le añadimos nuevas categorías de asientos.

Al ejecutar el programa se muestran las 5 naves espaciales disponibles, con horarios y destino (Interfaz/VentanaPrincipal.png).
Al seleccionar una nave, se abre una ventana mostrando su interior (Interfaz/VentanaApolo11.png, Interfaz/VentanaArcaDelVacío.png, Interfaz/VentanaHalcónMilenario.png, Interfaz/VentanaMorningStar.png) y al seleccionar la nave UES Contact Light se abren los 10 “pisos” disponibles (Interfaz/VentanaUESContactLightPiso1-10.png). Se exponen los asientos disponibles en verde, al clicar en uno se abre una ventana mostrando información del asiento (Interfaz/VentanaReservar.png) y dando la opción de “Reservar”, al reservar el asiento, este cambia del color verde al rojo indicando que no esta disponible.

Empezamos haciendo las ventanas y naves por temas de orden.

Decidimos crear un panel de naves espaciales que cambia según la instancia.

Al hacer los paneles de los asientos estos no cambiaban el color del fondo, así que decidimos hacer del panel entero un botón que cambia de color.

Podríamos haber implementado los “pisos” del UES Contact Light de una mejor manera.
