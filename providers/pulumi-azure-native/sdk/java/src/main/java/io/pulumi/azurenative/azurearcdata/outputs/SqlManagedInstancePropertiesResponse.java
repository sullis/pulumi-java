// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.azurenative.azurearcdata.outputs.BasicLoginInformationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlManagedInstancePropertiesResponse {
    /**
     * The instance admin user
     * 
     */
    private final @Nullable String admin;
    /**
     * Username and password for basic authentication.
     * 
     */
    private final @Nullable BasicLoginInformationResponse basicLoginInformation;
    /**
     * null
     * 
     */
    private final @Nullable String dataControllerId;
    /**
     * The instance end time
     * 
     */
    private final @Nullable String endTime;
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
    /**
     * The instance start time
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"admin","basicLoginInformation","dataControllerId","endTime","k8sRaw","lastUploadedDate","provisioningState","startTime"})
    private SqlManagedInstancePropertiesResponse(
        @Nullable String admin,
        @Nullable BasicLoginInformationResponse basicLoginInformation,
        @Nullable String dataControllerId,
        @Nullable String endTime,
        @Nullable Object k8sRaw,
        @Nullable String lastUploadedDate,
        String provisioningState,
        @Nullable String startTime) {
        this.admin = admin;
        this.basicLoginInformation = basicLoginInformation;
        this.dataControllerId = dataControllerId;
        this.endTime = endTime;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.startTime = startTime;
    }

    /**
     * The instance admin user
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
     * null
     * 
     */
    public Optional<String> getDataControllerId() {
        return Optional.ofNullable(this.dataControllerId);
    }
    /**
     * The instance end time
     * 
     */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
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
    /**
     * The instance start time
     * 
     */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlManagedInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String admin;
        private @Nullable BasicLoginInformationResponse basicLoginInformation;
        private @Nullable String dataControllerId;
        private @Nullable String endTime;
        private @Nullable Object k8sRaw;
        private @Nullable String lastUploadedDate;
        private String provisioningState;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlManagedInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.dataControllerId = defaults.dataControllerId;
    	      this.endTime = defaults.endTime;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.provisioningState = defaults.provisioningState;
    	      this.startTime = defaults.startTime;
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

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
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

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public SqlManagedInstancePropertiesResponse build() {
            return new SqlManagedInstancePropertiesResponse(admin, basicLoginInformation, dataControllerId, endTime, k8sRaw, lastUploadedDate, provisioningState, startTime);
        }
    }
}
