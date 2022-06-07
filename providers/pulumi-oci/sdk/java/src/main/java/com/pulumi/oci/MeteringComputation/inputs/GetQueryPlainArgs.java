// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQueryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueryPlainArgs Empty = new GetQueryPlainArgs();

    /**
     * The query unique OCID.
     * 
     */
    @Import(name="queryId", required=true)
    private String queryId;

    /**
     * @return The query unique OCID.
     * 
     */
    public String queryId() {
        return this.queryId;
    }

    private GetQueryPlainArgs() {}

    private GetQueryPlainArgs(GetQueryPlainArgs $) {
        this.queryId = $.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueryPlainArgs $;

        public Builder() {
            $ = new GetQueryPlainArgs();
        }

        public Builder(GetQueryPlainArgs defaults) {
            $ = new GetQueryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queryId The query unique OCID.
         * 
         * @return builder
         * 
         */
        public Builder queryId(String queryId) {
            $.queryId = queryId;
            return this;
        }

        public GetQueryPlainArgs build() {
            $.queryId = Objects.requireNonNull($.queryId, "expected parameter 'queryId' to be non-null");
            return $;
        }
    }

}
