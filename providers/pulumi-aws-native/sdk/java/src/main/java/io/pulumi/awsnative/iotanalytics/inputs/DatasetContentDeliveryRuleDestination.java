// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetIotEventsDestinationConfiguration;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetS3DestinationConfiguration;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetContentDeliveryRuleDestination extends io.pulumi.resources.InvokeArgs {

    public static final DatasetContentDeliveryRuleDestination Empty = new DatasetContentDeliveryRuleDestination();

    @Import(name="iotEventsDestinationConfiguration")
      private final @Nullable DatasetIotEventsDestinationConfiguration iotEventsDestinationConfiguration;

    public Optional<DatasetIotEventsDestinationConfiguration> iotEventsDestinationConfiguration() {
        return this.iotEventsDestinationConfiguration == null ? Optional.empty() : Optional.ofNullable(this.iotEventsDestinationConfiguration);
    }

    @Import(name="s3DestinationConfiguration")
      private final @Nullable DatasetS3DestinationConfiguration s3DestinationConfiguration;

    public Optional<DatasetS3DestinationConfiguration> s3DestinationConfiguration() {
        return this.s3DestinationConfiguration == null ? Optional.empty() : Optional.ofNullable(this.s3DestinationConfiguration);
    }

    public DatasetContentDeliveryRuleDestination(
        @Nullable DatasetIotEventsDestinationConfiguration iotEventsDestinationConfiguration,
        @Nullable DatasetS3DestinationConfiguration s3DestinationConfiguration) {
        this.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    private DatasetContentDeliveryRuleDestination() {
        this.iotEventsDestinationConfiguration = null;
        this.s3DestinationConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetContentDeliveryRuleDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetIotEventsDestinationConfiguration iotEventsDestinationConfiguration;
        private @Nullable DatasetS3DestinationConfiguration s3DestinationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetContentDeliveryRuleDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iotEventsDestinationConfiguration = defaults.iotEventsDestinationConfiguration;
    	      this.s3DestinationConfiguration = defaults.s3DestinationConfiguration;
        }

        public Builder iotEventsDestinationConfiguration(@Nullable DatasetIotEventsDestinationConfiguration iotEventsDestinationConfiguration) {
            this.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
            return this;
        }
        public Builder s3DestinationConfiguration(@Nullable DatasetS3DestinationConfiguration s3DestinationConfiguration) {
            this.s3DestinationConfiguration = s3DestinationConfiguration;
            return this;
        }        public DatasetContentDeliveryRuleDestination build() {
            return new DatasetContentDeliveryRuleDestination(iotEventsDestinationConfiguration, s3DestinationConfiguration);
        }
    }
}
