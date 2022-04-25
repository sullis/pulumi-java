// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModuleArgs Empty = new ModuleArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the module content link.
     * 
     */
    @Import(name="contentLink", required=true)
    private Output<ContentLinkArgs> contentLink;

    /**
     * @return Gets or sets the module content link.
     * 
     */
    public Output<ContentLinkArgs> contentLink() {
        return this.contentLink;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Gets or sets the location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of module.
     * 
     */
    @Import(name="moduleName")
    private @Nullable Output<String> moduleName;

    /**
     * @return The name of module.
     * 
     */
    public Optional<Output<String>> moduleName() {
        return Optional.ofNullable(this.moduleName);
    }

    /**
     * Gets or sets name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Gets or sets name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Gets or sets the tags attached to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModuleArgs() {}

    private ModuleArgs(ModuleArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.contentLink = $.contentLink;
        this.location = $.location;
        this.moduleName = $.moduleName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleArgs $;

        public Builder() {
            $ = new ModuleArgs();
        }

        public Builder(ModuleArgs defaults) {
            $ = new ModuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param contentLink Gets or sets the module content link.
         * 
         * @return builder
         * 
         */
        public Builder contentLink(Output<ContentLinkArgs> contentLink) {
            $.contentLink = contentLink;
            return this;
        }

        /**
         * @param contentLink Gets or sets the module content link.
         * 
         * @return builder
         * 
         */
        public Builder contentLink(ContentLinkArgs contentLink) {
            return contentLink(Output.of(contentLink));
        }

        /**
         * @param location Gets or sets the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Gets or sets the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param moduleName The name of module.
         * 
         * @return builder
         * 
         */
        public Builder moduleName(@Nullable Output<String> moduleName) {
            $.moduleName = moduleName;
            return this;
        }

        /**
         * @param moduleName The name of module.
         * 
         * @return builder
         * 
         */
        public Builder moduleName(String moduleName) {
            return moduleName(Output.of(moduleName));
        }

        /**
         * @param name Gets or sets name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Gets or sets the tags attached to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Gets or sets the tags attached to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ModuleArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.contentLink = Objects.requireNonNull($.contentLink, "expected parameter 'contentLink' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
