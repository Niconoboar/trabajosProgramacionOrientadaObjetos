
    class Estudiante extends Persona {
        private String curso;
        private double notaPromedioFinal;

        public Estudiante(String nombre, String sexo, int edad, String telefono, String curso, double notaPromedioFinal) {
            super(nombre, sexo, edad, telefono);
            this.curso = curso;
            this.notaPromedioFinal = notaPromedioFinal;
        }

        public String getCurso() {
            return curso;
        }

        public double getNotaPromedioFinal() {
            return notaPromedioFinal;
        }
    }
