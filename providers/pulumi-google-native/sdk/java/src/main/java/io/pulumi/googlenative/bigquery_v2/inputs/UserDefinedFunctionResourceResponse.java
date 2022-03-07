// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * This is used for defining User Defined Function (UDF) resources only when using legacy SQL. Users of Standard SQL should leverage either DDL (e.g. CREATE [TEMPORARY] FUNCTION ... ) or the Routines API to define UDF resources. For additional information on migrating, see: https://cloud.google.com/bigquery/docs/reference/standard-sql/migrating-from-legacy-sql#differences_in_user-defined_javascript_functions
 * 
 */
public final class UserDefinedFunctionResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserDefinedFunctionResourceResponse Empty = new UserDefinedFunctionResourceResponse();

    /**
     * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    @InputImport(name="inlineCode", required=true)
      private final String inlineCode;

    public String getInlineCode() {
        return this.inlineCode;
    }

    /**
     * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    public UserDefinedFunctionResourceResponse(
        String inlineCode,
        String resourceUri) {
        this.inlineCode = Objects.requireNonNull(inlineCode, "expected parameter 'inlineCode' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private UserDefinedFunctionResourceResponse() {
        this.inlineCode = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedFunctionResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inlineCode;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedFunctionResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setInlineCode(String inlineCode) {
            this.inlineCode = Objects.requireNonNull(inlineCode);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public UserDefinedFunctionResourceResponse build() {
            return new UserDefinedFunctionResourceResponse(inlineCode, resourceUri);
        }
    }
}