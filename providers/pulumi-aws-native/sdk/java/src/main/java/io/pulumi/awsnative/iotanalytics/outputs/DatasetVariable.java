// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatasetContentVersionValue;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetOutputFileUriValue;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetVariable {
    private final @Nullable DatasetContentVersionValue datasetContentVersionValue;
    private final @Nullable Double doubleValue;
    private final @Nullable DatasetOutputFileUriValue outputFileUriValue;
    private final @Nullable String stringValue;
    private final String variableName;

    @OutputCustomType.Constructor({"datasetContentVersionValue","doubleValue","outputFileUriValue","stringValue","variableName"})
    private DatasetVariable(
        @Nullable DatasetContentVersionValue datasetContentVersionValue,
        @Nullable Double doubleValue,
        @Nullable DatasetOutputFileUriValue outputFileUriValue,
        @Nullable String stringValue,
        String variableName) {
        this.datasetContentVersionValue = datasetContentVersionValue;
        this.doubleValue = doubleValue;
        this.outputFileUriValue = outputFileUriValue;
        this.stringValue = stringValue;
        this.variableName = Objects.requireNonNull(variableName);
    }

    public Optional<DatasetContentVersionValue> getDatasetContentVersionValue() {
        return Optional.ofNullable(this.datasetContentVersionValue);
    }
    public Optional<Double> getDoubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }
    public Optional<DatasetOutputFileUriValue> getOutputFileUriValue() {
        return Optional.ofNullable(this.outputFileUriValue);
    }
    public Optional<String> getStringValue() {
        return Optional.ofNullable(this.stringValue);
    }
    public String getVariableName() {
        return this.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetContentVersionValue datasetContentVersionValue;
        private @Nullable Double doubleValue;
        private @Nullable DatasetOutputFileUriValue outputFileUriValue;
        private @Nullable String stringValue;
        private String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetContentVersionValue = defaults.datasetContentVersionValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.outputFileUriValue = defaults.outputFileUriValue;
    	      this.stringValue = defaults.stringValue;
    	      this.variableName = defaults.variableName;
        }

        public Builder setDatasetContentVersionValue(@Nullable DatasetContentVersionValue datasetContentVersionValue) {
            this.datasetContentVersionValue = datasetContentVersionValue;
            return this;
        }

        public Builder setDoubleValue(@Nullable Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setOutputFileUriValue(@Nullable DatasetOutputFileUriValue outputFileUriValue) {
            this.outputFileUriValue = outputFileUriValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setVariableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public DatasetVariable build() {
            return new DatasetVariable(datasetContentVersionValue, doubleValue, outputFileUriValue, stringValue, variableName);
        }
    }
}
