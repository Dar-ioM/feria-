/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: EmpresaTest.java 588 2008-04-30 16:38:01Z f-vela $
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
import uniandes.cupi2.feriaEmpresarial.mundo.Empresa;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Empresa estén correctamente implementados
 */
public class EmpresaTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Empresa sobre la que se harán las prueba
     */
    private Empresa empresa;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye una nueva empresa visitante
     */
    private void setupEscenario1( )
    {
        // Crea la oficina
        empresa = new Empresa( "Empresa1", Empresa.VISITANTE, 12 );
    }

    /**
     * Construye una nueva empresa expositora
     */
    private void setupEscenario2( )
    {
        // Crea la oficina
        empresa = new Empresa( "Empresa2", Empresa.EXPOSITORA, 8 );
    }

    /**
     * Verifica la correcta inicialización de los atributos
     */
    public void testEmpresa( )
    {
        setupEscenario1( );

        assertEquals( "Nombre de la empresa no inicializado correctamente", empresa.darNombre( ), "Empresa1" );
        assertEquals( "Tipo de la empresa no inicializado correctamente", empresa.darTipo( ), Empresa.VISITANTE );
        assertEquals( "Número de personas asistentes de la empresa no inicializado correctamente", empresa.darNumeroPersonasAsistentes( ), 12 );
    }

    /**
     * Verifica el correcto retorno del nombre de la empresa
     */
    public void testDarNombre( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el nombre de la empresa", empresa.darNombre( ), "Empresa1" );
    }

    /**
     * Verifica el correcto retorno del tipo de la empresa
     */
    public void testDarTipo1( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el tipo de la empresa", empresa.darTipo( ), Empresa.VISITANTE );
    }

    /**
     * Verifica el correcto retorno del tipo de la empresa
     */
    public void testDarTipo2( )
    {
        setupEscenario2( );
        assertEquals( "No retorna correctamente el tipo de la empresa", empresa.darTipo( ), Empresa.EXPOSITORA );
    }

    /**
     * Verifica el correcto retorno del número del personas asistentes de la empresa
     */
    public void testDarNumeroPersonasAsistentes1( )
    {
        setupEscenario1( );
        assertEquals( "No retorna correctamente el número de personas asistentes de la empresa", empresa.darNumeroPersonasAsistentes( ), 12 );
    }

    /**
     * Verifica el correcto retorno del número del personas asistentes de la empresa
     */
    public void testDarNumeroPersonasAsistentes2( )
    {
        setupEscenario2( );
        assertEquals( "No retorna correctamente el número de personas asistentes de la empresa", empresa.darNumeroPersonasAsistentes( ), 8 );
    }

}
