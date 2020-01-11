package com.awscourse.service;

import com.awscourse.entity.DetailedMachine;
import com.awscourse.entity.Machine;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class MachineService {

    //get machine information
    public Machine getMachineInformation() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        String name = address.getHostName();
        String os = System.getProperty("os.name");
        String architecture = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");

        return new Machine(ip, name, os, architecture, osVersion);
    }

    //get detailed machine information
    public DetailedMachine getDetailedMachineInformation() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        String name = address.getHostName();
        String os = System.getProperty("os.name");
        String architecture = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");

        return new DetailedMachine(ip, name, os, architecture, osVersion, javaVersion, javaVendor, javaVendorUrl);
    }
}
