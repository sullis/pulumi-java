// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationalUnitArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationalUnitArgs Empty = new OrganizationalUnitArgs();

    /**
     * The name for the organizational unit
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * ID of the parent organizational unit, which may be the root
     * 
     */
    @Import(name="parentId", required=true)
      private final Output<String> parentId;

    public Output<String> parentId() {
        return this.parentId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public OrganizationalUnitArgs(
        @Nullable Output<String> name,
        Output<String> parentId,
        @Nullable Output<Map<String,String>> tags) {
        this.name = name;
        this.parentId = Objects.requireNonNull(parentId, "expected parameter 'parentId' to be non-null");
        this.tags = tags;
    }

    private OrganizationalUnitArgs() {
        this.name = Codegen.empty();
        this.parentId = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationalUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> parentId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationalUnitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parentId(Output<String> parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        public Builder parentId(String parentId) {
            this.parentId = Output.of(Objects.requireNonNull(parentId));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public OrganizationalUnitArgs build() {
            return new OrganizationalUnitArgs(name, parentId, tags);
        }
    }
}
