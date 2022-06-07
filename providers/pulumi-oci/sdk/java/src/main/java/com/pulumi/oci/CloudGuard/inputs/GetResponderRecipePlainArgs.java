// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResponderRecipePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponderRecipePlainArgs Empty = new GetResponderRecipePlainArgs();

    /**
     * OCID of ResponderRecipe
     * 
     */
    @Import(name="responderRecipeId", required=true)
    private String responderRecipeId;

    /**
     * @return OCID of ResponderRecipe
     * 
     */
    public String responderRecipeId() {
        return this.responderRecipeId;
    }

    private GetResponderRecipePlainArgs() {}

    private GetResponderRecipePlainArgs(GetResponderRecipePlainArgs $) {
        this.responderRecipeId = $.responderRecipeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponderRecipePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponderRecipePlainArgs $;

        public Builder() {
            $ = new GetResponderRecipePlainArgs();
        }

        public Builder(GetResponderRecipePlainArgs defaults) {
            $ = new GetResponderRecipePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param responderRecipeId OCID of ResponderRecipe
         * 
         * @return builder
         * 
         */
        public Builder responderRecipeId(String responderRecipeId) {
            $.responderRecipeId = responderRecipeId;
            return this;
        }

        public GetResponderRecipePlainArgs build() {
            $.responderRecipeId = Objects.requireNonNull($.responderRecipeId, "expected parameter 'responderRecipeId' to be non-null");
            return $;
        }
    }

}
