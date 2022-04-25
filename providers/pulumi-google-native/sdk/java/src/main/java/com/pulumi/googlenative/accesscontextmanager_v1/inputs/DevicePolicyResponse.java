// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.OsConstraintResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * `DevicePolicy` specifies device specific restrictions necessary to acquire a given access level. A `DevicePolicy` specifies requirements for requests from devices to be granted access levels, it does not do any enforcement on the device. `DevicePolicy` acts as an AND over all specified fields, and each repeated field is an OR over its elements. Any unset fields are ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will be true for requests originating from encrypted Linux desktops and encrypted Windows desktops.
 * 
 */
public final class DevicePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final DevicePolicyResponse Empty = new DevicePolicyResponse();

    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
     */
    @Import(name="allowedDeviceManagementLevels", required=true)
    private List<String> allowedDeviceManagementLevels;

    /**
     * @return Allowed device management levels, an empty list allows all management levels.
     * 
     */
    public List<String> allowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels;
    }

    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    @Import(name="allowedEncryptionStatuses", required=true)
    private List<String> allowedEncryptionStatuses;

    /**
     * @return Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    public List<String> allowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses;
    }

    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    @Import(name="osConstraints", required=true)
    private List<OsConstraintResponse> osConstraints;

    /**
     * @return Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    public List<OsConstraintResponse> osConstraints() {
        return this.osConstraints;
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval", required=true)
    private Boolean requireAdminApproval;

    /**
     * @return Whether the device needs to be approved by the customer admin.
     * 
     */
    public Boolean requireAdminApproval() {
        return this.requireAdminApproval;
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned", required=true)
    private Boolean requireCorpOwned;

    /**
     * @return Whether the device needs to be corp owned.
     * 
     */
    public Boolean requireCorpOwned() {
        return this.requireCorpOwned;
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    @Import(name="requireScreenlock", required=true)
    private Boolean requireScreenlock;

    /**
     * @return Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    public Boolean requireScreenlock() {
        return this.requireScreenlock;
    }

    private DevicePolicyResponse() {}

    private DevicePolicyResponse(DevicePolicyResponse $) {
        this.allowedDeviceManagementLevels = $.allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = $.allowedEncryptionStatuses;
        this.osConstraints = $.osConstraints;
        this.requireAdminApproval = $.requireAdminApproval;
        this.requireCorpOwned = $.requireCorpOwned;
        this.requireScreenlock = $.requireScreenlock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePolicyResponse $;

        public Builder() {
            $ = new DevicePolicyResponse();
        }

        public Builder(DevicePolicyResponse defaults) {
            $ = new DevicePolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedDeviceManagementLevels Allowed device management levels, an empty list allows all management levels.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(List<String> allowedDeviceManagementLevels) {
            $.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }

        /**
         * @param allowedDeviceManagementLevels Allowed device management levels, an empty list allows all management levels.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(String... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }

        /**
         * @param allowedEncryptionStatuses Allowed encryptions statuses, an empty list allows all statuses.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(List<String> allowedEncryptionStatuses) {
            $.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }

        /**
         * @param allowedEncryptionStatuses Allowed encryptions statuses, an empty list allows all statuses.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(String... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }

        /**
         * @param osConstraints Allowed OS versions, an empty list allows all types and all versions.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(List<OsConstraintResponse> osConstraints) {
            $.osConstraints = osConstraints;
            return this;
        }

        /**
         * @param osConstraints Allowed OS versions, an empty list allows all types and all versions.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(OsConstraintResponse... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }

        /**
         * @param requireAdminApproval Whether the device needs to be approved by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder requireAdminApproval(Boolean requireAdminApproval) {
            $.requireAdminApproval = requireAdminApproval;
            return this;
        }

        /**
         * @param requireCorpOwned Whether the device needs to be corp owned.
         * 
         * @return builder
         * 
         */
        public Builder requireCorpOwned(Boolean requireCorpOwned) {
            $.requireCorpOwned = requireCorpOwned;
            return this;
        }

        /**
         * @param requireScreenlock Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireScreenlock(Boolean requireScreenlock) {
            $.requireScreenlock = requireScreenlock;
            return this;
        }

        public DevicePolicyResponse build() {
            $.allowedDeviceManagementLevels = Objects.requireNonNull($.allowedDeviceManagementLevels, "expected parameter 'allowedDeviceManagementLevels' to be non-null");
            $.allowedEncryptionStatuses = Objects.requireNonNull($.allowedEncryptionStatuses, "expected parameter 'allowedEncryptionStatuses' to be non-null");
            $.osConstraints = Objects.requireNonNull($.osConstraints, "expected parameter 'osConstraints' to be non-null");
            $.requireAdminApproval = Objects.requireNonNull($.requireAdminApproval, "expected parameter 'requireAdminApproval' to be non-null");
            $.requireCorpOwned = Objects.requireNonNull($.requireCorpOwned, "expected parameter 'requireCorpOwned' to be non-null");
            $.requireScreenlock = Objects.requireNonNull($.requireScreenlock, "expected parameter 'requireScreenlock' to be non-null");
            return $;
        }
    }

}
