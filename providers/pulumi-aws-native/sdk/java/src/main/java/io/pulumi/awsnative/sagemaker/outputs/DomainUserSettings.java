// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.DomainJupyterServerAppSettings;
import io.pulumi.awsnative.sagemaker.outputs.DomainKernelGatewayAppSettings;
import io.pulumi.awsnative.sagemaker.outputs.DomainSharingSettings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainUserSettings {
    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String executionRole;
    /**
     * The Jupyter server's app settings.
     * 
     */
    private final @Nullable DomainJupyterServerAppSettings jupyterServerAppSettings;
    /**
     * The kernel gateway app settings.
     * 
     */
    private final @Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings;
    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * The sharing settings.
     * 
     */
    private final @Nullable DomainSharingSettings sharingSettings;

    @OutputCustomType.Constructor({"executionRole","jupyterServerAppSettings","kernelGatewayAppSettings","securityGroups","sharingSettings"})
    private DomainUserSettings(
        @Nullable String executionRole,
        @Nullable DomainJupyterServerAppSettings jupyterServerAppSettings,
        @Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings,
        @Nullable List<String> securityGroups,
        @Nullable DomainSharingSettings sharingSettings) {
        this.executionRole = executionRole;
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
    }

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    public Optional<String> getExecutionRole() {
        return Optional.ofNullable(this.executionRole);
    }
    /**
     * The Jupyter server's app settings.
     * 
     */
    public Optional<DomainJupyterServerAppSettings> getJupyterServerAppSettings() {
        return Optional.ofNullable(this.jupyterServerAppSettings);
    }
    /**
     * The kernel gateway app settings.
     * 
     */
    public Optional<DomainKernelGatewayAppSettings> getKernelGatewayAppSettings() {
        return Optional.ofNullable(this.kernelGatewayAppSettings);
    }
    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * The sharing settings.
     * 
     */
    public Optional<DomainSharingSettings> getSharingSettings() {
        return Optional.ofNullable(this.sharingSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainUserSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executionRole;
        private @Nullable DomainJupyterServerAppSettings jupyterServerAppSettings;
        private @Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings;
        private @Nullable List<String> securityGroups;
        private @Nullable DomainSharingSettings sharingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainUserSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
        }

        public Builder setExecutionRole(@Nullable String executionRole) {
            this.executionRole = executionRole;
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable DomainJupyterServerAppSettings jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable DomainKernelGatewayAppSettings kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSharingSettings(@Nullable DomainSharingSettings sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }

        public DomainUserSettings build() {
            return new DomainUserSettings(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings);
        }
    }
}
