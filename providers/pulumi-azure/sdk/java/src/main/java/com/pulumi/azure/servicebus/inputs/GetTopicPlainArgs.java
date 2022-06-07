// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTopicPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicPlainArgs Empty = new GetTopicPlainArgs();

    /**
     * The name of this Service Bus Topic.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Service Bus Topic.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="namespaceId")
    private @Nullable String namespaceId;

    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The name of the Service Bus Namespace.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable String namespaceName;

    /**
     * @return The name of the Service Bus Namespace.
     * 
     */
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * The name of the Resource Group where the Service Bus Topic exists.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Service Bus Topic exists.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private GetTopicPlainArgs() {}

    private GetTopicPlainArgs(GetTopicPlainArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopicPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopicPlainArgs $;

        public Builder() {
            $ = new GetTopicPlainArgs();
        }

        public Builder(GetTopicPlainArgs defaults) {
            $ = new GetTopicPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Service Bus Topic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder namespaceId(@Nullable String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceName The name of the Service Bus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Service Bus Topic exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetTopicPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
