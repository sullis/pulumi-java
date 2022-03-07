// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.DeploymentInstanceResponse;
import io.pulumi.azurenative.appplatform.outputs.DeploymentSettingsResponse;
import io.pulumi.azurenative.appplatform.outputs.UserSourceInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentResourcePropertiesResponse {
    /**
     * Indicates whether the Deployment is active
     * 
     */
    private final Boolean active;
    /**
     * App name of the deployment
     * 
     */
    private final String appName;
    /**
     * Date time when the resource is created
     * 
     */
    private final String createdTime;
    /**
     * Deployment settings of the Deployment
     * 
     */
    private final @Nullable DeploymentSettingsResponse deploymentSettings;
    /**
     * Collection of instances belong to the Deployment
     * 
     */
    private final List<DeploymentInstanceResponse> instances;
    /**
     * Provisioning state of the Deployment
     * 
     */
    private final String provisioningState;
    /**
     * Uploaded source information of the deployment.
     * 
     */
    private final @Nullable UserSourceInfoResponse source;
    /**
     * Status of the Deployment
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"active","appName","createdTime","deploymentSettings","instances","provisioningState","source","status"})
    private DeploymentResourcePropertiesResponse(
        Boolean active,
        String appName,
        String createdTime,
        @Nullable DeploymentSettingsResponse deploymentSettings,
        List<DeploymentInstanceResponse> instances,
        String provisioningState,
        @Nullable UserSourceInfoResponse source,
        String status) {
        this.active = Objects.requireNonNull(active);
        this.appName = Objects.requireNonNull(appName);
        this.createdTime = Objects.requireNonNull(createdTime);
        this.deploymentSettings = deploymentSettings;
        this.instances = Objects.requireNonNull(instances);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.source = source;
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Indicates whether the Deployment is active
     * 
    */
    public Boolean getActive() {
        return this.active;
    }
    /**
     * App name of the deployment
     * 
    */
    public String getAppName() {
        return this.appName;
    }
    /**
     * Date time when the resource is created
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Deployment settings of the Deployment
     * 
    */
    public Optional<DeploymentSettingsResponse> getDeploymentSettings() {
        return Optional.ofNullable(this.deploymentSettings);
    }
    /**
     * Collection of instances belong to the Deployment
     * 
    */
    public List<DeploymentInstanceResponse> getInstances() {
        return this.instances;
    }
    /**
     * Provisioning state of the Deployment
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Uploaded source information of the deployment.
     * 
    */
    public Optional<UserSourceInfoResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * Status of the Deployment
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean active;
        private String appName;
        private String createdTime;
        private @Nullable DeploymentSettingsResponse deploymentSettings;
        private List<DeploymentInstanceResponse> instances;
        private String provisioningState;
        private @Nullable UserSourceInfoResponse source;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.appName = defaults.appName;
    	      this.createdTime = defaults.createdTime;
    	      this.deploymentSettings = defaults.deploymentSettings;
    	      this.instances = defaults.instances;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
        }

        public Builder setActive(Boolean active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }

        public Builder setAppName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDeploymentSettings(@Nullable DeploymentSettingsResponse deploymentSettings) {
            this.deploymentSettings = deploymentSettings;
            return this;
        }

        public Builder setInstances(List<DeploymentInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSource(@Nullable UserSourceInfoResponse source) {
            this.source = source;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DeploymentResourcePropertiesResponse build() {
            return new DeploymentResourcePropertiesResponse(active, appName, createdTime, deploymentSettings, instances, provisioningState, source, status);
        }
    }
}