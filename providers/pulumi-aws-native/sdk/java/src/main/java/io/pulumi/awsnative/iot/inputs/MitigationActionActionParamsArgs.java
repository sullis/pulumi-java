// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.MitigationActionAddThingsToThingGroupParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionEnableIoTLoggingParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionPublishFindingToSnsParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionReplaceDefaultPolicyVersionParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionUpdateCACertificateParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionUpdateDeviceCertificateParamsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can apply only one action for each defined mitigation action).
 * 
 */
public final class MitigationActionActionParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionActionParamsArgs Empty = new MitigationActionActionParamsArgs();

    @InputImport(name="addThingsToThingGroupParams")
    private final @Nullable Input<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams;

    public Input<MitigationActionAddThingsToThingGroupParamsArgs> getAddThingsToThingGroupParams() {
        return this.addThingsToThingGroupParams == null ? Input.empty() : this.addThingsToThingGroupParams;
    }

    @InputImport(name="enableIoTLoggingParams")
    private final @Nullable Input<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams;

    public Input<MitigationActionEnableIoTLoggingParamsArgs> getEnableIoTLoggingParams() {
        return this.enableIoTLoggingParams == null ? Input.empty() : this.enableIoTLoggingParams;
    }

    @InputImport(name="publishFindingToSnsParams")
    private final @Nullable Input<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams;

    public Input<MitigationActionPublishFindingToSnsParamsArgs> getPublishFindingToSnsParams() {
        return this.publishFindingToSnsParams == null ? Input.empty() : this.publishFindingToSnsParams;
    }

    @InputImport(name="replaceDefaultPolicyVersionParams")
    private final @Nullable Input<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams;

    public Input<MitigationActionReplaceDefaultPolicyVersionParamsArgs> getReplaceDefaultPolicyVersionParams() {
        return this.replaceDefaultPolicyVersionParams == null ? Input.empty() : this.replaceDefaultPolicyVersionParams;
    }

    @InputImport(name="updateCACertificateParams")
    private final @Nullable Input<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams;

    public Input<MitigationActionUpdateCACertificateParamsArgs> getUpdateCACertificateParams() {
        return this.updateCACertificateParams == null ? Input.empty() : this.updateCACertificateParams;
    }

    @InputImport(name="updateDeviceCertificateParams")
    private final @Nullable Input<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams;

    public Input<MitigationActionUpdateDeviceCertificateParamsArgs> getUpdateDeviceCertificateParams() {
        return this.updateDeviceCertificateParams == null ? Input.empty() : this.updateDeviceCertificateParams;
    }

    public MitigationActionActionParamsArgs(
        @Nullable Input<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams,
        @Nullable Input<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams,
        @Nullable Input<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams,
        @Nullable Input<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams,
        @Nullable Input<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams,
        @Nullable Input<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
        this.enableIoTLoggingParams = enableIoTLoggingParams;
        this.publishFindingToSnsParams = publishFindingToSnsParams;
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
        this.updateCACertificateParams = updateCACertificateParams;
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
    }

    private MitigationActionActionParamsArgs() {
        this.addThingsToThingGroupParams = Input.empty();
        this.enableIoTLoggingParams = Input.empty();
        this.publishFindingToSnsParams = Input.empty();
        this.replaceDefaultPolicyVersionParams = Input.empty();
        this.updateCACertificateParams = Input.empty();
        this.updateDeviceCertificateParams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionActionParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams;
        private @Nullable Input<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams;
        private @Nullable Input<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams;
        private @Nullable Input<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams;
        private @Nullable Input<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams;
        private @Nullable Input<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionActionParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addThingsToThingGroupParams = defaults.addThingsToThingGroupParams;
    	      this.enableIoTLoggingParams = defaults.enableIoTLoggingParams;
    	      this.publishFindingToSnsParams = defaults.publishFindingToSnsParams;
    	      this.replaceDefaultPolicyVersionParams = defaults.replaceDefaultPolicyVersionParams;
    	      this.updateCACertificateParams = defaults.updateCACertificateParams;
    	      this.updateDeviceCertificateParams = defaults.updateDeviceCertificateParams;
        }

        public Builder setAddThingsToThingGroupParams(@Nullable Input<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams) {
            this.addThingsToThingGroupParams = addThingsToThingGroupParams;
            return this;
        }

        public Builder setAddThingsToThingGroupParams(@Nullable MitigationActionAddThingsToThingGroupParamsArgs addThingsToThingGroupParams) {
            this.addThingsToThingGroupParams = Input.ofNullable(addThingsToThingGroupParams);
            return this;
        }

        public Builder setEnableIoTLoggingParams(@Nullable Input<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams) {
            this.enableIoTLoggingParams = enableIoTLoggingParams;
            return this;
        }

        public Builder setEnableIoTLoggingParams(@Nullable MitigationActionEnableIoTLoggingParamsArgs enableIoTLoggingParams) {
            this.enableIoTLoggingParams = Input.ofNullable(enableIoTLoggingParams);
            return this;
        }

        public Builder setPublishFindingToSnsParams(@Nullable Input<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams) {
            this.publishFindingToSnsParams = publishFindingToSnsParams;
            return this;
        }

        public Builder setPublishFindingToSnsParams(@Nullable MitigationActionPublishFindingToSnsParamsArgs publishFindingToSnsParams) {
            this.publishFindingToSnsParams = Input.ofNullable(publishFindingToSnsParams);
            return this;
        }

        public Builder setReplaceDefaultPolicyVersionParams(@Nullable Input<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams) {
            this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
            return this;
        }

        public Builder setReplaceDefaultPolicyVersionParams(@Nullable MitigationActionReplaceDefaultPolicyVersionParamsArgs replaceDefaultPolicyVersionParams) {
            this.replaceDefaultPolicyVersionParams = Input.ofNullable(replaceDefaultPolicyVersionParams);
            return this;
        }

        public Builder setUpdateCACertificateParams(@Nullable Input<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams) {
            this.updateCACertificateParams = updateCACertificateParams;
            return this;
        }

        public Builder setUpdateCACertificateParams(@Nullable MitigationActionUpdateCACertificateParamsArgs updateCACertificateParams) {
            this.updateCACertificateParams = Input.ofNullable(updateCACertificateParams);
            return this;
        }

        public Builder setUpdateDeviceCertificateParams(@Nullable Input<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams) {
            this.updateDeviceCertificateParams = updateDeviceCertificateParams;
            return this;
        }

        public Builder setUpdateDeviceCertificateParams(@Nullable MitigationActionUpdateDeviceCertificateParamsArgs updateDeviceCertificateParams) {
            this.updateDeviceCertificateParams = Input.ofNullable(updateDeviceCertificateParams);
            return this;
        }

        public MitigationActionActionParamsArgs build() {
            return new MitigationActionActionParamsArgs(addThingsToThingGroupParams, enableIoTLoggingParams, publishFindingToSnsParams, replaceDefaultPolicyVersionParams, updateCACertificateParams, updateDeviceCertificateParams);
        }
    }
}
