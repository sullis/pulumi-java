// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetResourcefileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcefileArgs Empty = new GetResourcefileArgs();

    @InputImport(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GetResourcefileArgs(
        String environmentId,
        String name,
        String organizationId,
        String type) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetResourcefileArgs() {
        this.environmentId = null;
        this.name = null;
        this.organizationId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcefileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentId;
        private String name;
        private String organizationId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcefileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.type = defaults.type;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetResourcefileArgs build() {
            return new GetResourcefileArgs(environmentId, name, organizationId, type);
        }
    }
}