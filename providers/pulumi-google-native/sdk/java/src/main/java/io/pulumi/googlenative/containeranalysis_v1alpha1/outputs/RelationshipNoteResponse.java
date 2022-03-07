// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RelationshipNoteResponse {
    /**
     * The type of relationship between the source and target SPDX elements
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private RelationshipNoteResponse(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The type of relationship between the source and target SPDX elements
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RelationshipNoteResponse build() {
            return new RelationshipNoteResponse(type);
        }
    }
}