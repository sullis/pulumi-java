// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataFlowSourceDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataFlowSourceDatasetArgs Empty = new DataFlowSourceDatasetArgs();

    /**
     * The name for the Data Factory Dataset.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name for the Data Factory Dataset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A map of parameters to associate with the Data Factory dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private DataFlowSourceDatasetArgs() {}

    private DataFlowSourceDatasetArgs(DataFlowSourceDatasetArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataFlowSourceDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataFlowSourceDatasetArgs $;

        public Builder() {
            $ = new DataFlowSourceDatasetArgs();
        }

        public Builder(DataFlowSourceDatasetArgs defaults) {
            $ = new DataFlowSourceDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public DataFlowSourceDatasetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
