// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.outputs;

import io.pulumi.azurenative.aadiam.outputs.LogSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDiagnosticSettingResult {
    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    private final @Nullable String eventHubAuthorizationRuleId;
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    private final @Nullable String eventHubName;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The list of logs settings.
     * 
     */
    private final @Nullable List<LogSettingsResponse> logs;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    private final @Nullable String serviceBusRuleId;
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    private final @Nullable String storageAccountId;
    /**
     * Azure resource type
     * 
     */
    private final String type;
    /**
     * The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    private final @Nullable String workspaceId;

    @OutputCustomType.Constructor({"eventHubAuthorizationRuleId","eventHubName","id","logs","name","serviceBusRuleId","storageAccountId","type","workspaceId"})
    private GetDiagnosticSettingResult(
        @Nullable String eventHubAuthorizationRuleId,
        @Nullable String eventHubName,
        String id,
        @Nullable List<LogSettingsResponse> logs,
        String name,
        @Nullable String serviceBusRuleId,
        @Nullable String storageAccountId,
        String type,
        @Nullable String workspaceId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        this.eventHubName = eventHubName;
        this.id = Objects.requireNonNull(id);
        this.logs = logs;
        this.name = Objects.requireNonNull(name);
        this.serviceBusRuleId = serviceBusRuleId;
        this.storageAccountId = storageAccountId;
        this.type = Objects.requireNonNull(type);
        this.workspaceId = workspaceId;
    }

    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    public Optional<String> getEventHubAuthorizationRuleId() {
        return Optional.ofNullable(this.eventHubAuthorizationRuleId);
    }
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Optional<String> getEventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * Azure resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The list of logs settings.
     * 
     */
    public List<LogSettingsResponse> getLogs() {
        return this.logs == null ? List.of() : this.logs;
    }
    /**
     * Azure resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Optional<String> getServiceBusRuleId() {
        return Optional.ofNullable(this.serviceBusRuleId);
    }
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Optional<String> getStorageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    /**
     * Azure resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Optional<String> getWorkspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiagnosticSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubAuthorizationRuleId;
        private @Nullable String eventHubName;
        private String id;
        private @Nullable List<LogSettingsResponse> logs;
        private String name;
        private @Nullable String serviceBusRuleId;
        private @Nullable String storageAccountId;
        private String type;
        private @Nullable String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiagnosticSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubAuthorizationRuleId = defaults.eventHubAuthorizationRuleId;
    	      this.eventHubName = defaults.eventHubName;
    	      this.id = defaults.id;
    	      this.logs = defaults.logs;
    	      this.name = defaults.name;
    	      this.serviceBusRuleId = defaults.serviceBusRuleId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setEventHubAuthorizationRuleId(@Nullable String eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogs(@Nullable List<LogSettingsResponse> logs) {
            this.logs = logs;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServiceBusRuleId(@Nullable String serviceBusRuleId) {
            this.serviceBusRuleId = serviceBusRuleId;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetDiagnosticSettingResult build() {
            return new GetDiagnosticSettingResult(eventHubAuthorizationRuleId, eventHubName, id, logs, name, serviceBusRuleId, storageAccountId, type, workspaceId);
        }
    }
}
