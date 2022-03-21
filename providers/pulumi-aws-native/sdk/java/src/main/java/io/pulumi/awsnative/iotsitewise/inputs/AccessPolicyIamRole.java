// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information for an IAM role identity in an access policy.
 * 
 */
public final class AccessPolicyIamRole extends io.pulumi.resources.InvokeArgs {

    public static final AccessPolicyIamRole Empty = new AccessPolicyIamRole();

    /**
     * The ARN of the IAM role.
     * 
     */
    @Import(name="arn")
      private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    public AccessPolicyIamRole(@Nullable String arn) {
        this.arn = arn;
    }

    private AccessPolicyIamRole() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIamRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIamRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }        public AccessPolicyIamRole build() {
            return new AccessPolicyIamRole(arn);
        }
    }
}
