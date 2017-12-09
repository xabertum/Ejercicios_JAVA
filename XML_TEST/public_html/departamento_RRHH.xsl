<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" version="4.0" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/departamento_RRHH">
        <html>
            <head>
            </head>

            <body>
                <h2>Expediente de RRHH</h2>
                <table border="1">
                    <tr bgcolor="lightgray">
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Direccion</th>
                        <th>Poblacion</th>
                        <th>Nº Tfno. Principal</th>

                    </tr>

                    <xsl:for-each select="persona">

                        <tr bgcolor="" align="center">
                            <td>
                                <xsl:value-of select="datos_basicos/nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="datos_basicos/apellidos"/>
                            </td>
                            <td>
                                <xsl:value-of select="domicilios/domicilio/direccion/nombre_direccion"/>
                            </td>
                            <td>
                                <xsl:value-of select="domicilios/domicilio/poblacion"/>
                            </td>

                            <td>
                                <xsl:value-of select="telefonos/telefono[@principal='si']"/>
                            </td>

                        </tr>

                    </xsl:for-each>

                </table>

            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>