// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHybridConnectionAuthorizationRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridConnectionAuthorizationRulePlainArgs Empty = new GetHybridConnectionAuthorizationRulePlainArgs();

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
     * The hybrid connection name.
     * 
     */
    @Import(name="hybridConnectionName", required=true)
    private String hybridConnectionName;

    /**
     * @return The hybrid connection name.
     * 
     */
    public String hybridConnectionName() {
        return this.hybridConnectionName;
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

    private GetHybridConnectionAuthorizationRulePlainArgs() {}

    private GetHybridConnectionAuthorizationRulePlainArgs(GetHybridConnectionAuthorizationRulePlainArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.hybridConnectionName = $.hybridConnectionName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridConnectionAuthorizationRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridConnectionAuthorizationRulePlainArgs $;

        public Builder() {
            $ = new GetHybridConnectionAuthorizationRulePlainArgs();
        }

        public Builder(GetHybridConnectionAuthorizationRulePlainArgs defaults) {
            $ = new GetHybridConnectionAuthorizationRulePlainArgs(Objects.requireNonNull(defaults));
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
         * @param hybridConnectionName The hybrid connection name.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionName(String hybridConnectionName) {
            $.hybridConnectionName = hybridConnectionName;
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

        public GetHybridConnectionAuthorizationRulePlainArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.hybridConnectionName = Objects.requireNonNull($.hybridConnectionName, "expected parameter 'hybridConnectionName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
