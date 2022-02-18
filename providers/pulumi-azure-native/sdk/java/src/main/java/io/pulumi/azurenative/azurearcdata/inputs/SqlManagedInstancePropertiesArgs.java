// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of sqlManagedInstance.
 * 
 */
public final class SqlManagedInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlManagedInstancePropertiesArgs Empty = new SqlManagedInstancePropertiesArgs();

    /**
     * The instance admin user
     * 
     */
    @InputImport(name="admin")
    private final @Nullable Input<String> admin;

    public Input<String> getAdmin() {
        return this.admin == null ? Input.empty() : this.admin;
    }

    /**
     * Username and password for basic authentication.
     * 
     */
    @InputImport(name="basicLoginInformation")
    private final @Nullable Input<BasicLoginInformationArgs> basicLoginInformation;

    public Input<BasicLoginInformationArgs> getBasicLoginInformation() {
        return this.basicLoginInformation == null ? Input.empty() : this.basicLoginInformation;
    }

    /**
     * null
     * 
     */
    @InputImport(name="dataControllerId")
    private final @Nullable Input<String> dataControllerId;

    public Input<String> getDataControllerId() {
        return this.dataControllerId == null ? Input.empty() : this.dataControllerId;
    }

    /**
     * The instance end time
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The raw kubernetes information
     * 
     */
    @InputImport(name="k8sRaw")
    private final @Nullable Input<Object> k8sRaw;

    public Input<Object> getK8sRaw() {
        return this.k8sRaw == null ? Input.empty() : this.k8sRaw;
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @InputImport(name="lastUploadedDate")
    private final @Nullable Input<String> lastUploadedDate;

    public Input<String> getLastUploadedDate() {
        return this.lastUploadedDate == null ? Input.empty() : this.lastUploadedDate;
    }

    /**
     * The instance start time
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public SqlManagedInstancePropertiesArgs(
        @Nullable Input<String> admin,
        @Nullable Input<BasicLoginInformationArgs> basicLoginInformation,
        @Nullable Input<String> dataControllerId,
        @Nullable Input<String> endTime,
        @Nullable Input<Object> k8sRaw,
        @Nullable Input<String> lastUploadedDate,
        @Nullable Input<String> startTime) {
        this.admin = admin;
        this.basicLoginInformation = basicLoginInformation;
        this.dataControllerId = dataControllerId;
        this.endTime = endTime;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.startTime = startTime;
    }

    private SqlManagedInstancePropertiesArgs() {
        this.admin = Input.empty();
        this.basicLoginInformation = Input.empty();
        this.dataControllerId = Input.empty();
        this.endTime = Input.empty();
        this.k8sRaw = Input.empty();
        this.lastUploadedDate = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlManagedInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> admin;
        private @Nullable Input<BasicLoginInformationArgs> basicLoginInformation;
        private @Nullable Input<String> dataControllerId;
        private @Nullable Input<String> endTime;
        private @Nullable Input<Object> k8sRaw;
        private @Nullable Input<String> lastUploadedDate;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlManagedInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.dataControllerId = defaults.dataControllerId;
    	      this.endTime = defaults.endTime;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.startTime = defaults.startTime;
        }

        public Builder setAdmin(@Nullable Input<String> admin) {
            this.admin = admin;
            return this;
        }

        public Builder setAdmin(@Nullable String admin) {
            this.admin = Input.ofNullable(admin);
            return this;
        }

        public Builder setBasicLoginInformation(@Nullable Input<BasicLoginInformationArgs> basicLoginInformation) {
            this.basicLoginInformation = basicLoginInformation;
            return this;
        }

        public Builder setBasicLoginInformation(@Nullable BasicLoginInformationArgs basicLoginInformation) {
            this.basicLoginInformation = Input.ofNullable(basicLoginInformation);
            return this;
        }

        public Builder setDataControllerId(@Nullable Input<String> dataControllerId) {
            this.dataControllerId = dataControllerId;
            return this;
        }

        public Builder setDataControllerId(@Nullable String dataControllerId) {
            this.dataControllerId = Input.ofNullable(dataControllerId);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setK8sRaw(@Nullable Input<Object> k8sRaw) {
            this.k8sRaw = k8sRaw;
            return this;
        }

        public Builder setK8sRaw(@Nullable Object k8sRaw) {
            this.k8sRaw = Input.ofNullable(k8sRaw);
            return this;
        }

        public Builder setLastUploadedDate(@Nullable Input<String> lastUploadedDate) {
            this.lastUploadedDate = lastUploadedDate;
            return this;
        }

        public Builder setLastUploadedDate(@Nullable String lastUploadedDate) {
            this.lastUploadedDate = Input.ofNullable(lastUploadedDate);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public SqlManagedInstancePropertiesArgs build() {
            return new SqlManagedInstancePropertiesArgs(admin, basicLoginInformation, dataControllerId, endTime, k8sRaw, lastUploadedDate, startTime);
        }
    }
}
