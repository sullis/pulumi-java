// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelBasicConditionDevicePolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelBasicConditionDevicePolicyGetArgs Empty = new AccessLevelBasicConditionDevicePolicyGetArgs();

    /**
     * A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    @Import(name="allowedDeviceManagementLevels")
    private @Nullable Output<List<String>> allowedDeviceManagementLevels;

    /**
     * @return A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    public Optional<Output<List<String>>> allowedDeviceManagementLevels() {
        return Optional.ofNullable(this.allowedDeviceManagementLevels);
    }

    /**
     * A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    @Import(name="allowedEncryptionStatuses")
    private @Nullable Output<List<String>> allowedEncryptionStatuses;

    /**
     * @return A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    public Optional<Output<List<String>>> allowedEncryptionStatuses() {
        return Optional.ofNullable(this.allowedEncryptionStatuses);
    }

    /**
     * A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    @Import(name="osConstraints")
    private @Nullable Output<List<AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs>> osConstraints;

    /**
     * @return A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs>>> osConstraints() {
        return Optional.ofNullable(this.osConstraints);
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval")
    private @Nullable Output<Boolean> requireAdminApproval;

    /**
     * @return Whether the device needs to be approved by the customer admin.
     * 
     */
    public Optional<Output<Boolean>> requireAdminApproval() {
        return Optional.ofNullable(this.requireAdminApproval);
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned")
    private @Nullable Output<Boolean> requireCorpOwned;

    /**
     * @return Whether the device needs to be corp owned.
     * 
     */
    public Optional<Output<Boolean>> requireCorpOwned() {
        return Optional.ofNullable(this.requireCorpOwned);
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    @Import(name="requireScreenLock")
    private @Nullable Output<Boolean> requireScreenLock;

    /**
     * @return Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> requireScreenLock() {
        return Optional.ofNullable(this.requireScreenLock);
    }

    private AccessLevelBasicConditionDevicePolicyGetArgs() {}

    private AccessLevelBasicConditionDevicePolicyGetArgs(AccessLevelBasicConditionDevicePolicyGetArgs $) {
        this.allowedDeviceManagementLevels = $.allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = $.allowedEncryptionStatuses;
        this.osConstraints = $.osConstraints;
        this.requireAdminApproval = $.requireAdminApproval;
        this.requireCorpOwned = $.requireCorpOwned;
        this.requireScreenLock = $.requireScreenLock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelBasicConditionDevicePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelBasicConditionDevicePolicyGetArgs $;

        public Builder() {
            $ = new AccessLevelBasicConditionDevicePolicyGetArgs();
        }

        public Builder(AccessLevelBasicConditionDevicePolicyGetArgs defaults) {
            $ = new AccessLevelBasicConditionDevicePolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedDeviceManagementLevels A list of allowed device management levels.
         * An empty list allows all management levels.
         * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(@Nullable Output<List<String>> allowedDeviceManagementLevels) {
            $.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }

        /**
         * @param allowedDeviceManagementLevels A list of allowed device management levels.
         * An empty list allows all management levels.
         * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(List<String> allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(Output.of(allowedDeviceManagementLevels));
        }

        /**
         * @param allowedDeviceManagementLevels A list of allowed device management levels.
         * An empty list allows all management levels.
         * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(String... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }

        /**
         * @param allowedEncryptionStatuses A list of allowed encryptions statuses.
         * An empty list allows all statuses.
         * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(@Nullable Output<List<String>> allowedEncryptionStatuses) {
            $.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }

        /**
         * @param allowedEncryptionStatuses A list of allowed encryptions statuses.
         * An empty list allows all statuses.
         * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(List<String> allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(Output.of(allowedEncryptionStatuses));
        }

        /**
         * @param allowedEncryptionStatuses A list of allowed encryptions statuses.
         * An empty list allows all statuses.
         * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(String... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }

        /**
         * @param osConstraints A list of allowed OS versions.
         * An empty list allows all types and all versions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(@Nullable Output<List<AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs>> osConstraints) {
            $.osConstraints = osConstraints;
            return this;
        }

        /**
         * @param osConstraints A list of allowed OS versions.
         * An empty list allows all types and all versions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(List<AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs> osConstraints) {
            return osConstraints(Output.of(osConstraints));
        }

        /**
         * @param osConstraints A list of allowed OS versions.
         * An empty list allows all types and all versions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(AccessLevelBasicConditionDevicePolicyOsConstraintGetArgs... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }

        /**
         * @param requireAdminApproval Whether the device needs to be approved by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder requireAdminApproval(@Nullable Output<Boolean> requireAdminApproval) {
            $.requireAdminApproval = requireAdminApproval;
            return this;
        }

        /**
         * @param requireAdminApproval Whether the device needs to be approved by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder requireAdminApproval(Boolean requireAdminApproval) {
            return requireAdminApproval(Output.of(requireAdminApproval));
        }

        /**
         * @param requireCorpOwned Whether the device needs to be corp owned.
         * 
         * @return builder
         * 
         */
        public Builder requireCorpOwned(@Nullable Output<Boolean> requireCorpOwned) {
            $.requireCorpOwned = requireCorpOwned;
            return this;
        }

        /**
         * @param requireCorpOwned Whether the device needs to be corp owned.
         * 
         * @return builder
         * 
         */
        public Builder requireCorpOwned(Boolean requireCorpOwned) {
            return requireCorpOwned(Output.of(requireCorpOwned));
        }

        /**
         * @param requireScreenLock Whether or not screenlock is required for the DevicePolicy
         * to be true. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder requireScreenLock(@Nullable Output<Boolean> requireScreenLock) {
            $.requireScreenLock = requireScreenLock;
            return this;
        }

        /**
         * @param requireScreenLock Whether or not screenlock is required for the DevicePolicy
         * to be true. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder requireScreenLock(Boolean requireScreenLock) {
            return requireScreenLock(Output.of(requireScreenLock));
        }

        public AccessLevelBasicConditionDevicePolicyGetArgs build() {
            return $;
        }
    }

}
