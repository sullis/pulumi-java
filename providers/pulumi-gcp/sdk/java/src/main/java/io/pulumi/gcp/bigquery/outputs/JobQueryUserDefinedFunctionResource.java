// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobQueryUserDefinedFunctionResource {
    /**
     * An inline resource that contains code for a user-defined function (UDF).
     * Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    private final @Nullable String inlineCode;
    /**
     * A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    private final @Nullable String resourceUri;

    @OutputCustomType.Constructor({"inlineCode","resourceUri"})
    private JobQueryUserDefinedFunctionResource(
        @Nullable String inlineCode,
        @Nullable String resourceUri) {
        this.inlineCode = inlineCode;
        this.resourceUri = resourceUri;
    }

    /**
     * An inline resource that contains code for a user-defined function (UDF).
     * Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    public Optional<String> getInlineCode() {
        return Optional.ofNullable(this.inlineCode);
    }
    /**
     * A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    public Optional<String> getResourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryUserDefinedFunctionResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String inlineCode;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryUserDefinedFunctionResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setInlineCode(@Nullable String inlineCode) {
            this.inlineCode = inlineCode;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public JobQueryUserDefinedFunctionResource build() {
            return new JobQueryUserDefinedFunctionResource(inlineCode, resourceUri);
        }
    }
}
