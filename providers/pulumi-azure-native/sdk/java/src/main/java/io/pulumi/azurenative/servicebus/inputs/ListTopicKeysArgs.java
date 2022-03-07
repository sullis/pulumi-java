// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListTopicKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListTopicKeysArgs Empty = new ListTopicKeysArgs();

    /**
     * The authorization rule name.
     * 
     */
    @InputImport(name="authorizationRuleName", required=true)
      private final String authorizationRuleName;

    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
      private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The topic name.
     * 
     */
    @InputImport(name="topicName", required=true)
      private final String topicName;

    public String getTopicName() {
        return this.topicName;
    }

    public ListTopicKeysArgs(
        String authorizationRuleName,
        String namespaceName,
        String resourceGroupName,
        String topicName) {
        this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private ListTopicKeysArgs() {
        this.authorizationRuleName = null;
        this.namespaceName = null;
        this.resourceGroupName = null;
        this.topicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTopicKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationRuleName;
        private String namespaceName;
        private String resourceGroupName;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTopicKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.topicName = defaults.topicName;
        }

        public Builder setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public ListTopicKeysArgs build() {
            return new ListTopicKeysArgs(authorizationRuleName, namespaceName, resourceGroupName, topicName);
        }
    }
}