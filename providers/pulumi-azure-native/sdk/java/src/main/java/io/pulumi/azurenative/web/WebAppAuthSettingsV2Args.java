// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.AuthPlatformArgs;
import io.pulumi.azurenative.web.inputs.GlobalValidationArgs;
import io.pulumi.azurenative.web.inputs.HttpSettingsArgs;
import io.pulumi.azurenative.web.inputs.IdentityProvidersArgs;
import io.pulumi.azurenative.web.inputs.LoginArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppAuthSettingsV2Args extends io.pulumi.resources.ResourceArgs {

    public static final WebAppAuthSettingsV2Args Empty = new WebAppAuthSettingsV2Args();

    /**
     * The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
     * 
     */
    @InputImport(name="globalValidation")
    private final @Nullable Input<GlobalValidationArgs> globalValidation;

    public Input<GlobalValidationArgs> getGlobalValidation() {
        return this.globalValidation == null ? Input.empty() : this.globalValidation;
    }

    /**
     * The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
     * 
     */
    @InputImport(name="httpSettings")
    private final @Nullable Input<HttpSettingsArgs> httpSettings;

    public Input<HttpSettingsArgs> getHttpSettings() {
        return this.httpSettings == null ? Input.empty() : this.httpSettings;
    }

    /**
     * The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
     * 
     */
    @InputImport(name="identityProviders")
    private final @Nullable Input<IdentityProvidersArgs> identityProviders;

    public Input<IdentityProvidersArgs> getIdentityProviders() {
        return this.identityProviders == null ? Input.empty() : this.identityProviders;
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
     * The configuration settings of the login flow of users using App Service Authentication/Authorization.
     * 
     */
    @InputImport(name="login")
    private final @Nullable Input<LoginArgs> login;

    public Input<LoginArgs> getLogin() {
        return this.login == null ? Input.empty() : this.login;
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
     * The configuration settings of the platform of App Service Authentication/Authorization.
     * 
     */
    @InputImport(name="platform")
    private final @Nullable Input<AuthPlatformArgs> platform;

    public Input<AuthPlatformArgs> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
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

    public WebAppAuthSettingsV2Args(
        @Nullable Input<GlobalValidationArgs> globalValidation,
        @Nullable Input<HttpSettingsArgs> httpSettings,
        @Nullable Input<IdentityProvidersArgs> identityProviders,
        @Nullable Input<String> kind,
        @Nullable Input<LoginArgs> login,
        Input<String> name,
        @Nullable Input<AuthPlatformArgs> platform,
        Input<String> resourceGroupName) {
        this.globalValidation = globalValidation;
        this.httpSettings = httpSettings;
        this.identityProviders = identityProviders;
        this.kind = kind;
        this.login = login;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.platform = platform;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private WebAppAuthSettingsV2Args() {
        this.globalValidation = Input.empty();
        this.httpSettings = Input.empty();
        this.identityProviders = Input.empty();
        this.kind = Input.empty();
        this.login = Input.empty();
        this.name = Input.empty();
        this.platform = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppAuthSettingsV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GlobalValidationArgs> globalValidation;
        private @Nullable Input<HttpSettingsArgs> httpSettings;
        private @Nullable Input<IdentityProvidersArgs> identityProviders;
        private @Nullable Input<String> kind;
        private @Nullable Input<LoginArgs> login;
        private Input<String> name;
        private @Nullable Input<AuthPlatformArgs> platform;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppAuthSettingsV2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalValidation = defaults.globalValidation;
    	      this.httpSettings = defaults.httpSettings;
    	      this.identityProviders = defaults.identityProviders;
    	      this.kind = defaults.kind;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setGlobalValidation(@Nullable Input<GlobalValidationArgs> globalValidation) {
            this.globalValidation = globalValidation;
            return this;
        }

        public Builder setGlobalValidation(@Nullable GlobalValidationArgs globalValidation) {
            this.globalValidation = Input.ofNullable(globalValidation);
            return this;
        }

        public Builder setHttpSettings(@Nullable Input<HttpSettingsArgs> httpSettings) {
            this.httpSettings = httpSettings;
            return this;
        }

        public Builder setHttpSettings(@Nullable HttpSettingsArgs httpSettings) {
            this.httpSettings = Input.ofNullable(httpSettings);
            return this;
        }

        public Builder setIdentityProviders(@Nullable Input<IdentityProvidersArgs> identityProviders) {
            this.identityProviders = identityProviders;
            return this;
        }

        public Builder setIdentityProviders(@Nullable IdentityProvidersArgs identityProviders) {
            this.identityProviders = Input.ofNullable(identityProviders);
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

        public Builder setLogin(@Nullable Input<LoginArgs> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable LoginArgs login) {
            this.login = Input.ofNullable(login);
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

        public Builder setPlatform(@Nullable Input<AuthPlatformArgs> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable AuthPlatformArgs platform) {
            this.platform = Input.ofNullable(platform);
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

        public WebAppAuthSettingsV2Args build() {
            return new WebAppAuthSettingsV2Args(globalValidation, httpSettings, identityProviders, kind, login, name, platform, resourceGroupName);
        }
    }
}
