// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetContentVersionValueArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetOutputFileUriValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetVariableArgs Empty = new DatasetVariableArgs();

    @InputImport(name="datasetContentVersionValue")
      private final @Nullable Input<DatasetContentVersionValueArgs> datasetContentVersionValue;

    public Input<DatasetContentVersionValueArgs> getDatasetContentVersionValue() {
        return this.datasetContentVersionValue == null ? Input.empty() : this.datasetContentVersionValue;
    }

    @InputImport(name="doubleValue")
      private final @Nullable Input<Double> doubleValue;

    public Input<Double> getDoubleValue() {
        return this.doubleValue == null ? Input.empty() : this.doubleValue;
    }

    @InputImport(name="outputFileUriValue")
      private final @Nullable Input<DatasetOutputFileUriValueArgs> outputFileUriValue;

    public Input<DatasetOutputFileUriValueArgs> getOutputFileUriValue() {
        return this.outputFileUriValue == null ? Input.empty() : this.outputFileUriValue;
    }

    @InputImport(name="stringValue")
      private final @Nullable Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue == null ? Input.empty() : this.stringValue;
    }

    @InputImport(name="variableName", required=true)
      private final Input<String> variableName;

    public Input<String> getVariableName() {
        return this.variableName;
    }

    public DatasetVariableArgs(
        @Nullable Input<DatasetContentVersionValueArgs> datasetContentVersionValue,
        @Nullable Input<Double> doubleValue,
        @Nullable Input<DatasetOutputFileUriValueArgs> outputFileUriValue,
        @Nullable Input<String> stringValue,
        Input<String> variableName) {
        this.datasetContentVersionValue = datasetContentVersionValue;
        this.doubleValue = doubleValue;
        this.outputFileUriValue = outputFileUriValue;
        this.stringValue = stringValue;
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
    }

    private DatasetVariableArgs() {
        this.datasetContentVersionValue = Input.empty();
        this.doubleValue = Input.empty();
        this.outputFileUriValue = Input.empty();
        this.stringValue = Input.empty();
        this.variableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetContentVersionValueArgs> datasetContentVersionValue;
        private @Nullable Input<Double> doubleValue;
        private @Nullable Input<DatasetOutputFileUriValueArgs> outputFileUriValue;
        private @Nullable Input<String> stringValue;
        private Input<String> variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetContentVersionValue = defaults.datasetContentVersionValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.outputFileUriValue = defaults.outputFileUriValue;
    	      this.stringValue = defaults.stringValue;
    	      this.variableName = defaults.variableName;
        }

        public Builder setDatasetContentVersionValue(@Nullable Input<DatasetContentVersionValueArgs> datasetContentVersionValue) {
            this.datasetContentVersionValue = datasetContentVersionValue;
            return this;
        }

        public Builder setDatasetContentVersionValue(@Nullable DatasetContentVersionValueArgs datasetContentVersionValue) {
            this.datasetContentVersionValue = Input.ofNullable(datasetContentVersionValue);
            return this;
        }

        public Builder setDoubleValue(@Nullable Input<Double> doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setDoubleValue(@Nullable Double doubleValue) {
            this.doubleValue = Input.ofNullable(doubleValue);
            return this;
        }

        public Builder setOutputFileUriValue(@Nullable Input<DatasetOutputFileUriValueArgs> outputFileUriValue) {
            this.outputFileUriValue = outputFileUriValue;
            return this;
        }

        public Builder setOutputFileUriValue(@Nullable DatasetOutputFileUriValueArgs outputFileUriValue) {
            this.outputFileUriValue = Input.ofNullable(outputFileUriValue);
            return this;
        }

        public Builder setStringValue(@Nullable Input<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = Input.ofNullable(stringValue);
            return this;
        }

        public Builder setVariableName(Input<String> variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public Builder setVariableName(String variableName) {
            this.variableName = Input.of(Objects.requireNonNull(variableName));
            return this;
        }
        public DatasetVariableArgs build() {
            return new DatasetVariableArgs(datasetContentVersionValue, doubleValue, outputFileUriValue, stringValue, variableName);
        }
    }
}