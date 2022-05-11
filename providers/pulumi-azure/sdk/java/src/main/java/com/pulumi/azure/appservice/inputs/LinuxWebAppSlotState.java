// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotAuthSettingsArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotBackupArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotConnectionStringArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotIdentityArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteConfigArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotSiteCredentialArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotStorageAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxWebAppSlotState extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppSlotState Empty = new LinuxWebAppSlotState();

    /**
     * A `app_metadata` block as defined below.
     * 
     */
    @Import(name="appMetadata")
    private @Nullable Output<Map<String,String>> appMetadata;

    /**
     * @return A `app_metadata` block as defined below.
     * 
     */
    public Optional<Output<Map<String,String>>> appMetadata() {
        return Optional.ofNullable(this.appMetadata);
    }

    /**
     * The ID of the Linux Web App this Deployment Slot will be part of. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Import(name="appServiceId")
    private @Nullable Output<String> appServiceId;

    /**
     * @return The ID of the Linux Web App this Deployment Slot will be part of. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Optional<Output<String>> appServiceId() {
        return Optional.ofNullable(this.appServiceId);
    }

    /**
     * A map of key-value pairs of App Settings.
     * 
     */
    @Import(name="appSettings")
    private @Nullable Output<Map<String,String>> appSettings;

    /**
     * @return A map of key-value pairs of App Settings.
     * 
     */
    public Optional<Output<Map<String,String>>> appSettings() {
        return Optional.ofNullable(this.appSettings);
    }

    /**
     * A `auth_settings` block as defined below.
     * 
     */
    @Import(name="authSettings")
    private @Nullable Output<LinuxWebAppSlotAuthSettingsArgs> authSettings;

    /**
     * @return A `auth_settings` block as defined below.
     * 
     */
    public Optional<Output<LinuxWebAppSlotAuthSettingsArgs>> authSettings() {
        return Optional.ofNullable(this.authSettings);
    }

    /**
     * A `backup` block as defined below.
     * 
     */
    @Import(name="backup")
    private @Nullable Output<LinuxWebAppSlotBackupArgs> backup;

    /**
     * @return A `backup` block as defined below.
     * 
     */
    public Optional<Output<LinuxWebAppSlotBackupArgs>> backup() {
        return Optional.ofNullable(this.backup);
    }

    /**
     * Should Client Affinity be enabled?
     * 
     */
    @Import(name="clientAffinityEnabled")
    private @Nullable Output<Boolean> clientAffinityEnabled;

    /**
     * @return Should Client Affinity be enabled?
     * 
     */
    public Optional<Output<Boolean>> clientAffinityEnabled() {
        return Optional.ofNullable(this.clientAffinityEnabled);
    }

    /**
     * Should Client Certificates be enabled?
     * 
     */
    @Import(name="clientCertificateEnabled")
    private @Nullable Output<Boolean> clientCertificateEnabled;

    /**
     * @return Should Client Certificates be enabled?
     * 
     */
    public Optional<Output<Boolean>> clientCertificateEnabled() {
        return Optional.ofNullable(this.clientCertificateEnabled);
    }

    /**
     * The Client Certificate mode. Possible values include `Optional` and `Required`. This property has no effect when `client_cert_enabled` is `false`
     * 
     */
    @Import(name="clientCertificateMode")
    private @Nullable Output<String> clientCertificateMode;

    /**
     * @return The Client Certificate mode. Possible values include `Optional` and `Required`. This property has no effect when `client_cert_enabled` is `false`
     * 
     */
    public Optional<Output<String>> clientCertificateMode() {
        return Optional.ofNullable(this.clientCertificateMode);
    }

    /**
     * One or more `connection_string` blocks as defined below.
     * 
     */
    @Import(name="connectionStrings")
    private @Nullable Output<List<LinuxWebAppSlotConnectionStringArgs>> connectionStrings;

    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    public Optional<Output<List<LinuxWebAppSlotConnectionStringArgs>>> connectionStrings() {
        return Optional.ofNullable(this.connectionStrings);
    }

    /**
     * The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    @Import(name="customDomainVerificationId")
    private @Nullable Output<String> customDomainVerificationId;

    /**
     * @return The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    public Optional<Output<String>> customDomainVerificationId() {
        return Optional.ofNullable(this.customDomainVerificationId);
    }

    /**
     * The default hostname of the Linux Web App.
     * 
     */
    @Import(name="defaultHostname")
    private @Nullable Output<String> defaultHostname;

    /**
     * @return The default hostname of the Linux Web App.
     * 
     */
    public Optional<Output<String>> defaultHostname() {
        return Optional.ofNullable(this.defaultHostname);
    }

    /**
     * Should the Linux Web App be enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should the Linux Web App be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Should the Linux Web App require HTTPS connections.
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    /**
     * @return Should the Linux Web App require HTTPS connections.
     * 
     */
    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<LinuxWebAppSlotIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<LinuxWebAppSlotIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    @Import(name="keyVaultReferenceIdentityId")
    private @Nullable Output<String> keyVaultReferenceIdentityId;

    /**
     * @return The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    public Optional<Output<String>> keyVaultReferenceIdentityId() {
        return Optional.ofNullable(this.keyVaultReferenceIdentityId);
    }

    /**
     * The Kind value for this Linux Web App.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The Kind value for this Linux Web App.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * A `logs` block as defined below.
     * 
     */
    @Import(name="logs")
    private @Nullable Output<LinuxWebAppSlotLogsArgs> logs;

    /**
     * @return A `logs` block as defined below.
     * 
     */
    public Optional<Output<LinuxWebAppSlotLogsArgs>> logs() {
        return Optional.ofNullable(this.logs);
    }

    /**
     * The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    @Import(name="outboundIpAddressLists")
    private @Nullable Output<List<String>> outboundIpAddressLists;

    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    public Optional<Output<List<String>>> outboundIpAddressLists() {
        return Optional.ofNullable(this.outboundIpAddressLists);
    }

    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    @Import(name="outboundIpAddresses")
    private @Nullable Output<String> outboundIpAddresses;

    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    public Optional<Output<String>> outboundIpAddresses() {
        return Optional.ofNullable(this.outboundIpAddresses);
    }

    /**
     * A `possible_outbound_ip_address_list` block as defined below.
     * 
     */
    @Import(name="possibleOutboundIpAddressLists")
    private @Nullable Output<List<String>> possibleOutboundIpAddressLists;

    /**
     * @return A `possible_outbound_ip_address_list` block as defined below.
     * 
     */
    public Optional<Output<List<String>>> possibleOutboundIpAddressLists() {
        return Optional.ofNullable(this.possibleOutboundIpAddressLists);
    }

    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    @Import(name="possibleOutboundIpAddresses")
    private @Nullable Output<String> possibleOutboundIpAddresses;

    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    public Optional<Output<String>> possibleOutboundIpAddresses() {
        return Optional.ofNullable(this.possibleOutboundIpAddresses);
    }

    /**
     * A `site_config` block as defined below.
     * 
     */
    @Import(name="siteConfig")
    private @Nullable Output<LinuxWebAppSlotSiteConfigArgs> siteConfig;

    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public Optional<Output<LinuxWebAppSlotSiteConfigArgs>> siteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }

    /**
     * A `site_credential` block as defined below.
     * 
     */
    @Import(name="siteCredentials")
    private @Nullable Output<List<LinuxWebAppSlotSiteCredentialArgs>> siteCredentials;

    /**
     * @return A `site_credential` block as defined below.
     * 
     */
    public Optional<Output<List<LinuxWebAppSlotSiteCredentialArgs>>> siteCredentials() {
        return Optional.ofNullable(this.siteCredentials);
    }

    /**
     * One or more `storage_account` blocks as defined below.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<LinuxWebAppSlotStorageAccountArgs>> storageAccounts;

    /**
     * @return One or more `storage_account` blocks as defined below.
     * 
     */
    public Optional<Output<List<LinuxWebAppSlotStorageAccountArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * A mapping of tags which should be assigned to the Linux Web App.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Linux Web App.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LinuxWebAppSlotState() {}

    private LinuxWebAppSlotState(LinuxWebAppSlotState $) {
        this.appMetadata = $.appMetadata;
        this.appServiceId = $.appServiceId;
        this.appSettings = $.appSettings;
        this.authSettings = $.authSettings;
        this.backup = $.backup;
        this.clientAffinityEnabled = $.clientAffinityEnabled;
        this.clientCertificateEnabled = $.clientCertificateEnabled;
        this.clientCertificateMode = $.clientCertificateMode;
        this.connectionStrings = $.connectionStrings;
        this.customDomainVerificationId = $.customDomainVerificationId;
        this.defaultHostname = $.defaultHostname;
        this.enabled = $.enabled;
        this.httpsOnly = $.httpsOnly;
        this.identity = $.identity;
        this.keyVaultReferenceIdentityId = $.keyVaultReferenceIdentityId;
        this.kind = $.kind;
        this.logs = $.logs;
        this.name = $.name;
        this.outboundIpAddressLists = $.outboundIpAddressLists;
        this.outboundIpAddresses = $.outboundIpAddresses;
        this.possibleOutboundIpAddressLists = $.possibleOutboundIpAddressLists;
        this.possibleOutboundIpAddresses = $.possibleOutboundIpAddresses;
        this.siteConfig = $.siteConfig;
        this.siteCredentials = $.siteCredentials;
        this.storageAccounts = $.storageAccounts;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppSlotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppSlotState $;

        public Builder() {
            $ = new LinuxWebAppSlotState();
        }

        public Builder(LinuxWebAppSlotState defaults) {
            $ = new LinuxWebAppSlotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appMetadata A `app_metadata` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder appMetadata(@Nullable Output<Map<String,String>> appMetadata) {
            $.appMetadata = appMetadata;
            return this;
        }

        /**
         * @param appMetadata A `app_metadata` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder appMetadata(Map<String,String> appMetadata) {
            return appMetadata(Output.of(appMetadata));
        }

        /**
         * @param appServiceId The ID of the Linux Web App this Deployment Slot will be part of. Changing this forces a new Linux Web App to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceId(@Nullable Output<String> appServiceId) {
            $.appServiceId = appServiceId;
            return this;
        }

        /**
         * @param appServiceId The ID of the Linux Web App this Deployment Slot will be part of. Changing this forces a new Linux Web App to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceId(String appServiceId) {
            return appServiceId(Output.of(appServiceId));
        }

        /**
         * @param appSettings A map of key-value pairs of App Settings.
         * 
         * @return builder
         * 
         */
        public Builder appSettings(@Nullable Output<Map<String,String>> appSettings) {
            $.appSettings = appSettings;
            return this;
        }

        /**
         * @param appSettings A map of key-value pairs of App Settings.
         * 
         * @return builder
         * 
         */
        public Builder appSettings(Map<String,String> appSettings) {
            return appSettings(Output.of(appSettings));
        }

        /**
         * @param authSettings A `auth_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authSettings(@Nullable Output<LinuxWebAppSlotAuthSettingsArgs> authSettings) {
            $.authSettings = authSettings;
            return this;
        }

        /**
         * @param authSettings A `auth_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authSettings(LinuxWebAppSlotAuthSettingsArgs authSettings) {
            return authSettings(Output.of(authSettings));
        }

        /**
         * @param backup A `backup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backup(@Nullable Output<LinuxWebAppSlotBackupArgs> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup A `backup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backup(LinuxWebAppSlotBackupArgs backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param clientAffinityEnabled Should Client Affinity be enabled?
         * 
         * @return builder
         * 
         */
        public Builder clientAffinityEnabled(@Nullable Output<Boolean> clientAffinityEnabled) {
            $.clientAffinityEnabled = clientAffinityEnabled;
            return this;
        }

        /**
         * @param clientAffinityEnabled Should Client Affinity be enabled?
         * 
         * @return builder
         * 
         */
        public Builder clientAffinityEnabled(Boolean clientAffinityEnabled) {
            return clientAffinityEnabled(Output.of(clientAffinityEnabled));
        }

        /**
         * @param clientCertificateEnabled Should Client Certificates be enabled?
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateEnabled(@Nullable Output<Boolean> clientCertificateEnabled) {
            $.clientCertificateEnabled = clientCertificateEnabled;
            return this;
        }

        /**
         * @param clientCertificateEnabled Should Client Certificates be enabled?
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateEnabled(Boolean clientCertificateEnabled) {
            return clientCertificateEnabled(Output.of(clientCertificateEnabled));
        }

        /**
         * @param clientCertificateMode The Client Certificate mode. Possible values include `Optional` and `Required`. This property has no effect when `client_cert_enabled` is `false`
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateMode(@Nullable Output<String> clientCertificateMode) {
            $.clientCertificateMode = clientCertificateMode;
            return this;
        }

        /**
         * @param clientCertificateMode The Client Certificate mode. Possible values include `Optional` and `Required`. This property has no effect when `client_cert_enabled` is `false`
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateMode(String clientCertificateMode) {
            return clientCertificateMode(Output.of(clientCertificateMode));
        }

        /**
         * @param connectionStrings One or more `connection_string` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(@Nullable Output<List<LinuxWebAppSlotConnectionStringArgs>> connectionStrings) {
            $.connectionStrings = connectionStrings;
            return this;
        }

        /**
         * @param connectionStrings One or more `connection_string` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(List<LinuxWebAppSlotConnectionStringArgs> connectionStrings) {
            return connectionStrings(Output.of(connectionStrings));
        }

        /**
         * @param connectionStrings One or more `connection_string` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(LinuxWebAppSlotConnectionStringArgs... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }

        /**
         * @param customDomainVerificationId The identifier used by App Service to perform domain ownership verification via DNS TXT record.
         * 
         * @return builder
         * 
         */
        public Builder customDomainVerificationId(@Nullable Output<String> customDomainVerificationId) {
            $.customDomainVerificationId = customDomainVerificationId;
            return this;
        }

        /**
         * @param customDomainVerificationId The identifier used by App Service to perform domain ownership verification via DNS TXT record.
         * 
         * @return builder
         * 
         */
        public Builder customDomainVerificationId(String customDomainVerificationId) {
            return customDomainVerificationId(Output.of(customDomainVerificationId));
        }

        /**
         * @param defaultHostname The default hostname of the Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder defaultHostname(@Nullable Output<String> defaultHostname) {
            $.defaultHostname = defaultHostname;
            return this;
        }

        /**
         * @param defaultHostname The default hostname of the Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder defaultHostname(String defaultHostname) {
            return defaultHostname(Output.of(defaultHostname));
        }

        /**
         * @param enabled Should the Linux Web App be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the Linux Web App be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param httpsOnly Should the Linux Web App require HTTPS connections.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param httpsOnly Should the Linux Web App require HTTPS connections.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<LinuxWebAppSlotIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(LinuxWebAppSlotIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyVaultReferenceIdentityId The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentityId(@Nullable Output<String> keyVaultReferenceIdentityId) {
            $.keyVaultReferenceIdentityId = keyVaultReferenceIdentityId;
            return this;
        }

        /**
         * @param keyVaultReferenceIdentityId The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentityId(String keyVaultReferenceIdentityId) {
            return keyVaultReferenceIdentityId(Output.of(keyVaultReferenceIdentityId));
        }

        /**
         * @param kind The Kind value for this Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The Kind value for this Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param logs A `logs` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder logs(@Nullable Output<LinuxWebAppSlotLogsArgs> logs) {
            $.logs = logs;
            return this;
        }

        /**
         * @param logs A `logs` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder logs(LinuxWebAppSlotLogsArgs logs) {
            return logs(Output.of(logs));
        }

        /**
         * @param name The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outboundIpAddressLists A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddressLists(@Nullable Output<List<String>> outboundIpAddressLists) {
            $.outboundIpAddressLists = outboundIpAddressLists;
            return this;
        }

        /**
         * @param outboundIpAddressLists A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddressLists(List<String> outboundIpAddressLists) {
            return outboundIpAddressLists(Output.of(outboundIpAddressLists));
        }

        /**
         * @param outboundIpAddressLists A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddressLists(String... outboundIpAddressLists) {
            return outboundIpAddressLists(List.of(outboundIpAddressLists));
        }

        /**
         * @param outboundIpAddresses A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddresses(@Nullable Output<String> outboundIpAddresses) {
            $.outboundIpAddresses = outboundIpAddresses;
            return this;
        }

        /**
         * @param outboundIpAddresses A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddresses(String outboundIpAddresses) {
            return outboundIpAddresses(Output.of(outboundIpAddresses));
        }

        /**
         * @param possibleOutboundIpAddressLists A `possible_outbound_ip_address_list` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder possibleOutboundIpAddressLists(@Nullable Output<List<String>> possibleOutboundIpAddressLists) {
            $.possibleOutboundIpAddressLists = possibleOutboundIpAddressLists;
            return this;
        }

        /**
         * @param possibleOutboundIpAddressLists A `possible_outbound_ip_address_list` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder possibleOutboundIpAddressLists(List<String> possibleOutboundIpAddressLists) {
            return possibleOutboundIpAddressLists(Output.of(possibleOutboundIpAddressLists));
        }

        /**
         * @param possibleOutboundIpAddressLists A `possible_outbound_ip_address_list` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder possibleOutboundIpAddressLists(String... possibleOutboundIpAddressLists) {
            return possibleOutboundIpAddressLists(List.of(possibleOutboundIpAddressLists));
        }

        /**
         * @param possibleOutboundIpAddresses A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
         * 
         * @return builder
         * 
         */
        public Builder possibleOutboundIpAddresses(@Nullable Output<String> possibleOutboundIpAddresses) {
            $.possibleOutboundIpAddresses = possibleOutboundIpAddresses;
            return this;
        }

        /**
         * @param possibleOutboundIpAddresses A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
         * 
         * @return builder
         * 
         */
        public Builder possibleOutboundIpAddresses(String possibleOutboundIpAddresses) {
            return possibleOutboundIpAddresses(Output.of(possibleOutboundIpAddresses));
        }

        /**
         * @param siteConfig A `site_config` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(@Nullable Output<LinuxWebAppSlotSiteConfigArgs> siteConfig) {
            $.siteConfig = siteConfig;
            return this;
        }

        /**
         * @param siteConfig A `site_config` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(LinuxWebAppSlotSiteConfigArgs siteConfig) {
            return siteConfig(Output.of(siteConfig));
        }

        /**
         * @param siteCredentials A `site_credential` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteCredentials(@Nullable Output<List<LinuxWebAppSlotSiteCredentialArgs>> siteCredentials) {
            $.siteCredentials = siteCredentials;
            return this;
        }

        /**
         * @param siteCredentials A `site_credential` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteCredentials(List<LinuxWebAppSlotSiteCredentialArgs> siteCredentials) {
            return siteCredentials(Output.of(siteCredentials));
        }

        /**
         * @param siteCredentials A `site_credential` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteCredentials(LinuxWebAppSlotSiteCredentialArgs... siteCredentials) {
            return siteCredentials(List.of(siteCredentials));
        }

        /**
         * @param storageAccounts One or more `storage_account` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable Output<List<LinuxWebAppSlotStorageAccountArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts One or more `storage_account` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(List<LinuxWebAppSlotStorageAccountArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        /**
         * @param storageAccounts One or more `storage_account` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(LinuxWebAppSlotStorageAccountArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public LinuxWebAppSlotState build() {
            return $;
        }
    }

}
