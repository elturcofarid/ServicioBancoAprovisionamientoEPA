package co.icfes.aprovisionamiento.model.enums;

/**
 * EnumTipoProceso Enumeracion para los tipos de proceso .
 * Procesos: Proceso de transformar items qti html.
 * 
 */
public enum EnumTipoProceso {
	
	ARCHIVOS_PLEXI_OFFLINE("ARCHIVOS_PLEXI_OFFLINE", "Generar archivos offline - Plexi"),
	/** Identificador carga de armado*/
    
	/** Identificador para el proceso de transformar items de qti a html. */
    TRANFORMAR_QTI_HTML("TRANSFORMAR_QTI_HTML","Transformación de ítems QTI's a HTML"),
    /** Identificador para el proceso de Ordeanamiento dentro de salon.*/
    REALIZAR_PREINSTALACION("REALIZAR_PREINSTALACION", "Preinstalación"),
    /** Identificador para el proceso de actualizacion de la preinstalacion*/
    ACTUALIZAR_PREINSTALACION("ACTUALIZAR_PREINSTALACION", "Actualizar preinstalación"),
	/** Identificador para el proceso de Cargar QTI a la BD	 */
	CARGAR_QTI("CARGAR_QTI", "Carga de QTI's"),
	   /** Identificador para el proceso de depuracion de items no procesados*/
	DEPURAR_ITEMS("DEPURAR_ITEMS", "Depurar ítems de bolsa"),
	/**Identificador para el proceso de generacion de respuesta de pregunta abierta	 */
	GENERAR_RESPUESTAS_PR_ABIERTA("GENERAR_RESPUESTAS_PR_ABIERTA", "Generar respuestas pregunta abierta"),
	/**Identificador para el proceso de instalacion de plexi */
	REALIZAR_INSTALACION("REALIZAR_INSTALACION", "Instalar PLEXI"),
	/**Identificador para el proceso de Eliminar instalacion */
	ELIMINAR_INSTALACION("ELIMINAR_INSTALACION", "Eliminar instalación de PLEXI"),
	/**Identificador para el proceso de Carga de Audios */
	CARGAR_AUDIOS("CARGAR_AUDIOS", "Carga de audios"),
	/**Identificador copia de multimedia */
	COPIA_MULTIMEDIA("COPIA_MULTIMEDIA", "Copia Multimedia"),
	/**Identificador para el proceso de generaciÃ³n de respuesta de pregunta abierta	 */
	DESCARGAR_ARCHIVOS_PR_ABIERTA("DESCARGAR_ARCHIVOS_PR_ABIERTA", "Descargar PDF pregunta abierta"),	
	/**Identificador para el proceso de ValidaciÃ³n de Json Usuario */
	VALIDACION_JSON("VALIDACION_JSON", "ValidaciÃ³n Json Usuarios"),
	/**Identificador para el proceso Descargar resultados PISA */
	DESCARGAR_RESULTADOS_PISA("DESCARGAR_RESULTADOS_PISA", "Descargar resultados PISA");	
	
	

	
    
	/** Lista de valores del Enum.*/
	public static EnumTipoProceso[] ENUM_VALUES = EnumTipoProceso.values();

	/**
	 * Nombre del proceso.
	 */
	private String nombre;
	
	/**
	 * Descripción del proceso.
	 */
	private String descripcion;
	
	/**
	 * Constructor del enum
	 * @param nombre
	 * @param descripcion
	 */
	EnumTipoProceso(final String nombre, final String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	

	/**
	 * @return the nombre
	 */
	public final String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public final String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}



	/**
	 * consulta la Enumeracion dado su nombre.
	 * @param nombre nombre a consultar
	 * @return la Enumeracion que corresponde
	 */
	public static EnumTipoProceso get(final String nombre) {
		for (final EnumTipoProceso tipoProceso : EnumTipoProceso.ENUM_VALUES) {
			if (tipoProceso.getNombre().equals(nombre)) {
				return tipoProceso;
			}
		}
		return null;
	}

}
