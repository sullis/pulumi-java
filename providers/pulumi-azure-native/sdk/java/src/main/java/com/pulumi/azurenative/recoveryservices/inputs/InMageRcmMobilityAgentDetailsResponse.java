// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * InMageRcm mobility agent details.
 * 
 */
public final class InMageRcmMobilityAgentDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final InMageRcmMobilityAgentDetailsResponse Empty = new InMageRcmMobilityAgentDetailsResponse();

    /**
     * The agent version expiry date.
     * 
     */
    @Import(name="agentVersionExpiryDate", required=true)
    private String agentVersionExpiryDate;

    /**
     * @return The agent version expiry date.
     * 
     */
    public String agentVersionExpiryDate() {
        return this.agentVersionExpiryDate;
    }

    /**
     * The driver version.
     * 
     */
    @Import(name="driverVersion", required=true)
    private String driverVersion;

    /**
     * @return The driver version.
     * 
     */
    public String driverVersion() {
        return this.driverVersion;
    }

    /**
     * The driver version expiry date.
     * 
     */
    @Import(name="driverVersionExpiryDate", required=true)
    private String driverVersionExpiryDate;

    /**
     * @return The driver version expiry date.
     * 
     */
    public String driverVersionExpiryDate() {
        return this.driverVersionExpiryDate;
    }

    /**
     * A value indicating whether agent is upgradeable or not.
     * 
     */
    @Import(name="isUpgradeable", required=true)
    private String isUpgradeable;

    /**
     * @return A value indicating whether agent is upgradeable or not.
     * 
     */
    public String isUpgradeable() {
        return this.isUpgradeable;
    }

    /**
     * The time of the last heartbeat received from the agent.
     * 
     */
    @Import(name="lastHeartbeatUtc", required=true)
    private String lastHeartbeatUtc;

    /**
     * @return The time of the last heartbeat received from the agent.
     * 
     */
    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * The latest upgradeable version available without reboot.
     * 
     */
    @Import(name="latestUpgradableVersionWithoutReboot", required=true)
    private String latestUpgradableVersionWithoutReboot;

    /**
     * @return The latest upgradeable version available without reboot.
     * 
     */
    public String latestUpgradableVersionWithoutReboot() {
        return this.latestUpgradableVersionWithoutReboot;
    }

    /**
     * The latest agent version available.
     * 
     */
    @Import(name="latestVersion", required=true)
    private String latestVersion;

    /**
     * @return The latest agent version available.
     * 
     */
    public String latestVersion() {
        return this.latestVersion;
    }

    /**
     * The whether update is possible or not.
     * 
     */
    @Import(name="reasonsBlockingUpgrade", required=true)
    private List<String> reasonsBlockingUpgrade;

    /**
     * @return The whether update is possible or not.
     * 
     */
    public List<String> reasonsBlockingUpgrade() {
        return this.reasonsBlockingUpgrade;
    }

    /**
     * The agent version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The agent version.
     * 
     */
    public String version() {
        return this.version;
    }

    private InMageRcmMobilityAgentDetailsResponse() {}

    private InMageRcmMobilityAgentDetailsResponse(InMageRcmMobilityAgentDetailsResponse $) {
        this.agentVersionExpiryDate = $.agentVersionExpiryDate;
        this.driverVersion = $.driverVersion;
        this.driverVersionExpiryDate = $.driverVersionExpiryDate;
        this.isUpgradeable = $.isUpgradeable;
        this.lastHeartbeatUtc = $.lastHeartbeatUtc;
        this.latestUpgradableVersionWithoutReboot = $.latestUpgradableVersionWithoutReboot;
        this.latestVersion = $.latestVersion;
        this.reasonsBlockingUpgrade = $.reasonsBlockingUpgrade;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageRcmMobilityAgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageRcmMobilityAgentDetailsResponse $;

        public Builder() {
            $ = new InMageRcmMobilityAgentDetailsResponse();
        }

        public Builder(InMageRcmMobilityAgentDetailsResponse defaults) {
            $ = new InMageRcmMobilityAgentDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentVersionExpiryDate The agent version expiry date.
         * 
         * @return builder
         * 
         */
        public Builder agentVersionExpiryDate(String agentVersionExpiryDate) {
            $.agentVersionExpiryDate = agentVersionExpiryDate;
            return this;
        }

        /**
         * @param driverVersion The driver version.
         * 
         * @return builder
         * 
         */
        public Builder driverVersion(String driverVersion) {
            $.driverVersion = driverVersion;
            return this;
        }

        /**
         * @param driverVersionExpiryDate The driver version expiry date.
         * 
         * @return builder
         * 
         */
        public Builder driverVersionExpiryDate(String driverVersionExpiryDate) {
            $.driverVersionExpiryDate = driverVersionExpiryDate;
            return this;
        }

        /**
         * @param isUpgradeable A value indicating whether agent is upgradeable or not.
         * 
         * @return builder
         * 
         */
        public Builder isUpgradeable(String isUpgradeable) {
            $.isUpgradeable = isUpgradeable;
            return this;
        }

        /**
         * @param lastHeartbeatUtc The time of the last heartbeat received from the agent.
         * 
         * @return builder
         * 
         */
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            $.lastHeartbeatUtc = lastHeartbeatUtc;
            return this;
        }

        /**
         * @param latestUpgradableVersionWithoutReboot The latest upgradeable version available without reboot.
         * 
         * @return builder
         * 
         */
        public Builder latestUpgradableVersionWithoutReboot(String latestUpgradableVersionWithoutReboot) {
            $.latestUpgradableVersionWithoutReboot = latestUpgradableVersionWithoutReboot;
            return this;
        }

        /**
         * @param latestVersion The latest agent version available.
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(String latestVersion) {
            $.latestVersion = latestVersion;
            return this;
        }

        /**
         * @param reasonsBlockingUpgrade The whether update is possible or not.
         * 
         * @return builder
         * 
         */
        public Builder reasonsBlockingUpgrade(List<String> reasonsBlockingUpgrade) {
            $.reasonsBlockingUpgrade = reasonsBlockingUpgrade;
            return this;
        }

        /**
         * @param reasonsBlockingUpgrade The whether update is possible or not.
         * 
         * @return builder
         * 
         */
        public Builder reasonsBlockingUpgrade(String... reasonsBlockingUpgrade) {
            return reasonsBlockingUpgrade(List.of(reasonsBlockingUpgrade));
        }

        /**
         * @param version The agent version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public InMageRcmMobilityAgentDetailsResponse build() {
            $.agentVersionExpiryDate = Objects.requireNonNull($.agentVersionExpiryDate, "expected parameter 'agentVersionExpiryDate' to be non-null");
            $.driverVersion = Objects.requireNonNull($.driverVersion, "expected parameter 'driverVersion' to be non-null");
            $.driverVersionExpiryDate = Objects.requireNonNull($.driverVersionExpiryDate, "expected parameter 'driverVersionExpiryDate' to be non-null");
            $.isUpgradeable = Objects.requireNonNull($.isUpgradeable, "expected parameter 'isUpgradeable' to be non-null");
            $.lastHeartbeatUtc = Objects.requireNonNull($.lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
            $.latestUpgradableVersionWithoutReboot = Objects.requireNonNull($.latestUpgradableVersionWithoutReboot, "expected parameter 'latestUpgradableVersionWithoutReboot' to be non-null");
            $.latestVersion = Objects.requireNonNull($.latestVersion, "expected parameter 'latestVersion' to be non-null");
            $.reasonsBlockingUpgrade = Objects.requireNonNull($.reasonsBlockingUpgrade, "expected parameter 'reasonsBlockingUpgrade' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
