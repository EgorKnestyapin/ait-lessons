package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressTest {
    IPAddress ipAddress;

    @BeforeEach
    void setUp() {
        ipAddress = new IPAddress("143.245.13.1");
    }

    @Test
    void setIpAddress() {
        String validAddress = "245.123.45.15";
        ipAddress.setAddress(validAddress);
        assertEquals(validAddress, ipAddress.getAddress());
        String invalidAddress = "24.45.2365236.24";
        ipAddress.setAddress(invalidAddress);
        assertEquals(validAddress, ipAddress.getAddress());
        invalidAddress = "27.241.42.2151.515";
        ipAddress.setAddress(invalidAddress);
        assertEquals(validAddress, ipAddress.getAddress());
    }
    @Test
    void validateIPAddress() {
        String address = "242.254.56.24";
        assertTrue(ipAddress.validateIPAddress(address));
        address = "24.256.21.68";
        assertFalse(ipAddress.validateIPAddress(address));
        address = "254.75.21";
        assertFalse(ipAddress.validateIPAddress(address));
    }
}