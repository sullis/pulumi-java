// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.DaprComponentResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DaprResponse {
    /**
     * Dapr application identifier
     * 
     */
    private final @Nullable String appId;
    /**
     * Port on which the Dapr side car
     * 
     */
    private final @Nullable Integer appPort;
    /**
     * Collection of Dapr components
     * 
     */
    private final @Nullable List<DaprComponentResponse> components;
    /**
     * Boolean indicating if the Dapr side car is enabled
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor({"appId","appPort","components","enabled"})
    private DaprResponse(
        @Nullable String appId,
        @Nullable Integer appPort,
        @Nullable List<DaprComponentResponse> components,
        @Nullable Boolean enabled) {
        this.appId = appId;
        this.appPort = appPort;
        this.components = components;
        this.enabled = enabled;
    }

    /**
     * Dapr application identifier
     * 
    */
    public Optional<String> getAppId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * Port on which the Dapr side car
     * 
    */
    public Optional<Integer> getAppPort() {
        return Optional.ofNullable(this.appPort);
    }
    /**
     * Collection of Dapr components
     * 
    */
    public List<DaprComponentResponse> getComponents() {
        return this.components == null ? List.of() : this.components;
    }
    /**
     * Boolean indicating if the Dapr side car is enabled
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
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