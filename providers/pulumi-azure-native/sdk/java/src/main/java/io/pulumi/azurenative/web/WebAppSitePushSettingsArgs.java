// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSitePushSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSitePushSettingsArgs Empty = new WebAppSitePushSettingsArgs();

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    @InputImport(name="dynamicTagsJson")
    private final @Nullable Input<String> dynamicTagsJson;

    public Input<String> getDynamicTagsJson() {
        return this.dynamicTagsJson == null ? Input.empty() : this.dynamicTagsJson;
    }

    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    @InputImport(name="isPushEnabled", required=true)
    private final Input<Boolean> isPushEnabled;

    public Input<Boolean> getIsPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of web app.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    @InputImport(name="tagWhitelistJson")
    private final @Nullable Input<String> tagWhitelistJson;

    public Input<String> getTagWhitelistJson() {
        return this.tagWhitelistJson == null ? Input.empty() : this.tagWhitelistJson;
    }

    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    @InputImport(name="tagsRequiringAuth")
    private final @Nullable Input<String> tagsRequiringAuth;

    public Input<String> getTagsRequiringAuth() {
        return this.tagsRequiringAuth == null ? Input.empty() : this.tagsRequiringAuth;
    }

    public WebAppSitePushSettingsArgs(
        @Nullable Input<String> dynamicTagsJson,
        Input<Boolean> isPushEnabled,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> tagWhitelistJson,
        @Nullable Input<String> tagsRequiringAuth) {
        this.dynamicTagsJson = dynamicTagsJson;
        this.isPushEnabled = Objects.requireNonNull(isPushEnabled, "expected parameter 'isPushEnabled' to be non-null");
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tagWhitelistJson = tagWhitelistJson;
        this.tagsRequiringAuth = tagsRequiringAuth;
    }

    private WebAppSitePushSettingsArgs() {
        this.dynamicTagsJson = Input.empty();
        this.isPushEnabled = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tagWhitelistJson = Input.empty();
        this.tagsRequiringAuth = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSitePushSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dynamicTagsJson;
        private Input<Boolean> isPushEnabled;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> tagWhitelistJson;
        private @Nullable Input<String> tagsRequiringAuth;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSitePushSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagsJson = defaults.dynamicTagsJson;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tagWhitelistJson = defaults.tagWhitelistJson;
    	      this.tagsRequiringAuth = defaults.tagsRequiringAuth;
        }

        public Builder setDynamicTagsJson(@Nullable Input<String> dynamicTagsJson) {
            this.dynamicTagsJson = dynamicTagsJson;
            return this;
        }

        public Builder setDynamicTagsJson(@Nullable String dynamicTagsJson) {
            this.dynamicTagsJson = Input.ofNullable(dynamicTagsJson);
            return this;
        }

        public Builder setIsPushEnabled(Input<Boolean> isPushEnabled) {
            this.isPushEnabled = Objects.requireNonNull(isPushEnabled);
            return this;
        }

        public Builder setIsPushEnabled(Boolean isPushEnabled) {
            this.isPushEnabled = Input.of(Objects.requireNonNull(isPushEnabled));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTagWhitelistJson(@Nullable Input<String> tagWhitelistJson) {
            this.tagWhitelistJson = tagWhitelistJson;
            return this;
        }

        public Builder setTagWhitelistJson(@Nullable String tagWhitelistJson) {
            this.tagWhitelistJson = Input.ofNullable(tagWhitelistJson);
            return this;
        }

        public Builder setTagsRequiringAuth(@Nullable Input<String> tagsRequiringAuth) {
            this.tagsRequiringAuth = tagsRequiringAuth;
            return this;
        }

        public Builder setTagsRequiringAuth(@Nullable String tagsRequiringAuth) {
            this.tagsRequiringAuth = Input.ofNullable(tagsRequiringAuth);
            return this;
        }

        public WebAppSitePushSettingsArgs build() {
            return new WebAppSitePushSettingsArgs(dynamicTagsJson, isPushEnabled, kind, name, resourceGroupName, tagWhitelistJson, tagsRequiringAuth);
        }
    }
}
