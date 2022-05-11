// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppLogsHttpLogsAzureBlobStorage;
import com.pulumi.azure.appservice.outputs.LinuxWebAppLogsHttpLogsFileSystem;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppLogsHttpLogs {
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    private final @Nullable LinuxWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage;
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    private final @Nullable LinuxWebAppLogsHttpLogsFileSystem fileSystem;

    @CustomType.Constructor
    private LinuxWebAppLogsHttpLogs(
        @CustomType.Parameter("azureBlobStorage") @Nullable LinuxWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage,
        @CustomType.Parameter("fileSystem") @Nullable LinuxWebAppLogsHttpLogsFileSystem fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.fileSystem = fileSystem;
    }

    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    public Optional<LinuxWebAppLogsHttpLogsAzureBlobStorage> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    public Optional<LinuxWebAppLogsHttpLogsFileSystem> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppLogsHttpLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage;
        private @Nullable LinuxWebAppLogsHttpLogsFileSystem fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppLogsHttpLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder azureBlobStorage(@Nullable LinuxWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        public Builder fileSystem(@Nullable LinuxWebAppLogsHttpLogsFileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }        public LinuxWebAppLogsHttpLogs build() {
            return new LinuxWebAppLogsHttpLogs(azureBlobStorage, fileSystem);
        }
    }
}
