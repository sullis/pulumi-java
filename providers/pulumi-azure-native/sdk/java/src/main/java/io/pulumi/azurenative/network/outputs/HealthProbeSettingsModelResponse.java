// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthProbeSettingsModelResponse {
    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    private final @Nullable String enabledState;
    /**
     * Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
     */
    private final @Nullable String healthProbeMethod;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The number of seconds between health probes.
     * 
     */
    private final @Nullable Integer intervalInSeconds;
    /**
     * Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * The path to use for the health probe. Default is /
     * 
     */
    private final @Nullable String path;
    /**
     * Protocol scheme to use for this probe
     * 
     */
    private final @Nullable String protocol;
    /**
     * Resource status.
     * 
     */
    private final String resourceState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"enabledState","healthProbeMethod","id","intervalInSeconds","name","path","protocol","resourceState","type"})
    private HealthProbeSettingsModelResponse(
        @Nullable String enabledState,
        @Nullable String healthProbeMethod,
        @Nullable String id,
        @Nullable Integer intervalInSeconds,
        @Nullable String name,
        @Nullable String path,
        @Nullable String protocol,
        String resourceState,
        String type) {
        this.enabledState = enabledState;
        this.healthProbeMethod = healthProbeMethod;
        this.id = id;
        this.intervalInSeconds = intervalInSeconds;
        this.name = name;
        this.path = path;
        this.protocol = protocol;
        this.resourceState = Objects.requireNonNull(resourceState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
    */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
    */
    public Optional<String> getHealthProbeMethod() {
        return Optional.ofNullable(this.healthProbeMethod);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The number of seconds between health probes.
     * 
    */
    public Optional<Integer> getIntervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }
    /**
     * Resource name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The path to use for the health probe. Default is /
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Protocol scheme to use for this probe
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Resource status.
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthProbeSettingsModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabledState;
        private @Nullable String healthProbeMethod;
        private @Nullable String id;
        private @Nullable Integer intervalInSeconds;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable String protocol;
        private String resourceState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthProbeSettingsModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledState = defaults.enabledState;
    	      this.healthProbeMethod = defaults.healthProbeMethod;
    	      this.id = defaults.id;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.resourceState = defaults.resourceState;
    	      this.type = defaults.type;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setHealthProbeMethod(@Nullable String healthProbeMethod) {
            this.healthProbeMethod = healthProbeMethod;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public HealthProbeSettingsModelResponse build() {
            return new HealthProbeSettingsModelResponse(enabledState, healthProbeMethod, id, intervalInSeconds, name, path, protocol, resourceState, type);
        }
    }
}