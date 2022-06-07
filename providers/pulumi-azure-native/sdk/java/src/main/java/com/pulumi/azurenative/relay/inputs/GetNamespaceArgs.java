// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceArgs Empty = new GetNamespaceArgs();

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNamespaceArgs() {}

    private GetNamespaceArgs(GetNamespaceArgs $) {
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceArgs $;

        public Builder() {
            $ = new GetNamespaceArgs();
        }

        public Builder(GetNamespaceArgs defaults) {
            $ = new GetNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetNamespaceArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
