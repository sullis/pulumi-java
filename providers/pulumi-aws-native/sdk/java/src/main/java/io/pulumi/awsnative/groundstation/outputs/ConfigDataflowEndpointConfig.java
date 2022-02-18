// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigDataflowEndpointConfig {
    private final @Nullable String dataflowEndpointName;
    private final @Nullable String dataflowEndpointRegion;

    @OutputCustomType.Constructor({"dataflowEndpointName","dataflowEndpointRegion"})
    private ConfigDataflowEndpointConfig(
        @Nullable String dataflowEndpointName,
        @Nullable String dataflowEndpointRegion) {
        this.dataflowEndpointName = dataflowEndpointName;
        this.dataflowEndpointRegion = dataflowEndpointRegion;
    }

    public Optional<String> getDataflowEndpointName() {
        return Optional.ofNullable(this.dataflowEndpointName);
    }
    public Optional<String> getDataflowEndpointRegion() {
        return Optional.ofNullable(this.dataflowEndpointRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigDataflowEndpointConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataflowEndpointName;
        private @Nullable String dataflowEndpointRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigDataflowEndpointConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataflowEndpointName = defaults.dataflowEndpointName;
    	      this.dataflowEndpointRegion = defaults.dataflowEndpointRegion;
        }

        public Builder setDataflowEndpointName(@Nullable String dataflowEndpointName) {
            this.dataflowEndpointName = dataflowEndpointName;
            return this;
        }

        public Builder setDataflowEndpointRegion(@Nullable String dataflowEndpointRegion) {
            this.dataflowEndpointRegion = dataflowEndpointRegion;
            return this;
        }

        public ConfigDataflowEndpointConfig build() {
            return new ConfigDataflowEndpointConfig(dataflowEndpointName, dataflowEndpointRegion);
        }
    }
}
