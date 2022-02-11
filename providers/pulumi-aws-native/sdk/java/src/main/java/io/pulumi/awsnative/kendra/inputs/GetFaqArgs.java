// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFaqArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFaqArgs Empty = new GetFaqArgs();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="indexId", required=true)
    private final String indexId;

    public String getIndexId() {
        return this.indexId;
    }

    public GetFaqArgs(
        String id,
        String indexId) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.indexId = Objects.requireNonNull(indexId, "expected parameter 'indexId' to be non-null");
    }

    private GetFaqArgs() {
        this.id = null;
        this.indexId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFaqArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String indexId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFaqArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIndexId(String indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }

        public GetFaqArgs build() {
            return new GetFaqArgs(id, indexId);
        }
    }
}
