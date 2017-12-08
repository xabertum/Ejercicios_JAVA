<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
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

                        <tr bgcolor="blue">
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


