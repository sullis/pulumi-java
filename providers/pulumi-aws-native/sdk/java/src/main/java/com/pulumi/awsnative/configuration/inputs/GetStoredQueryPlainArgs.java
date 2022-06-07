// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.configuration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStoredQueryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStoredQueryPlainArgs Empty = new GetStoredQueryPlainArgs();

    @Import(name="queryName", required=true)
    private String queryName;

    public String queryName() {
        return this.queryName;
    }

    private GetStoredQueryPlainArgs() {}

    private GetStoredQueryPlainArgs(GetStoredQueryPlainArgs $) {
        this.queryName = $.queryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStoredQueryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStoredQueryPlainArgs $;

        public Builder() {
            $ = new GetStoredQueryPlainArgs();
        }

        public Builder(GetStoredQueryPlainArgs defaults) {
            $ = new GetStoredQueryPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryName(String queryName) {
            $.queryName = queryName;
            return this;
        }

        public GetStoredQueryPlainArgs build() {
            $.queryName = Objects.requireNonNull($.queryName, "expected parameter 'queryName' to be non-null");
            return $;
        }
    }

}
