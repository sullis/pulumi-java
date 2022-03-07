// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvgroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvgroupArgs Empty = new EnvgroupArgs();

    /**
     * Host names for this environment group.
     * 
     */
    @InputImport(name="hostnames", required=true)
      private final Input<List<String>> hostnames;

    public Input<List<String>> getHostnames() {
        return this.hostnames;
    }

    /**
     * ID of the environment group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    public EnvgroupArgs(
        Input<List<String>> hostnames,
        @Nullable Input<String> name,
        Input<String> organizationId) {
        this.hostnames = Objects.requireNonNull(hostnames, "expected parameter 'hostnames' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private EnvgroupArgs() {
        this.hostnames = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvgroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> hostnames;
        private @Nullable Input<String> name;
        private Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvgroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setHostnames(Input<List<String>> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }

        public Builder setHostnames(List<String> hostnames) {
            this.hostnames = Input.of(Objects.requireNonNull(hostnames));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public EnvgroupArgs build() {
            return new EnvgroupArgs(hostnames, name, organizationId);
        }
    }
}