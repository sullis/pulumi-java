// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage location for a packet capture session.
 * 
 */
public final class PacketCaptureStorageLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final PacketCaptureStorageLocationResponse Empty = new PacketCaptureStorageLocationResponse();

    /**
     * A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     * 
     */
    @Import(name="filePath")
    private @Nullable String filePath;

    /**
     * @return A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * The ID of the storage account to save the packet capture session. Required if no local file path is provided.
     * 
     */
    @Import(name="storageId")
    private @Nullable String storageId;

    /**
     * @return The ID of the storage account to save the packet capture session. Required if no local file path is provided.
     * 
     */
    public Optional<String> storageId() {
        return Optional.ofNullable(this.storageId);
    }

    /**
     * The URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     * 
     */
    @Import(name="storagePath")
    private @Nullable String storagePath;

    /**
     * @return The URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     * 
     */
    public Optional<String> storagePath() {
        return Optional.ofNullable(this.storagePath);
    }

    private PacketCaptureStorageLocationResponse() {}

    private PacketCaptureStorageLocationResponse(PacketCaptureStorageLocationResponse $) {
        this.filePath = $.filePath;
        this.storageId = $.storageId;
        this.storagePath = $.storagePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketCaptureStorageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketCaptureStorageLocationResponse $;

        public Builder() {
            $ = new PacketCaptureStorageLocationResponse();
        }

        public Builder(PacketCaptureStorageLocationResponse defaults) {
            $ = new PacketCaptureStorageLocationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePath A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable String filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param storageId The ID of the storage account to save the packet capture session. Required if no local file path is provided.
         * 
         * @return builder
         * 
         */
        public Builder storageId(@Nullable String storageId) {
            $.storageId = storageId;
            return this;
        }

        /**
         * @param storagePath The URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
         * 
         * @return builder
         * 
         */
        public Builder storagePath(@Nullable String storagePath) {
            $.storagePath = storagePath;
            return this;
        }

        public PacketCaptureStorageLocationResponse build() {
            return $;
        }
    }

}
