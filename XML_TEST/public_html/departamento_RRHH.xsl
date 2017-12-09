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
                    <tr bgcolor="blue">
                        <th>Asignatura</th>
                        <th>Nota</th>
                    </tr>

                    <xsl:for-each select="persona/datos_basicos">

                        <tr bgcolor="">
                            <td>
                                <xsl:value-of select="DNI"/>
                            </td>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                        </tr>

                    </xsl:for-each>

                </table>

            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>