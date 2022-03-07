// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.ConfigurationIdentityResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ErrorDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ExtensionStatusResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ScopeResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExtensionResult {
    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    private final @Nullable Map<String,String> configurationProtectedSettings;
    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    private final @Nullable Map<String,String> configurationSettings;
    /**
     * DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
     */
    private final String creationTime;
    /**
     * Error information from the Agent - e.g. errors during installation.
     * 
     */
    private final ErrorDefinitionResponse errorInfo;
    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    private final @Nullable String extensionType;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The identity of the configuration.
     * 
     */
    private final @Nullable ConfigurationIdentityResponse identity;
    /**
     * Status of installation of this instance of the extension.
     * 
     */
    private final String installState;
    /**
     * DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
     */
    private final String lastModifiedTime;
    /**
     * DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
     */
    private final String lastStatusTime;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     */
    private final @Nullable String releaseTrain;
    /**
     * Scope at which the extension instance is installed.
     * 
     */
    private final @Nullable ScopeResponse scope;
    /**
     * Status from this instance of the extension.
     * 
     */
    private final @Nullable List<ExtensionStatusResponse> statuses;
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    private final @Nullable SystemDataResponse systemData;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"autoUpgradeMinorVersion","configurationProtectedSettings","configurationSettings","creationTime","errorInfo","extensionType","id","identity","installState","lastModifiedTime","lastStatusTime","name","releaseTrain","scope","statuses","systemData","type","version"})
    private GetExtensionResult(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable Map<String,String> configurationProtectedSettings,
        @Nullable Map<String,String> configurationSettings,
        String creationTime,
        ErrorDefinitionResponse errorInfo,
        @Nullable String extensionType,
        String id,
        @Nullable ConfigurationIdentityResponse identity,
        String installState,
        String lastModifiedTime,
        String lastStatusTime,
        String name,
        @Nullable String releaseTrain,
        @Nullable ScopeResponse scope,
        @Nullable List<ExtensionStatusResponse> statuses,
        @Nullable SystemDataResponse systemData,
        String type,
        @Nullable String version) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.configurationSettings = configurationSettings;
        this.creationTime = Objects.requireNonNull(creationTime);
        this.errorInfo = Objects.requireNonNull(errorInfo);
        this.extensionType = extensionType;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.installState = Objects.requireNonNull(installState);
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.lastStatusTime = Objects.requireNonNull(lastStatusTime);
        this.name = Objects.requireNonNull(name);
        this.releaseTrain = releaseTrain;
        this.scope = scope;
        this.statuses = statuses;
        this.systemData = systemData;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
    */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
    */
    public Map<String,String> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Map.of() : this.configurationProtectedSettings;
    }
    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
    */
    public Map<String,String> getConfigurationSettings() {
        return this.configurationSettings == null ? Map.of() : this.configurationSettings;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Error information from the Agent - e.g. errors during installation.
     * 
    */
    public ErrorDefinitionResponse getErrorInfo() {
        return this.errorInfo;
    }
    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
    */
    public Optional<String> getExtensionType() {
        return Optional.ofNullable(this.extensionType);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the configuration.
     * 
    */
    public Optional<ConfigurationIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Status of installation of this instance of the extension.
     * 
    */
    public String getInstallState() {
        return this.installState;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
    */
    public String getLastStatusTime() {
        return this.lastStatusTime;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
    */
    public Optional<String> getReleaseTrain() {
        return Optional.ofNullable(this.releaseTrain);
    }
    /**
     * Scope at which the extension instance is installed.
     * 
    */
    public Optional<ScopeResponse> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Status from this instance of the extension.
     * 
    */
    public List<ExtensionStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
    */
    public Optional<SystemDataResponse> getSystemData() {
        return Optional.ofNullable(this.systemData);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable Map<String,String> configurationProtectedSettings;
        private @Nullable Map<String,String> configurationSettings;
        private String creationTime;
        private ErrorDefinitionResponse errorInfo;
        private @Nullable String extensionType;
        private String id;
        private @Nullable ConfigurationIdentityResponse identity;
        private String installState;
        private String lastModifiedTime;
        private String lastStatusTime;
        private String name;
        private @Nullable String releaseTrain;
        private @Nullable ScopeResponse scope;
        private @Nullable List<ExtensionStatusResponse> statuses;
        private @Nullable SystemDataResponse systemData;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.configurationSettings = defaults.configurationSettings;
    	      this.creationTime = defaults.creationTime;
    	      this.errorInfo = defaults.errorInfo;
    	      this.extensionType = defaults.extensionType;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.installState = defaults.installState;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.lastStatusTime = defaults.lastStatusTime;
    	      this.name = defaults.name;
    	      this.releaseTrain = defaults.releaseTrain;
    	      this.scope = defaults.scope;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setConfigurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        public Builder setConfigurationSettings(@Nullable Map<String,String> configurationSettings) {
            this.configurationSettings = configurationSettings;
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setErrorInfo(ErrorDefinitionResponse errorInfo) {
            this.errorInfo = Objects.requireNonNull(errorInfo);
            return this;
        }

        public Builder setExtensionType(@Nullable String extensionType) {
            this.extensionType = extensionType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ConfigurationIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInstallState(String installState) {
            this.installState = Objects.requireNonNull(installState);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setLastStatusTime(String lastStatusTime) {
            this.lastStatusTime = Objects.requireNonNull(lastStatusTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReleaseTrain(@Nullable String releaseTrain) {
            this.releaseTrain = releaseTrain;
            return this;
        }

        public Builder setScope(@Nullable ScopeResponse scope) {
            this.scope = scope;
            return this;
        }

        public Builder setStatuses(@Nullable List<ExtensionStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setSystemData(@Nullable SystemDataResponse systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetExtensionResult build() {
            return new GetExtensionResult(autoUpgradeMinorVersion, configurationProtectedSettings, configurationSettings, creationTime, errorInfo, extensionType, id, identity, installState, lastModifiedTime, lastStatusTime, name, releaseTrain, scope, statuses, systemData, type, version);
        }
    }
}