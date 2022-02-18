// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a network port.
 * 
 */
public final class PortResponse extends io.pulumi.resources.InvokeArgs {

    public static final PortResponse Empty = new PortResponse();

    /**
     * Backend port of the target virtual machine.
     * 
     */
    @InputImport(name="backendPort")
    private final @Nullable Integer backendPort;

    public Optional<Integer> getBackendPort() {
        return this.backendPort == null ? Optional.empty() : Optional.ofNullable(this.backendPort);
    }

    /**
     * Protocol type of the port.
     * 
     */
    @InputImport(name="transportProtocol")
    private final @Nullable String transportProtocol;

    public Optional<String> getTransportProtocol() {
        return this.transportProtocol == null ? Optional.empty() : Optional.ofNullable(this.transportProtocol);
    }

    public PortResponse(
        @Nullable Integer backendPort,
        @Nullable String transportProtocol) {
        this.backendPort = backendPort;
        this.transportProtocol = transportProtocol;
    }

    private PortResponse() {
        this.backendPort = null;
        this.transportProtocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backendPort;
        private @Nullable String transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(PortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder setBackendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder setTransportProtocol(@Nullable String transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        public PortResponse build() {
            return new PortResponse(backendPort, transportProtocol);
        }
    }
}
