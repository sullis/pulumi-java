// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetContentVersionValue extends io.pulumi.resources.InvokeArgs {

    public static final DatasetContentVersionValue Empty = new DatasetContentVersionValue();

    @InputImport(name="datasetName", required=true)
    private final String datasetName;

    public String getDatasetName() {
        return this.datasetName;
    }

    public DatasetContentVersionValue(String datasetName) {
        this.datasetName = Objects.requireNonNull(datasetName, "expected parameter 'datasetName' to be non-null");
    }

    private DatasetContentVersionValue() {
        this.datasetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetContentVersionValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetContentVersionValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
        }

        public Builder setDatasetName(String datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }

        public DatasetContentVersionValue build() {
            return new DatasetContentVersionValue(datasetName);
        }
    }
}
