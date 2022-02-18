// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatasetDeltaTimeSessionWindowConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetLateDataRuleConfiguration {
    private final @Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration;

    @OutputCustomType.Constructor({"deltaTimeSessionWindowConfiguration"})
    private DatasetLateDataRuleConfiguration(@Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration) {
        this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
    }

    public Optional<DatasetDeltaTimeSessionWindowConfiguration> getDeltaTimeSessionWindowConfiguration() {
        return Optional.ofNullable(this.deltaTimeSessionWindowConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetLateDataRuleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetLateDataRuleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaTimeSessionWindowConfiguration = defaults.deltaTimeSessionWindowConfiguration;
        }

        public Builder setDeltaTimeSessionWindowConfiguration(@Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration) {
            this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
            return this;
        }

        public DatasetLateDataRuleConfiguration build() {
            return new DatasetLateDataRuleConfiguration(deltaTimeSessionWindowConfiguration);
        }
    }
}
