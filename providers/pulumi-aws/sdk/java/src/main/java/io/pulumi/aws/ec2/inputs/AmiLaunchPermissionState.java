// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiLaunchPermissionState extends io.pulumi.resources.ResourceArgs {

    public static final AmiLaunchPermissionState Empty = new AmiLaunchPermissionState();

    /**
     * An AWS Account ID to add launch permissions.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="imageId")
      private final @Nullable Output<String> imageId;

    public Output<String> imageId() {
        return this.imageId == null ? Codegen.empty() : this.imageId;
    }

    public AmiLaunchPermissionState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> imageId) {
        this.accountId = accountId;
        this.imageId = imageId;
    }

    private AmiLaunchPermissionState() {
        this.accountId = Codegen.empty();
        this.imageId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiLaunchPermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> imageId;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiLaunchPermissionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.imageId = defaults.imageId;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder imageId(@Nullable Output<String> imageId) {
            this.imageId = imageId;
            return this;
        }
        public Builder imageId(@Nullable String imageId) {
            this.imageId = Codegen.ofNullable(imageId);
            return this;
        }        public AmiLaunchPermissionState build() {
            return new AmiLaunchPermissionState(accountId, imageId);
        }
    }
}
