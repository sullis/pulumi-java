// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data flow reference type.
 * 
 */
public final class DataFlowReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataFlowReferenceResponse Empty = new DataFlowReferenceResponse();

    /**
     * Reference data flow parameters from dataset.
     * 
     */
    @InputImport(name="datasetParameters")
      private final @Nullable Object datasetParameters;

    public Optional<Object> getDatasetParameters() {
        return this.datasetParameters == null ? Optional.empty() : Optional.ofNullable(this.datasetParameters);
    }

    /**
     * Data flow parameters
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,Object> parameters;

    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Reference data flow name.
     * 
     */
    @InputImport(name="referenceName", required=true)
      private final String referenceName;

    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Data flow reference type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public DataFlowReferenceResponse(
        @Nullable Object datasetParameters,
        @Nullable Map<String,Object> parameters,
        String referenceName,
        String type) {
        this.datasetParameters = datasetParameters;
        this.parameters = parameters;
        this.referenceName = Objects.requireNonNull(referenceName, "expected parameter 'referenceName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DataFlowReferenceResponse() {
        this.datasetParameters = null;
        this.parameters = Map.of();
        this.referenceName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object datasetParameters;
        private @Nullable Map<String,Object> parameters;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetParameters = defaults.datasetParameters;
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setDatasetParameters(@Nullable Object datasetParameters) {
            this.datasetParameters = datasetParameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setReferenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DataFlowReferenceResponse build() {
            return new DataFlowReferenceResponse(datasetParameters, parameters, referenceName, type);
        }
    }
}