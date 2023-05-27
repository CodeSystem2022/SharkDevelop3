//Uso del prototype
Persona3.prototype.telefono = '2618383832';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5492618383832';
console.log(madre.telefono);

//Uso de call (nos va permitir llamar un metodo que esta definido en otro objeto, desde otro objeto)
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = { 
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '5492618383834'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ingeniero', '254626416'));

//Método Apply (nos permite llamar un método que no se encuentra definido,en otro objeto)
let arreglo = ['Ing.', '5492618383834'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
