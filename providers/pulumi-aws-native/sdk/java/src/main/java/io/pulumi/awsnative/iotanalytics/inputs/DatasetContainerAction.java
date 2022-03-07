// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetResourceConfiguration;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetVariable;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetContainerAction extends io.pulumi.resources.InvokeArgs {

    public static final DatasetContainerAction Empty = new DatasetContainerAction();

    @InputImport(name="executionRoleArn", required=true)
      private final String executionRoleArn;

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    @InputImport(name="image", required=true)
      private final String image;

    public String getImage() {
        return this.image;
    }

    @InputImport(name="resourceConfiguration", required=true)
      private final DatasetResourceConfiguration resourceConfiguration;

    public DatasetResourceConfiguration getResourceConfiguration() {
        return this.resourceConfiguration;
    }

    @InputImport(name="variables")
      private final @Nullable List<DatasetVariable> variables;

    public List<DatasetVariable> getVariables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public DatasetContainerAction(
        String executionRoleArn,
        String image,
        DatasetResourceConfiguration resourceConfiguration,
        @Nullable List<DatasetVariable> variables) {
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.resourceConfiguration = Objects.requireNonNull(resourceConfiguration, "expected parameter 'resourceConfiguration' to be non-null");
        this.variables = variables;
    }

    private DatasetContainerAction() {
        this.executionRoleArn = null;
        this.image = null;
        this.resourceConfiguration = null;
        this.variables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetContainerAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionRoleArn;
        private String image;
        private DatasetResourceConfiguration resourceConfiguration;
        private @Nullable List<DatasetVariable> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetContainerAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.image = defaults.image;
    	      this.resourceConfiguration = defaults.resourceConfiguration;
    	      this.variables = defaults.variables;
        }

        public Builder setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setResourceConfiguration(DatasetResourceConfiguration resourceConfiguration) {
            this.resourceConfiguration = Objects.requireNonNull(resourceConfiguration);
            return this;
        }

        public Builder setVariables(@Nullable List<DatasetVariable> variables) {
            this.variables = variables;
            return this;
        }
        public DatasetContainerAction build() {
            return new DatasetContainerAction(executionRoleArn, image, resourceConfiguration, variables);
        }
    }
}