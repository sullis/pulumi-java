// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceAuthorizationRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceAuthorizationRuleArgs Empty = new GetNamespaceAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
    private String authorizationRuleName;

    /**
     * @return The authorization rule name.
     * 
     */
    public String authorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNamespaceAuthorizationRuleArgs() {}

    private GetNamespaceAuthorizationRuleArgs(GetNamespaceAuthorizationRuleArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceAuthorizationRuleArgs $;

        public Builder() {
            $ = new GetNamespaceAuthorizationRuleArgs();
        }

        public Builder(GetNamespaceAuthorizationRuleArgs defaults) {
            $ = new GetNamespaceAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNamespaceAuthorizationRuleArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
