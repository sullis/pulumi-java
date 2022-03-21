// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the Azure Storage endpoint for file upload.
 * 
 */
public final class StorageEndpointPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageEndpointPropertiesResponse Empty = new StorageEndpointPropertiesResponse();

    /**
     * Specifies authentication type being used for connecting to the storage account.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     * 
     */
    @Import(name="connectionString", required=true)
      private final String connectionString;

    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * The name of the root container where you upload files. The container need not exist but should be creatable using the connectionString specified.
     * 
     */
    @Import(name="containerName", required=true)
      private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     * 
     */
    @Import(name="sasTtlAsIso8601")
      private final @Nullable String sasTtlAsIso8601;

    public Optional<String> getSasTtlAsIso8601() {
        return this.sasTtlAsIso8601 == null ? Optional.empty() : Optional.ofNullable(this.sasTtlAsIso8601);
    }

    public StorageEndpointPropertiesResponse(
        @Nullable String authenticationType,
        String connectionString,
        String containerName,
        @Nullable String sasTtlAsIso8601) {
        this.authenticationType = authenticationType;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.sasTtlAsIso8601 = sasTtlAsIso8601;
    }

    private StorageEndpointPropertiesResponse() {
        this.authenticationType = null;
        this.connectionString = null;
        this.containerName = null;
        this.sasTtlAsIso8601 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private String connectionString;
        private String containerName;
        private @Nullable String sasTtlAsIso8601;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.sasTtlAsIso8601 = defaults.sasTtlAsIso8601;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder sasTtlAsIso8601(@Nullable String sasTtlAsIso8601) {
            this.sasTtlAsIso8601 = sasTtlAsIso8601;
            return this;
        }        public StorageEndpointPropertiesResponse build() {
            return new StorageEndpointPropertiesResponse(authenticationType, connectionString, containerName, sasTtlAsIso8601);
        }
    }
}
