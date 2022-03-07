// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.DaprComponentResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App Dapr configuration.
 * 
 */
public final class DaprResponse extends io.pulumi.resources.InvokeArgs {

    public static final DaprResponse Empty = new DaprResponse();

    /**
     * Dapr application identifier
     * 
     */
    @InputImport(name="appId")
      private final @Nullable String appId;

    public Optional<String> getAppId() {
        return this.appId == null ? Optional.empty() : Optional.ofNullable(this.appId);
    }

    /**
     * Port on which the Dapr side car
     * 
     */
    @InputImport(name="appPort")
      private final @Nullable Integer appPort;

    public Optional<Integer> getAppPort() {
        return this.appPort == null ? Optional.empty() : Optional.ofNullable(this.appPort);
    }

    /**
     * Collection of Dapr components
     * 
     */
    @InputImport(name="components")
      private final @Nullable List<DaprComponentResponse> components;

    public List<DaprComponentResponse> getComponents() {
        return this.components == null ? List.of() : this.components;
    }

    /**
     * Boolean indicating if the Dapr side car is enabled
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public DaprResponse(
        @Nullable String appId,
        @Nullable Integer appPort,
        @Nullable List<DaprComponentResponse> components,
        @Nullable Boolean enabled) {
        this.appId = appId;
        this.appPort = appPort;
        this.components = components;
        this.enabled = enabled;
    }

    private DaprResponse() {
        this.appId = null;
        this.appPort = null;
        this.components = List.of();
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable Integer appPort;
        private @Nullable List<DaprComponentResponse> components;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appPort = defaults.appPort;
    	      this.components = defaults.components;
    	      this.enabled = defaults.enabled;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppPort(@Nullable Integer appPort) {
            this.appPort = appPort;
            return this;
        }

        public Builder setComponents(@Nullable List<DaprComponentResponse> components) {
            this.components = components;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public DaprResponse build() {
            return new DaprResponse(appId, appPort, components, enabled);
        }
    }
}