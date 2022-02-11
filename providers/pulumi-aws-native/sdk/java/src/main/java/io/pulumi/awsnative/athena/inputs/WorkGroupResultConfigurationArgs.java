// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.inputs.WorkGroupEncryptionConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkGroupResultConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkGroupResultConfigurationArgs Empty = new WorkGroupResultConfigurationArgs();

    @InputImport(name="encryptionConfiguration")
    private final @Nullable Input<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration;

    public Input<WorkGroupEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    @InputImport(name="outputLocation")
    private final @Nullable Input<String> outputLocation;

    public Input<String> getOutputLocation() {
        return this.outputLocation == null ? Input.empty() : this.outputLocation;
    }

    public WorkGroupResultConfigurationArgs(
        @Nullable Input<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Input<String> outputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
    }

    private WorkGroupResultConfigurationArgs() {
        this.encryptionConfiguration = Input.empty();
        this.outputLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupResultConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Input<String> outputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupResultConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable WorkGroupEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setOutputLocation(@Nullable Input<String> outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        public Builder setOutputLocation(@Nullable String outputLocation) {
            this.outputLocation = Input.ofNullable(outputLocation);
            return this;
        }

        public WorkGroupResultConfigurationArgs build() {
            return new WorkGroupResultConfigurationArgs(encryptionConfiguration, outputLocation);
        }
    }
}
