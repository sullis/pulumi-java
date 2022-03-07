// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRuleArgs Empty = new GetRuleArgs();

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
     * The rule name.
     * 
     */
    @InputImport(name="ruleName", required=true)
      private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * The subscription name.
     * 
     */
    @InputImport(name="subscriptionName", required=true)
      private final String subscriptionName;

    public String getSubscriptionName() {
        return this.subscriptionName;
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

    public GetRuleArgs(
        String namespaceName,
        String resourceGroupName,
        String ruleName,
        String subscriptionName,
        String topicName) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
        this.subscriptionName = Objects.requireNonNull(subscriptionName, "expected parameter 'subscriptionName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private GetRuleArgs() {
        this.namespaceName = null;
        this.resourceGroupName = null;
        this.ruleName = null;
        this.subscriptionName = null;
        this.topicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespaceName;
        private String resourceGroupName;
        private String ruleName;
        private String subscriptionName;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.subscriptionName = defaults.subscriptionName;
    	      this.topicName = defaults.topicName;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public Builder setSubscriptionName(String subscriptionName) {
            this.subscriptionName = Objects.requireNonNull(subscriptionName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public GetRuleArgs build() {
            return new GetRuleArgs(namespaceName, resourceGroupName, ruleName, subscriptionName, topicName);
        }
    }
}