// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountArgs Empty = new IntegrationAccountArgs();

    /**
     * The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    @Import(name="integrationServiceEnvironmentId")
    private @Nullable Output<String> integrationServiceEnvironmentId;

    /**
     * @return The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    public Optional<Output<String>> integrationServiceEnvironmentId() {
        return Optional.ofNullable(this.integrationServiceEnvironmentId);
    }

    /**
     * The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * A mapping of tags which should be assigned to the Logic App Integration Account.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Logic App Integration Account.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IntegrationAccountArgs() {}

    private IntegrationAccountArgs(IntegrationAccountArgs $) {
        this.integrationServiceEnvironmentId = $.integrationServiceEnvironmentId;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountArgs $;

        public Builder() {
            $ = new IntegrationAccountArgs();
        }

        public Builder(IntegrationAccountArgs defaults) {
            $ = new IntegrationAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationServiceEnvironmentId The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentId(@Nullable Output<String> integrationServiceEnvironmentId) {
            $.integrationServiceEnvironmentId = integrationServiceEnvironmentId;
            return this;
        }

        /**
         * @param integrationServiceEnvironmentId The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentId(String integrationServiceEnvironmentId) {
            return integrationServiceEnvironmentId(Output.of(integrationServiceEnvironmentId));
        }

        /**
         * @param location The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Logic App Integration Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Logic App Integration Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public IntegrationAccountArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            return $;
        }
    }

}
