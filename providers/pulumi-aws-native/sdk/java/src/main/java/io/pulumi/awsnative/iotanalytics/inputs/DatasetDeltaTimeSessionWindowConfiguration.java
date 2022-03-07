// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class DatasetDeltaTimeSessionWindowConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DatasetDeltaTimeSessionWindowConfiguration Empty = new DatasetDeltaTimeSessionWindowConfiguration();

    @InputImport(name="timeoutInMinutes", required=true)
      private final Integer timeoutInMinutes;

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public DatasetDeltaTimeSessionWindowConfiguration(Integer timeoutInMinutes) {
        this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes, "expected parameter 'timeoutInMinutes' to be non-null");
    }

    private DatasetDeltaTimeSessionWindowConfiguration() {
        this.timeoutInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDeltaTimeSessionWindowConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer timeoutInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDeltaTimeSessionWindowConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeoutInMinutes = defaults.timeoutInMinutes;
        }

        public Builder setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes);
            return this;
        }
        public DatasetDeltaTimeSessionWindowConfiguration build() {
            return new DatasetDeltaTimeSessionWindowConfiguration(timeoutInMinutes);
        }
    }
}