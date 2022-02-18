// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FrontDoorHealthProbeMethod;
import io.pulumi.azurenative.network.enums.FrontDoorProtocol;
import io.pulumi.azurenative.network.enums.HealthProbeEnabled;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Load balancing settings for a backend pool
 * 
 */
public final class HealthProbeSettingsModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthProbeSettingsModelArgs Empty = new HealthProbeSettingsModelArgs();

    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,HealthProbeEnabled>> enabledState;

    public Input<Either<String,HealthProbeEnabled>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    /**
     * Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
     */
    @InputImport(name="healthProbeMethod")
    private final @Nullable Input<Either<String,FrontDoorHealthProbeMethod>> healthProbeMethod;

    public Input<Either<String,FrontDoorHealthProbeMethod>> getHealthProbeMethod() {
        return this.healthProbeMethod == null ? Input.empty() : this.healthProbeMethod;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The number of seconds between health probes.
     * 
     */
    @InputImport(name="intervalInSeconds")
    private final @Nullable Input<Integer> intervalInSeconds;

    public Input<Integer> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Input.empty() : this.intervalInSeconds;
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The path to use for the health probe. Default is /
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Protocol scheme to use for this probe
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<Either<String,FrontDoorProtocol>> protocol;

    public Input<Either<String,FrontDoorProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public HealthProbeSettingsModelArgs(
        @Nullable Input<Either<String,HealthProbeEnabled>> enabledState,
        @Nullable Input<Either<String,FrontDoorHealthProbeMethod>> healthProbeMethod,
        @Nullable Input<String> id,
        @Nullable Input<Integer> intervalInSeconds,
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<Either<String,FrontDoorProtocol>> protocol) {
        this.enabledState = enabledState;
        this.healthProbeMethod = healthProbeMethod == null ? Input.ofLeft("HEAD") : healthProbeMethod;
        this.id = id;
        this.intervalInSeconds = intervalInSeconds;
        this.name = name;
        this.path = path;
        this.protocol = protocol;
    }

    private HealthProbeSettingsModelArgs() {
        this.enabledState = Input.empty();
        this.healthProbeMethod = Input.empty();
        this.id = Input.empty();
        this.intervalInSeconds = Input.empty();
        this.name = Input.empty();
        this.path = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthProbeSettingsModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,HealthProbeEnabled>> enabledState;
        private @Nullable Input<Either<String,FrontDoorHealthProbeMethod>> healthProbeMethod;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> intervalInSeconds;
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<Either<String,FrontDoorProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthProbeSettingsModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledState = defaults.enabledState;
    	      this.healthProbeMethod = defaults.healthProbeMethod;
    	      this.id = defaults.id;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,HealthProbeEnabled>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,HealthProbeEnabled> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setHealthProbeMethod(@Nullable Input<Either<String,FrontDoorHealthProbeMethod>> healthProbeMethod) {
            this.healthProbeMethod = healthProbeMethod;
            return this;
        }

        public Builder setHealthProbeMethod(@Nullable Either<String,FrontDoorHealthProbeMethod> healthProbeMethod) {
            this.healthProbeMethod = Input.ofNullable(healthProbeMethod);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Input<Integer> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = Input.ofNullable(intervalInSeconds);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Either<String,FrontDoorProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,FrontDoorProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public HealthProbeSettingsModelArgs build() {
            return new HealthProbeSettingsModelArgs(enabledState, healthProbeMethod, id, intervalInSeconds, name, path, protocol);
        }
    }
}
