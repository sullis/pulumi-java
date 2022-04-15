// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.inputs.ReplicationSetRegionConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ReplicationSet regional configuration.
 * 
 */
public final class ReplicationSetReplicationRegionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationSetReplicationRegionArgs Empty = new ReplicationSetReplicationRegionArgs();

    @Import(name="regionConfiguration")
      private final @Nullable Output<ReplicationSetRegionConfigurationArgs> regionConfiguration;

    public Output<ReplicationSetRegionConfigurationArgs> regionConfiguration() {
        return this.regionConfiguration == null ? Codegen.empty() : this.regionConfiguration;
    }

    @Import(name="regionName")
      private final @Nullable Output<String> regionName;

    public Output<String> regionName() {
        return this.regionName == null ? Codegen.empty() : this.regionName;
    }

    public ReplicationSetReplicationRegionArgs(
        @Nullable Output<ReplicationSetRegionConfigurationArgs> regionConfiguration,
        @Nullable Output<String> regionName) {
        this.regionConfiguration = regionConfiguration;
        this.regionName = regionName;
    }

    private ReplicationSetReplicationRegionArgs() {
        this.regionConfiguration = Codegen.empty();
        this.regionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSetReplicationRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ReplicationSetRegionConfigurationArgs> regionConfiguration;
        private @Nullable Output<String> regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSetReplicationRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionConfiguration = defaults.regionConfiguration;
    	      this.regionName = defaults.regionName;
        }

        public Builder regionConfiguration(@Nullable Output<ReplicationSetRegionConfigurationArgs> regionConfiguration) {
            this.regionConfiguration = regionConfiguration;
            return this;
        }
        public Builder regionConfiguration(@Nullable ReplicationSetRegionConfigurationArgs regionConfiguration) {
            this.regionConfiguration = Codegen.ofNullable(regionConfiguration);
            return this;
        }
        public Builder regionName(@Nullable Output<String> regionName) {
            this.regionName = regionName;
            return this;
        }
        public Builder regionName(@Nullable String regionName) {
            this.regionName = Codegen.ofNullable(regionName);
            return this;
        }        public ReplicationSetReplicationRegionArgs build() {
            return new ReplicationSetReplicationRegionArgs(regionConfiguration, regionName);
        }
    }
}
