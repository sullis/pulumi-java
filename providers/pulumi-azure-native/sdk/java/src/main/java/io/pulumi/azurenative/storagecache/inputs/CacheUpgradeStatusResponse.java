// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Properties describing the software upgrade state of the Cache.
 * 
 */
public final class CacheUpgradeStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheUpgradeStatusResponse Empty = new CacheUpgradeStatusResponse();

    /**
     * Version string of the firmware currently installed on this Cache.
     * 
     */
    @Import(name="currentFirmwareVersion", required=true)
      private final String currentFirmwareVersion;

    public String getCurrentFirmwareVersion() {
        return this.currentFirmwareVersion;
    }

    /**
     * Time at which the pending firmware update will automatically be installed on the Cache.
     * 
     */
    @Import(name="firmwareUpdateDeadline", required=true)
      private final String firmwareUpdateDeadline;

    public String getFirmwareUpdateDeadline() {
        return this.firmwareUpdateDeadline;
    }

    /**
     * True if there is a firmware update ready to install on this Cache. The firmware will automatically be installed after firmwareUpdateDeadline if not triggered earlier via the upgrade operation.
     * 
     */
    @Import(name="firmwareUpdateStatus", required=true)
      private final String firmwareUpdateStatus;

    public String getFirmwareUpdateStatus() {
        return this.firmwareUpdateStatus;
    }

    /**
     * Time of the last successful firmware update.
     * 
     */
    @Import(name="lastFirmwareUpdate", required=true)
      private final String lastFirmwareUpdate;

    public String getLastFirmwareUpdate() {
        return this.lastFirmwareUpdate;
    }

    /**
     * When firmwareUpdateAvailable is true, this field holds the version string for the update.
     * 
     */
    @Import(name="pendingFirmwareVersion", required=true)
      private final String pendingFirmwareVersion;

    public String getPendingFirmwareVersion() {
        return this.pendingFirmwareVersion;
    }

    public CacheUpgradeStatusResponse(
        String currentFirmwareVersion,
        String firmwareUpdateDeadline,
        String firmwareUpdateStatus,
        String lastFirmwareUpdate,
        String pendingFirmwareVersion) {
        this.currentFirmwareVersion = Objects.requireNonNull(currentFirmwareVersion, "expected parameter 'currentFirmwareVersion' to be non-null");
        this.firmwareUpdateDeadline = Objects.requireNonNull(firmwareUpdateDeadline, "expected parameter 'firmwareUpdateDeadline' to be non-null");
        this.firmwareUpdateStatus = Objects.requireNonNull(firmwareUpdateStatus, "expected parameter 'firmwareUpdateStatus' to be non-null");
        this.lastFirmwareUpdate = Objects.requireNonNull(lastFirmwareUpdate, "expected parameter 'lastFirmwareUpdate' to be non-null");
        this.pendingFirmwareVersion = Objects.requireNonNull(pendingFirmwareVersion, "expected parameter 'pendingFirmwareVersion' to be non-null");
    }

    private CacheUpgradeStatusResponse() {
        this.currentFirmwareVersion = null;
        this.firmwareUpdateDeadline = null;
        this.firmwareUpdateStatus = null;
        this.lastFirmwareUpdate = null;
        this.pendingFirmwareVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheUpgradeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentFirmwareVersion;
        private String firmwareUpdateDeadline;
        private String firmwareUpdateStatus;
        private String lastFirmwareUpdate;
        private String pendingFirmwareVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheUpgradeStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentFirmwareVersion = defaults.currentFirmwareVersion;
    	      this.firmwareUpdateDeadline = defaults.firmwareUpdateDeadline;
    	      this.firmwareUpdateStatus = defaults.firmwareUpdateStatus;
    	      this.lastFirmwareUpdate = defaults.lastFirmwareUpdate;
    	      this.pendingFirmwareVersion = defaults.pendingFirmwareVersion;
        }

        public Builder currentFirmwareVersion(String currentFirmwareVersion) {
            this.currentFirmwareVersion = Objects.requireNonNull(currentFirmwareVersion);
            return this;
        }
        public Builder firmwareUpdateDeadline(String firmwareUpdateDeadline) {
            this.firmwareUpdateDeadline = Objects.requireNonNull(firmwareUpdateDeadline);
            return this;
        }
        public Builder firmwareUpdateStatus(String firmwareUpdateStatus) {
            this.firmwareUpdateStatus = Objects.requireNonNull(firmwareUpdateStatus);
            return this;
        }
        public Builder lastFirmwareUpdate(String lastFirmwareUpdate) {
            this.lastFirmwareUpdate = Objects.requireNonNull(lastFirmwareUpdate);
            return this;
        }
        public Builder pendingFirmwareVersion(String pendingFirmwareVersion) {
            this.pendingFirmwareVersion = Objects.requireNonNull(pendingFirmwareVersion);
            return this;
        }        public CacheUpgradeStatusResponse build() {
            return new CacheUpgradeStatusResponse(currentFirmwareVersion, firmwareUpdateDeadline, firmwareUpdateStatus, lastFirmwareUpdate, pendingFirmwareVersion);
        }
    }
}
