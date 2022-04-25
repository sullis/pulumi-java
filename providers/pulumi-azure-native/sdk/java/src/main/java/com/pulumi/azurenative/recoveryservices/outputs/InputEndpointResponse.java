// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InputEndpointResponse {
    /**
     * @return The input endpoint name.
     * 
     */
    private final @Nullable String endpointName;
    /**
     * @return The input endpoint private port.
     * 
     */
    private final @Nullable Integer privatePort;
    /**
     * @return The input endpoint protocol.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return The input endpoint public port.
     * 
     */
    private final @Nullable Integer publicPort;

    @CustomType.Constructor
    private InputEndpointResponse(
        @CustomType.Parameter("endpointName") @Nullable String endpointName,
        @CustomType.Parameter("privatePort") @Nullable Integer privatePort,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("publicPort") @Nullable Integer publicPort) {
        this.endpointName = endpointName;
        this.privatePort = privatePort;
        this.protocol = protocol;
        this.publicPort = publicPort;
    }

    /**
     * @return The input endpoint name.
     * 
     */
    public Optional<String> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }
    /**
     * @return The input endpoint private port.
     * 
     */
    public Optional<Integer> privatePort() {
        return Optional.ofNullable(this.privatePort);
    }
    /**
     * @return The input endpoint protocol.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The input endpoint public port.
     * 
     */
    public Optional<Integer> publicPort() {
        return Optional.ofNullable(this.publicPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointName;
        private @Nullable Integer privatePort;
        private @Nullable String protocol;
        private @Nullable Integer publicPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InputEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.privatePort = defaults.privatePort;
    	      this.protocol = defaults.protocol;
    	      this.publicPort = defaults.publicPort;
        }

        public Builder endpointName(@Nullable String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public Builder privatePort(@Nullable Integer privatePort) {
            this.privatePort = privatePort;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder publicPort(@Nullable Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }        public InputEndpointResponse build() {
            return new InputEndpointResponse(endpointName, privatePort, protocol, publicPort);
        }
    }
}
