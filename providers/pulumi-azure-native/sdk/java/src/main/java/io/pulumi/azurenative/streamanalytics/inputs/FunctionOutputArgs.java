// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the output of a function.
 * 
 */
public final class FunctionOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionOutputArgs Empty = new FunctionOutputArgs();

    /**
     * The (Azure Stream Analytics supported) data type of the function output. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable Input<String> dataType;

    public Input<String> getDataType() {
        return this.dataType == null ? Input.empty() : this.dataType;
    }

    public FunctionOutputArgs(@Nullable Input<String> dataType) {
        this.dataType = dataType;
    }

    private FunctionOutputArgs() {
        this.dataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
        }

        public Builder setDataType(@Nullable Input<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = Input.ofNullable(dataType);
            return this;
        }
        public FunctionOutputArgs build() {
            return new FunctionOutputArgs(dataType);
        }
    }
}