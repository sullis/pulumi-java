// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetResourceConfigurationArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetVariableArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetContainerActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetContainerActionArgs Empty = new DatasetContainerActionArgs();

    @InputImport(name="executionRoleArn", required=true)
      private final Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    @InputImport(name="image", required=true)
      private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    @InputImport(name="resourceConfiguration", required=true)
      private final Input<DatasetResourceConfigurationArgs> resourceConfiguration;

    public Input<DatasetResourceConfigurationArgs> getResourceConfiguration() {
        return this.resourceConfiguration;
    }

    @InputImport(name="variables")
      private final @Nullable Input<List<DatasetVariableArgs>> variables;

    public Input<List<DatasetVariableArgs>> getVariables() {
        return this.variables == null ? Input.empty() : this.variables;
    }

    public DatasetContainerActionArgs(
        Input<String> executionRoleArn,
        Input<String> image,
        Input<DatasetResourceConfigurationArgs> resourceConfiguration,
        @Nullable Input<List<DatasetVariableArgs>> variables) {
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.resourceConfiguration = Objects.requireNonNull(resourceConfiguration, "expected parameter 'resourceConfiguration' to be non-null");
        this.variables = variables;
    }

    private DatasetContainerActionArgs() {
        this.executionRoleArn = Input.empty();
        this.image = Input.empty();
        this.resourceConfiguration = Input.empty();
        this.variables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetContainerActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> executionRoleArn;
        private Input<String> image;
        private Input<DatasetResourceConfigurationArgs> resourceConfiguration;
        private @Nullable Input<List<DatasetVariableArgs>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetContainerActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.image = defaults.image;
    	      this.resourceConfiguration = defaults.resourceConfiguration;
    	      this.variables = defaults.variables;
        }

        public Builder setExecutionRoleArn(Input<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Input.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }

        public Builder setImage(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder setResourceConfiguration(Input<DatasetResourceConfigurationArgs> resourceConfiguration) {
            this.resourceConfiguration = Objects.requireNonNull(resourceConfiguration);
            return this;
        }

        public Builder setResourceConfiguration(DatasetResourceConfigurationArgs resourceConfiguration) {
            this.resourceConfiguration = Input.of(Objects.requireNonNull(resourceConfiguration));
            return this;
        }

        public Builder setVariables(@Nullable Input<List<DatasetVariableArgs>> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setVariables(@Nullable List<DatasetVariableArgs> variables) {
            this.variables = Input.ofNullable(variables);
            return this;
        }
        public DatasetContainerActionArgs build() {
            return new DatasetContainerActionArgs(executionRoleArn, image, resourceConfiguration, variables);
        }
    }
}