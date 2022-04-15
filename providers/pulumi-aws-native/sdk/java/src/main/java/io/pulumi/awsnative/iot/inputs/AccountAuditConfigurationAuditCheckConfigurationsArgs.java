// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.AccountAuditConfigurationAuditCheckConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies which audit checks are enabled and disabled for this account.
 * 
 */
public final class AccountAuditConfigurationAuditCheckConfigurationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountAuditConfigurationAuditCheckConfigurationsArgs Empty = new AccountAuditConfigurationAuditCheckConfigurationsArgs();

    @Import(name="authenticatedCognitoRoleOverlyPermissiveCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck() {
        return this.authenticatedCognitoRoleOverlyPermissiveCheck == null ? Codegen.empty() : this.authenticatedCognitoRoleOverlyPermissiveCheck;
    }

    @Import(name="caCertificateExpiringCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck() {
        return this.caCertificateExpiringCheck == null ? Codegen.empty() : this.caCertificateExpiringCheck;
    }

    @Import(name="caCertificateKeyQualityCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck() {
        return this.caCertificateKeyQualityCheck == null ? Codegen.empty() : this.caCertificateKeyQualityCheck;
    }

    @Import(name="conflictingClientIdsCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck() {
        return this.conflictingClientIdsCheck == null ? Codegen.empty() : this.conflictingClientIdsCheck;
    }

    @Import(name="deviceCertificateExpiringCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck() {
        return this.deviceCertificateExpiringCheck == null ? Codegen.empty() : this.deviceCertificateExpiringCheck;
    }

    @Import(name="deviceCertificateKeyQualityCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck() {
        return this.deviceCertificateKeyQualityCheck == null ? Codegen.empty() : this.deviceCertificateKeyQualityCheck;
    }

    @Import(name="deviceCertificateSharedCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck() {
        return this.deviceCertificateSharedCheck == null ? Codegen.empty() : this.deviceCertificateSharedCheck;
    }

    @Import(name="iotPolicyOverlyPermissiveCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck() {
        return this.iotPolicyOverlyPermissiveCheck == null ? Codegen.empty() : this.iotPolicyOverlyPermissiveCheck;
    }

    @Import(name="iotRoleAliasAllowsAccessToUnusedServicesCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck() {
        return this.iotRoleAliasAllowsAccessToUnusedServicesCheck == null ? Codegen.empty() : this.iotRoleAliasAllowsAccessToUnusedServicesCheck;
    }

    @Import(name="iotRoleAliasOverlyPermissiveCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck() {
        return this.iotRoleAliasOverlyPermissiveCheck == null ? Codegen.empty() : this.iotRoleAliasOverlyPermissiveCheck;
    }

    @Import(name="loggingDisabledCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck() {
        return this.loggingDisabledCheck == null ? Codegen.empty() : this.loggingDisabledCheck;
    }

    @Import(name="revokedCaCertificateStillActiveCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck() {
        return this.revokedCaCertificateStillActiveCheck == null ? Codegen.empty() : this.revokedCaCertificateStillActiveCheck;
    }

    @Import(name="revokedDeviceCertificateStillActiveCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck() {
        return this.revokedDeviceCertificateStillActiveCheck == null ? Codegen.empty() : this.revokedDeviceCertificateStillActiveCheck;
    }

    @Import(name="unauthenticatedCognitoRoleOverlyPermissiveCheck")
      private final @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck;

    public Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck() {
        return this.unauthenticatedCognitoRoleOverlyPermissiveCheck == null ? Codegen.empty() : this.unauthenticatedCognitoRoleOverlyPermissiveCheck;
    }

    public AccountAuditConfigurationAuditCheckConfigurationsArgs(
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck,
        @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck) {
        this.authenticatedCognitoRoleOverlyPermissiveCheck = authenticatedCognitoRoleOverlyPermissiveCheck;
        this.caCertificateExpiringCheck = caCertificateExpiringCheck;
        this.caCertificateKeyQualityCheck = caCertificateKeyQualityCheck;
        this.conflictingClientIdsCheck = conflictingClientIdsCheck;
        this.deviceCertificateExpiringCheck = deviceCertificateExpiringCheck;
        this.deviceCertificateKeyQualityCheck = deviceCertificateKeyQualityCheck;
        this.deviceCertificateSharedCheck = deviceCertificateSharedCheck;
        this.iotPolicyOverlyPermissiveCheck = iotPolicyOverlyPermissiveCheck;
        this.iotRoleAliasAllowsAccessToUnusedServicesCheck = iotRoleAliasAllowsAccessToUnusedServicesCheck;
        this.iotRoleAliasOverlyPermissiveCheck = iotRoleAliasOverlyPermissiveCheck;
        this.loggingDisabledCheck = loggingDisabledCheck;
        this.revokedCaCertificateStillActiveCheck = revokedCaCertificateStillActiveCheck;
        this.revokedDeviceCertificateStillActiveCheck = revokedDeviceCertificateStillActiveCheck;
        this.unauthenticatedCognitoRoleOverlyPermissiveCheck = unauthenticatedCognitoRoleOverlyPermissiveCheck;
    }

    private AccountAuditConfigurationAuditCheckConfigurationsArgs() {
        this.authenticatedCognitoRoleOverlyPermissiveCheck = Codegen.empty();
        this.caCertificateExpiringCheck = Codegen.empty();
        this.caCertificateKeyQualityCheck = Codegen.empty();
        this.conflictingClientIdsCheck = Codegen.empty();
        this.deviceCertificateExpiringCheck = Codegen.empty();
        this.deviceCertificateKeyQualityCheck = Codegen.empty();
        this.deviceCertificateSharedCheck = Codegen.empty();
        this.iotPolicyOverlyPermissiveCheck = Codegen.empty();
        this.iotRoleAliasAllowsAccessToUnusedServicesCheck = Codegen.empty();
        this.iotRoleAliasOverlyPermissiveCheck = Codegen.empty();
        this.loggingDisabledCheck = Codegen.empty();
        this.revokedCaCertificateStillActiveCheck = Codegen.empty();
        this.revokedDeviceCertificateStillActiveCheck = Codegen.empty();
        this.unauthenticatedCognitoRoleOverlyPermissiveCheck = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditCheckConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck;
        private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditCheckConfigurationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticatedCognitoRoleOverlyPermissiveCheck = defaults.authenticatedCognitoRoleOverlyPermissiveCheck;
    	      this.caCertificateExpiringCheck = defaults.caCertificateExpiringCheck;
    	      this.caCertificateKeyQualityCheck = defaults.caCertificateKeyQualityCheck;
    	      this.conflictingClientIdsCheck = defaults.conflictingClientIdsCheck;
    	      this.deviceCertificateExpiringCheck = defaults.deviceCertificateExpiringCheck;
    	      this.deviceCertificateKeyQualityCheck = defaults.deviceCertificateKeyQualityCheck;
    	      this.deviceCertificateSharedCheck = defaults.deviceCertificateSharedCheck;
    	      this.iotPolicyOverlyPermissiveCheck = defaults.iotPolicyOverlyPermissiveCheck;
    	      this.iotRoleAliasAllowsAccessToUnusedServicesCheck = defaults.iotRoleAliasAllowsAccessToUnusedServicesCheck;
    	      this.iotRoleAliasOverlyPermissiveCheck = defaults.iotRoleAliasOverlyPermissiveCheck;
    	      this.loggingDisabledCheck = defaults.loggingDisabledCheck;
    	      this.revokedCaCertificateStillActiveCheck = defaults.revokedCaCertificateStillActiveCheck;
    	      this.revokedDeviceCertificateStillActiveCheck = defaults.revokedDeviceCertificateStillActiveCheck;
    	      this.unauthenticatedCognitoRoleOverlyPermissiveCheck = defaults.unauthenticatedCognitoRoleOverlyPermissiveCheck;
        }

        public Builder authenticatedCognitoRoleOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck) {
            this.authenticatedCognitoRoleOverlyPermissiveCheck = authenticatedCognitoRoleOverlyPermissiveCheck;
            return this;
        }
        public Builder authenticatedCognitoRoleOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs authenticatedCognitoRoleOverlyPermissiveCheck) {
            this.authenticatedCognitoRoleOverlyPermissiveCheck = Codegen.ofNullable(authenticatedCognitoRoleOverlyPermissiveCheck);
            return this;
        }
        public Builder caCertificateExpiringCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck) {
            this.caCertificateExpiringCheck = caCertificateExpiringCheck;
            return this;
        }
        public Builder caCertificateExpiringCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs caCertificateExpiringCheck) {
            this.caCertificateExpiringCheck = Codegen.ofNullable(caCertificateExpiringCheck);
            return this;
        }
        public Builder caCertificateKeyQualityCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck) {
            this.caCertificateKeyQualityCheck = caCertificateKeyQualityCheck;
            return this;
        }
        public Builder caCertificateKeyQualityCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs caCertificateKeyQualityCheck) {
            this.caCertificateKeyQualityCheck = Codegen.ofNullable(caCertificateKeyQualityCheck);
            return this;
        }
        public Builder conflictingClientIdsCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck) {
            this.conflictingClientIdsCheck = conflictingClientIdsCheck;
            return this;
        }
        public Builder conflictingClientIdsCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs conflictingClientIdsCheck) {
            this.conflictingClientIdsCheck = Codegen.ofNullable(conflictingClientIdsCheck);
            return this;
        }
        public Builder deviceCertificateExpiringCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck) {
            this.deviceCertificateExpiringCheck = deviceCertificateExpiringCheck;
            return this;
        }
        public Builder deviceCertificateExpiringCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs deviceCertificateExpiringCheck) {
            this.deviceCertificateExpiringCheck = Codegen.ofNullable(deviceCertificateExpiringCheck);
            return this;
        }
        public Builder deviceCertificateKeyQualityCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck) {
            this.deviceCertificateKeyQualityCheck = deviceCertificateKeyQualityCheck;
            return this;
        }
        public Builder deviceCertificateKeyQualityCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs deviceCertificateKeyQualityCheck) {
            this.deviceCertificateKeyQualityCheck = Codegen.ofNullable(deviceCertificateKeyQualityCheck);
            return this;
        }
        public Builder deviceCertificateSharedCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck) {
            this.deviceCertificateSharedCheck = deviceCertificateSharedCheck;
            return this;
        }
        public Builder deviceCertificateSharedCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs deviceCertificateSharedCheck) {
            this.deviceCertificateSharedCheck = Codegen.ofNullable(deviceCertificateSharedCheck);
            return this;
        }
        public Builder iotPolicyOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck) {
            this.iotPolicyOverlyPermissiveCheck = iotPolicyOverlyPermissiveCheck;
            return this;
        }
        public Builder iotPolicyOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs iotPolicyOverlyPermissiveCheck) {
            this.iotPolicyOverlyPermissiveCheck = Codegen.ofNullable(iotPolicyOverlyPermissiveCheck);
            return this;
        }
        public Builder iotRoleAliasAllowsAccessToUnusedServicesCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck) {
            this.iotRoleAliasAllowsAccessToUnusedServicesCheck = iotRoleAliasAllowsAccessToUnusedServicesCheck;
            return this;
        }
        public Builder iotRoleAliasAllowsAccessToUnusedServicesCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs iotRoleAliasAllowsAccessToUnusedServicesCheck) {
            this.iotRoleAliasAllowsAccessToUnusedServicesCheck = Codegen.ofNullable(iotRoleAliasAllowsAccessToUnusedServicesCheck);
            return this;
        }
        public Builder iotRoleAliasOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck) {
            this.iotRoleAliasOverlyPermissiveCheck = iotRoleAliasOverlyPermissiveCheck;
            return this;
        }
        public Builder iotRoleAliasOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs iotRoleAliasOverlyPermissiveCheck) {
            this.iotRoleAliasOverlyPermissiveCheck = Codegen.ofNullable(iotRoleAliasOverlyPermissiveCheck);
            return this;
        }
        public Builder loggingDisabledCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck) {
            this.loggingDisabledCheck = loggingDisabledCheck;
            return this;
        }
        public Builder loggingDisabledCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs loggingDisabledCheck) {
            this.loggingDisabledCheck = Codegen.ofNullable(loggingDisabledCheck);
            return this;
        }
        public Builder revokedCaCertificateStillActiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck) {
            this.revokedCaCertificateStillActiveCheck = revokedCaCertificateStillActiveCheck;
            return this;
        }
        public Builder revokedCaCertificateStillActiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs revokedCaCertificateStillActiveCheck) {
            this.revokedCaCertificateStillActiveCheck = Codegen.ofNullable(revokedCaCertificateStillActiveCheck);
            return this;
        }
        public Builder revokedDeviceCertificateStillActiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck) {
            this.revokedDeviceCertificateStillActiveCheck = revokedDeviceCertificateStillActiveCheck;
            return this;
        }
        public Builder revokedDeviceCertificateStillActiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs revokedDeviceCertificateStillActiveCheck) {
            this.revokedDeviceCertificateStillActiveCheck = Codegen.ofNullable(revokedDeviceCertificateStillActiveCheck);
            return this;
        }
        public Builder unauthenticatedCognitoRoleOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck) {
            this.unauthenticatedCognitoRoleOverlyPermissiveCheck = unauthenticatedCognitoRoleOverlyPermissiveCheck;
            return this;
        }
        public Builder unauthenticatedCognitoRoleOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfigurationArgs unauthenticatedCognitoRoleOverlyPermissiveCheck) {
            this.unauthenticatedCognitoRoleOverlyPermissiveCheck = Codegen.ofNullable(unauthenticatedCognitoRoleOverlyPermissiveCheck);
            return this;
        }        public AccountAuditConfigurationAuditCheckConfigurationsArgs build() {
            return new AccountAuditConfigurationAuditCheckConfigurationsArgs(authenticatedCognitoRoleOverlyPermissiveCheck, caCertificateExpiringCheck, caCertificateKeyQualityCheck, conflictingClientIdsCheck, deviceCertificateExpiringCheck, deviceCertificateKeyQualityCheck, deviceCertificateSharedCheck, iotPolicyOverlyPermissiveCheck, iotRoleAliasAllowsAccessToUnusedServicesCheck, iotRoleAliasOverlyPermissiveCheck, loggingDisabledCheck, revokedCaCertificateStillActiveCheck, revokedDeviceCertificateStillActiveCheck, unauthenticatedCognitoRoleOverlyPermissiveCheck);
        }
    }
}
