// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetDeltaTimeSessionWindowConfiguration;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetLateDataRuleConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DatasetLateDataRuleConfiguration Empty = new DatasetLateDataRuleConfiguration();

    @InputImport(name="deltaTimeSessionWindowConfiguration")
    private final @Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration;

    public Optional<DatasetDeltaTimeSessionWindowConfiguration> getDeltaTimeSessionWindowConfiguration() {
        return this.deltaTimeSessionWindowConfiguration == null ? Optional.empty() : Optional.ofNullable(this.deltaTimeSessionWindowConfiguration);
    }

    public DatasetLateDataRuleConfiguration(@Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration) {
        this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
    }

    private DatasetLateDataRuleConfiguration() {
        this.deltaTimeSessionWindowConfiguration = null;
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
