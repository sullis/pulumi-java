// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPublishedBlueprintArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublishedBlueprintArgs Empty = new GetPublishedBlueprintArgs();

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
    private Output<String> blueprintName;

    /**
     * @return Name of the blueprint definition.
     * 
     */
    public Output<String> blueprintName() {
        return this.blueprintName;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    @Import(name="resourceScope", required=true)
    private Output<String> resourceScope;

    /**
     * @return The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    /**
     * Version of the published blueprint definition.
     * 
     */
    @Import(name="versionId", required=true)
    private Output<String> versionId;

    /**
     * @return Version of the published blueprint definition.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    private GetPublishedBlueprintArgs() {}

    private GetPublishedBlueprintArgs(GetPublishedBlueprintArgs $) {
        this.blueprintName = $.blueprintName;
        this.resourceScope = $.resourceScope;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublishedBlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublishedBlueprintArgs $;

        public Builder() {
            $ = new GetPublishedBlueprintArgs();
        }

        public Builder(GetPublishedBlueprintArgs defaults) {
            $ = new GetPublishedBlueprintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprintName Name of the blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(Output<String> blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        /**
         * @param blueprintName Name of the blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(String blueprintName) {
            return blueprintName(Output.of(blueprintName));
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(Output<String> resourceScope) {
            $.resourceScope = resourceScope;
            return this;
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(String resourceScope) {
            return resourceScope(Output.of(resourceScope));
        }

        /**
         * @param versionId Version of the published blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Version of the published blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public GetPublishedBlueprintArgs build() {
            $.blueprintName = Objects.requireNonNull($.blueprintName, "expected parameter 'blueprintName' to be non-null");
            $.resourceScope = Objects.requireNonNull($.resourceScope, "expected parameter 'resourceScope' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
