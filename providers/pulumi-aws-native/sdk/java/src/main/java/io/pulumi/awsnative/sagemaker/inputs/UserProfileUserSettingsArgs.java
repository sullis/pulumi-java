// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.UserProfileJupyterServerAppSettingsArgs;
import io.pulumi.awsnative.sagemaker.inputs.UserProfileKernelGatewayAppSettingsArgs;
import io.pulumi.awsnative.sagemaker.inputs.UserProfileSharingSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of settings that apply to users of Amazon SageMaker Studio. These settings are specified when the CreateUserProfile API is called, and as DefaultUserSettings when the CreateDomain API is called.
 * 
 */
public final class UserProfileUserSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsArgs Empty = new UserProfileUserSettingsArgs();

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="executionRole")
      private final @Nullable Input<String> executionRole;

    public Input<String> getExecutionRole() {
        return this.executionRole == null ? Input.empty() : this.executionRole;
    }

    /**
     * The Jupyter server's app settings.
     * 
     */
    @InputImport(name="jupyterServerAppSettings")
      private final @Nullable Input<UserProfileJupyterServerAppSettingsArgs> jupyterServerAppSettings;

    public Input<UserProfileJupyterServerAppSettingsArgs> getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings == null ? Input.empty() : this.jupyterServerAppSettings;
    }

    /**
     * The kernel gateway app settings.
     * 
     */
    @InputImport(name="kernelGatewayAppSettings")
      private final @Nullable Input<UserProfileKernelGatewayAppSettingsArgs> kernelGatewayAppSettings;

    public Input<UserProfileKernelGatewayAppSettingsArgs> getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings == null ? Input.empty() : this.kernelGatewayAppSettings;
    }

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The sharing settings.
     * 
     */
    @InputImport(name="sharingSettings")
      private final @Nullable Input<UserProfileSharingSettingsArgs> sharingSettings;

    public Input<UserProfileSharingSettingsArgs> getSharingSettings() {
        return this.sharingSettings == null ? Input.empty() : this.sharingSettings;
    }

    public UserProfileUserSettingsArgs(
        @Nullable Input<String> executionRole,
        @Nullable Input<UserProfileJupyterServerAppSettingsArgs> jupyterServerAppSettings,
        @Nullable Input<UserProfileKernelGatewayAppSettingsArgs> kernelGatewayAppSettings,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<UserProfileSharingSettingsArgs> sharingSettings) {
        this.executionRole = executionRole;
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
    }

    private UserProfileUserSettingsArgs() {
        this.executionRole = Input.empty();
        this.jupyterServerAppSettings = Input.empty();
        this.kernelGatewayAppSettings = Input.empty();
        this.securityGroups = Input.empty();
        this.sharingSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> executionRole;
        private @Nullable Input<UserProfileJupyterServerAppSettingsArgs> jupyterServerAppSettings;
        private @Nullable Input<UserProfileKernelGatewayAppSettingsArgs> kernelGatewayAppSettings;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<UserProfileSharingSettingsArgs> sharingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
        }

        public Builder setExecutionRole(@Nullable Input<String> executionRole) {
            this.executionRole = executionRole;
            return this;
        }

        public Builder setExecutionRole(@Nullable String executionRole) {
            this.executionRole = Input.ofNullable(executionRole);
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable Input<UserProfileJupyterServerAppSettingsArgs> jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable UserProfileJupyterServerAppSettingsArgs jupyterServerAppSettings) {
            this.jupyterServerAppSettings = Input.ofNullable(jupyterServerAppSettings);
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable Input<UserProfileKernelGatewayAppSettingsArgs> kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable UserProfileKernelGatewayAppSettingsArgs kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = Input.ofNullable(kernelGatewayAppSettings);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSharingSettings(@Nullable Input<UserProfileSharingSettingsArgs> sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }

        public Builder setSharingSettings(@Nullable UserProfileSharingSettingsArgs sharingSettings) {
            this.sharingSettings = Input.ofNullable(sharingSettings);
            return this;
        }
        public UserProfileUserSettingsArgs build() {
            return new UserProfileUserSettingsArgs(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings);
        }
    }
}