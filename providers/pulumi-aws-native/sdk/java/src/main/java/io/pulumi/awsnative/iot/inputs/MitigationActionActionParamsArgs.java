// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.MitigationActionAddThingsToThingGroupParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionEnableIoTLoggingParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionPublishFindingToSnsParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionReplaceDefaultPolicyVersionParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionUpdateCACertificateParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionUpdateDeviceCertificateParamsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can apply only one action for each defined mitigation action).
 * 
 */
public final class MitigationActionActionParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionActionParamsArgs Empty = new MitigationActionActionParamsArgs();

    @Import(name="addThingsToThingGroupParams")
      private final @Nullable Output<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams;

    public Output<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams() {
        return this.addThingsToThingGroupParams == null ? Codegen.empty() : this.addThingsToThingGroupParams;
    }

    @Import(name="enableIoTLoggingParams")
      private final @Nullable Output<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams;

    public Output<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams() {
        return this.enableIoTLoggingParams == null ? Codegen.empty() : this.enableIoTLoggingParams;
    }

    @Import(name="publishFindingToSnsParams")
      private final @Nullable Output<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams;

    public Output<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams() {
        return this.publishFindingToSnsParams == null ? Codegen.empty() : this.publishFindingToSnsParams;
    }

    @Import(name="replaceDefaultPolicyVersionParams")
      private final @Nullable Output<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams;

    public Output<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams() {
        return this.replaceDefaultPolicyVersionParams == null ? Codegen.empty() : this.replaceDefaultPolicyVersionParams;
    }

    @Import(name="updateCACertificateParams")
      private final @Nullable Output<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams;

    public Output<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams() {
        return this.updateCACertificateParams == null ? Codegen.empty() : this.updateCACertificateParams;
    }

    @Import(name="updateDeviceCertificateParams")
      private final @Nullable Output<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams;

    public Output<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams() {
        return this.updateDeviceCertificateParams == null ? Codegen.empty() : this.updateDeviceCertificateParams;
    }

    public MitigationActionActionParamsArgs(
        @Nullable Output<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams,
        @Nullable Output<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams,
        @Nullable Output<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams,
        @Nullable Output<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams,
        @Nullable Output<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams,
        @Nullable Output<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
        this.enableIoTLoggingParams = enableIoTLoggingParams;
        this.publishFindingToSnsParams = publishFindingToSnsParams;
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
        this.updateCACertificateParams = updateCACertificateParams;
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
    }

    private MitigationActionActionParamsArgs() {
        this.addThingsToThingGroupParams = Codegen.empty();
        this.enableIoTLoggingParams = Codegen.empty();
        this.publishFindingToSnsParams = Codegen.empty();
        this.replaceDefaultPolicyVersionParams = Codegen.empty();
        this.updateCACertificateParams = Codegen.empty();
        this.updateDeviceCertificateParams = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionActionParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams;
        private @Nullable Output<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams;
        private @Nullable Output<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams;
        private @Nullable Output<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams;
        private @Nullable Output<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams;
        private @Nullable Output<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams;

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

        public Builder addThingsToThingGroupParams(@Nullable Output<MitigationActionAddThingsToThingGroupParamsArgs> addThingsToThingGroupParams) {
            this.addThingsToThingGroupParams = addThingsToThingGroupParams;
            return this;
        }
        public Builder addThingsToThingGroupParams(@Nullable MitigationActionAddThingsToThingGroupParamsArgs addThingsToThingGroupParams) {
            this.addThingsToThingGroupParams = Codegen.ofNullable(addThingsToThingGroupParams);
            return this;
        }
        public Builder enableIoTLoggingParams(@Nullable Output<MitigationActionEnableIoTLoggingParamsArgs> enableIoTLoggingParams) {
            this.enableIoTLoggingParams = enableIoTLoggingParams;
            return this;
        }
        public Builder enableIoTLoggingParams(@Nullable MitigationActionEnableIoTLoggingParamsArgs enableIoTLoggingParams) {
            this.enableIoTLoggingParams = Codegen.ofNullable(enableIoTLoggingParams);
            return this;
        }
        public Builder publishFindingToSnsParams(@Nullable Output<MitigationActionPublishFindingToSnsParamsArgs> publishFindingToSnsParams) {
            this.publishFindingToSnsParams = publishFindingToSnsParams;
            return this;
        }
        public Builder publishFindingToSnsParams(@Nullable MitigationActionPublishFindingToSnsParamsArgs publishFindingToSnsParams) {
            this.publishFindingToSnsParams = Codegen.ofNullable(publishFindingToSnsParams);
            return this;
        }
        public Builder replaceDefaultPolicyVersionParams(@Nullable Output<MitigationActionReplaceDefaultPolicyVersionParamsArgs> replaceDefaultPolicyVersionParams) {
            this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
            return this;
        }
        public Builder replaceDefaultPolicyVersionParams(@Nullable MitigationActionReplaceDefaultPolicyVersionParamsArgs replaceDefaultPolicyVersionParams) {
            this.replaceDefaultPolicyVersionParams = Codegen.ofNullable(replaceDefaultPolicyVersionParams);
            return this;
        }
        public Builder updateCACertificateParams(@Nullable Output<MitigationActionUpdateCACertificateParamsArgs> updateCACertificateParams) {
            this.updateCACertificateParams = updateCACertificateParams;
            return this;
        }
        public Builder updateCACertificateParams(@Nullable MitigationActionUpdateCACertificateParamsArgs updateCACertificateParams) {
            this.updateCACertificateParams = Codegen.ofNullable(updateCACertificateParams);
            return this;
        }
        public Builder updateDeviceCertificateParams(@Nullable Output<MitigationActionUpdateDeviceCertificateParamsArgs> updateDeviceCertificateParams) {
            this.updateDeviceCertificateParams = updateDeviceCertificateParams;
            return this;
        }
        public Builder updateDeviceCertificateParams(@Nullable MitigationActionUpdateDeviceCertificateParamsArgs updateDeviceCertificateParams) {
            this.updateDeviceCertificateParams = Codegen.ofNullable(updateDeviceCertificateParams);
            return this;
        }        public MitigationActionActionParamsArgs build() {
            return new MitigationActionActionParamsArgs(addThingsToThingGroupParams, enableIoTLoggingParams, publishFindingToSnsParams, replaceDefaultPolicyVersionParams, updateCACertificateParams, updateDeviceCertificateParams);
        }
    }
}
