function Persona3(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+ ' '+this.apellido;
    }
}

let padre = new Persona3('Gabriel','Valdes','email@gmail.com');
padre.nombre = 'Luis'; //modificamos el nombre
console.log(padre);
console.log(padre.nombreCompleto()); //utilizamos la funcion

let madre = new Persona3('Laura', 'Contreras', 'lcontrera@gmail.com');
console.log(madre);
console.log(madre.nombreCompleto());