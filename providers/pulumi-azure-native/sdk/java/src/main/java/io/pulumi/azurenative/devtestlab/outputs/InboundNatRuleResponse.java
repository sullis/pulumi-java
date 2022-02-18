// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InboundNatRuleResponse {
    /**
     * The port to which the external traffic will be redirected.
     * 
     */
    private final @Nullable Integer backendPort;
    /**
     * The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     * 
     */
    private final @Nullable Integer frontendPort;
    /**
     * The transport protocol for the endpoint.
     * 
     */
    private final @Nullable String transportProtocol;

    @OutputCustomType.Constructor({"backendPort","frontendPort","transportProtocol"})
    private InboundNatRuleResponse(
        @Nullable Integer backendPort,
        @Nullable Integer frontendPort,
        @Nullable String transportProtocol) {
        this.backendPort = backendPort;
        this.frontendPort = frontendPort;
        this.transportProtocol = transportProtocol;
    }

    /**
     * The port to which the external traffic will be redirected.
     * 
     */
    public Optional<Integer> getBackendPort() {
        return Optional.ofNullable(this.backendPort);
    }
    /**
     * The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     * 
     */
    public Optional<Integer> getFrontendPort() {
        return Optional.ofNullable(this.frontendPort);
    }
    /**
     * The transport protocol for the endpoint.
     * 
     */
    public Optional<String> getTransportProtocol() {
        return Optional.ofNullable(this.transportProtocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backendPort;
        private @Nullable Integer frontendPort;
        private @Nullable String transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPort = defaults.frontendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder setBackendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder setFrontendPort(@Nullable Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }

        public Builder setTransportProtocol(@Nullable String transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        public InboundNatRuleResponse build() {
            return new InboundNatRuleResponse(backendPort, frontendPort, transportProtocol);
        }
    }
}
