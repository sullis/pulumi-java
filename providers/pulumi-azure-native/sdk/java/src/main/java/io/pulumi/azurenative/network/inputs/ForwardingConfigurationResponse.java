// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.CacheConfigurationResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes Forwarding Route.
 * 
 */
public final class ForwardingConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ForwardingConfigurationResponse Empty = new ForwardingConfigurationResponse();

    /**
     * A reference to the BackendPool which this rule routes to.
     * 
     */
    @InputImport(name="backendPool")
    private final @Nullable SubResourceResponse backendPool;

    public Optional<SubResourceResponse> getBackendPool() {
        return this.backendPool == null ? Optional.empty() : Optional.ofNullable(this.backendPool);
    }

    /**
     * The caching configuration associated with this rule.
     * 
     */
    @InputImport(name="cacheConfiguration")
    private final @Nullable CacheConfigurationResponse cacheConfiguration;

    public Optional<CacheConfigurationResponse> getCacheConfiguration() {
        return this.cacheConfiguration == null ? Optional.empty() : Optional.ofNullable(this.cacheConfiguration);
    }

    /**
     * A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
     * 
     */
    @InputImport(name="customForwardingPath")
    private final @Nullable String customForwardingPath;

    public Optional<String> getCustomForwardingPath() {
        return this.customForwardingPath == null ? Optional.empty() : Optional.ofNullable(this.customForwardingPath);
    }

    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    @InputImport(name="forwardingProtocol")
    private final @Nullable String forwardingProtocol;

    public Optional<String> getForwardingProtocol() {
        return this.forwardingProtocol == null ? Optional.empty() : Optional.ofNullable(this.forwardingProtocol);
    }

    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public ForwardingConfigurationResponse(
        @Nullable SubResourceResponse backendPool,
        @Nullable CacheConfigurationResponse cacheConfiguration,
        @Nullable String customForwardingPath,
        @Nullable String forwardingProtocol,
        String odataType) {
        this.backendPool = backendPool;
        this.cacheConfiguration = cacheConfiguration;
        this.customForwardingPath = customForwardingPath;
        this.forwardingProtocol = forwardingProtocol;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ForwardingConfigurationResponse() {
        this.backendPool = null;
        this.cacheConfiguration = null;
        this.customForwardingPath = null;
        this.forwardingProtocol = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendPool;
        private @Nullable CacheConfigurationResponse cacheConfiguration;
        private @Nullable String customForwardingPath;
        private @Nullable String forwardingProtocol;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPool = defaults.backendPool;
    	      this.cacheConfiguration = defaults.cacheConfiguration;
    	      this.customForwardingPath = defaults.customForwardingPath;
    	      this.forwardingProtocol = defaults.forwardingProtocol;
    	      this.odataType = defaults.odataType;
        }

        public Builder setBackendPool(@Nullable SubResourceResponse backendPool) {
            this.backendPool = backendPool;
            return this;
        }

        public Builder setCacheConfiguration(@Nullable CacheConfigurationResponse cacheConfiguration) {
            this.cacheConfiguration = cacheConfiguration;
            return this;
        }

        public Builder setCustomForwardingPath(@Nullable String customForwardingPath) {
            this.customForwardingPath = customForwardingPath;
            return this;
        }

        public Builder setForwardingProtocol(@Nullable String forwardingProtocol) {
            this.forwardingProtocol = forwardingProtocol;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public ForwardingConfigurationResponse build() {
            return new ForwardingConfigurationResponse(backendPool, cacheConfiguration, customForwardingPath, forwardingProtocol, odataType);
        }
    }
}
