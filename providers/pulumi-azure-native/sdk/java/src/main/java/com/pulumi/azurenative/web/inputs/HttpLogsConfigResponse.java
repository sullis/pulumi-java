// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AzureBlobStorageHttpLogsConfigResponse;
import com.pulumi.azurenative.web.inputs.FileSystemHttpLogsConfigResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Http logs configuration.
 * 
 */
public final class HttpLogsConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpLogsConfigResponse Empty = new HttpLogsConfigResponse();

    /**
     * Http logs to azure blob storage configuration.
     * 
     */
    @Import(name="azureBlobStorage")
    private @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;

    /**
     * @return Http logs to azure blob storage configuration.
     * 
     */
    public Optional<AzureBlobStorageHttpLogsConfigResponse> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }

    /**
     * Http logs to file system configuration.
     * 
     */
    @Import(name="fileSystem")
    private @Nullable FileSystemHttpLogsConfigResponse fileSystem;

    /**
     * @return Http logs to file system configuration.
     * 
     */
    public Optional<FileSystemHttpLogsConfigResponse> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    private HttpLogsConfigResponse() {}

    private HttpLogsConfigResponse(HttpLogsConfigResponse $) {
        this.azureBlobStorage = $.azureBlobStorage;
        this.fileSystem = $.fileSystem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpLogsConfigResponse $;

        public Builder() {
            $ = new HttpLogsConfigResponse();
        }

        public Builder(HttpLogsConfigResponse defaults) {
            $ = new HttpLogsConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureBlobStorage Http logs to azure blob storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(@Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage) {
            $.azureBlobStorage = azureBlobStorage;
            return this;
        }

        /**
         * @param fileSystem Http logs to file system configuration.
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(@Nullable FileSystemHttpLogsConfigResponse fileSystem) {
            $.fileSystem = fileSystem;
            return this;
        }

        public HttpLogsConfigResponse build() {
            return $;
        }
    }

}
