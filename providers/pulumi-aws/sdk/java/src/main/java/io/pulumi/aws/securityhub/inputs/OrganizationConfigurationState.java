// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationConfigurationState Empty = new OrganizationConfigurationState();

    /**
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * 
     */
    @Import(name="autoEnable")
      private final @Nullable Output<Boolean> autoEnable;

    public Output<Boolean> autoEnable() {
        return this.autoEnable == null ? Codegen.empty() : this.autoEnable;
    }

    public OrganizationConfigurationState(@Nullable Output<Boolean> autoEnable) {
        this.autoEnable = autoEnable;
    }

    private OrganizationConfigurationState() {
        this.autoEnable = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoEnable;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoEnable = defaults.autoEnable;
        }

        public Builder autoEnable(@Nullable Output<Boolean> autoEnable) {
            this.autoEnable = autoEnable;
            return this;
        }
        public Builder autoEnable(@Nullable Boolean autoEnable) {
            this.autoEnable = Codegen.ofNullable(autoEnable);
            return this;
        }        public OrganizationConfigurationState build() {
            return new OrganizationConfigurationState(autoEnable);
        }
    }
}
