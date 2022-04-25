// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.redis_v1.inputs.WeeklyMaintenanceWindowResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Maintenance policy for an instance.
 * 
 */
public final class MaintenancePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final MaintenancePolicyResponse Empty = new MaintenancePolicyResponse();

    /**
     * The time when the policy was created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    /**
     * @return The time when the policy was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }

    /**
     * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The time when the policy was last updated.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    /**
     * @return The time when the policy was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    /**
     * Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
     * 
     */
    @Import(name="weeklyMaintenanceWindow", required=true)
    private List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow;

    /**
     * @return Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
     * 
     */
    public List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow() {
        return this.weeklyMaintenanceWindow;
    }

    private MaintenancePolicyResponse() {}

    private MaintenancePolicyResponse(MaintenancePolicyResponse $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.updateTime = $.updateTime;
        this.weeklyMaintenanceWindow = $.weeklyMaintenanceWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenancePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenancePolicyResponse $;

        public Builder() {
            $ = new MaintenancePolicyResponse();
        }

        public Builder(MaintenancePolicyResponse defaults) {
            $ = new MaintenancePolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the policy was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param description Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param updateTime The time when the policy was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param weeklyMaintenanceWindow Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceWindow(List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow) {
            $.weeklyMaintenanceWindow = weeklyMaintenanceWindow;
            return this;
        }

        /**
         * @param weeklyMaintenanceWindow Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceWindow(WeeklyMaintenanceWindowResponse... weeklyMaintenanceWindow) {
            return weeklyMaintenanceWindow(List.of(weeklyMaintenanceWindow));
        }

        public MaintenancePolicyResponse build() {
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            $.weeklyMaintenanceWindow = Objects.requireNonNull($.weeklyMaintenanceWindow, "expected parameter 'weeklyMaintenanceWindow' to be non-null");
            return $;
        }
    }

}
