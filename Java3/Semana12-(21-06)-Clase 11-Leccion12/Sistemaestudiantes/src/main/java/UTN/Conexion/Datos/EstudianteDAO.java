package UTN.Conexion.Datos;

import UTN.dominio.Estudiante;

import static UTN.Conexion.Conexion.getConnection;

import  java.util.List;

import java.util.ArrayList;

import  java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Connection;


public class EstudianteDAO{
    // Método listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //Objetos necesarios comunicacion BD
        PreparedStatement ps;//envia sentencia
        ResultSet rs;//guarda el resultado
        //Creamos objeto conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //falta agregarlo a la lista
                estudiantes.add(estudiante);

            }
        }catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos"+e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion"+e.getMessage());
            }
        }//Fin Finally

        return estudiantes;
    }//Fin método listar

    public static void main(String[] args){
        //listar estudiantes
        var estudiantesDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudiantesDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//lambda para imprimir
    }

}