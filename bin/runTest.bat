@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogot� - Colombia)
REM Departamento de Ingenier�a de Sistemas y Computaci�n 
REM Licenciado bajo el esquema Academic Free License version 2.1 
REM
REM Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
REM Ejercicio: n4_feriaEmpresarial
REM Autor: Alfredo Morales Pinz�n - 25-mar-2008
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

SET CLASSPATH=

REM ---------------------------------------------------------
REM Ejecucion de las pruebas
REM ---------------------------------------------------------
java -ea -classpath ../lib/feriaEmpresarial.jar;../test/lib/feriaEmpresarialTest.jar;../test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.feriaEmpresarial.test.FeriaEmpresarialTest
java -ea -classpath ../lib/feriaEmpresarial.jar;../test/lib/feriaEmpresarialTest.jar;../test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.feriaEmpresarial.test.EmpresaTest
java -ea -classpath ../lib/feriaEmpresarial.jar;../test/lib/feriaEmpresarialTest.jar;../test/lib/junit.jar junit.swingui.TestRunner uniandes.cupi2.feriaEmpresarial.test.PuestoTest