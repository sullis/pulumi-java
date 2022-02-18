// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of a secret resource.
 * 
 */
public final class SecretResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretResourcePropertiesResponse Empty = new SecretResourcePropertiesResponse();

    /**
     * The type of the content stored in the secret value. The value of this property is opaque to Service Fabric. Once set, the value of this property cannot be changed.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * User readable description of the secret.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Describes the kind of secret.
     * Expected value is 'SecretResourceProperties'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * State of the resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Status of the resource.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Gives additional information about the current status of the secret.
     * 
     */
    @InputImport(name="statusDetails", required=true)
    private final String statusDetails;

    public String getStatusDetails() {
        return this.statusDetails;
    }

    public SecretResourcePropertiesResponse(
        @Nullable String contentType,
        @Nullable String description,
        String kind,
        String provisioningState,
        String status,
        String statusDetails) {
        this.contentType = contentType;
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusDetails = Objects.requireNonNull(statusDetails, "expected parameter 'statusDetails' to be non-null");
    }

    private SecretResourcePropertiesResponse() {
        this.contentType = null;
        this.description = null;
        this.kind = null;
        this.provisioningState = null;
        this.status = null;
        this.statusDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String description;
        private String kind;
        private String provisioningState;
        private String status;
        private String statusDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }

        public SecretResourcePropertiesResponse build() {
            return new SecretResourcePropertiesResponse(contentType, description, kind, provisioningState, status, statusDetails);
        }
    }
}
