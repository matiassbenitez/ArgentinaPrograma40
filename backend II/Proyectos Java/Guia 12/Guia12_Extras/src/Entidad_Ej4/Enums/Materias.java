/*
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).

• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
package Entidad_Ej4.Enums;

public enum Materias {
    AGRONOMIA("Agronomia", 1), AGRICULTURA("Agricultura", 2), FILOSOFIA("Filosofía y Letras", 3), ARQUITECTURA("Arquitectura, Diseño y Urbanismo", 4),
    C_ECONOMICAS("Ciencias Economicas", 5), ARTE_Y_DISEÑO("Arte Creativo y Diseño", 6), LENGUAS_EXTRANJERAS("Lenguas Extranjeras", 7),
    C_PURAS_Y_APLICADAS("Ciencias Puras y Aplicadas", 8), C_SOCIALES("Ciencias Sociales y de la Comunicacion", 9),
    TECNO_INFORMACION("Computacion y Tecnologías de la Informacion", 10), C_EXACTAS_Y_NATURALES("Ciencias Exactas y Naturales", 11),
    ODONTOLOGIA("Odontologia", 12), DERECHO("Derecho", 13), TURISMO_Y_HOSPITALIDAD("Turismo y Hospitalidad", 14), PSICOLOGIA("Psicologia", 16),
    ADMINISTRACION_Y_NEGOCIOS("Negocios y Administracion", 15), EDUCACION_Y_FORMACION("Educacion y Formacion", 17),
    HUMANIDADES("Humanidades", 18), INGENIERIA("Ingenieria", 19), MEDI_VETERINARIA("Medicina Veterinaria", 20), MEDI_Y_SALUD("Medicina y Salud", 21);

    String codigo;
    int num;

    private Materias() {
    }

    private Materias(String codigo, int num) {
        this.codigo = codigo;
        this.num = num;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
