// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualMachineDetailsResponse {
    /**
     * Last known compute power state captured in DTL
     * 
     */
    private final String lastKnownPowerState;
    /**
     * PrivateIp address of the compute VM
     * 
     */
    private final String privateIpAddress;
    /**
     * Provisioning state of the Dtl VM
     * 
     */
    private final String provisioningState;
    /**
     * Connection information for Windows
     * 
     */
    private final String rdpAuthority;
    /**
     * Connection information for Linux
     * 
     */
    private final String sshAuthority;
    /**
     * Compute VM login user name
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"lastKnownPowerState","privateIpAddress","provisioningState","rdpAuthority","sshAuthority","userName"})
    private VirtualMachineDetailsResponse(
        String lastKnownPowerState,
        String privateIpAddress,
        String provisioningState,
        String rdpAuthority,
        String sshAuthority,
        String userName) {
        this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
        this.sshAuthority = Objects.requireNonNull(sshAuthority);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Last known compute power state captured in DTL
     * 
     */
    public String getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }
    /**
     * PrivateIp address of the compute VM
     * 
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * Provisioning state of the Dtl VM
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Connection information for Windows
     * 
     */
    public String getRdpAuthority() {
        return this.rdpAuthority;
    }
    /**
     * Connection information for Linux
     * 
     */
    public String getSshAuthority() {
        return this.sshAuthority;
    }
    /**
     * Compute VM login user name
     * 
     */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKnownPowerState;
        private String privateIpAddress;
        private String provisioningState;
        private String rdpAuthority;
        private String sshAuthority;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
    	      this.userName = defaults.userName;
        }

        public Builder setLastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }

        public Builder setSshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public VirtualMachineDetailsResponse build() {
            return new VirtualMachineDetailsResponse(lastKnownPowerState, privateIpAddress, provisioningState, rdpAuthority, sshAuthority, userName);
        }
    }
}
