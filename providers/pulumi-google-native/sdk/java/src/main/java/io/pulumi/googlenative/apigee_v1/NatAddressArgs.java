// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NatAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatAddressArgs Empty = new NatAddressArgs();

    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Resource ID of the NAT address.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    public NatAddressArgs(
        Output<String> instanceId,
        @Nullable Output<String> name,
        Output<String> organizationId) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private NatAddressArgs() {
        this.instanceId = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceId;
        private @Nullable Output<String> name;
        private Output<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(NatAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }        public NatAddressArgs build() {
            return new NatAddressArgs(instanceId, name, organizationId);
        }
    }
}
