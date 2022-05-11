// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.FunctionAppAuthSettingsActiveDirectory;
import com.pulumi.azure.appservice.outputs.FunctionAppAuthSettingsFacebook;
import com.pulumi.azure.appservice.outputs.FunctionAppAuthSettingsGoogle;
import com.pulumi.azure.appservice.outputs.FunctionAppAuthSettingsMicrosoft;
import com.pulumi.azure.appservice.outputs.FunctionAppAuthSettingsTwitter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionAppAuthSettings {
    /**
     * @return A `active_directory` block as defined below.
     * 
     */
    private final @Nullable FunctionAppAuthSettingsActiveDirectory activeDirectory;
    /**
     * @return Login parameters to send to the OpenID Connect authorization endpoint when a user logs in. Each parameter must be in the form &#34;key=value&#34;.
     * 
     */
    private final @Nullable Map<String,String> additionalLoginParams;
    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app.
     * 
     */
    private final @Nullable List<String> allowedExternalRedirectUrls;
    /**
     * @return The default provider to use when multiple providers have been set up. Possible values are `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount` and `Twitter`.
     * 
     */
    private final @Nullable String defaultProvider;
    /**
     * @return Is Authentication enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return A `facebook` block as defined below.
     * 
     */
    private final @Nullable FunctionAppAuthSettingsFacebook facebook;
    /**
     * @return A `google` block as defined below.
     * 
     */
    private final @Nullable FunctionAppAuthSettingsGoogle google;
    /**
     * @return Issuer URI. When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * 
     */
    private final @Nullable String issuer;
    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    private final @Nullable FunctionAppAuthSettingsMicrosoft microsoft;
    /**
     * @return The runtime version of the Authentication/Authorization module.
     * 
     */
    private final @Nullable String runtimeVersion;
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to 72.
     * 
     */
    private final @Nullable Double tokenRefreshExtensionHours;
    /**
     * @return If enabled the module will durably store platform-specific security tokens that are obtained during login flows. Defaults to false.
     * 
     */
    private final @Nullable Boolean tokenStoreEnabled;
    /**
     * @return A `twitter` block as defined below.
     * 
     */
    private final @Nullable FunctionAppAuthSettingsTwitter twitter;
    /**
     * @return The action to take when an unauthenticated client attempts to access the app. Possible values are `AllowAnonymous` and `RedirectToLoginPage`.
     * 
     */
    private final @Nullable String unauthenticatedClientAction;

    @CustomType.Constructor
    private FunctionAppAuthSettings(
        @CustomType.Parameter("activeDirectory") @Nullable FunctionAppAuthSettingsActiveDirectory activeDirectory,
        @CustomType.Parameter("additionalLoginParams") @Nullable Map<String,String> additionalLoginParams,
        @CustomType.Parameter("allowedExternalRedirectUrls") @Nullable List<String> allowedExternalRedirectUrls,
        @CustomType.Parameter("defaultProvider") @Nullable String defaultProvider,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("facebook") @Nullable FunctionAppAuthSettingsFacebook facebook,
        @CustomType.Parameter("google") @Nullable FunctionAppAuthSettingsGoogle google,
        @CustomType.Parameter("issuer") @Nullable String issuer,
        @CustomType.Parameter("microsoft") @Nullable FunctionAppAuthSettingsMicrosoft microsoft,
        @CustomType.Parameter("runtimeVersion") @Nullable String runtimeVersion,
        @CustomType.Parameter("tokenRefreshExtensionHours") @Nullable Double tokenRefreshExtensionHours,
        @CustomType.Parameter("tokenStoreEnabled") @Nullable Boolean tokenStoreEnabled,
        @CustomType.Parameter("twitter") @Nullable FunctionAppAuthSettingsTwitter twitter,
        @CustomType.Parameter("unauthenticatedClientAction") @Nullable String unauthenticatedClientAction) {
        this.activeDirectory = activeDirectory;
        this.additionalLoginParams = additionalLoginParams;
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        this.defaultProvider = defaultProvider;
        this.enabled = enabled;
        this.facebook = facebook;
        this.google = google;
        this.issuer = issuer;
        this.microsoft = microsoft;
        this.runtimeVersion = runtimeVersion;
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
        this.tokenStoreEnabled = tokenStoreEnabled;
        this.twitter = twitter;
        this.unauthenticatedClientAction = unauthenticatedClientAction;
    }

    /**
     * @return A `active_directory` block as defined below.
     * 
     */
    public Optional<FunctionAppAuthSettingsActiveDirectory> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }
    /**
     * @return Login parameters to send to the OpenID Connect authorization endpoint when a user logs in. Each parameter must be in the form &#34;key=value&#34;.
     * 
     */
    public Map<String,String> additionalLoginParams() {
        return this.additionalLoginParams == null ? Map.of() : this.additionalLoginParams;
    }
    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app.
     * 
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls == null ? List.of() : this.allowedExternalRedirectUrls;
    }
    /**
     * @return The default provider to use when multiple providers have been set up. Possible values are `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount` and `Twitter`.
     * 
     */
    public Optional<String> defaultProvider() {
        return Optional.ofNullable(this.defaultProvider);
    }
    /**
     * @return Is Authentication enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A `facebook` block as defined below.
     * 
     */
    public Optional<FunctionAppAuthSettingsFacebook> facebook() {
        return Optional.ofNullable(this.facebook);
    }
    /**
     * @return A `google` block as defined below.
     * 
     */
    public Optional<FunctionAppAuthSettingsGoogle> google() {
        return Optional.ofNullable(this.google);
    }
    /**
     * @return Issuer URI. When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * 
     */
    public Optional<String> issuer() {
        return Optional.ofNullable(this.issuer);
    }
    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    public Optional<FunctionAppAuthSettingsMicrosoft> microsoft() {
        return Optional.ofNullable(this.microsoft);
    }
    /**
     * @return The runtime version of the Authentication/Authorization module.
     * 
     */
    public Optional<String> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to 72.
     * 
     */
    public Optional<Double> tokenRefreshExtensionHours() {
        return Optional.ofNullable(this.tokenRefreshExtensionHours);
    }
    /**
     * @return If enabled the module will durably store platform-specific security tokens that are obtained during login flows. Defaults to false.
     * 
     */
    public Optional<Boolean> tokenStoreEnabled() {
        return Optional.ofNullable(this.tokenStoreEnabled);
    }
    /**
     * @return A `twitter` block as defined below.
     * 
     */
    public Optional<FunctionAppAuthSettingsTwitter> twitter() {
        return Optional.ofNullable(this.twitter);
    }
    /**
     * @return The action to take when an unauthenticated client attempts to access the app. Possible values are `AllowAnonymous` and `RedirectToLoginPage`.
     * 
     */
    public Optional<String> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionAppAuthSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FunctionAppAuthSettingsActiveDirectory activeDirectory;
        private @Nullable Map<String,String> additionalLoginParams;
        private @Nullable List<String> allowedExternalRedirectUrls;
        private @Nullable String defaultProvider;
        private Boolean enabled;
        private @Nullable FunctionAppAuthSettingsFacebook facebook;
        private @Nullable FunctionAppAuthSettingsGoogle google;
        private @Nullable String issuer;
        private @Nullable FunctionAppAuthSettingsMicrosoft microsoft;
        private @Nullable String runtimeVersion;
        private @Nullable Double tokenRefreshExtensionHours;
        private @Nullable Boolean tokenStoreEnabled;
        private @Nullable FunctionAppAuthSettingsTwitter twitter;
        private @Nullable String unauthenticatedClientAction;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionAppAuthSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectory = defaults.activeDirectory;
    	      this.additionalLoginParams = defaults.additionalLoginParams;
    	      this.allowedExternalRedirectUrls = defaults.allowedExternalRedirectUrls;
    	      this.defaultProvider = defaults.defaultProvider;
    	      this.enabled = defaults.enabled;
    	      this.facebook = defaults.facebook;
    	      this.google = defaults.google;
    	      this.issuer = defaults.issuer;
    	      this.microsoft = defaults.microsoft;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.tokenRefreshExtensionHours = defaults.tokenRefreshExtensionHours;
    	      this.tokenStoreEnabled = defaults.tokenStoreEnabled;
    	      this.twitter = defaults.twitter;
    	      this.unauthenticatedClientAction = defaults.unauthenticatedClientAction;
        }

        public Builder activeDirectory(@Nullable FunctionAppAuthSettingsActiveDirectory activeDirectory) {
            this.activeDirectory = activeDirectory;
            return this;
        }
        public Builder additionalLoginParams(@Nullable Map<String,String> additionalLoginParams) {
            this.additionalLoginParams = additionalLoginParams;
            return this;
        }
        public Builder allowedExternalRedirectUrls(@Nullable List<String> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            return this;
        }
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }
        public Builder defaultProvider(@Nullable String defaultProvider) {
            this.defaultProvider = defaultProvider;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder facebook(@Nullable FunctionAppAuthSettingsFacebook facebook) {
            this.facebook = facebook;
            return this;
        }
        public Builder google(@Nullable FunctionAppAuthSettingsGoogle google) {
            this.google = google;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder microsoft(@Nullable FunctionAppAuthSettingsMicrosoft microsoft) {
            this.microsoft = microsoft;
            return this;
        }
        public Builder runtimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public Builder tokenRefreshExtensionHours(@Nullable Double tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }
        public Builder tokenStoreEnabled(@Nullable Boolean tokenStoreEnabled) {
            this.tokenStoreEnabled = tokenStoreEnabled;
            return this;
        }
        public Builder twitter(@Nullable FunctionAppAuthSettingsTwitter twitter) {
            this.twitter = twitter;
            return this;
        }
        public Builder unauthenticatedClientAction(@Nullable String unauthenticatedClientAction) {
            this.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }        public FunctionAppAuthSettings build() {
            return new FunctionAppAuthSettings(activeDirectory, additionalLoginParams, allowedExternalRedirectUrls, defaultProvider, enabled, facebook, google, issuer, microsoft, runtimeVersion, tokenRefreshExtensionHours, tokenStoreEnabled, twitter, unauthenticatedClientAction);
        }
    }
}
