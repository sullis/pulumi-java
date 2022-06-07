// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    /**
     * Specifies the name of the ServiceBus Subscription.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Subscription.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the ServiceBus Namespace.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return The name of the ServiceBus Namespace.
     * 
     */
    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * Specifies the name of the Resource Group where the ServiceBus Namespace exists.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the ServiceBus Namespace exists.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    @Import(name="topicId")
    private @Nullable Output<String> topicId;

    public Optional<Output<String>> topicId() {
        return Optional.ofNullable(this.topicId);
    }

    /**
     * The name of the ServiceBus Topic.
     * 
     */
    @Import(name="topicName")
    private @Nullable Output<String> topicName;

    /**
     * @return The name of the ServiceBus Topic.
     * 
     */
    public Optional<Output<String>> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    private GetSubscriptionArgs() {}

    private GetSubscriptionArgs(GetSubscriptionArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.topicId = $.topicId;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionArgs $;

        public Builder() {
            $ = new GetSubscriptionArgs();
        }

        public Builder(GetSubscriptionArgs defaults) {
            $ = new GetSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the ServiceBus Subscription.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Subscription.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the ServiceBus Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the ServiceBus Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder topicId(@Nullable Output<String> topicId) {
            $.topicId = topicId;
            return this;
        }

        public Builder topicId(String topicId) {
            return topicId(Output.of(topicId));
        }

        /**
         * @param topicName The name of the ServiceBus Topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(@Nullable Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName The name of the ServiceBus Topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public GetSubscriptionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
