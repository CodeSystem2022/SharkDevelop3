package UTN.datos;
import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;

import  java.util.List;

import java.util.ArrayList;

import  java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Connection;
public class EstudianteDAO {
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

    //Metodo por id -> find by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            } //fin if
        } catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante"+e.getMessage());
        }finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar conexion "+e.getMessage());
            } //fin catch
        } //fin finally
        return false;
    }

    //Metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        } catch(Exception e){
            System.out.println("Ocurrio un error al agregar estudiante: "+e.getMessage());
            return false;
        } //fiin catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar la conexion"+e.getMessage());
            }
        }
    }//fin metodoagregarestudiante

    //Metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            return true;
        } catch (Exception e){
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        } //fin catch
        finally{
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar la conexion "+e.getMessage());
            } //fin catch
        }//fin finally
        return false;
    }

    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e){
            System.out.println("Error al eliminar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }

        }
        return false;
    }





    public static void main(String[] args){
        var estudianteDao = new EstudianteDAO();
        //modificar estudiante
        //var estudianteModificado = new Estudiante(1, "Juliana", "Ramirez", "45677889", "juarez1241@email.com" );
        //var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        //if(modificado)
        //    System.out.println("Estudiante modificado: "+estudianteModificado);
        // else
        //    System.out.println("No se modifico el estudiante: "+estudianteModificado);

        // agrega restudiante
        var nuevoEstudiante = new Estudiante("Maria", "Lara", "2455233332", "mariaLara433@email.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("Se agrego el estudiante: "+nuevoEstudiante);
        else
            System.out.println("No se pudo agregar el estudiante: "+nuevoEstudiante);

        //listar estudiantes

        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//lambda para imprimir

        //buscar por id
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de la busqueda: "+estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado)
            System.out.println("Estudiante encontrado: "+estudiante1);
        else
            System.out.println("No se encontro el estudiante"+estudiante1.getIdEstudiante());
        // Eliminar estudiante con id 4
        var estudianteEliminar = new Estudiante(4);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminar);
        if(eliminado)
            System.out.println("Estudiante eliminado: "+ estudianteEliminar);
        else
            System.out.println("No se pudo eliminar el estudiante: "+estudianteEliminar);

    }

}

