Lo primero es la creación de los objetos Auto y Mecanico. El auto es extiende de Observable y el Mecanico implementa Observer.
Una vez creados los objetos, se debe asignar al observado un observador, esto se hace haciendo que el objeto de tipo auto
llame al método addObserver, pasando por parámetro el objeto mecánico, que es el que implementa Observer.
Después se llama al método de Auto que genere un cambio de atributos, en el caso de este ejercicio, los cambios de aceite, 
agua y presión.
Los métodos de cambio de atributos reciben un double. Lo primero que se hace en estos métodos es copiar el objeto previo
a realizar cambios, así se puede guardar el valor anterior. 
Luego se cambia el valor y se llama al método setChanged(), que registra el cambio. El paso siguiente es avisar al objeto
que observa que algo cambió, medante el método notifyObserver(), que se le pasa como parámetro la versión sin actualizar del auto.
Desde el notifyObserver() se llama al método update() del Observer, en este caso el Mecánico. Update() recibe como parámetro
el object que cambió, y el viejo sin cambios, que es el pasado por el notifyObserver. Ahora se verifica cual es el 
estado que cambió, e imprime que cambió, y el valor nuevo y el viejo.
