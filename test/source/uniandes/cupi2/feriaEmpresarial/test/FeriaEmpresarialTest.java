/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: FeriaEmpresarialTest.java 756 2008-11-27 21:25:10Z jua-gome $
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
import uniandes.cupi2.feriaEmpresarial.mundo.FeriaEmpresarial;
import uniandes.cupi2.feriaEmpresarial.mundo.Puesto;

/**
 * Esta es la clase usada para verificar que los métodos de la clase FeriaEmpresarial estén correctamente implementados
 */
public class FeriaEmpresarialTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se harán las pruebas
     */
    private FeriaEmpresarial feriaEmpresarial;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye una nueva FeriaEmpresarial vacía
     * 
     */
    private void setupEscenario1( )
    {
        feriaEmpresarial = new FeriaEmpresarial( );
    }

    /**
     * Construye una nueva FeriaEmpresarial con todos sus puesto ocupados
     */
    private void setupEscenario2( )
    {
        feriaEmpresarial = new FeriaEmpresarial( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte1", 8, Puesto.ZONA_NORTE, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte2", 7, Puesto.ZONA_NORTE, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte3", 6, Puesto.ZONA_NORTE, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte4", 5, Puesto.ZONA_NORTE, 4 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Oriente1", 13, Puesto.ZONA_ORIENTE, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Oriente2", 12, Puesto.ZONA_ORIENTE, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Oriente3", 11, Puesto.ZONA_ORIENTE, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Sur1", 7, Puesto.ZONA_SUR, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Sur2", 6, Puesto.ZONA_SUR, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Sur3", 5, Puesto.ZONA_SUR, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Sur4", 4, Puesto.ZONA_SUR, 4 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Occidente1", 13, Puesto.ZONA_OCCIDENTE, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Occidente2", 12, Puesto.ZONA_OCCIDENTE, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Occidente3", 11, Puesto.ZONA_OCCIDENTE, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro1", 12, Puesto.ZONA_CENTRO, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro2", 11, Puesto.ZONA_CENTRO, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro3", 10, Puesto.ZONA_CENTRO, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro4", 9, Puesto.ZONA_CENTRO, 4 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro5", 8, Puesto.ZONA_CENTRO, 5 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro6", 7, Puesto.ZONA_CENTRO, 6 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro7", 6, Puesto.ZONA_CENTRO, 7 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Centro8", 6, Puesto.ZONA_CENTRO, 8 );
        }
        catch( Exception e )
        {
            fail( "No debería generar una excepción" );
        }
    }

    /**
     * Verifica la correcta inicialización de los atributos de la clase FeriaEmpresarial
     */
    public void testFeriaEmpresarial( )
    {
        setupEscenario1( );

        assertNotNull( "No se ha inicializado la lista de empresas ", feriaEmpresarial.darEmpresas( ) );
        for( int i = 0; i < FeriaEmpresarial.NUM_PUESTOS_NORTE + FeriaEmpresarial.NUM_PUESTOS_ORIENTE + FeriaEmpresarial.NUM_PUESTOS_SUR + FeriaEmpresarial.NUM_PUESTOS_OCCIDENTE + FeriaEmpresarial.NUM_PUESTOS_CENTRO; i++ )
        {
            assertNotNull( "Los puestos no han sido incializados correctamente", feriaEmpresarial.darPuestos( )[ i ] );
        }
    }

    /**
     * Verifica el correcto retorno de las empresas
     */
    public void testDarEmpresas( )
    {
        setupEscenario1( );
        assertNotNull( "No se ha inicializado la lista de empresas ", feriaEmpresarial.darEmpresas( ) );
    }

    /**
     * Verifica el correcto retorno de los puestos
     */
    public void testDarPuestos( )
    {
        setupEscenario1( );
        for( int i = 0; i < FeriaEmpresarial.NUM_PUESTOS_NORTE + FeriaEmpresarial.NUM_PUESTOS_ORIENTE + FeriaEmpresarial.NUM_PUESTOS_SUR + FeriaEmpresarial.NUM_PUESTOS_OCCIDENTE + FeriaEmpresarial.NUM_PUESTOS_CENTRO; i++ )
        {
            assertNotNull( "Los puestos no han sido incializados correctamente", feriaEmpresarial.darPuestos( )[ i ] );
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa visitante.
     */
    public void testIngresarEmpresaVisitante1( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaVisitante( "Empresa1", 19 );
            feriaEmpresarial.ingresarEmpresaVisitante( "Empresa2", 1 );
            feriaEmpresarial.ingresarEmpresaVisitante( "Empresa3", 2 );
        }
        catch( Exception e )
        {
            fail( "No debería generar una excepción" );
        }
        assertNotNull( "No ingresa correctamente la empresa visitante", feriaEmpresarial.darEmpresas( ).get( 0 ) );
        assertNotNull( "No ingresa correctamente la empresa visitante", feriaEmpresarial.darEmpresas( ).get( 1 ) );
        assertNotNull( "No ingresa correctamente la empresa visitante", feriaEmpresarial.darEmpresas( ).get( 2 ) );
        assertEquals( "No ingresa correctamente la empresa visitante", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 0 ) ).darNombre( ), "Empresa1" );
        assertEquals( "No ingresa correctamente la empresa visitante", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 1 ) ).darNombre( ), "Empresa2" );
        assertEquals( "No ingresa correctamente la empresa visitante", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 2 ) ).darNombre( ), "Empresa3" );
        assertEquals( "No se inicializa correctamente el tipo de la empresa visitante", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 0 ) ).darTipo( ), Empresa.VISITANTE );
        assertEquals( "No se inicializa correctamente el tipo de la empresa visitante", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 1 ) ).darTipo( ), Empresa.VISITANTE );
        try
        {
            feriaEmpresarial.ingresarEmpresaVisitante( "Empresa1", 19 );
            fail( "Debería generar una excepción" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }

    }

    /**
     * Verifica el correcto ingreso de una empresa visitante.
     */
    public void testIngresarEmpresaVisitante2( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaVisitante( "Empresa1", FeriaEmpresarial.MAX_PERSONAS_ASISTENTES + 1 );
            fail( "Debería generar una excepción" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora
     */
    public void testIngresarEmpresaExpositora1( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 8, Puesto.ZONA_NORTE, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa2", 7, Puesto.ZONA_ORIENTE, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa3", 7, Puesto.ZONA_SUR, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa4", 14, Puesto.ZONA_OCCIDENTE, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa5", 12, Puesto.ZONA_CENTRO, 5 );
        }
        catch( Exception e )
        {
            fail( "No debería generar una excepción" );
        }
        // Ingreso de Empresas
        assertNotNull( "No ingresa correctamente la empresa expositora", feriaEmpresarial.darEmpresas( ).get( 0 ) );
        assertNotNull( "No ingresa correctamente la empresa expositora", feriaEmpresarial.darEmpresas( ).get( 1 ) );
        assertNotNull( "No ingresa correctamente la empresa expositora", feriaEmpresarial.darEmpresas( ).get( 2 ) );
        assertEquals( "No ingresa correctamente la empresa expositora", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 0 ) ).darNombre( ), "Empresa1" );
        assertEquals( "No ingresa correctamente la empresa expositora", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 1 ) ).darNombre( ), "Empresa2" );
        assertEquals( "No ingresa correctamente la empresa expositora", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 2 ) ).darNombre( ), "Empresa3" );
        assertEquals( "No se inicializa correctamente el tipo de la empresa expositora", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 0 ) ).darTipo( ), Empresa.EXPOSITORA );
        assertEquals( "No se inicializa correctamente el tipo de la empresa expositora", ( ( Empresa )feriaEmpresarial.darEmpresas( ).get( 1 ) ).darTipo( ), Empresa.EXPOSITORA );
        // Ocupado de puestos
        assertTrue( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 1 ] ).estaOcupado( ) );
        assertTrue( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 6 ] ).estaOcupado( ) );
        assertTrue( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 7 ] ).estaOcupado( ) );
        assertTrue( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 11 ] ).estaOcupado( ) );
        assertTrue( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 18 ] ).estaOcupado( ) );
        // Nombre de las empresas en los puestos
        assertEquals( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 1 ] ).darNombreEmpresa( ), "Empresa1" );
        assertEquals( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 6 ] ).darNombreEmpresa( ), "Empresa2" );
        assertEquals( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 7 ] ).darNombreEmpresa( ), "Empresa3" );
        assertEquals( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 11 ] ).darNombreEmpresa( ), "Empresa4" );
        assertEquals( "No se ocupa correctamente el puesto de una empresa expositora", ( ( Puesto )feriaEmpresarial.darPuestos( )[ 18 ] ).darNombreEmpresa( ), "Empresa5" );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 8, Puesto.ZONA_NORTE, 2 );
            fail( "Debería generar una excepción de empresa existente" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }

    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción no hay puestos disponibles
     */
    public void testIngresarEmpresaExpositora2( )
    {
        setupEscenario2( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 8, Puesto.ZONA_NORTE, 2 );
            fail( "Debería generar una excepción de no hay puestos disponible" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }

    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción no existe el puesto disponible
     */
    public void testIngresarEmpresaExpositora3( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 8, Puesto.ZONA_NORTE, 5 );
            fail( "Debería generar una excepción de no existe el puesto" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción no existe el puesto disponible
     */
    public void testIngresarEmpresaExpositora4( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 8, Puesto.ZONA_ORIENTE, 4 );
            fail( "Debería generar una excepción de no existe el puesto" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción el puesto esta ocupado
     */
    public void testIngresarEmpresaExpositora5( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 6, Puesto.ZONA_SUR, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa2", 6, Puesto.ZONA_SUR, 1 );
            fail( "Debería generar una excepción de el puesto ya esta ocupado" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción el puesto esta ocupado
     */
    public void testIngresarEmpresaExpositora6( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 8, Puesto.ZONA_OCCIDENTE, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa2", 9, Puesto.ZONA_OCCIDENTE, 3 );
            fail( "Debería generar una excepción de el puesto ya esta ocupado" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción número de expositores no permitido
     */
    public void testIngresarEmpresaExpositora7( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 3, Puesto.ZONA_NORTE, 3 );
            fail( "Debería generar una excepción de número de expositores no permitido" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción número de expositores no permitido
     */
    public void testIngresarEmpresaExpositora8( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 6, Puesto.ZONA_ORIENTE, 3 );
            fail( "Debería generar una excepción de número de expositores no permitido" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción número de expositores no permitido
     */
    public void testIngresarEmpresaExpositora9( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 2, Puesto.ZONA_SUR, 4 );
            fail( "Debería generar una excepción de número de expositores no permitido" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción número de expositores no permitido
     */
    public void testIngresarEmpresaExpositora10( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 15, Puesto.ZONA_OCCIDENTE, 3 );
            fail( "Debería generar una excepción de número de expositores no permitido" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto ingreso de una empresa expositora. Excepción número de expositores no permitido
     */
    public void testIngresarEmpresaExpositora11( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 13, Puesto.ZONA_CENTRO, 6 );
            fail( "Debería generar una excepción de número de expositores no permitido" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto desocupado de un puesto
     */
    public void testDesocuparPuesto1( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Empresa1", 6, Puesto.ZONA_NORTE, 3 );
            feriaEmpresarial.desocuparPuesto( "Empresa1" );
        }
        catch( Exception e )
        {
            fail( "No debería generar una excepción" );
        }
    }

    /**
     * Verifica el correcto desocupado de un puesto
     */
    public void testDesocuparPuesto2( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.desocuparPuesto( "Empresa1" );
            fail( "Debería generar una excepción de no existe empresa" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto desocupado de un puesto
     */
    public void testDesocuparPuesto3( )
    {
        setupEscenario1( );
        try
        {
            feriaEmpresarial.ingresarEmpresaVisitante( "Empresa1", 12 );
            feriaEmpresarial.desocuparPuesto( "Empresa1" );
            fail( "Debería generar una excepción de empresa no ocupa puesto" );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica el correcto calculo del porcentaje de ocupación
     */
    public void testPorcentajeOcupacion( )
    {
        setupEscenario2( );
        try
        {
            assertEquals( "No se calcula correctamente el porcentaje de ocupación", feriaEmpresarial.porcentajeOcupacion( ), ( double )100.0, 0.001 );
            feriaEmpresarial.desocuparPuesto( "Norte1" );
            feriaEmpresarial.desocuparPuesto( "Norte2" );
            feriaEmpresarial.desocuparPuesto( "Norte3" );
            feriaEmpresarial.desocuparPuesto( "Oriente1" );
            feriaEmpresarial.desocuparPuesto( "Oriente2" );
            feriaEmpresarial.desocuparPuesto( "Occidente1" );
            feriaEmpresarial.desocuparPuesto( "Occidente2" );
            feriaEmpresarial.desocuparPuesto( "Occidente3" );
            feriaEmpresarial.desocuparPuesto( "Sur1" );
            feriaEmpresarial.desocuparPuesto( "Sur2" );
            feriaEmpresarial.desocuparPuesto( "Centro1" );
            assertEquals( "No se calcula correctamente el porcentaje de ocupación", feriaEmpresarial.porcentajeOcupacion( ), ( double )50.0, 0.001 );
        }
        catch( Exception e )
        {
            // Pasa por acá
        }
    }

    /**
     * Verifica la correcta sugerencia de un puesto
     */
    public void testSugerirPuesto( )
    {
        setupEscenario1( );

        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte1", 6, Puesto.ZONA_NORTE, 1 );
        }
        catch( Exception e )
        {
            fail( "No debería generar una excepción" );
        }
        Puesto aux = feriaEmpresarial.darPuestos( )[ 1 ];
        assertEquals( "No sugiere correctamente el puesto", feriaEmpresarial.sugerirPuesto( 8 ), aux );
        aux = feriaEmpresarial.darPuestos( )[ 4 ];
        assertEquals( "No sugiere correctamente el puesto", feriaEmpresarial.sugerirPuesto( 9 ), aux );
        aux = feriaEmpresarial.darPuestos( )[ 11 ];
        assertEquals( "No sugiere correctamente el puesto", feriaEmpresarial.sugerirPuesto( 14 ), aux );
        try
        {
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte2", 6, Puesto.ZONA_NORTE, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte3", 6, Puesto.ZONA_NORTE, 3 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Norte4", 6, Puesto.ZONA_NORTE, 4 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Oriente1", 13, Puesto.ZONA_ORIENTE, 1 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Oriente2", 12, Puesto.ZONA_ORIENTE, 2 );
            feriaEmpresarial.ingresarEmpresaExpositora( "Oriente3", 11, Puesto.ZONA_ORIENTE, 3 );

            aux = feriaEmpresarial.darPuestos( )[ 7 ];
            assertEquals( "No sugiere correctamente el puesto", feriaEmpresarial.sugerirPuesto( 7 ), aux );
        }
        catch( Exception e )
        {
            fail( "No debería generar una excepción" );
        }
    }
}