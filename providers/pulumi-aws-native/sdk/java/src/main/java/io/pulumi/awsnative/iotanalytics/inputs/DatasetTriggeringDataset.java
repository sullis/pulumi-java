// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetTriggeringDataset extends io.pulumi.resources.InvokeArgs {

    public static final DatasetTriggeringDataset Empty = new DatasetTriggeringDataset();

    @InputImport(name="datasetName", required=true)
    private final String datasetName;

    public String getDatasetName() {
        return this.datasetName;
    }

    public DatasetTriggeringDataset(String datasetName) {
        this.datasetName = Objects.requireNonNull(datasetName, "expected parameter 'datasetName' to be non-null");
    }

    private DatasetTriggeringDataset() {
        this.datasetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTriggeringDataset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTriggeringDataset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
        }

        public Builder setDatasetName(String datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }

        public DatasetTriggeringDataset build() {
            return new DatasetTriggeringDataset(datasetName);
        }
    }
}
