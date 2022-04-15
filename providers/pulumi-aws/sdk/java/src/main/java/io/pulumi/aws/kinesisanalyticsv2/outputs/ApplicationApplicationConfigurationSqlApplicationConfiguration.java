// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInput;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutput;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfiguration {
    /**
     * The input stream used by the application.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInput input;
    /**
     * The destination streams used by the application.
     * 
     */
    private final @Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutput> outputs;
    /**
     * The reference data source used by the application.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource referenceDataSource;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfiguration(
        @CustomType.Parameter("input") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInput input,
        @CustomType.Parameter("outputs") @Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutput> outputs,
        @CustomType.Parameter("referenceDataSource") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource referenceDataSource) {
        this.input = input;
        this.outputs = outputs;
        this.referenceDataSource = referenceDataSource;
    }

    /**
     * The input stream used by the application.
     * 
    */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInput> input() {
        return Optional.ofNullable(this.input);
    }
    /**
     * The destination streams used by the application.
     * 
    */
    public List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutput> outputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * The reference data source used by the application.
     * 
    */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource> referenceDataSource() {
        return Optional.ofNullable(this.referenceDataSource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInput input;
        private @Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutput> outputs;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource referenceDataSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.outputs = defaults.outputs;
    	      this.referenceDataSource = defaults.referenceDataSource;
        }

        public Builder input(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInput input) {
            this.input = input;
            return this;
        }
        public Builder outputs(@Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(ApplicationApplicationConfigurationSqlApplicationConfigurationOutput... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder referenceDataSource(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource referenceDataSource) {
            this.referenceDataSource = referenceDataSource;
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfiguration build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfiguration(input, outputs, referenceDataSource);
        }
    }
}
