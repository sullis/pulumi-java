// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.AccessPointVpcConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.PolicyStatusPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    @InputImport(name="policy")
    private final @Nullable Input<Object> policy;

    public Input<Object> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    @InputImport(name="policyStatus")
    private final @Nullable Input<PolicyStatusPropertiesArgs> policyStatus;

    public Input<PolicyStatusPropertiesArgs> getPolicyStatus() {
        return this.policyStatus == null ? Input.empty() : this.policyStatus;
    }

    @InputImport(name="publicAccessBlockConfiguration")
    private final @Nullable Input<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    public Input<AccessPointPublicAccessBlockConfigurationArgs> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration == null ? Input.empty() : this.publicAccessBlockConfiguration;
    }

    @InputImport(name="vpcConfiguration")
    private final @Nullable Input<AccessPointVpcConfigurationArgs> vpcConfiguration;

    public Input<AccessPointVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Input.empty() : this.vpcConfiguration;
    }

    public AccessPointArgs(
        Input<String> bucket,
        @Nullable Input<Object> policy,
        @Nullable Input<PolicyStatusPropertiesArgs> policyStatus,
        @Nullable Input<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration,
        @Nullable Input<AccessPointVpcConfigurationArgs> vpcConfiguration) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.policy = policy;
        this.policyStatus = policyStatus;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private AccessPointArgs() {
        this.bucket = Input.empty();
        this.policy = Input.empty();
        this.policyStatus = Input.empty();
        this.publicAccessBlockConfiguration = Input.empty();
        this.vpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<Object> policy;
        private @Nullable Input<PolicyStatusPropertiesArgs> policyStatus;
        private @Nullable Input<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;
        private @Nullable Input<AccessPointVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.policy = defaults.policy;
    	      this.policyStatus = defaults.policyStatus;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setPolicy(@Nullable Input<Object> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable Object policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setPolicyStatus(@Nullable Input<PolicyStatusPropertiesArgs> policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }

        public Builder setPolicyStatus(@Nullable PolicyStatusPropertiesArgs policyStatus) {
            this.policyStatus = Input.ofNullable(policyStatus);
            return this;
        }

        public Builder setPublicAccessBlockConfiguration(@Nullable Input<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        public Builder setPublicAccessBlockConfiguration(@Nullable AccessPointPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = Input.ofNullable(publicAccessBlockConfiguration);
            return this;
        }

        public Builder setVpcConfiguration(@Nullable Input<AccessPointVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder setVpcConfiguration(@Nullable AccessPointVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Input.ofNullable(vpcConfiguration);
            return this;
        }

        public AccessPointArgs build() {
            return new AccessPointArgs(bucket, policy, policyStatus, publicAccessBlockConfiguration, vpcConfiguration);
        }
    }
}
