let persona = {
	nombre : 'Lucas',
	apellido : 'Lavena',
	edad : 25,
	email : 'lucaslavena999@gmail.com',
	idioma : 'ES',
	 nombreCompleto: function() {
		return this.nombre +' '+this.apellido;
	},
	get nombreYedad(){
		return 'Nombre: '+this.nombre+' Edad: '+this.edad;
	},
	get leng(){
		return this.idioma.toUpperCase();
	},
	set lang(lang){
		this.idioma = lang.toUpperCase();
	}
}
console.log(persona.nombreCompleto())

let persona2 = new Object();
persona2.nombre = 'Juan';
persona2.apellido = 'Lorenzo';
persona2.edad = 23;
persona2.email = 'yo@hotmail.com.ar';

console.log(persona2);
console.log(persona.nombreYedad);
