// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomaliesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomaliesArgs Empty = new AnomaliesArgs();

    /**
     * The kind of the setting
     * Expected value is 'Anomalies'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final Input<String> operationalInsightsResourceProvider;

    public Input<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @InputImport(name="settingsName")
    private final @Nullable Input<String> settingsName;

    public Input<String> getSettingsName() {
        return this.settingsName == null ? Input.empty() : this.settingsName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public AnomaliesArgs(
        Input<String> kind,
        Input<String> operationalInsightsResourceProvider,
        Input<String> resourceGroupName,
        @Nullable Input<String> settingsName,
        Input<String> workspaceName) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settingsName = settingsName;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AnomaliesArgs() {
        this.kind = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.resourceGroupName = Input.empty();
        this.settingsName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kind;
        private Input<String> operationalInsightsResourceProvider;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> settingsName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomaliesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settingsName = defaults.settingsName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(Input<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Input.of(Objects.requireNonNull(operationalInsightsResourceProvider));
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

        public Builder setSettingsName(@Nullable Input<String> settingsName) {
            this.settingsName = settingsName;
            return this;
        }

        public Builder setSettingsName(@Nullable String settingsName) {
            this.settingsName = Input.ofNullable(settingsName);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public AnomaliesArgs build() {
            return new AnomaliesArgs(kind, operationalInsightsResourceProvider, resourceGroupName, settingsName, workspaceName);
        }
    }
}
