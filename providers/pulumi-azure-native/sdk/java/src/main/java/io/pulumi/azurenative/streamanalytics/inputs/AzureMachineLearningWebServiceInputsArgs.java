// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceInputColumnArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The inputs for the Azure Machine Learning web service endpoint.
 * 
 */
public final class AzureMachineLearningWebServiceInputsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMachineLearningWebServiceInputsArgs Empty = new AzureMachineLearningWebServiceInputsArgs();

    /**
     * A list of input columns for the Azure Machine Learning web service endpoint.
     * 
     */
    @InputImport(name="columnNames")
    private final @Nullable Input<List<AzureMachineLearningWebServiceInputColumnArgs>> columnNames;

    public Input<List<AzureMachineLearningWebServiceInputColumnArgs>> getColumnNames() {
        return this.columnNames == null ? Input.empty() : this.columnNames;
    }

    /**
     * The name of the input. This is the name provided while authoring the endpoint.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public AzureMachineLearningWebServiceInputsArgs(
        @Nullable Input<List<AzureMachineLearningWebServiceInputColumnArgs>> columnNames,
        @Nullable Input<String> name) {
        this.columnNames = columnNames;
        this.name = name;
    }

    private AzureMachineLearningWebServiceInputsArgs() {
        this.columnNames = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceInputsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AzureMachineLearningWebServiceInputColumnArgs>> columnNames;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceInputsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnNames = defaults.columnNames;
    	      this.name = defaults.name;
        }

        public Builder setColumnNames(@Nullable Input<List<AzureMachineLearningWebServiceInputColumnArgs>> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        public Builder setColumnNames(@Nullable List<AzureMachineLearningWebServiceInputColumnArgs> columnNames) {
            this.columnNames = Input.ofNullable(columnNames);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public AzureMachineLearningWebServiceInputsArgs build() {
            return new AzureMachineLearningWebServiceInputsArgs(columnNames, name);
        }
    }
}
