// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceAuthorizationRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceAuthorizationRuleArgs Empty = new GetNamespaceAuthorizationRuleArgs();

    /**
     * Specifies the name of the ServiceBus Namespace Authorization Rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Namespace Authorization Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * Specifies the name of the ServiceBus Namespace.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return Specifies the name of the ServiceBus Namespace.
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

    private GetNamespaceAuthorizationRuleArgs() {}

    private GetNamespaceAuthorizationRuleArgs(GetNamespaceAuthorizationRuleArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
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
         * @param name Specifies the name of the ServiceBus Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param namespaceName Specifies the name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the ServiceBus Namespace.
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

        public GetNamespaceAuthorizationRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
