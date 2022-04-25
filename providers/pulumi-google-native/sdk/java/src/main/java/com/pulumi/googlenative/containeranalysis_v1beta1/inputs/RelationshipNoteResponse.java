// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * RelationshipNote represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 * 
 */
public final class RelationshipNoteResponse extends com.pulumi.resources.InvokeArgs {

    public static final RelationshipNoteResponse Empty = new RelationshipNoteResponse();

    /**
     * The type of relationship between the source and target SPDX elements
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of relationship between the source and target SPDX elements
     * 
     */
    public String type() {
        return this.type;
    }

    private RelationshipNoteResponse() {}

    private RelationshipNoteResponse(RelationshipNoteResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RelationshipNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RelationshipNoteResponse $;

        public Builder() {
            $ = new RelationshipNoteResponse();
        }

        public Builder(RelationshipNoteResponse defaults) {
            $ = new RelationshipNoteResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of relationship between the source and target SPDX elements
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RelationshipNoteResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
