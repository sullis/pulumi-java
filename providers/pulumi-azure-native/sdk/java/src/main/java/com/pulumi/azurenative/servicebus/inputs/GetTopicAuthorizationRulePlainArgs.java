// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTopicAuthorizationRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicAuthorizationRulePlainArgs Empty = new GetTopicAuthorizationRulePlainArgs();

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

    /**
     * The topic name.
     * 
     */
    @Import(name="topicName", required=true)
    private String topicName;

    /**
     * @return The topic name.
     * 
     */
    public String topicName() {
        return this.topicName;
    }

    private GetTopicAuthorizationRulePlainArgs() {}

    private GetTopicAuthorizationRulePlainArgs(GetTopicAuthorizationRulePlainArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopicAuthorizationRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopicAuthorizationRulePlainArgs $;

        public Builder() {
            $ = new GetTopicAuthorizationRulePlainArgs();
        }

        public Builder(GetTopicAuthorizationRulePlainArgs defaults) {
            $ = new GetTopicAuthorizationRulePlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param topicName The topic name.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            $.topicName = topicName;
            return this;
        }

        public GetTopicAuthorizationRulePlainArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
