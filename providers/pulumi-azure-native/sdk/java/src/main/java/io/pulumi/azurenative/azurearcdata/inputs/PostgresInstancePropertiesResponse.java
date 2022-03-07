// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Postgres Instance properties.
 * 
 */
public final class PostgresInstancePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PostgresInstancePropertiesResponse Empty = new PostgresInstancePropertiesResponse();

    /**
     * The instance admin
     * 
     */
    @InputImport(name="admin")
      private final @Nullable String admin;

    public Optional<String> getAdmin() {
        return this.admin == null ? Optional.empty() : Optional.ofNullable(this.admin);
    }

    /**
     * Username and password for basic authentication.
     * 
     */
    @InputImport(name="basicLoginInformation")
      private final @Nullable BasicLoginInformationResponse basicLoginInformation;

    public Optional<BasicLoginInformationResponse> getBasicLoginInformation() {
        return this.basicLoginInformation == null ? Optional.empty() : Optional.ofNullable(this.basicLoginInformation);
    }

    /**
     * The data controller id
     * 
     */
    @InputImport(name="dataControllerId")
      private final @Nullable String dataControllerId;

    public Optional<String> getDataControllerId() {
        return this.dataControllerId == null ? Optional.empty() : Optional.ofNullable(this.dataControllerId);
    }

    /**
     * The raw kubernetes information
     * 
     */
    @InputImport(name="k8sRaw")
      private final @Nullable Object k8sRaw;

    public Optional<Object> getK8sRaw() {
        return this.k8sRaw == null ? Optional.empty() : Optional.ofNullable(this.k8sRaw);
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @InputImport(name="lastUploadedDate")
      private final @Nullable String lastUploadedDate;

    public Optional<String> getLastUploadedDate() {
        return this.lastUploadedDate == null ? Optional.empty() : Optional.ofNullable(this.lastUploadedDate);
    }

    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public PostgresInstancePropertiesResponse(
        @Nullable String admin,
        @Nullable BasicLoginInformationResponse basicLoginInformation,
        @Nullable String dataControllerId,
        @Nullable Object k8sRaw,
        @Nullable String lastUploadedDate,
        String provisioningState) {
        this.admin = admin;
        this.basicLoginInformation = basicLoginInformation;
        this.dataControllerId = dataControllerId;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private PostgresInstancePropertiesResponse() {
        this.admin = null;
        this.basicLoginInformation = null;
        this.dataControllerId = null;
        this.k8sRaw = null;
        this.lastUploadedDate = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgresInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String admin;
        private @Nullable BasicLoginInformationResponse basicLoginInformation;
        private @Nullable String dataControllerId;
        private @Nullable Object k8sRaw;
        private @Nullable String lastUploadedDate;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgresInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.dataControllerId = defaults.dataControllerId;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setAdmin(@Nullable String admin) {
            this.admin = admin;
            return this;
        }

        public Builder setBasicLoginInformation(@Nullable BasicLoginInformationResponse basicLoginInformation) {
            this.basicLoginInformation = basicLoginInformation;
            return this;
        }

        public Builder setDataControllerId(@Nullable String dataControllerId) {
            this.dataControllerId = dataControllerId;
            return this;
        }

        public Builder setK8sRaw(@Nullable Object k8sRaw) {
            this.k8sRaw = k8sRaw;
            return this;
        }

        public Builder setLastUploadedDate(@Nullable String lastUploadedDate) {
            this.lastUploadedDate = lastUploadedDate;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public PostgresInstancePropertiesResponse build() {
            return new PostgresInstancePropertiesResponse(admin, basicLoginInformation, dataControllerId, k8sRaw, lastUploadedDate, provisioningState);
        }
    }
}