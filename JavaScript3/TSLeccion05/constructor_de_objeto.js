function Persona3(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
}

let padre = new Persona3('Gabriel','Valdes','email@gmail.com');
padre.nombre = 'Luis';
console.log(padre);

let madre = new Persona3('Laura', 'Contreras', 'lcontrera@gmail.com');
console.log('madre');