// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer;

import io.pulumi.awsnative.signer.enums.SigningProfilePlatformId;
import io.pulumi.awsnative.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import io.pulumi.awsnative.signer.inputs.SigningProfileTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileArgs Empty = new SigningProfileArgs();

    /**
     * The ID of the target signing platform.
     * 
     */
    @Import(name="platformId", required=true)
      private final Output<SigningProfilePlatformId> platformId;

    public Output<SigningProfilePlatformId> getPlatformId() {
        return this.platformId;
    }

    /**
     * Signature validity period of the profile.
     * 
     */
    @Import(name="signatureValidityPeriod")
      private final @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    public Output<SigningProfileSignatureValidityPeriodArgs> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod == null ? Output.empty() : this.signatureValidityPeriod;
    }

    /**
     * A list of tags associated with the signing profile.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<SigningProfileTagArgs>> tags;

    public Output<List<SigningProfileTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SigningProfileArgs(
        Output<SigningProfilePlatformId> platformId,
        @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod,
        @Nullable Output<List<SigningProfileTagArgs>> tags) {
        this.platformId = Objects.requireNonNull(platformId, "expected parameter 'platformId' to be non-null");
        this.signatureValidityPeriod = signatureValidityPeriod;
        this.tags = tags;
    }

    private SigningProfileArgs() {
        this.platformId = Output.empty();
        this.signatureValidityPeriod = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SigningProfilePlatformId> platformId;
        private @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;
        private @Nullable Output<List<SigningProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platformId = defaults.platformId;
    	      this.signatureValidityPeriod = defaults.signatureValidityPeriod;
    	      this.tags = defaults.tags;
        }

        public Builder platformId(Output<SigningProfilePlatformId> platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }
        public Builder platformId(SigningProfilePlatformId platformId) {
            this.platformId = Output.of(Objects.requireNonNull(platformId));
            return this;
        }
        public Builder signatureValidityPeriod(@Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            this.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }
        public Builder signatureValidityPeriod(@Nullable SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            this.signatureValidityPeriod = Output.ofNullable(signatureValidityPeriod);
            return this;
        }
        public Builder tags(@Nullable Output<List<SigningProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<SigningProfileTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(SigningProfileTagArgs... tags) {
            return tags(List.of(tags));
        }        public SigningProfileArgs build() {
            return new SigningProfileArgs(platformId, signatureValidityPeriod, tags);
        }
    }
}
