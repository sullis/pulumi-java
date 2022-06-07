// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRelationshipLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRelationshipLinkArgs Empty = new GetRelationshipLinkArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the relationship link.
     * 
     */
    @Import(name="relationshipLinkName", required=true)
    private Output<String> relationshipLinkName;

    /**
     * @return The name of the relationship link.
     * 
     */
    public Output<String> relationshipLinkName() {
        return this.relationshipLinkName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetRelationshipLinkArgs() {}

    private GetRelationshipLinkArgs(GetRelationshipLinkArgs $) {
        this.hubName = $.hubName;
        this.relationshipLinkName = $.relationshipLinkName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRelationshipLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRelationshipLinkArgs $;

        public Builder() {
            $ = new GetRelationshipLinkArgs();
        }

        public Builder(GetRelationshipLinkArgs defaults) {
            $ = new GetRelationshipLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param relationshipLinkName The name of the relationship link.
         * 
         * @return builder
         * 
         */
        public Builder relationshipLinkName(Output<String> relationshipLinkName) {
            $.relationshipLinkName = relationshipLinkName;
            return this;
        }

        /**
         * @param relationshipLinkName The name of the relationship link.
         * 
         * @return builder
         * 
         */
        public Builder relationshipLinkName(String relationshipLinkName) {
            return relationshipLinkName(Output.of(relationshipLinkName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetRelationshipLinkArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.relationshipLinkName = Objects.requireNonNull($.relationshipLinkName, "expected parameter 'relationshipLinkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
