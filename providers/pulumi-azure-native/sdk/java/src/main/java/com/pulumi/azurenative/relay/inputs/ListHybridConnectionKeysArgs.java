// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListHybridConnectionKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListHybridConnectionKeysArgs Empty = new ListHybridConnectionKeysArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
    private Output<String> authorizationRuleName;

    /**
     * @return The authorization rule name.
     * 
     */
    public Output<String> authorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The hybrid connection name.
     * 
     */
    @Import(name="hybridConnectionName", required=true)
    private Output<String> hybridConnectionName;

    /**
     * @return The hybrid connection name.
     * 
     */
    public Output<String> hybridConnectionName() {
        return this.hybridConnectionName;
    }

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

    private ListHybridConnectionKeysArgs() {}

    private ListHybridConnectionKeysArgs(ListHybridConnectionKeysArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.hybridConnectionName = $.hybridConnectionName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListHybridConnectionKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListHybridConnectionKeysArgs $;

        public Builder() {
            $ = new ListHybridConnectionKeysArgs();
        }

        public Builder(ListHybridConnectionKeysArgs defaults) {
            $ = new ListHybridConnectionKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(Output<String> authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            return authorizationRuleName(Output.of(authorizationRuleName));
        }

        /**
         * @param hybridConnectionName The hybrid connection name.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionName(Output<String> hybridConnectionName) {
            $.hybridConnectionName = hybridConnectionName;
            return this;
        }

        /**
         * @param hybridConnectionName The hybrid connection name.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionName(String hybridConnectionName) {
            return hybridConnectionName(Output.of(hybridConnectionName));
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

        public ListHybridConnectionKeysArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.hybridConnectionName = Objects.requireNonNull($.hybridConnectionName, "expected parameter 'hybridConnectionName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
