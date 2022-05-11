// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.relay;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridConnectionArgs Empty = new HybridConnectionArgs();

    /**
     * Specifies the name of the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Azure Relay in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="relayNamespaceName", required=true)
    private Output<String> relayNamespaceName;

    /**
     * @return The name of the Azure Relay in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> relayNamespaceName() {
        return this.relayNamespaceName;
    }

    /**
     * Specify if client authorization is needed for this hybrid connection. True by default. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="requiresClientAuthorization")
    private @Nullable Output<Boolean> requiresClientAuthorization;

    /**
     * @return Specify if client authorization is needed for this hybrid connection. True by default. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> requiresClientAuthorization() {
        return Optional.ofNullable(this.requiresClientAuthorization);
    }

    /**
     * The name of the resource group in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    @Import(name="userMetadata")
    private @Nullable Output<String> userMetadata;

    /**
     * @return The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    public Optional<Output<String>> userMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    private HybridConnectionArgs() {}

    private HybridConnectionArgs(HybridConnectionArgs $) {
        this.name = $.name;
        this.relayNamespaceName = $.relayNamespaceName;
        this.requiresClientAuthorization = $.requiresClientAuthorization;
        this.resourceGroupName = $.resourceGroupName;
        this.userMetadata = $.userMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridConnectionArgs $;

        public Builder() {
            $ = new HybridConnectionArgs();
        }

        public Builder(HybridConnectionArgs defaults) {
            $ = new HybridConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param relayNamespaceName The name of the Azure Relay in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder relayNamespaceName(Output<String> relayNamespaceName) {
            $.relayNamespaceName = relayNamespaceName;
            return this;
        }

        /**
         * @param relayNamespaceName The name of the Azure Relay in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder relayNamespaceName(String relayNamespaceName) {
            return relayNamespaceName(Output.of(relayNamespaceName));
        }

        /**
         * @param requiresClientAuthorization Specify if client authorization is needed for this hybrid connection. True by default. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder requiresClientAuthorization(@Nullable Output<Boolean> requiresClientAuthorization) {
            $.requiresClientAuthorization = requiresClientAuthorization;
            return this;
        }

        /**
         * @param requiresClientAuthorization Specify if client authorization is needed for this hybrid connection. True by default. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder requiresClientAuthorization(Boolean requiresClientAuthorization) {
            return requiresClientAuthorization(Output.of(requiresClientAuthorization));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Azure Relay Hybrid Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param userMetadata The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
         * 
         * @return builder
         * 
         */
        public Builder userMetadata(@Nullable Output<String> userMetadata) {
            $.userMetadata = userMetadata;
            return this;
        }

        /**
         * @param userMetadata The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
         * 
         * @return builder
         * 
         */
        public Builder userMetadata(String userMetadata) {
            return userMetadata(Output.of(userMetadata));
        }

        public HybridConnectionArgs build() {
            $.relayNamespaceName = Objects.requireNonNull($.relayNamespaceName, "expected parameter 'relayNamespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
