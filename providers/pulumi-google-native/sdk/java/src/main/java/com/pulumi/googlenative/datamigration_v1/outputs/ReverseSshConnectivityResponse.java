// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReverseSshConnectivityResponse {
    /**
     * @return The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    private final String vm;
    /**
     * @return The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    private final String vmIp;
    /**
     * @return The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    private final Integer vmPort;
    /**
     * @return The name of the VPC to peer with the Cloud SQL private network.
     * 
     */
    private final String vpc;

    @CustomType.Constructor
    private ReverseSshConnectivityResponse(
        @CustomType.Parameter("vm") String vm,
        @CustomType.Parameter("vmIp") String vmIp,
        @CustomType.Parameter("vmPort") Integer vmPort,
        @CustomType.Parameter("vpc") String vpc) {
        this.vm = vm;
        this.vmIp = vmIp;
        this.vmPort = vmPort;
        this.vpc = vpc;
    }

    /**
     * @return The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    public String vm() {
        return this.vm;
    }
    /**
     * @return The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    public String vmIp() {
        return this.vmIp;
    }
    /**
     * @return The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    public Integer vmPort() {
        return this.vmPort;
    }
    /**
     * @return The name of the VPC to peer with the Cloud SQL private network.
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReverseSshConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vm;
        private String vmIp;
        private Integer vmPort;
        private String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(ReverseSshConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vm = defaults.vm;
    	      this.vmIp = defaults.vmIp;
    	      this.vmPort = defaults.vmPort;
    	      this.vpc = defaults.vpc;
        }

        public Builder vm(String vm) {
            this.vm = Objects.requireNonNull(vm);
            return this;
        }
        public Builder vmIp(String vmIp) {
            this.vmIp = Objects.requireNonNull(vmIp);
            return this;
        }
        public Builder vmPort(Integer vmPort) {
            this.vmPort = Objects.requireNonNull(vmPort);
            return this;
        }
        public Builder vpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }        public ReverseSshConnectivityResponse build() {
            return new ReverseSshConnectivityResponse(vm, vmIp, vmPort, vpc);
        }
    }
}
