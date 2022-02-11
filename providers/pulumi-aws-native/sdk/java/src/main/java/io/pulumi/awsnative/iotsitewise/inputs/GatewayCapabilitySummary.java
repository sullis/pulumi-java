// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayCapabilitySummary extends io.pulumi.resources.InvokeArgs {

    public static final GatewayCapabilitySummary Empty = new GatewayCapabilitySummary();

    @InputImport(name="capabilityConfiguration")
    private final @Nullable String capabilityConfiguration;

    public Optional<String> getCapabilityConfiguration() {
        return this.capabilityConfiguration == null ? Optional.empty() : Optional.ofNullable(this.capabilityConfiguration);
    }

    @InputImport(name="capabilityNamespace", required=true)
    private final String capabilityNamespace;

    public String getCapabilityNamespace() {
        return this.capabilityNamespace;
    }

    public GatewayCapabilitySummary(
        @Nullable String capabilityConfiguration,
        String capabilityNamespace) {
        this.capabilityConfiguration = capabilityConfiguration;
        this.capabilityNamespace = Objects.requireNonNull(capabilityNamespace, "expected parameter 'capabilityNamespace' to be non-null");
    }

    private GatewayCapabilitySummary() {
        this.capabilityConfiguration = null;
        this.capabilityNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCapabilitySummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capabilityConfiguration;
        private String capabilityNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCapabilitySummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilityConfiguration = defaults.capabilityConfiguration;
    	      this.capabilityNamespace = defaults.capabilityNamespace;
        }

        public Builder setCapabilityConfiguration(@Nullable String capabilityConfiguration) {
            this.capabilityConfiguration = capabilityConfiguration;
            return this;
        }

        public Builder setCapabilityNamespace(String capabilityNamespace) {
            this.capabilityNamespace = Objects.requireNonNull(capabilityNamespace);
            return this;
        }

        public GatewayCapabilitySummary build() {
            return new GatewayCapabilitySummary(capabilityConfiguration, capabilityNamespace);
        }
    }
}
