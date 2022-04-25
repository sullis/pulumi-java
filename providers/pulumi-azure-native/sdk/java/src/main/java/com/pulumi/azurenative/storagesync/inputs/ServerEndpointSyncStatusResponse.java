// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.inputs;

import com.pulumi.azurenative.storagesync.inputs.ServerEndpointSyncActivityStatusResponse;
import com.pulumi.azurenative.storagesync.inputs.ServerEndpointSyncSessionStatusResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Server Endpoint sync status
 * 
 */
public final class ServerEndpointSyncStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServerEndpointSyncStatusResponse Empty = new ServerEndpointSyncStatusResponse();

    /**
     * Combined Health Status.
     * 
     */
    @Import(name="combinedHealth", required=true)
    private String combinedHealth;

    /**
     * @return Combined Health Status.
     * 
     */
    public String combinedHealth() {
        return this.combinedHealth;
    }

    /**
     * Download sync activity
     * 
     */
    @Import(name="downloadActivity", required=true)
    private ServerEndpointSyncActivityStatusResponse downloadActivity;

    /**
     * @return Download sync activity
     * 
     */
    public ServerEndpointSyncActivityStatusResponse downloadActivity() {
        return this.downloadActivity;
    }

    /**
     * Download Health Status.
     * 
     */
    @Import(name="downloadHealth", required=true)
    private String downloadHealth;

    /**
     * @return Download Health Status.
     * 
     */
    public String downloadHealth() {
        return this.downloadHealth;
    }

    /**
     * Download Status
     * 
     */
    @Import(name="downloadStatus", required=true)
    private ServerEndpointSyncSessionStatusResponse downloadStatus;

    /**
     * @return Download Status
     * 
     */
    public ServerEndpointSyncSessionStatusResponse downloadStatus() {
        return this.downloadStatus;
    }

    /**
     * Last Updated Timestamp
     * 
     */
    @Import(name="lastUpdatedTimestamp", required=true)
    private String lastUpdatedTimestamp;

    /**
     * @return Last Updated Timestamp
     * 
     */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Offline Data Transfer State
     * 
     */
    @Import(name="offlineDataTransferStatus", required=true)
    private String offlineDataTransferStatus;

    /**
     * @return Offline Data Transfer State
     * 
     */
    public String offlineDataTransferStatus() {
        return this.offlineDataTransferStatus;
    }

    /**
     * Sync activity
     * 
     */
    @Import(name="syncActivity", required=true)
    private String syncActivity;

    /**
     * @return Sync activity
     * 
     */
    public String syncActivity() {
        return this.syncActivity;
    }

    /**
     * Total count of persistent files not syncing (combined upload + download).
     * 
     */
    @Import(name="totalPersistentFilesNotSyncingCount", required=true)
    private Double totalPersistentFilesNotSyncingCount;

    /**
     * @return Total count of persistent files not syncing (combined upload + download).
     * 
     */
    public Double totalPersistentFilesNotSyncingCount() {
        return this.totalPersistentFilesNotSyncingCount;
    }

    /**
     * Upload sync activity
     * 
     */
    @Import(name="uploadActivity", required=true)
    private ServerEndpointSyncActivityStatusResponse uploadActivity;

    /**
     * @return Upload sync activity
     * 
     */
    public ServerEndpointSyncActivityStatusResponse uploadActivity() {
        return this.uploadActivity;
    }

    /**
     * Upload Health Status.
     * 
     */
    @Import(name="uploadHealth", required=true)
    private String uploadHealth;

    /**
     * @return Upload Health Status.
     * 
     */
    public String uploadHealth() {
        return this.uploadHealth;
    }

    /**
     * Upload Status
     * 
     */
    @Import(name="uploadStatus", required=true)
    private ServerEndpointSyncSessionStatusResponse uploadStatus;

    /**
     * @return Upload Status
     * 
     */
    public ServerEndpointSyncSessionStatusResponse uploadStatus() {
        return this.uploadStatus;
    }

    private ServerEndpointSyncStatusResponse() {}

    private ServerEndpointSyncStatusResponse(ServerEndpointSyncStatusResponse $) {
        this.combinedHealth = $.combinedHealth;
        this.downloadActivity = $.downloadActivity;
        this.downloadHealth = $.downloadHealth;
        this.downloadStatus = $.downloadStatus;
        this.lastUpdatedTimestamp = $.lastUpdatedTimestamp;
        this.offlineDataTransferStatus = $.offlineDataTransferStatus;
        this.syncActivity = $.syncActivity;
        this.totalPersistentFilesNotSyncingCount = $.totalPersistentFilesNotSyncingCount;
        this.uploadActivity = $.uploadActivity;
        this.uploadHealth = $.uploadHealth;
        this.uploadStatus = $.uploadStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerEndpointSyncStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerEndpointSyncStatusResponse $;

        public Builder() {
            $ = new ServerEndpointSyncStatusResponse();
        }

        public Builder(ServerEndpointSyncStatusResponse defaults) {
            $ = new ServerEndpointSyncStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param combinedHealth Combined Health Status.
         * 
         * @return builder
         * 
         */
        public Builder combinedHealth(String combinedHealth) {
            $.combinedHealth = combinedHealth;
            return this;
        }

        /**
         * @param downloadActivity Download sync activity
         * 
         * @return builder
         * 
         */
        public Builder downloadActivity(ServerEndpointSyncActivityStatusResponse downloadActivity) {
            $.downloadActivity = downloadActivity;
            return this;
        }

        /**
         * @param downloadHealth Download Health Status.
         * 
         * @return builder
         * 
         */
        public Builder downloadHealth(String downloadHealth) {
            $.downloadHealth = downloadHealth;
            return this;
        }

        /**
         * @param downloadStatus Download Status
         * 
         * @return builder
         * 
         */
        public Builder downloadStatus(ServerEndpointSyncSessionStatusResponse downloadStatus) {
            $.downloadStatus = downloadStatus;
            return this;
        }

        /**
         * @param lastUpdatedTimestamp Last Updated Timestamp
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            $.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }

        /**
         * @param offlineDataTransferStatus Offline Data Transfer State
         * 
         * @return builder
         * 
         */
        public Builder offlineDataTransferStatus(String offlineDataTransferStatus) {
            $.offlineDataTransferStatus = offlineDataTransferStatus;
            return this;
        }

        /**
         * @param syncActivity Sync activity
         * 
         * @return builder
         * 
         */
        public Builder syncActivity(String syncActivity) {
            $.syncActivity = syncActivity;
            return this;
        }

        /**
         * @param totalPersistentFilesNotSyncingCount Total count of persistent files not syncing (combined upload + download).
         * 
         * @return builder
         * 
         */
        public Builder totalPersistentFilesNotSyncingCount(Double totalPersistentFilesNotSyncingCount) {
            $.totalPersistentFilesNotSyncingCount = totalPersistentFilesNotSyncingCount;
            return this;
        }

        /**
         * @param uploadActivity Upload sync activity
         * 
         * @return builder
         * 
         */
        public Builder uploadActivity(ServerEndpointSyncActivityStatusResponse uploadActivity) {
            $.uploadActivity = uploadActivity;
            return this;
        }

        /**
         * @param uploadHealth Upload Health Status.
         * 
         * @return builder
         * 
         */
        public Builder uploadHealth(String uploadHealth) {
            $.uploadHealth = uploadHealth;
            return this;
        }

        /**
         * @param uploadStatus Upload Status
         * 
         * @return builder
         * 
         */
        public Builder uploadStatus(ServerEndpointSyncSessionStatusResponse uploadStatus) {
            $.uploadStatus = uploadStatus;
            return this;
        }

        public ServerEndpointSyncStatusResponse build() {
            $.combinedHealth = Objects.requireNonNull($.combinedHealth, "expected parameter 'combinedHealth' to be non-null");
            $.downloadActivity = Objects.requireNonNull($.downloadActivity, "expected parameter 'downloadActivity' to be non-null");
            $.downloadHealth = Objects.requireNonNull($.downloadHealth, "expected parameter 'downloadHealth' to be non-null");
            $.downloadStatus = Objects.requireNonNull($.downloadStatus, "expected parameter 'downloadStatus' to be non-null");
            $.lastUpdatedTimestamp = Objects.requireNonNull($.lastUpdatedTimestamp, "expected parameter 'lastUpdatedTimestamp' to be non-null");
            $.offlineDataTransferStatus = Objects.requireNonNull($.offlineDataTransferStatus, "expected parameter 'offlineDataTransferStatus' to be non-null");
            $.syncActivity = Objects.requireNonNull($.syncActivity, "expected parameter 'syncActivity' to be non-null");
            $.totalPersistentFilesNotSyncingCount = Objects.requireNonNull($.totalPersistentFilesNotSyncingCount, "expected parameter 'totalPersistentFilesNotSyncingCount' to be non-null");
            $.uploadActivity = Objects.requireNonNull($.uploadActivity, "expected parameter 'uploadActivity' to be non-null");
            $.uploadHealth = Objects.requireNonNull($.uploadHealth, "expected parameter 'uploadHealth' to be non-null");
            $.uploadStatus = Objects.requireNonNull($.uploadStatus, "expected parameter 'uploadStatus' to be non-null");
            return $;
        }
    }

}
