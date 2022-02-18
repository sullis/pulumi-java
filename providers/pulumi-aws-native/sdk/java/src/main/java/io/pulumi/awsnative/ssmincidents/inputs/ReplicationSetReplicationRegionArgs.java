// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.inputs.ReplicationSetRegionConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ReplicationSet regional configuration.
 * 
 */
public final class ReplicationSetReplicationRegionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationSetReplicationRegionArgs Empty = new ReplicationSetReplicationRegionArgs();

    @InputImport(name="regionConfiguration")
    private final @Nullable Input<ReplicationSetRegionConfigurationArgs> regionConfiguration;

    public Input<ReplicationSetRegionConfigurationArgs> getRegionConfiguration() {
        return this.regionConfiguration == null ? Input.empty() : this.regionConfiguration;
    }

    @InputImport(name="regionName")
    private final @Nullable Input<String> regionName;

    public Input<String> getRegionName() {
        return this.regionName == null ? Input.empty() : this.regionName;
    }

    public ReplicationSetReplicationRegionArgs(
        @Nullable Input<ReplicationSetRegionConfigurationArgs> regionConfiguration,
        @Nullable Input<String> regionName) {
        this.regionConfiguration = regionConfiguration;
        this.regionName = regionName;
    }

    private ReplicationSetReplicationRegionArgs() {
        this.regionConfiguration = Input.empty();
        this.regionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSetReplicationRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ReplicationSetRegionConfigurationArgs> regionConfiguration;
        private @Nullable Input<String> regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSetReplicationRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionConfiguration = defaults.regionConfiguration;
    	      this.regionName = defaults.regionName;
        }

        public Builder setRegionConfiguration(@Nullable Input<ReplicationSetRegionConfigurationArgs> regionConfiguration) {
            this.regionConfiguration = regionConfiguration;
            return this;
        }

        public Builder setRegionConfiguration(@Nullable ReplicationSetRegionConfigurationArgs regionConfiguration) {
            this.regionConfiguration = Input.ofNullable(regionConfiguration);
            return this;
        }

        public Builder setRegionName(@Nullable Input<String> regionName) {
            this.regionName = regionName;
            return this;
        }

        public Builder setRegionName(@Nullable String regionName) {
            this.regionName = Input.ofNullable(regionName);
            return this;
        }

        public ReplicationSetReplicationRegionArgs build() {
            return new ReplicationSetReplicationRegionArgs(regionConfiguration, regionName);
        }
    }
}
