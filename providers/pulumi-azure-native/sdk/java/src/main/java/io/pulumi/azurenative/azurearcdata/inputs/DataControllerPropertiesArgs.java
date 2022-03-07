// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationArgs;
import io.pulumi.azurenative.azurearcdata.inputs.LogAnalyticsWorkspaceConfigArgs;
import io.pulumi.azurenative.azurearcdata.inputs.OnPremisePropertyArgs;
import io.pulumi.azurenative.azurearcdata.inputs.UploadServicePrincipalArgs;
import io.pulumi.azurenative.azurearcdata.inputs.UploadWatermarkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The data controller properties.
 * 
 */
public final class DataControllerPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataControllerPropertiesArgs Empty = new DataControllerPropertiesArgs();

    /**
     * Username and password for basic login authentication.
     * 
     */
    @InputImport(name="basicLoginInformation")
      private final @Nullable Input<BasicLoginInformationArgs> basicLoginInformation;

    public Input<BasicLoginInformationArgs> getBasicLoginInformation() {
        return this.basicLoginInformation == null ? Input.empty() : this.basicLoginInformation;
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
     * Log analytics workspace id and primary key
     * 
     */
    @InputImport(name="logAnalyticsWorkspaceConfig")
      private final @Nullable Input<LogAnalyticsWorkspaceConfigArgs> logAnalyticsWorkspaceConfig;

    public Input<LogAnalyticsWorkspaceConfigArgs> getLogAnalyticsWorkspaceConfig() {
        return this.logAnalyticsWorkspaceConfig == null ? Input.empty() : this.logAnalyticsWorkspaceConfig;
    }

    /**
     * Properties from the Kubernetes data controller
     * 
     */
    @InputImport(name="onPremiseProperty")
      private final @Nullable Input<OnPremisePropertyArgs> onPremiseProperty;

    public Input<OnPremisePropertyArgs> getOnPremiseProperty() {
        return this.onPremiseProperty == null ? Input.empty() : this.onPremiseProperty;
    }

    /**
     * Service principal for uploading billing, metrics and logs.
     * 
     */
    @InputImport(name="uploadServicePrincipal")
      private final @Nullable Input<UploadServicePrincipalArgs> uploadServicePrincipal;

    public Input<UploadServicePrincipalArgs> getUploadServicePrincipal() {
        return this.uploadServicePrincipal == null ? Input.empty() : this.uploadServicePrincipal;
    }

    /**
     * Properties on upload watermark.  Mostly timestamp for each upload data type
     * 
     */
    @InputImport(name="uploadWatermark")
      private final @Nullable Input<UploadWatermarkArgs> uploadWatermark;

    public Input<UploadWatermarkArgs> getUploadWatermark() {
        return this.uploadWatermark == null ? Input.empty() : this.uploadWatermark;
    }

    public DataControllerPropertiesArgs(
        @Nullable Input<BasicLoginInformationArgs> basicLoginInformation,
        @Nullable Input<Object> k8sRaw,
        @Nullable Input<String> lastUploadedDate,
        @Nullable Input<LogAnalyticsWorkspaceConfigArgs> logAnalyticsWorkspaceConfig,
        @Nullable Input<OnPremisePropertyArgs> onPremiseProperty,
        @Nullable Input<UploadServicePrincipalArgs> uploadServicePrincipal,
        @Nullable Input<UploadWatermarkArgs> uploadWatermark) {
        this.basicLoginInformation = basicLoginInformation;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
        this.onPremiseProperty = onPremiseProperty;
        this.uploadServicePrincipal = uploadServicePrincipal;
        this.uploadWatermark = uploadWatermark;
    }

    private DataControllerPropertiesArgs() {
        this.basicLoginInformation = Input.empty();
        this.k8sRaw = Input.empty();
        this.lastUploadedDate = Input.empty();
        this.logAnalyticsWorkspaceConfig = Input.empty();
        this.onPremiseProperty = Input.empty();
        this.uploadServicePrincipal = Input.empty();
        this.uploadWatermark = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataControllerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BasicLoginInformationArgs> basicLoginInformation;
        private @Nullable Input<Object> k8sRaw;
        private @Nullable Input<String> lastUploadedDate;
        private @Nullable Input<LogAnalyticsWorkspaceConfigArgs> logAnalyticsWorkspaceConfig;
        private @Nullable Input<OnPremisePropertyArgs> onPremiseProperty;
        private @Nullable Input<UploadServicePrincipalArgs> uploadServicePrincipal;
        private @Nullable Input<UploadWatermarkArgs> uploadWatermark;

        public Builder() {
    	      // Empty
        }

        public Builder(DataControllerPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.logAnalyticsWorkspaceConfig = defaults.logAnalyticsWorkspaceConfig;
    	      this.onPremiseProperty = defaults.onPremiseProperty;
    	      this.uploadServicePrincipal = defaults.uploadServicePrincipal;
    	      this.uploadWatermark = defaults.uploadWatermark;
        }

        public Builder setBasicLoginInformation(@Nullable Input<BasicLoginInformationArgs> basicLoginInformation) {
            this.basicLoginInformation = basicLoginInformation;
            return this;
        }

        public Builder setBasicLoginInformation(@Nullable BasicLoginInformationArgs basicLoginInformation) {
            this.basicLoginInformation = Input.ofNullable(basicLoginInformation);
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

        public Builder setLogAnalyticsWorkspaceConfig(@Nullable Input<LogAnalyticsWorkspaceConfigArgs> logAnalyticsWorkspaceConfig) {
            this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
            return this;
        }

        public Builder setLogAnalyticsWorkspaceConfig(@Nullable LogAnalyticsWorkspaceConfigArgs logAnalyticsWorkspaceConfig) {
            this.logAnalyticsWorkspaceConfig = Input.ofNullable(logAnalyticsWorkspaceConfig);
            return this;
        }

        public Builder setOnPremiseProperty(@Nullable Input<OnPremisePropertyArgs> onPremiseProperty) {
            this.onPremiseProperty = onPremiseProperty;
            return this;
        }

        public Builder setOnPremiseProperty(@Nullable OnPremisePropertyArgs onPremiseProperty) {
            this.onPremiseProperty = Input.ofNullable(onPremiseProperty);
            return this;
        }

        public Builder setUploadServicePrincipal(@Nullable Input<UploadServicePrincipalArgs> uploadServicePrincipal) {
            this.uploadServicePrincipal = uploadServicePrincipal;
            return this;
        }

        public Builder setUploadServicePrincipal(@Nullable UploadServicePrincipalArgs uploadServicePrincipal) {
            this.uploadServicePrincipal = Input.ofNullable(uploadServicePrincipal);
            return this;
        }

        public Builder setUploadWatermark(@Nullable Input<UploadWatermarkArgs> uploadWatermark) {
            this.uploadWatermark = uploadWatermark;
            return this;
        }

        public Builder setUploadWatermark(@Nullable UploadWatermarkArgs uploadWatermark) {
            this.uploadWatermark = Input.ofNullable(uploadWatermark);
            return this;
        }
        public DataControllerPropertiesArgs build() {
            return new DataControllerPropertiesArgs(basicLoginInformation, k8sRaw, lastUploadedDate, logAnalyticsWorkspaceConfig, onPremiseProperty, uploadServicePrincipal, uploadWatermark);
        }
    }
}