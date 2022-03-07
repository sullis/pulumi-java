// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.MitigationActionAddThingsToThingGroupParams;
import io.pulumi.awsnative.iot.inputs.MitigationActionEnableIoTLoggingParams;
import io.pulumi.awsnative.iot.inputs.MitigationActionPublishFindingToSnsParams;
import io.pulumi.awsnative.iot.inputs.MitigationActionReplaceDefaultPolicyVersionParams;
import io.pulumi.awsnative.iot.inputs.MitigationActionUpdateCACertificateParams;
import io.pulumi.awsnative.iot.inputs.MitigationActionUpdateDeviceCertificateParams;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can apply only one action for each defined mitigation action).
 * 
 */
public final class MitigationActionActionParams extends io.pulumi.resources.InvokeArgs {

    public static final MitigationActionActionParams Empty = new MitigationActionActionParams();

    @InputImport(name="addThingsToThingGroupParams")
      private final @Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams;

    public Optional<MitigationActionAddThingsToThingGroupParams> getAddThingsToThingGroupParams() {
        return this.addThingsToThingGroupParams == null ? Optional.empty() : Optional.ofNullable(this.addThingsToThingGroupParams);
    }

    @InputImport(name="enableIoTLoggingParams")
      private final @Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams;

    public Optional<MitigationActionEnableIoTLoggingParams> getEnableIoTLoggingParams() {
        return this.enableIoTLoggingParams == null ? Optional.empty() : Optional.ofNullable(this.enableIoTLoggingParams);
    }

    @InputImport(name="publishFindingToSnsParams")
      private final @Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams;

    public Optional<MitigationActionPublishFindingToSnsParams> getPublishFindingToSnsParams() {
        return this.publishFindingToSnsParams == null ? Optional.empty() : Optional.ofNullable(this.publishFindingToSnsParams);
    }

    @InputImport(name="replaceDefaultPolicyVersionParams")
      private final @Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams;

    public Optional<MitigationActionReplaceDefaultPolicyVersionParams> getReplaceDefaultPolicyVersionParams() {
        return this.replaceDefaultPolicyVersionParams == null ? Optional.empty() : Optional.ofNullable(this.replaceDefaultPolicyVersionParams);
    }

    @InputImport(name="updateCACertificateParams")
      private final @Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams;

    public Optional<MitigationActionUpdateCACertificateParams> getUpdateCACertificateParams() {
        return this.updateCACertificateParams == null ? Optional.empty() : Optional.ofNullable(this.updateCACertificateParams);
    }

    @InputImport(name="updateDeviceCertificateParams")
      private final @Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams;

    public Optional<MitigationActionUpdateDeviceCertificateParams> getUpdateDeviceCertificateParams() {
        return this.updateDeviceCertificateParams == null ? Optional.empty() : Optional.ofNullable(this.updateDeviceCertificateParams);
    }

    public MitigationActionActionParams(
        @Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams,
        @Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams,
        @Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams,
        @Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams,
        @Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams,
        @Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
        this.enableIoTLoggingParams = enableIoTLoggingParams;
        this.publishFindingToSnsParams = publishFindingToSnsParams;
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
        this.updateCACertificateParams = updateCACertificateParams;
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
    }

    private MitigationActionActionParams() {
        this.addThingsToThingGroupParams = null;
        this.enableIoTLoggingParams = null;
        this.publishFindingToSnsParams = null;
        this.replaceDefaultPolicyVersionParams = null;
        this.updateCACertificateParams = null;
        this.updateDeviceCertificateParams = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionActionParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams;
        private @Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams;
        private @Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams;
        private @Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams;
        private @Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams;
        private @Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionActionParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addThingsToThingGroupParams = defaults.addThingsToThingGroupParams;
    	      this.enableIoTLoggingParams = defaults.enableIoTLoggingParams;
    	      this.publishFindingToSnsParams = defaults.publishFindingToSnsParams;
    	      this.replaceDefaultPolicyVersionParams = defaults.replaceDefaultPolicyVersionParams;
    	      this.updateCACertificateParams = defaults.updateCACertificateParams;
    	      this.updateDeviceCertificateParams = defaults.updateDeviceCertificateParams;
        }

        public Builder setAddThingsToThingGroupParams(@Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams) {
            this.addThingsToThingGroupParams = addThingsToThingGroupParams;
            return this;
        }

        public Builder setEnableIoTLoggingParams(@Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams) {
            this.enableIoTLoggingParams = enableIoTLoggingParams;
            return this;
        }

        public Builder setPublishFindingToSnsParams(@Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams) {
            this.publishFindingToSnsParams = publishFindingToSnsParams;
            return this;
        }

        public Builder setReplaceDefaultPolicyVersionParams(@Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams) {
            this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
            return this;
        }

        public Builder setUpdateCACertificateParams(@Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams) {
            this.updateCACertificateParams = updateCACertificateParams;
            return this;
        }

        public Builder setUpdateDeviceCertificateParams(@Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams) {
            this.updateDeviceCertificateParams = updateDeviceCertificateParams;
            return this;
        }
        public MitigationActionActionParams build() {
            return new MitigationActionActionParams(addThingsToThingGroupParams, enableIoTLoggingParams, publishFindingToSnsParams, replaceDefaultPolicyVersionParams, updateCACertificateParams, updateDeviceCertificateParams);
        }
    }
}