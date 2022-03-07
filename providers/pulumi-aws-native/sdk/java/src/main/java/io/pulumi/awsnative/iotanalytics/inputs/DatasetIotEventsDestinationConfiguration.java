// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetIotEventsDestinationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DatasetIotEventsDestinationConfiguration Empty = new DatasetIotEventsDestinationConfiguration();

    @InputImport(name="inputName", required=true)
      private final String inputName;

    public String getInputName() {
        return this.inputName;
    }

    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    public DatasetIotEventsDestinationConfiguration(
        String inputName,
        String roleArn) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private DatasetIotEventsDestinationConfiguration() {
        this.inputName = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetIotEventsDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputName;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetIotEventsDestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setInputName(String inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public DatasetIotEventsDestinationConfiguration build() {
            return new DatasetIotEventsDestinationConfiguration(inputName, roleArn);
        }
    }
}