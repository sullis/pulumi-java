// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.licensemanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationState extends io.pulumi.resources.ResourceArgs {

    public static final AssociationState Empty = new AssociationState();

    /**
     * ARN of the license configuration.
     * 
     */
    @Import(name="licenseConfigurationArn")
      private final @Nullable Output<String> licenseConfigurationArn;

    public Output<String> licenseConfigurationArn() {
        return this.licenseConfigurationArn == null ? Codegen.empty() : this.licenseConfigurationArn;
    }

    /**
     * ARN of the resource associated with the license configuration.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn == null ? Codegen.empty() : this.resourceArn;
    }

    public AssociationState(
        @Nullable Output<String> licenseConfigurationArn,
        @Nullable Output<String> resourceArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
        this.resourceArn = resourceArn;
    }

    private AssociationState() {
        this.licenseConfigurationArn = Codegen.empty();
        this.resourceArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> licenseConfigurationArn;
        private @Nullable Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseConfigurationArn = defaults.licenseConfigurationArn;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder licenseConfigurationArn(@Nullable Output<String> licenseConfigurationArn) {
            this.licenseConfigurationArn = licenseConfigurationArn;
            return this;
        }
        public Builder licenseConfigurationArn(@Nullable String licenseConfigurationArn) {
            this.licenseConfigurationArn = Codegen.ofNullable(licenseConfigurationArn);
            return this;
        }
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Codegen.ofNullable(resourceArn);
            return this;
        }        public AssociationState build() {
            return new AssociationState(licenseConfigurationArn, resourceArn);
        }
    }
}
