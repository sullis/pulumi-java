// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.enums.DatasetResourceConfigurationComputeType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class DatasetResourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetResourceConfigurationArgs Empty = new DatasetResourceConfigurationArgs();

    @InputImport(name="computeType", required=true)
    private final Input<DatasetResourceConfigurationComputeType> computeType;

    public Input<DatasetResourceConfigurationComputeType> getComputeType() {
        return this.computeType;
    }

    @InputImport(name="volumeSizeInGB", required=true)
    private final Input<Integer> volumeSizeInGB;

    public Input<Integer> getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    public DatasetResourceConfigurationArgs(
        Input<DatasetResourceConfigurationComputeType> computeType,
        Input<Integer> volumeSizeInGB) {
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB, "expected parameter 'volumeSizeInGB' to be non-null");
    }

    private DatasetResourceConfigurationArgs() {
        this.computeType = Input.empty();
        this.volumeSizeInGB = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DatasetResourceConfigurationComputeType> computeType;
        private Input<Integer> volumeSizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.volumeSizeInGB = defaults.volumeSizeInGB;
        }

        public Builder setComputeType(Input<DatasetResourceConfigurationComputeType> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setComputeType(DatasetResourceConfigurationComputeType computeType) {
            this.computeType = Input.of(Objects.requireNonNull(computeType));
            return this;
        }

        public Builder setVolumeSizeInGB(Input<Integer> volumeSizeInGB) {
            this.volumeSizeInGB = Objects.requireNonNull(volumeSizeInGB);
            return this;
        }

        public Builder setVolumeSizeInGB(Integer volumeSizeInGB) {
            this.volumeSizeInGB = Input.of(Objects.requireNonNull(volumeSizeInGB));
            return this;
        }

        public DatasetResourceConfigurationArgs build() {
            return new DatasetResourceConfigurationArgs(computeType, volumeSizeInGB);
        }
    }
}
