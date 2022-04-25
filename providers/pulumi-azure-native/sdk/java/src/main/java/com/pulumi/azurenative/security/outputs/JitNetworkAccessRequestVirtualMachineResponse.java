// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.azurenative.security.outputs.JitNetworkAccessRequestPortResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JitNetworkAccessRequestVirtualMachineResponse {
    /**
     * @return Resource ID of the virtual machine that is linked to this policy
     * 
     */
    private final String id;
    /**
     * @return The ports that were opened for the virtual machine
     * 
     */
    private final List<JitNetworkAccessRequestPortResponse> ports;

    @CustomType.Constructor
    private JitNetworkAccessRequestVirtualMachineResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ports") List<JitNetworkAccessRequestPortResponse> ports) {
        this.id = id;
        this.ports = ports;
    }

    /**
     * @return Resource ID of the virtual machine that is linked to this policy
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ports that were opened for the virtual machine
     * 
     */
    public List<JitNetworkAccessRequestPortResponse> ports() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestVirtualMachineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<JitNetworkAccessRequestPortResponse> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestVirtualMachineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ports = defaults.ports;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ports(List<JitNetworkAccessRequestPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(JitNetworkAccessRequestPortResponse... ports) {
            return ports(List.of(ports));
        }        public JitNetworkAccessRequestVirtualMachineResponse build() {
            return new JitNetworkAccessRequestVirtualMachineResponse(id, ports);
        }
    }
}
