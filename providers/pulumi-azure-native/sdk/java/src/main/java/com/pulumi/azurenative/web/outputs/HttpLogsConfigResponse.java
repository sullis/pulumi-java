// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AzureBlobStorageHttpLogsConfigResponse;
import com.pulumi.azurenative.web.outputs.FileSystemHttpLogsConfigResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpLogsConfigResponse {
    /**
     * @return Http logs to azure blob storage configuration.
     * 
     */
    private final @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;
    /**
     * @return Http logs to file system configuration.
     * 
     */
    private final @Nullable FileSystemHttpLogsConfigResponse fileSystem;

    @CustomType.Constructor
    private HttpLogsConfigResponse(
        @CustomType.Parameter("azureBlobStorage") @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage,
        @CustomType.Parameter("fileSystem") @Nullable FileSystemHttpLogsConfigResponse fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.fileSystem = fileSystem;
    }

    /**
     * @return Http logs to azure blob storage configuration.
     * 
     */
    public Optional<AzureBlobStorageHttpLogsConfigResponse> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * @return Http logs to file system configuration.
     * 
     */
    public Optional<FileSystemHttpLogsConfigResponse> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;
        private @Nullable FileSystemHttpLogsConfigResponse fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder azureBlobStorage(@Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        public Builder fileSystem(@Nullable FileSystemHttpLogsConfigResponse fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }        public HttpLogsConfigResponse build() {
            return new HttpLogsConfigResponse(azureBlobStorage, fileSystem);
        }
    }
}
