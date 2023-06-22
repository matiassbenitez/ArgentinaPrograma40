/*
1. Director Escolar
2. Jefe de Estudios
4. Asistente o Auxiliar
5. Psicologo
6. Personal de Secretaria
7. Monitor de comedor y de ruta escolar
8. Enfermera escolar
9. Tecnicos e Informaticos
10. Monitores de Actividades Extraescolares
11. Personal de limpieza
13. Bedel o conserje
biblioteca,
decanato
 */
package Entidad_Ej4.Enums;

/*• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).

• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public enum PersoSer {
    DIRECTOR("Director", 1), JEFE_ESTUDIOS("Jefe de Estudios", 2), ASISTENTE_AUXILIAR("Asistente Auxiliar", 3),
    SECRETARIADO("Secretariado", 4), COMEDOR("Comedor", 5), ENFERMERIA("Enfermeria", 6), TECNICO("Tecnico", 7),
    MONITOREO("Monitoreo de Camaras", 8), PER_LIMPIEZA("Personal de Limpieza", 9), PSICOLOGO("Psicologo", 10),
    SEGURIDAD("Seguridad", 11), TUTORIA("Tutoria", 12), ORIENTACION("Orientacion", 13),
    DECANO("Decano", 14), BIBLIOTECA("Biblioteca", 15),CONSERJE("Conserje",16);

    String codigo;
    int num;

    private PersoSer() {
    }

    private PersoSer(String codigo, int num) {
        this.codigo = codigo;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
