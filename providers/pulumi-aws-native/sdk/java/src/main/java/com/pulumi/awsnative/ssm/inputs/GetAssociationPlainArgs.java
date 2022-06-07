// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssociationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssociationPlainArgs Empty = new GetAssociationPlainArgs();

    /**
     * Unique identifier of the association.
     * 
     */
    @Import(name="associationId", required=true)
    private String associationId;

    /**
     * @return Unique identifier of the association.
     * 
     */
    public String associationId() {
        return this.associationId;
    }

    private GetAssociationPlainArgs() {}

    private GetAssociationPlainArgs(GetAssociationPlainArgs $) {
        this.associationId = $.associationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssociationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssociationPlainArgs $;

        public Builder() {
            $ = new GetAssociationPlainArgs();
        }

        public Builder(GetAssociationPlainArgs defaults) {
            $ = new GetAssociationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationId Unique identifier of the association.
         * 
         * @return builder
         * 
         */
        public Builder associationId(String associationId) {
            $.associationId = associationId;
            return this;
        }

        public GetAssociationPlainArgs build() {
            $.associationId = Objects.requireNonNull($.associationId, "expected parameter 'associationId' to be non-null");
            return $;
        }
    }

}
