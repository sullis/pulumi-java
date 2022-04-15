// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamOrganizationAdminAccountState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamOrganizationAdminAccountState Empty = new VpcIpamOrganizationAdminAccountState();

    /**
     * The Organizations ARN for the delegate account.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    @Import(name="delegatedAdminAccountId")
      private final @Nullable Output<String> delegatedAdminAccountId;

    public Output<String> delegatedAdminAccountId() {
        return this.delegatedAdminAccountId == null ? Codegen.empty() : this.delegatedAdminAccountId;
    }

    /**
     * The Organizations email for the delegate account.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> email() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * The Organizations name for the delegate account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The AWS service principal.
     * 
     */
    @Import(name="servicePrincipal")
      private final @Nullable Output<String> servicePrincipal;

    public Output<String> servicePrincipal() {
        return this.servicePrincipal == null ? Codegen.empty() : this.servicePrincipal;
    }

    public VpcIpamOrganizationAdminAccountState(
        @Nullable Output<String> arn,
        @Nullable Output<String> delegatedAdminAccountId,
        @Nullable Output<String> email,
        @Nullable Output<String> name,
        @Nullable Output<String> servicePrincipal) {
        this.arn = arn;
        this.delegatedAdminAccountId = delegatedAdminAccountId;
        this.email = email;
        this.name = name;
        this.servicePrincipal = servicePrincipal;
    }

    private VpcIpamOrganizationAdminAccountState() {
        this.arn = Codegen.empty();
        this.delegatedAdminAccountId = Codegen.empty();
        this.email = Codegen.empty();
        this.name = Codegen.empty();
        this.servicePrincipal = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamOrganizationAdminAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> delegatedAdminAccountId;
        private @Nullable Output<String> email;
        private @Nullable Output<String> name;
        private @Nullable Output<String> servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamOrganizationAdminAccountState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.delegatedAdminAccountId = defaults.delegatedAdminAccountId;
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder delegatedAdminAccountId(@Nullable Output<String> delegatedAdminAccountId) {
            this.delegatedAdminAccountId = delegatedAdminAccountId;
            return this;
        }
        public Builder delegatedAdminAccountId(@Nullable String delegatedAdminAccountId) {
            this.delegatedAdminAccountId = Codegen.ofNullable(delegatedAdminAccountId);
            return this;
        }
        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder servicePrincipal(@Nullable Output<String> servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public Builder servicePrincipal(@Nullable String servicePrincipal) {
            this.servicePrincipal = Codegen.ofNullable(servicePrincipal);
            return this;
        }        public VpcIpamOrganizationAdminAccountState build() {
            return new VpcIpamOrganizationAdminAccountState(arn, delegatedAdminAccountId, email, name, servicePrincipal);
        }
    }
}
