    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package clase;

    import java.time.LocalDate;

    /**
     *
     * @author Yamil
     */
    public class Estudiante extends Persona {

        private int carnet;
        private LocalDate fechaIngreso;
        private LocalDate fechaEgreso;
        private String idCarrera;

        public int getCarnet() {
            return carnet;
        }

        public LocalDate getFechaIngreso() {
            return fechaIngreso;
        }

        public LocalDate getFechaEgreso() {
            return fechaEgreso;
        }

        public String getIdCarrera() {
            return idCarrera;
        }

        public void setFechaIngreso(LocalDate fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
        }

        public void setIdCarrera(String idCarrera) {
            this.idCarrera = idCarrera;
        }

        public Estudiante(int carnet, LocalDate fechaIngreso, LocalDate fechaEgreso, String idCarrera, String cedula, String nombre, LocalDate fecNac, String direccion, int telefono, String email) {
            super(cedula, nombre, fecNac, direccion, telefono, email);
            this.carnet = carnet;
            this.fechaIngreso = fechaIngreso;
            this.fechaEgreso = fechaEgreso;
            this.idCarrera = idCarrera;
        }

        public Estudiante() {
            this.carnet = 0;
            this.fechaIngreso = LocalDate.now();
            this.fechaEgreso = LocalDate.now();
            this.idCarrera = "";
        }

        @Override
        public String toString() {
            return super.toString() + "Estudiante{" + "carnet=" + carnet + ", fechaIngreso=" + fechaIngreso + ", fechaEgreso=" + fechaEgreso + ", idCarrera=" + idCarrera + '}';
        }

    }
