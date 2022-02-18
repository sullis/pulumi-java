// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisioningTemplateProvisioningHookArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisioningTemplateProvisioningHookArgs Empty = new ProvisioningTemplateProvisioningHookArgs();

    @InputImport(name="payloadVersion")
    private final @Nullable Input<String> payloadVersion;

    public Input<String> getPayloadVersion() {
        return this.payloadVersion == null ? Input.empty() : this.payloadVersion;
    }

    @InputImport(name="targetArn")
    private final @Nullable Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn == null ? Input.empty() : this.targetArn;
    }

    public ProvisioningTemplateProvisioningHookArgs(
        @Nullable Input<String> payloadVersion,
        @Nullable Input<String> targetArn) {
        this.payloadVersion = payloadVersion;
        this.targetArn = targetArn;
    }

    private ProvisioningTemplateProvisioningHookArgs() {
        this.payloadVersion = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisioningTemplateProvisioningHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> payloadVersion;
        private @Nullable Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisioningTemplateProvisioningHookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadVersion = defaults.payloadVersion;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setPayloadVersion(@Nullable Input<String> payloadVersion) {
            this.payloadVersion = payloadVersion;
            return this;
        }

        public Builder setPayloadVersion(@Nullable String payloadVersion) {
            this.payloadVersion = Input.ofNullable(payloadVersion);
            return this;
        }

        public Builder setTargetArn(@Nullable Input<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        public Builder setTargetArn(@Nullable String targetArn) {
            this.targetArn = Input.ofNullable(targetArn);
            return this;
        }

        public ProvisioningTemplateProvisioningHookArgs build() {
            return new ProvisioningTemplateProvisioningHookArgs(payloadVersion, targetArn);
        }
    }
}
