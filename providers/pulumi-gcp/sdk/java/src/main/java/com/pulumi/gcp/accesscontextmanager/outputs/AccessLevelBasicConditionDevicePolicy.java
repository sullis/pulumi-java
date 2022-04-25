// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelBasicConditionDevicePolicyOsConstraint;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessLevelBasicConditionDevicePolicy {
    /**
     * @return A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    private final @Nullable List<String> allowedDeviceManagementLevels;
    /**
     * @return A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    private final @Nullable List<String> allowedEncryptionStatuses;
    /**
     * @return A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AccessLevelBasicConditionDevicePolicyOsConstraint> osConstraints;
    /**
     * @return Whether the device needs to be approved by the customer admin.
     * 
     */
    private final @Nullable Boolean requireAdminApproval;
    /**
     * @return Whether the device needs to be corp owned.
     * 
     */
    private final @Nullable Boolean requireCorpOwned;
    /**
     * @return Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    private final @Nullable Boolean requireScreenLock;

    @CustomType.Constructor
    private AccessLevelBasicConditionDevicePolicy(
        @CustomType.Parameter("allowedDeviceManagementLevels") @Nullable List<String> allowedDeviceManagementLevels,
        @CustomType.Parameter("allowedEncryptionStatuses") @Nullable List<String> allowedEncryptionStatuses,
        @CustomType.Parameter("osConstraints") @Nullable List<AccessLevelBasicConditionDevicePolicyOsConstraint> osConstraints,
        @CustomType.Parameter("requireAdminApproval") @Nullable Boolean requireAdminApproval,
        @CustomType.Parameter("requireCorpOwned") @Nullable Boolean requireCorpOwned,
        @CustomType.Parameter("requireScreenLock") @Nullable Boolean requireScreenLock) {
        this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = allowedEncryptionStatuses;
        this.osConstraints = osConstraints;
        this.requireAdminApproval = requireAdminApproval;
        this.requireCorpOwned = requireCorpOwned;
        this.requireScreenLock = requireScreenLock;
    }

    /**
     * @return A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    public List<String> allowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels == null ? List.of() : this.allowedDeviceManagementLevels;
    }
    /**
     * @return A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    public List<String> allowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses == null ? List.of() : this.allowedEncryptionStatuses;
    }
    /**
     * @return A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    public List<AccessLevelBasicConditionDevicePolicyOsConstraint> osConstraints() {
        return this.osConstraints == null ? List.of() : this.osConstraints;
    }
    /**
     * @return Whether the device needs to be approved by the customer admin.
     * 
     */
    public Optional<Boolean> requireAdminApproval() {
        return Optional.ofNullable(this.requireAdminApproval);
    }
    /**
     * @return Whether the device needs to be corp owned.
     * 
     */
    public Optional<Boolean> requireCorpOwned() {
        return Optional.ofNullable(this.requireCorpOwned);
    }
    /**
     * @return Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    public Optional<Boolean> requireScreenLock() {
        return Optional.ofNullable(this.requireScreenLock);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelBasicConditionDevicePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedDeviceManagementLevels;
        private @Nullable List<String> allowedEncryptionStatuses;
        private @Nullable List<AccessLevelBasicConditionDevicePolicyOsConstraint> osConstraints;
        private @Nullable Boolean requireAdminApproval;
        private @Nullable Boolean requireCorpOwned;
        private @Nullable Boolean requireScreenLock;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelBasicConditionDevicePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenLock = defaults.requireScreenLock;
        }

        public Builder allowedDeviceManagementLevels(@Nullable List<String> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }
        public Builder allowedDeviceManagementLevels(String... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }
        public Builder allowedEncryptionStatuses(@Nullable List<String> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }
        public Builder allowedEncryptionStatuses(String... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }
        public Builder osConstraints(@Nullable List<AccessLevelBasicConditionDevicePolicyOsConstraint> osConstraints) {
            this.osConstraints = osConstraints;
            return this;
        }
        public Builder osConstraints(AccessLevelBasicConditionDevicePolicyOsConstraint... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }
        public Builder requireAdminApproval(@Nullable Boolean requireAdminApproval) {
            this.requireAdminApproval = requireAdminApproval;
            return this;
        }
        public Builder requireCorpOwned(@Nullable Boolean requireCorpOwned) {
            this.requireCorpOwned = requireCorpOwned;
            return this;
        }
        public Builder requireScreenLock(@Nullable Boolean requireScreenLock) {
            this.requireScreenLock = requireScreenLock;
            return this;
        }        public AccessLevelBasicConditionDevicePolicy build() {
            return new AccessLevelBasicConditionDevicePolicy(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenLock);
        }
    }
}
