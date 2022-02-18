// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSchemaVersionArgs Empty = new GetSchemaVersionArgs();

    /**
     * Represents the version ID associated with the schema version.
     * 
     */
    @InputImport(name="versionId", required=true)
    private final String versionId;

    public String getVersionId() {
        return this.versionId;
    }

    public GetSchemaVersionArgs(String versionId) {
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
    }

    private GetSchemaVersionArgs() {
        this.versionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.versionId = defaults.versionId;
        }

        public Builder setVersionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }

        public GetSchemaVersionArgs build() {
            return new GetSchemaVersionArgs(versionId);
        }
    }
}
