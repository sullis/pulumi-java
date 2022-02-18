// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.enums.MsaAppType;
import io.pulumi.azurenative.botservice.enums.PublicNetworkAccess;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Bot.
 * 
 */
public final class BotPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotPropertiesArgs Empty = new BotPropertiesArgs();

    /**
     * Contains resource all settings defined as key/value pairs.
     * 
     */
    @InputImport(name="allSettings")
    private final @Nullable Input<Map<String,String>> allSettings;

    public Input<Map<String,String>> getAllSettings() {
        return this.allSettings == null ? Input.empty() : this.allSettings;
    }

    /**
     * The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
     * 
     */
    @InputImport(name="appPasswordHint")
    private final @Nullable Input<String> appPasswordHint;

    public Input<String> getAppPasswordHint() {
        return this.appPasswordHint == null ? Input.empty() : this.appPasswordHint;
    }

    /**
     * The CMK Url
     * 
     */
    @InputImport(name="cmekKeyVaultUrl")
    private final @Nullable Input<String> cmekKeyVaultUrl;

    public Input<String> getCmekKeyVaultUrl() {
        return this.cmekKeyVaultUrl == null ? Input.empty() : this.cmekKeyVaultUrl;
    }

    /**
     * The description of the bot
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Application Insights key
     * 
     */
    @InputImport(name="developerAppInsightKey")
    private final @Nullable Input<String> developerAppInsightKey;

    public Input<String> getDeveloperAppInsightKey() {
        return this.developerAppInsightKey == null ? Input.empty() : this.developerAppInsightKey;
    }

    /**
     * The Application Insights Api Key
     * 
     */
    @InputImport(name="developerAppInsightsApiKey")
    private final @Nullable Input<String> developerAppInsightsApiKey;

    public Input<String> getDeveloperAppInsightsApiKey() {
        return this.developerAppInsightsApiKey == null ? Input.empty() : this.developerAppInsightsApiKey;
    }

    /**
     * The Application Insights App Id
     * 
     */
    @InputImport(name="developerAppInsightsApplicationId")
    private final @Nullable Input<String> developerAppInsightsApplicationId;

    public Input<String> getDeveloperAppInsightsApplicationId() {
        return this.developerAppInsightsApplicationId == null ? Input.empty() : this.developerAppInsightsApplicationId;
    }

    /**
     * Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
     */
    @InputImport(name="disableLocalAuth")
    private final @Nullable Input<Boolean> disableLocalAuth;

    public Input<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Input.empty() : this.disableLocalAuth;
    }

    /**
     * The Name of the bot
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The bot's endpoint
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint;
    }

    /**
     * The Icon Url of the bot
     * 
     */
    @InputImport(name="iconUrl")
    private final @Nullable Input<String> iconUrl;

    public Input<String> getIconUrl() {
        return this.iconUrl == null ? Input.empty() : this.iconUrl;
    }

    /**
     * Whether Cmek is enabled
     * 
     */
    @InputImport(name="isCmekEnabled")
    private final @Nullable Input<Boolean> isCmekEnabled;

    public Input<Boolean> getIsCmekEnabled() {
        return this.isCmekEnabled == null ? Input.empty() : this.isCmekEnabled;
    }

    /**
     * Whether the bot is streaming supported
     * 
     */
    @InputImport(name="isStreamingSupported")
    private final @Nullable Input<Boolean> isStreamingSupported;

    public Input<Boolean> getIsStreamingSupported() {
        return this.isStreamingSupported == null ? Input.empty() : this.isStreamingSupported;
    }

    /**
     * Collection of LUIS App Ids
     * 
     */
    @InputImport(name="luisAppIds")
    private final @Nullable Input<List<String>> luisAppIds;

    public Input<List<String>> getLuisAppIds() {
        return this.luisAppIds == null ? Input.empty() : this.luisAppIds;
    }

    /**
     * The LUIS Key
     * 
     */
    @InputImport(name="luisKey")
    private final @Nullable Input<String> luisKey;

    public Input<String> getLuisKey() {
        return this.luisKey == null ? Input.empty() : this.luisKey;
    }

    /**
     * The bot's manifest url
     * 
     */
    @InputImport(name="manifestUrl")
    private final @Nullable Input<String> manifestUrl;

    public Input<String> getManifestUrl() {
        return this.manifestUrl == null ? Input.empty() : this.manifestUrl;
    }

    /**
     * Microsoft App Id for the bot
     * 
     */
    @InputImport(name="msaAppId", required=true)
    private final Input<String> msaAppId;

    public Input<String> getMsaAppId() {
        return this.msaAppId;
    }

    /**
     * Microsoft App Managed Identity Resource Id for the bot
     * 
     */
    @InputImport(name="msaAppMSIResourceId")
    private final @Nullable Input<String> msaAppMSIResourceId;

    public Input<String> getMsaAppMSIResourceId() {
        return this.msaAppMSIResourceId == null ? Input.empty() : this.msaAppMSIResourceId;
    }

    /**
     * Microsoft App Tenant Id for the bot
     * 
     */
    @InputImport(name="msaAppTenantId")
    private final @Nullable Input<String> msaAppTenantId;

    public Input<String> getMsaAppTenantId() {
        return this.msaAppTenantId == null ? Input.empty() : this.msaAppTenantId;
    }

    /**
     * Microsoft App Type for the bot
     * 
     */
    @InputImport(name="msaAppType")
    private final @Nullable Input<Either<String,MsaAppType>> msaAppType;

    public Input<Either<String,MsaAppType>> getMsaAppType() {
        return this.msaAppType == null ? Input.empty() : this.msaAppType;
    }

    /**
     * The hint to browser (e.g. protocol handler) on how to open the bot for authoring
     * 
     */
    @InputImport(name="openWithHint")
    private final @Nullable Input<String> openWithHint;

    public Input<String> getOpenWithHint() {
        return this.openWithHint == null ? Input.empty() : this.openWithHint;
    }

    /**
     * Contains resource parameters defined as key/value pairs.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Whether the bot is in an isolated network
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * Publishing credentials of the resource
     * 
     */
    @InputImport(name="publishingCredentials")
    private final @Nullable Input<String> publishingCredentials;

    public Input<String> getPublishingCredentials() {
        return this.publishingCredentials == null ? Input.empty() : this.publishingCredentials;
    }

    /**
     * The channel schema transformation version for the bot
     * 
     */
    @InputImport(name="schemaTransformationVersion")
    private final @Nullable Input<String> schemaTransformationVersion;

    public Input<String> getSchemaTransformationVersion() {
        return this.schemaTransformationVersion == null ? Input.empty() : this.schemaTransformationVersion;
    }

    /**
     * The storage resourceId for the bot
     * 
     */
    @InputImport(name="storageResourceId")
    private final @Nullable Input<String> storageResourceId;

    public Input<String> getStorageResourceId() {
        return this.storageResourceId == null ? Input.empty() : this.storageResourceId;
    }

    public BotPropertiesArgs(
        @Nullable Input<Map<String,String>> allSettings,
        @Nullable Input<String> appPasswordHint,
        @Nullable Input<String> cmekKeyVaultUrl,
        @Nullable Input<String> description,
        @Nullable Input<String> developerAppInsightKey,
        @Nullable Input<String> developerAppInsightsApiKey,
        @Nullable Input<String> developerAppInsightsApplicationId,
        @Nullable Input<Boolean> disableLocalAuth,
        Input<String> displayName,
        Input<String> endpoint,
        @Nullable Input<String> iconUrl,
        @Nullable Input<Boolean> isCmekEnabled,
        @Nullable Input<Boolean> isStreamingSupported,
        @Nullable Input<List<String>> luisAppIds,
        @Nullable Input<String> luisKey,
        @Nullable Input<String> manifestUrl,
        Input<String> msaAppId,
        @Nullable Input<String> msaAppMSIResourceId,
        @Nullable Input<String> msaAppTenantId,
        @Nullable Input<Either<String,MsaAppType>> msaAppType,
        @Nullable Input<String> openWithHint,
        @Nullable Input<Map<String,String>> parameters,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Input<String> publishingCredentials,
        @Nullable Input<String> schemaTransformationVersion,
        @Nullable Input<String> storageResourceId) {
        this.allSettings = allSettings;
        this.appPasswordHint = appPasswordHint;
        this.cmekKeyVaultUrl = cmekKeyVaultUrl;
        this.description = description;
        this.developerAppInsightKey = developerAppInsightKey;
        this.developerAppInsightsApiKey = developerAppInsightsApiKey;
        this.developerAppInsightsApplicationId = developerAppInsightsApplicationId;
        this.disableLocalAuth = disableLocalAuth;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.iconUrl = iconUrl;
        this.isCmekEnabled = isCmekEnabled;
        this.isStreamingSupported = isStreamingSupported == null ? Input.ofNullable(false) : isStreamingSupported;
        this.luisAppIds = luisAppIds;
        this.luisKey = luisKey;
        this.manifestUrl = manifestUrl;
        this.msaAppId = Objects.requireNonNull(msaAppId, "expected parameter 'msaAppId' to be non-null");
        this.msaAppMSIResourceId = msaAppMSIResourceId;
        this.msaAppTenantId = msaAppTenantId;
        this.msaAppType = msaAppType;
        this.openWithHint = openWithHint;
        this.parameters = parameters;
        this.publicNetworkAccess = publicNetworkAccess == null ? Input.ofLeft("Enabled") : publicNetworkAccess;
        this.publishingCredentials = publishingCredentials;
        this.schemaTransformationVersion = schemaTransformationVersion;
        this.storageResourceId = storageResourceId;
    }

    private BotPropertiesArgs() {
        this.allSettings = Input.empty();
        this.appPasswordHint = Input.empty();
        this.cmekKeyVaultUrl = Input.empty();
        this.description = Input.empty();
        this.developerAppInsightKey = Input.empty();
        this.developerAppInsightsApiKey = Input.empty();
        this.developerAppInsightsApplicationId = Input.empty();
        this.disableLocalAuth = Input.empty();
        this.displayName = Input.empty();
        this.endpoint = Input.empty();
        this.iconUrl = Input.empty();
        this.isCmekEnabled = Input.empty();
        this.isStreamingSupported = Input.empty();
        this.luisAppIds = Input.empty();
        this.luisKey = Input.empty();
        this.manifestUrl = Input.empty();
        this.msaAppId = Input.empty();
        this.msaAppMSIResourceId = Input.empty();
        this.msaAppTenantId = Input.empty();
        this.msaAppType = Input.empty();
        this.openWithHint = Input.empty();
        this.parameters = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.publishingCredentials = Input.empty();
        this.schemaTransformationVersion = Input.empty();
        this.storageResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> allSettings;
        private @Nullable Input<String> appPasswordHint;
        private @Nullable Input<String> cmekKeyVaultUrl;
        private @Nullable Input<String> description;
        private @Nullable Input<String> developerAppInsightKey;
        private @Nullable Input<String> developerAppInsightsApiKey;
        private @Nullable Input<String> developerAppInsightsApplicationId;
        private @Nullable Input<Boolean> disableLocalAuth;
        private Input<String> displayName;
        private Input<String> endpoint;
        private @Nullable Input<String> iconUrl;
        private @Nullable Input<Boolean> isCmekEnabled;
        private @Nullable Input<Boolean> isStreamingSupported;
        private @Nullable Input<List<String>> luisAppIds;
        private @Nullable Input<String> luisKey;
        private @Nullable Input<String> manifestUrl;
        private Input<String> msaAppId;
        private @Nullable Input<String> msaAppMSIResourceId;
        private @Nullable Input<String> msaAppTenantId;
        private @Nullable Input<Either<String,MsaAppType>> msaAppType;
        private @Nullable Input<String> openWithHint;
        private @Nullable Input<Map<String,String>> parameters;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Input<String> publishingCredentials;
        private @Nullable Input<String> schemaTransformationVersion;
        private @Nullable Input<String> storageResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSettings = defaults.allSettings;
    	      this.appPasswordHint = defaults.appPasswordHint;
    	      this.cmekKeyVaultUrl = defaults.cmekKeyVaultUrl;
    	      this.description = defaults.description;
    	      this.developerAppInsightKey = defaults.developerAppInsightKey;
    	      this.developerAppInsightsApiKey = defaults.developerAppInsightsApiKey;
    	      this.developerAppInsightsApplicationId = defaults.developerAppInsightsApplicationId;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.displayName = defaults.displayName;
    	      this.endpoint = defaults.endpoint;
    	      this.iconUrl = defaults.iconUrl;
    	      this.isCmekEnabled = defaults.isCmekEnabled;
    	      this.isStreamingSupported = defaults.isStreamingSupported;
    	      this.luisAppIds = defaults.luisAppIds;
    	      this.luisKey = defaults.luisKey;
    	      this.manifestUrl = defaults.manifestUrl;
    	      this.msaAppId = defaults.msaAppId;
    	      this.msaAppMSIResourceId = defaults.msaAppMSIResourceId;
    	      this.msaAppTenantId = defaults.msaAppTenantId;
    	      this.msaAppType = defaults.msaAppType;
    	      this.openWithHint = defaults.openWithHint;
    	      this.parameters = defaults.parameters;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.publishingCredentials = defaults.publishingCredentials;
    	      this.schemaTransformationVersion = defaults.schemaTransformationVersion;
    	      this.storageResourceId = defaults.storageResourceId;
        }

        public Builder setAllSettings(@Nullable Input<Map<String,String>> allSettings) {
            this.allSettings = allSettings;
            return this;
        }

        public Builder setAllSettings(@Nullable Map<String,String> allSettings) {
            this.allSettings = Input.ofNullable(allSettings);
            return this;
        }

        public Builder setAppPasswordHint(@Nullable Input<String> appPasswordHint) {
            this.appPasswordHint = appPasswordHint;
            return this;
        }

        public Builder setAppPasswordHint(@Nullable String appPasswordHint) {
            this.appPasswordHint = Input.ofNullable(appPasswordHint);
            return this;
        }

        public Builder setCmekKeyVaultUrl(@Nullable Input<String> cmekKeyVaultUrl) {
            this.cmekKeyVaultUrl = cmekKeyVaultUrl;
            return this;
        }

        public Builder setCmekKeyVaultUrl(@Nullable String cmekKeyVaultUrl) {
            this.cmekKeyVaultUrl = Input.ofNullable(cmekKeyVaultUrl);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeveloperAppInsightKey(@Nullable Input<String> developerAppInsightKey) {
            this.developerAppInsightKey = developerAppInsightKey;
            return this;
        }

        public Builder setDeveloperAppInsightKey(@Nullable String developerAppInsightKey) {
            this.developerAppInsightKey = Input.ofNullable(developerAppInsightKey);
            return this;
        }

        public Builder setDeveloperAppInsightsApiKey(@Nullable Input<String> developerAppInsightsApiKey) {
            this.developerAppInsightsApiKey = developerAppInsightsApiKey;
            return this;
        }

        public Builder setDeveloperAppInsightsApiKey(@Nullable String developerAppInsightsApiKey) {
            this.developerAppInsightsApiKey = Input.ofNullable(developerAppInsightsApiKey);
            return this;
        }

        public Builder setDeveloperAppInsightsApplicationId(@Nullable Input<String> developerAppInsightsApplicationId) {
            this.developerAppInsightsApplicationId = developerAppInsightsApplicationId;
            return this;
        }

        public Builder setDeveloperAppInsightsApplicationId(@Nullable String developerAppInsightsApplicationId) {
            this.developerAppInsightsApplicationId = Input.ofNullable(developerAppInsightsApplicationId);
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Input<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Input.ofNullable(disableLocalAuth);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEndpoint(Input<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Input.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder setIconUrl(@Nullable Input<String> iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder setIconUrl(@Nullable String iconUrl) {
            this.iconUrl = Input.ofNullable(iconUrl);
            return this;
        }

        public Builder setIsCmekEnabled(@Nullable Input<Boolean> isCmekEnabled) {
            this.isCmekEnabled = isCmekEnabled;
            return this;
        }

        public Builder setIsCmekEnabled(@Nullable Boolean isCmekEnabled) {
            this.isCmekEnabled = Input.ofNullable(isCmekEnabled);
            return this;
        }

        public Builder setIsStreamingSupported(@Nullable Input<Boolean> isStreamingSupported) {
            this.isStreamingSupported = isStreamingSupported;
            return this;
        }

        public Builder setIsStreamingSupported(@Nullable Boolean isStreamingSupported) {
            this.isStreamingSupported = Input.ofNullable(isStreamingSupported);
            return this;
        }

        public Builder setLuisAppIds(@Nullable Input<List<String>> luisAppIds) {
            this.luisAppIds = luisAppIds;
            return this;
        }

        public Builder setLuisAppIds(@Nullable List<String> luisAppIds) {
            this.luisAppIds = Input.ofNullable(luisAppIds);
            return this;
        }

        public Builder setLuisKey(@Nullable Input<String> luisKey) {
            this.luisKey = luisKey;
            return this;
        }

        public Builder setLuisKey(@Nullable String luisKey) {
            this.luisKey = Input.ofNullable(luisKey);
            return this;
        }

        public Builder setManifestUrl(@Nullable Input<String> manifestUrl) {
            this.manifestUrl = manifestUrl;
            return this;
        }

        public Builder setManifestUrl(@Nullable String manifestUrl) {
            this.manifestUrl = Input.ofNullable(manifestUrl);
            return this;
        }

        public Builder setMsaAppId(Input<String> msaAppId) {
            this.msaAppId = Objects.requireNonNull(msaAppId);
            return this;
        }

        public Builder setMsaAppId(String msaAppId) {
            this.msaAppId = Input.of(Objects.requireNonNull(msaAppId));
            return this;
        }

        public Builder setMsaAppMSIResourceId(@Nullable Input<String> msaAppMSIResourceId) {
            this.msaAppMSIResourceId = msaAppMSIResourceId;
            return this;
        }

        public Builder setMsaAppMSIResourceId(@Nullable String msaAppMSIResourceId) {
            this.msaAppMSIResourceId = Input.ofNullable(msaAppMSIResourceId);
            return this;
        }

        public Builder setMsaAppTenantId(@Nullable Input<String> msaAppTenantId) {
            this.msaAppTenantId = msaAppTenantId;
            return this;
        }

        public Builder setMsaAppTenantId(@Nullable String msaAppTenantId) {
            this.msaAppTenantId = Input.ofNullable(msaAppTenantId);
            return this;
        }

        public Builder setMsaAppType(@Nullable Input<Either<String,MsaAppType>> msaAppType) {
            this.msaAppType = msaAppType;
            return this;
        }

        public Builder setMsaAppType(@Nullable Either<String,MsaAppType> msaAppType) {
            this.msaAppType = Input.ofNullable(msaAppType);
            return this;
        }

        public Builder setOpenWithHint(@Nullable Input<String> openWithHint) {
            this.openWithHint = openWithHint;
            return this;
        }

        public Builder setOpenWithHint(@Nullable String openWithHint) {
            this.openWithHint = Input.ofNullable(openWithHint);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setPublishingCredentials(@Nullable Input<String> publishingCredentials) {
            this.publishingCredentials = publishingCredentials;
            return this;
        }

        public Builder setPublishingCredentials(@Nullable String publishingCredentials) {
            this.publishingCredentials = Input.ofNullable(publishingCredentials);
            return this;
        }

        public Builder setSchemaTransformationVersion(@Nullable Input<String> schemaTransformationVersion) {
            this.schemaTransformationVersion = schemaTransformationVersion;
            return this;
        }

        public Builder setSchemaTransformationVersion(@Nullable String schemaTransformationVersion) {
            this.schemaTransformationVersion = Input.ofNullable(schemaTransformationVersion);
            return this;
        }

        public Builder setStorageResourceId(@Nullable Input<String> storageResourceId) {
            this.storageResourceId = storageResourceId;
            return this;
        }

        public Builder setStorageResourceId(@Nullable String storageResourceId) {
            this.storageResourceId = Input.ofNullable(storageResourceId);
            return this;
        }

        public BotPropertiesArgs build() {
            return new BotPropertiesArgs(allSettings, appPasswordHint, cmekKeyVaultUrl, description, developerAppInsightKey, developerAppInsightsApiKey, developerAppInsightsApplicationId, disableLocalAuth, displayName, endpoint, iconUrl, isCmekEnabled, isStreamingSupported, luisAppIds, luisKey, manifestUrl, msaAppId, msaAppMSIResourceId, msaAppTenantId, msaAppType, openWithHint, parameters, publicNetworkAccess, publishingCredentials, schemaTransformationVersion, storageResourceId);
        }
    }
}
