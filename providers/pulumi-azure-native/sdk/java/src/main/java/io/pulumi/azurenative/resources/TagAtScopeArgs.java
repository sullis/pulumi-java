// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.inputs.TagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TagAtScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagAtScopeArgs Empty = new TagAtScopeArgs();

    /**
     * The set of tags.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<TagsArgs> properties;

    public Input<TagsArgs> getProperties() {
        return this.properties;
    }

    /**
     * The resource scope.
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public TagAtScopeArgs(
        Input<TagsArgs> properties,
        Input<String> scope) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private TagAtScopeArgs() {
        this.properties = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<TagsArgs> properties;
        private Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(TagAtScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.scope = defaults.scope;
        }

        public Builder setProperties(Input<TagsArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(TagsArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public TagAtScopeArgs build() {
            return new TagAtScopeArgs(properties, scope);
        }
    }
}
