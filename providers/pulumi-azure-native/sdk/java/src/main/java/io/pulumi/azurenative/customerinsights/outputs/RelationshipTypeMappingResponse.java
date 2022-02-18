// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.RelationshipTypeFieldMappingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RelationshipTypeMappingResponse {
    /**
     * Maps a profile property with the StrongId of related profile. This is an array to support StrongIds that are composite key as well.
     * 
     */
    private final List<RelationshipTypeFieldMappingResponse> fieldMappings;

    @OutputCustomType.Constructor({"fieldMappings"})
    private RelationshipTypeMappingResponse(List<RelationshipTypeFieldMappingResponse> fieldMappings) {
        this.fieldMappings = Objects.requireNonNull(fieldMappings);
    }

    /**
     * Maps a profile property with the StrongId of related profile. This is an array to support StrongIds that are composite key as well.
     * 
     */
    public List<RelationshipTypeFieldMappingResponse> getFieldMappings() {
        return this.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipTypeMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RelationshipTypeFieldMappingResponse> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipTypeMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder setFieldMappings(List<RelationshipTypeFieldMappingResponse> fieldMappings) {
            this.fieldMappings = Objects.requireNonNull(fieldMappings);
            return this;
        }

        public RelationshipTypeMappingResponse build() {
            return new RelationshipTypeMappingResponse(fieldMappings);
        }
    }
}
