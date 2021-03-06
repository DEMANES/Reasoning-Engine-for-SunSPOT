/**
 * Copyright 2014-2015 Universidad Politécnica de Madrid (UPM).
 *
 * Authors:
 *    José-Fernan Martínez Ortega
 *    Vicente Hernández Díaz
 *    Néstor Lucas Martínez
 *    Yuanjiang Huang
 *    Raúl del Toro Matamoros
 * 
 * This software is distributed under a dual-license scheme:
 *
 * - For academic uses: Licensed under GNU Affero General Public License as
 *                      published by the Free Software Foundation, either
 *                      version 3 of the License, or (at your option) any
 *                      later version.
 * 
 * - For any other use: Licensed under the Apache License, Version 2.0.
 * 
 * You can get a copy of the license terms in licences/LICENSE.
 */
package eu.artemis.demanes.impl.SunSPOT.utils.neighbordiscovery;

/**
 * Thrown when an error occurs in the neighbor discovery protocol.
 * 
 * @author N&eacute;stor Lucas Mart&iacute;nez
 * @version 1.0.0
 */
public class NeighborDiscoveryException extends Exception {

    /**
     * Constructs a {@code NeighborDiscoveryException} with the specified
     * detail message.
     * 
     * @param s The detail message.
     */
    public NeighborDiscoveryException(String s) {
        super(s);
    }
    
}
