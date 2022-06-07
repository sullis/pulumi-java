// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceActionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceActionArgs Empty = new GetResourceActionArgs();

    /**
     * The unique OCID associated with the resource action.
     * 
     */
    @Import(name="resourceActionId", required=true)
    private Output<String> resourceActionId;

    /**
     * @return The unique OCID associated with the resource action.
     * 
     */
    public Output<String> resourceActionId() {
        return this.resourceActionId;
    }

    private GetResourceActionArgs() {}

    private GetResourceActionArgs(GetResourceActionArgs $) {
        this.resourceActionId = $.resourceActionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceActionArgs $;

        public Builder() {
            $ = new GetResourceActionArgs();
        }

        public Builder(GetResourceActionArgs defaults) {
            $ = new GetResourceActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceActionId The unique OCID associated with the resource action.
         * 
         * @return builder
         * 
         */
        public Builder resourceActionId(Output<String> resourceActionId) {
            $.resourceActionId = resourceActionId;
            return this;
        }

        /**
         * @param resourceActionId The unique OCID associated with the resource action.
         * 
         * @return builder
         * 
         */
        public Builder resourceActionId(String resourceActionId) {
            return resourceActionId(Output.of(resourceActionId));
        }

        public GetResourceActionArgs build() {
            $.resourceActionId = Objects.requireNonNull($.resourceActionId, "expected parameter 'resourceActionId' to be non-null");
            return $;
        }
    }

}
