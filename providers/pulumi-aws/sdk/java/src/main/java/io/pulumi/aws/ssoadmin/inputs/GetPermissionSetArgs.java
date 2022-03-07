// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPermissionSetArgs Empty = new GetPermissionSetArgs();

    /**
     * The Amazon Resource Name (ARN) of the permission set.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
     * 
     */
    @InputImport(name="instanceArn", required=true)
      private final String instanceArn;

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the SSO Permission Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetPermissionSetArgs(
        @Nullable String arn,
        String instanceArn,
        @Nullable String name,
        @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private GetPermissionSetArgs() {
        this.arn = null;
        this.instanceArn = null;
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private String instanceArn;
        private @Nullable String name;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetPermissionSetArgs build() {
            return new GetPermissionSetArgs(arn, instanceArn, name, tags);
        }
    }
}