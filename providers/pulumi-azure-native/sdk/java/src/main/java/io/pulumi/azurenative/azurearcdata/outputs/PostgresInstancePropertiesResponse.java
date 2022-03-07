// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.azurenative.azurearcdata.outputs.BasicLoginInformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PostgresInstancePropertiesResponse {
    /**
     * The instance admin
     * 
     */
    private final @Nullable String admin;
    /**
     * Username and password for basic authentication.
     * 
     */
    private final @Nullable BasicLoginInformationResponse basicLoginInformation;
    /**
     * The data controller id
     * 
     */
    private final @Nullable String dataControllerId;
    /**
     * The raw kubernetes information
     * 
     */
    private final @Nullable Object k8sRaw;
    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    private final @Nullable String lastUploadedDate;
    private final String provisioningState;

    @OutputCustomType.Constructor({"admin","basicLoginInformation","dataControllerId","k8sRaw","lastUploadedDate","provisioningState"})
    private PostgresInstancePropertiesResponse(
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
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * The instance admin
     * 
    */
    public Optional<String> getAdmin() {
        return Optional.ofNullable(this.admin);
    }
    /**
     * Username and password for basic authentication.
     * 
    */
    public Optional<BasicLoginInformationResponse> getBasicLoginInformation() {
        return Optional.ofNullable(this.basicLoginInformation);
    }
    /**
     * The data controller id
     * 
    */
    public Optional<String> getDataControllerId() {
        return Optional.ofNullable(this.dataControllerId);
    }
    /**
     * The raw kubernetes information
     * 
    */
    public Optional<Object> getK8sRaw() {
        return Optional.ofNullable(this.k8sRaw);
    }
    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
    */
    public Optional<String> getLastUploadedDate() {
        return Optional.ofNullable(this.lastUploadedDate);
    }
    public String getProvisioningState() {
        return this.provisioningState;
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