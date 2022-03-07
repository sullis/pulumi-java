// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is used for defining User Defined Function (UDF) resources only when using legacy SQL. Users of Standard SQL should leverage either DDL (e.g. CREATE [TEMPORARY] FUNCTION ... ) or the Routines API to define UDF resources. For additional information on migrating, see: https://cloud.google.com/bigquery/docs/reference/standard-sql/migrating-from-legacy-sql#differences_in_user-defined_javascript_functions
 * 
 */
public final class UserDefinedFunctionResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserDefinedFunctionResourceArgs Empty = new UserDefinedFunctionResourceArgs();

    /**
     * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    @InputImport(name="inlineCode")
      private final @Nullable Input<String> inlineCode;

    public Input<String> getInlineCode() {
        return this.inlineCode == null ? Input.empty() : this.inlineCode;
    }

    /**
     * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    @InputImport(name="resourceUri")
      private final @Nullable Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri == null ? Input.empty() : this.resourceUri;
    }

    public UserDefinedFunctionResourceArgs(
        @Nullable Input<String> inlineCode,
        @Nullable Input<String> resourceUri) {
        this.inlineCode = inlineCode;
        this.resourceUri = resourceUri;
    }

    private UserDefinedFunctionResourceArgs() {
        this.inlineCode = Input.empty();
        this.resourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedFunctionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> inlineCode;
        private @Nullable Input<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedFunctionResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setInlineCode(@Nullable Input<String> inlineCode) {
            this.inlineCode = inlineCode;
            return this;
        }

        public Builder setInlineCode(@Nullable String inlineCode) {
            this.inlineCode = Input.ofNullable(inlineCode);
            return this;
        }

        public Builder setResourceUri(@Nullable Input<String> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = Input.ofNullable(resourceUri);
            return this;
        }
        public UserDefinedFunctionResourceArgs build() {
            return new UserDefinedFunctionResourceArgs(inlineCode, resourceUri);
        }
    }
}