/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PuestoTest.java 718 2008-10-03 21:07:55Z jua-gome $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n4_feriaEmpresarial
 * Autor: Alfredo Morales Pinz�n - 25-mar-2008
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.feriaEmpresarial.test;

import junit.framework.TestCase;
import uniandes.cupi2.feriaEmpresarial.mundo.Puesto;

/**
 * Esta es la clase usada para verificar que los m�todos de la clase Puesto est�n correctamente implementados
 */
public class PuestoTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Empresa sobre la que se har�n las prueba
     */
    private Puesto puesto;

    /**
     * Nombre empresa
     */
    private String nombreEmpresa;

    /**
     * N�mero de puesto
     */
    private int numPuesto;

    /**
     * N�mero de personas m�nimo
     */
    private int numMinPersonas;

    /**
     * N�mero de personas m�ximo
     */
    private int numMaxPersonas;

    // -----------------------------------------------------------------
    // M�todos
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
     * Verifica la correcta inicializaci�n de los atributos
     */
    public void testPuesto( )
    {
        setupEscenario1( );

        assertEquals( "N�mero del puesto no inicializado correctamente", puesto.darNumero( ), numPuesto );
        assertEquals( "Zona del puesto no inicializado correctamente", puesto.darZona( ), Puesto.ZONA_CENTRO );
        assertEquals( "N�mero de personas m�nimo del puesto no inicializado correctamente", puesto.darNumMinimoPersonas( ), numMinPersonas );
        assertEquals( "N�mero de personas m�ximo del puesto no inicializado correctamente", puesto.darNumMaximoPersonas( ), numMaxPersonas );
        assertEquals( "Estado del puesto no inicializado correctamente", puesto.estaOcupado( ), false );
        assertEquals( "Nombre de la empresa que ocupa el puesto no inicializado correctamente", puesto.darNombreEmpresa( ), "" );
    }

    /**
     * Verifica el correcto retorno del n�mero del puesto
     */
    public void testDarNumero( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el n�mero del puesto", puesto.darNumero( ), numPuesto );
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
     * Verifica el correcto retorno del n�mero m�nimo de personas del puesto
     */
    public void testDarNumMinimoPersonas( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el n�mero m�nimo de personas del puesto", puesto.darNumMinimoPersonas( ), numMinPersonas );
    }

    /**
     * Verifica el correcto retorno del n�mero m�ximo de personas del puesto
     */
    public void testDarNumMaximoPersonas( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el n�mero m�ximo de personas del puesto", puesto.darNumMaximoPersonas( ), numMaxPersonas );
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
