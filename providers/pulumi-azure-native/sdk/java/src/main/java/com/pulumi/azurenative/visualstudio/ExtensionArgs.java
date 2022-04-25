// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.visualstudio;

import com.pulumi.azurenative.visualstudio.inputs.ExtensionResourcePlanArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * The name of the Visual Studio Team Services account resource.
     * 
     */
    @Import(name="accountResourceName", required=true)
    private Output<String> accountResourceName;

    /**
     * @return The name of the Visual Studio Team Services account resource.
     * 
     */
    public Output<String> accountResourceName() {
        return this.accountResourceName;
    }

    /**
     * The name of the extension.
     * 
     */
    @Import(name="extensionResourceName")
    private @Nullable Output<String> extensionResourceName;

    /**
     * @return The name of the extension.
     * 
     */
    public Optional<Output<String>> extensionResourceName() {
        return Optional.ofNullable(this.extensionResourceName);
    }

    /**
     * The Azure region of the Visual Studio account associated with this request (i.e &#39;southcentralus&#39;.)
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure region of the Visual Studio account associated with this request (i.e &#39;southcentralus&#39;.)
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Extended information about the plan being purchased for this extension resource.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<ExtensionResourcePlanArgs> plan;

    /**
     * @return Extended information about the plan being purchased for this extension resource.
     * 
     */
    public Optional<Output<ExtensionResourcePlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * A dictionary of extended properties. This property is currently unused.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return A dictionary of extended properties. This property is currently unused.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A dictionary of user-defined tags to be stored with the extension resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A dictionary of user-defined tags to be stored with the extension resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ExtensionArgs() {}

    private ExtensionArgs(ExtensionArgs $) {
        this.accountResourceName = $.accountResourceName;
        this.extensionResourceName = $.extensionResourceName;
        this.location = $.location;
        this.plan = $.plan;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionArgs $;

        public Builder() {
            $ = new ExtensionArgs();
        }

        public Builder(ExtensionArgs defaults) {
            $ = new ExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountResourceName The name of the Visual Studio Team Services account resource.
         * 
         * @return builder
         * 
         */
        public Builder accountResourceName(Output<String> accountResourceName) {
            $.accountResourceName = accountResourceName;
            return this;
        }

        /**
         * @param accountResourceName The name of the Visual Studio Team Services account resource.
         * 
         * @return builder
         * 
         */
        public Builder accountResourceName(String accountResourceName) {
            return accountResourceName(Output.of(accountResourceName));
        }

        /**
         * @param extensionResourceName The name of the extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionResourceName(@Nullable Output<String> extensionResourceName) {
            $.extensionResourceName = extensionResourceName;
            return this;
        }

        /**
         * @param extensionResourceName The name of the extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionResourceName(String extensionResourceName) {
            return extensionResourceName(Output.of(extensionResourceName));
        }

        /**
         * @param location The Azure region of the Visual Studio account associated with this request (i.e &#39;southcentralus&#39;.)
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure region of the Visual Studio account associated with this request (i.e &#39;southcentralus&#39;.)
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param plan Extended information about the plan being purchased for this extension resource.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<ExtensionResourcePlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Extended information about the plan being purchased for this extension resource.
         * 
         * @return builder
         * 
         */
        public Builder plan(ExtensionResourcePlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param properties A dictionary of extended properties. This property is currently unused.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A dictionary of extended properties. This property is currently unused.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A dictionary of user-defined tags to be stored with the extension resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A dictionary of user-defined tags to be stored with the extension resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ExtensionArgs build() {
            $.accountResourceName = Objects.requireNonNull($.accountResourceName, "expected parameter 'accountResourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
