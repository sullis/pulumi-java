// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetReferenceResponse {
    /**
     * Arguments for dataset.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Reference dataset name.
     * 
     */
    private final String referenceName;
    /**
     * Dataset reference type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"parameters","referenceName","type"})
    private DatasetReferenceResponse(
        @Nullable Map<String,Object> parameters,
        String referenceName,
        String type) {
        this.parameters = parameters;
        this.referenceName = Objects.requireNonNull(referenceName);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Arguments for dataset.
     * 
     */
    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Reference dataset name.
     * 
     */
    public String getReferenceName() {
        return this.referenceName;
    }
    /**
     * Dataset reference type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> parameters;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
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

        public DatasetReferenceResponse build() {
            return new DatasetReferenceResponse(parameters, referenceName, type);
        }
    }
}
