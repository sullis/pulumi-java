// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigDataflowEndpointConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigDataflowEndpointConfig Empty = new ConfigDataflowEndpointConfig();

    @Import(name="dataflowEndpointName")
      private final @Nullable String dataflowEndpointName;

    public Optional<String> dataflowEndpointName() {
        return this.dataflowEndpointName == null ? Optional.empty() : Optional.ofNullable(this.dataflowEndpointName);
    }

    @Import(name="dataflowEndpointRegion")
      private final @Nullable String dataflowEndpointRegion;

    public Optional<String> dataflowEndpointRegion() {
        return this.dataflowEndpointRegion == null ? Optional.empty() : Optional.ofNullable(this.dataflowEndpointRegion);
    }

    public ConfigDataflowEndpointConfig(
        @Nullable String dataflowEndpointName,
        @Nullable String dataflowEndpointRegion) {
        this.dataflowEndpointName = dataflowEndpointName;
        this.dataflowEndpointRegion = dataflowEndpointRegion;
    }

    private ConfigDataflowEndpointConfig() {
        this.dataflowEndpointName = null;
        this.dataflowEndpointRegion = null;
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

        public Builder dataflowEndpointName(@Nullable String dataflowEndpointName) {
            this.dataflowEndpointName = dataflowEndpointName;
            return this;
        }
        public Builder dataflowEndpointRegion(@Nullable String dataflowEndpointRegion) {
            this.dataflowEndpointRegion = dataflowEndpointRegion;
            return this;
        }        public ConfigDataflowEndpointConfig build() {
            return new ConfigDataflowEndpointConfig(dataflowEndpointName, dataflowEndpointRegion);
        }
    }
}
