/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PuestoTest.java 718 2008-10-03 21:07:55Z jua-gome $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_feriaEmpresarial
 * Autor: Alfredo Morales Pinzón - 25-mar-2008
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.feriaEmpresarial.test;

import junit.framework.TestCase;
import uniandes.cupi2.feriaEmpresarial.mundo.Puesto;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Puesto estén correctamente implementados
 */
public class PuestoTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Empresa sobre la que se harán las prueba
     */
    private Puesto puesto;

    /**
     * Nombre empresa
     */
    private String nombreEmpresa;

    /**
     * Número de puesto
     */
    private int numPuesto;

    /**
     * Número de personas mínimo
     */
    private int numMinPersonas;

    /**
     * Número de personas máximo
     */
    private int numMaxPersonas;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo puesto
     */
    private void setupEscenario1( )
    {
        numPuesto = 1;
        numMinPersonas = 5;
        numMaxPersonas = 12;
        nombreEmpresa = "Empresa1";
        // Crea el puesto
        puesto = new Puesto( numPuesto, Puesto.ZONA_CENTRO, numMinPersonas, numMaxPersonas );
    }

    /**
     * Verifica la correcta inicialización de los atributos
     */
    public void testPuesto( )
    {
        setupEscenario1( );

        assertEquals( "Número del puesto no inicializado correctamente", puesto.darNumero( ), numPuesto );
        assertEquals( "Zona del puesto no inicializado correctamente", puesto.darZona( ), Puesto.ZONA_CENTRO );
        assertEquals( "Número de personas mínimo del puesto no inicializado correctamente", puesto.darNumMinimoPersonas( ), numMinPersonas );
        assertEquals( "Número de personas máximo del puesto no inicializado correctamente", puesto.darNumMaximoPersonas( ), numMaxPersonas );
        assertEquals( "Estado del puesto no inicializado correctamente", puesto.estaOcupado( ), false );
        assertEquals( "Nombre de la empresa que ocupa el puesto no inicializado correctamente", puesto.darNombreEmpresa( ), "" );
    }

    /**
     * Verifica el correcto retorno del número del puesto
     */
    public void testDarNumero( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el número del puesto", puesto.darNumero( ), numPuesto );
    }

    /**
     * Verifica el correcto retorno de la zona del puesto
     */
    public void testDarZona( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente la zona del puesto", puesto.darZona( ), Puesto.ZONA_CENTRO );
    }

    /**
     * Verifica el correcto retorno del número mínimo de personas del puesto
     */
    public void testDarNumMinimoPersonas( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el número mínimo de personas del puesto", puesto.darNumMinimoPersonas( ), numMinPersonas );
    }

    /**
     * Verifica el correcto retorno del número máximo de personas del puesto
     */
    public void testDarNumMaximoPersonas( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el número máximo de personas del puesto", puesto.darNumMaximoPersonas( ), numMaxPersonas );
    }

    /**
     * Verifica el correcto retorno del nombre de la empresa que ocupa el puesto
     */
    public void testDarNombreEmpresa( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el nombre de la empresa que ocupa puesto", puesto.darNombreEmpresa( ), "" );
        puesto.ocuparPuesto( nombreEmpresa );
        assertEquals( "No retorna correctamente el nombre de la empresa que ocupa puesto", puesto.darNombreEmpresa( ), nombreEmpresa );
    }

    /**
     * Verifica el correcto retorno si el puesto esta ocupado
     */
    public void testEstaOcupado( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el estado del puesto", puesto.estaOcupado( ), false );
        puesto.ocuparPuesto( nombreEmpresa );
        assertEquals( "No retorna correctamente el estado del puesto", puesto.estaOcupado( ), true );
    }

    /**
     * Verifica el correcto ocupado del puesto
     */
    public void testOcuparPuesto( )
    {
        setupEscenario1( );
        puesto.ocuparPuesto( nombreEmpresa );
        assertEquals( "No ocupa correctamente el puesto", puesto.estaOcupado( ), true );
        assertEquals( "No ocupa correctamente el puesto", puesto.darNombreEmpresa( ), nombreEmpresa );
    }

    /**
     * Verifica el correcto desocupado del puesto
     */
    public void testDescuparPuesto( )
    {
        setupEscenario1( );
        puesto.ocuparPuesto( nombreEmpresa );
        assertEquals( "No ocupa correctamente el puesto", puesto.estaOcupado( ), true );
        assertEquals( "No ocupa correctamente el puesto", puesto.darNombreEmpresa( ), nombreEmpresa );
        puesto.desocuparPuesto( );
        assertEquals( "No desocupa correctamente el puesto", puesto.estaOcupado( ), false );
        assertEquals( "No desocupa correctamente el puesto", puesto.darNombreEmpresa( ), "" );
    }

}
