// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationRootPolicyTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationRootPolicyTypeArgs Empty = new OrganizationRootPolicyTypeArgs();

    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public OrganizationRootPolicyTypeArgs(
        @Nullable Output<String> status,
        @Nullable Output<String> type) {
        this.status = status;
        this.type = type;
    }

    private OrganizationRootPolicyTypeArgs() {
        this.status = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRootPolicyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> status;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationRootPolicyTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public OrganizationRootPolicyTypeArgs build() {
            return new OrganizationRootPolicyTypeArgs(status, type);
        }
    }
}
