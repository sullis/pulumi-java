// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecListenerPortMapping {
    /**
     * The port used for the port mapping.
     * 
     */
    private final Integer port;
    /**
     * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerPortMapping(
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("protocol") String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * The port used for the port mapping.
     * 
    */
    public Integer port() {
        return this.port;
    }
    /**
     * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
    */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerPortMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerPortMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public VirtualGatewaySpecListenerPortMapping build() {
            return new VirtualGatewaySpecListenerPortMapping(port, protocol);
        }
    }
}
